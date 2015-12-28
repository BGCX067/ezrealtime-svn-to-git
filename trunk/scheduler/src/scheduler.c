//
// 1. Tentar GUIAR a busca usando EDF 
// 2. Colocar como primeira a mesma transicao de computacao anteriormente executada (no prunedTransitions)
// 3. Eliminar transicoes ja disparadas anteriormente no mesmo estado
// 4. NAO TENTAR estados ja visitados anteriormente.
//


#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "consts.h"
#include "datatype-it.h"
#include <sys/time.h>
#include "busca_estados.h"

#define Tempo(T1,T2) ((double)(((T2.tv_sec-T1.tv_sec)*1000000)+(T2.tv_usec-T1.tv_usec))/1000000)
struct timeval T1, T2;

struct state_list_item *item_atual_lista = NULL, *lista_primeiro_item = NULL;

int atual, max=0;
short JAH_TEVE_TRANS_GRANT_ANTERIOR=FALSE, transicao_grant_anterior=-1;
int counter = 0;

short DEBUG_FLAG = TRUE;

#include "petri-net.h"
#include "print.h"

unsigned long int card_resultados = 0;
unsigned long int card_visited = 0;

struct state_list_item *CRIA_ITEM_NA_LISTA() {

	struct state_list_item *item = malloc(sizeof(struct state_list_item));

	if (item == NULL) {
		printf("ERRO NA ALOCACAO DE MEMORIA NA CRIACAO DO ESPACO\n");
		exit(1);
	}

	item->estado.passou = FALSE;
	item->estado.ID = ++counter;
	item->previous = NULL;
	item->next = NULL;

	if (lista_primeiro_item == NULL) {
		item_atual_lista = item;
		lista_primeiro_item = item_atual_lista;
		return item;
	}

	item->previous = item_atual_lista;
	item_atual_lista->next = item;
	item_atual_lista = item;

	return item;

}

struct state_list_item *REMOVER_ITEM_NA_LISTA(struct state_list_item *item,
		short remover_hash_code) {

	item_atual_lista = item->previous;
	item_atual_lista->next = NULL;

	if (remover_hash_code) {
		free(item->estado.state_s);

	}

	//printf("Removendo item na lista\n");
	item->previous=NULL;
	item->next=NULL;
	free(item);

	item=NULL;

	return item_atual_lista;
}

//--------------------------------------------------------------------------------------------
// - Antes de chamar essa funcao, tem-se que garantir que PT tenha pelo menos uma transicao
// - E que no início PT_indice tenha valor igual a -1
//--------------------------------------------------------------------------------------------
void escolheTransTime(struct state *St) {

	if (St->PT_indice == -1) // Se eh a primeira vez 
	{
		St->PT_indice++;
		St->trans = St->PT_trans[St->PT_indice];
		St->time = St->PT_tmin [St->PT_indice];

		return;

	}

	while (((St->time)+1) <= St->time_max) // se incrementar tempo nao ultrapassa tmax
	{
		St->time = St->time + 1;
		return;
	}

	while ((St->PT_indice)+1< St->cardPT) // Se ha outra trasicao para ser disparada
	{
		(St->PT_indice)++;
		St->trans = St->PT_trans[St->PT_indice];
		St->time = St->PT_tmin [St->PT_indice];

		return;
	}

	St->trans = -1;
	St->time = -1;
}

void ADICIONA_NOS_ESTADOS_VISITADOS(struct state S) {
	card_visited = card_visited + 1;
	//printf("Estados visitados %d\n",card_visited);
	ADICIONA_ESTADO(S);
}
short CHECA_SE_ESTADO_JA_FOI_VISITADO(struct state S) {
	return EXISTE_ESTADO(S);
}

simula() {
	short estado_recem_gerado;
	struct state_list_item *item_atual;

	JAH_TEVE_TRANS_GRANT_ANTERIOR = FALSE;
	atual = 0;

	item_atual = CRIA_ITEM_NA_LISTA();
	item_atual->estado = estado_inicial;

	enabledTrans(&item_atual->estado);
	firableTrans(&item_atual->estado);
	prunedTrans(&item_atual->estado);
	escolheTransTime (&item_atual->estado);
	item_atual->estado.passou = TRUE;

	//Debug print 
	if (DEBUG_FLAG)
		printStatePruned(item_atual->estado, transitions, max, atual);

	item_atual = CRIA_ITEM_NA_LISTA();
	atual++;

	while (TRUE) {

		estado_recem_gerado = FALSE;
		if (item_atual->estado.passou !=TRUE) // E a primeira vez que entra nesse estado
		{
			estado_recem_gerado = TRUE;

			newStateGen(item_atual->previous->estado, &(item_atual->estado));
			//Novo adiciona a potencia utilizada

			max++;

			prunedTrans(&(item_atual->estado));

			if (CHECA_SE_ESTADO_JA_FOI_VISITADO(item_atual->estado)) {
				//Debug print
				if (DEBUG_FLAG)
					printState(item_atual->estado, transitions, max, atual);
				item_atual = REMOVER_ITEM_NA_LISTA(item_atual, TRUE);
				atual--;

			} else {
				ADICIONA_NOS_ESTADOS_VISITADOS(item_atual->estado);
			}

			if (item_atual->estado.M[PLACE_FINAL_MARK]) {
				//Debug print	      
				if (DEBUG_FLAG)
					printState(item_atual->estado, transitions, max, atual);
				return atual;
			}

		}// if (item_atual->estado.passou !=TRUE)


		//Se a variavel atual for igual a zero, entao o algoritmo nao deve prosseguir
		//ALTERADO POR EDUARDO
		if (atual == 0|| item_atual == NULL || item_atual->previous == NULL) {
			//Debug print
			if (DEBUG_FLAG)
				printState(item_atual->estado, transitions, max, atual);
			item_atual == NULL;
			return FALSE;
		}

		if (item_atual->estado.cardPT > 0) {
			escolheTransTime (&(item_atual->estado));
			//Debug print
			if (DEBUG_FLAG)
				printStatePruned(item_atual->estado, transitions, max, atual);
			//Verifica a potencia gasta e incrementa a potenciaUtilizada ate o presente
			//momento
			if (CHECAR_POTENCIA) {
				incrementaPotencia(item_atual->previous->estado,
						&item_atual->estado);
			}

			//Verifica se a potencia utilizada ate o momento e maior do que a permitida
			//Se for, retorna ao estado anterior
			if (CHECAR_POTENCIA&& (item_atual->estado.potenciaUtilizada
					> POTENCIA_MAXIMA)) {
				item_atual = REMOVER_ITEM_NA_LISTA(item_atual, FALSE);
				atual--;

			} else if (item_atual->estado.trans==-1) {
				// Se nao existe mais pruned transitions

				item_atual = REMOVER_ITEM_NA_LISTA(item_atual, FALSE);

				atual--;

			} else {

				if (TRANSICAO_GRANT_PROCESSOR(item_atual->estado.trans)) {

					//Casos a serem verificados
					//Se e a primeira vez que uma transicao de grant processor e disparada, entao nao ha consumo
					//Se a transicao de grant processo e a mesma que anterior, tambem nao ha consumo
					if (CHECAR_POTENCIA&& (transicao_grant_anterior != -1)
							&& (transicao_grant_anterior
									!= item_atual->estado.trans)) {
						item_atual->estado.potenciaUtilizada
								+= POTENCIA_TROCA_CONTEXTO_PROCESSADOR;
					}

					transicao_grant_anterior=item_atual->estado.trans;

				}//if (TRANSICAO_GRANT_PROCESSOR(item_atual->estado.trans))

				item_atual = CRIA_ITEM_NA_LISTA();
				atual++;

			}// else 

		} else {

			//Debug print
			if (DEBUG_FLAG)
				printState(item_atual->estado, transitions, max, atual);

			item_atual = REMOVER_ITEM_NA_LISTA(item_atual, FALSE);

			atual--;

		}
	}
}

void IMPRIME_LTS(char *nomeArquivo) {
	FILE *fp;
	char line[300];
	int i, j = 0;
	struct state_list_item *aux = lista_primeiro_item;
	int ultimaPotencia = 0;

	fp = fopen(nomeArquivo, "w");

	for (i = 0; i < NUMERO_PROCESSADORES; i++) {
		sprintf(line, "Proc=%s\n", proc[i].proc_name);
		fprintf(fp, "%s", line);

		for (j = 0; j < proc[i].card; j++) {
			sprintf(line, "%s=%d\n", transitions.name[proc[i].trans[j]],
					transitions.eft[proc[i].trans[j]]);
			fprintf(fp, "%s", line);

		}//for(j = 0; j < proc[i].card; j++)
		sprintf(line, "#\n", proc[i].proc_name);
		fprintf(fp, "%s", line);

	}//for(i = 0; i < NUMERO_PROCESSADORES; i++)

	while (aux != NULL) {

		if (aux->next != NULL) {
			sprintf(line, "(%s,%d,%d)", transitions.name[aux->estado.trans],
					aux->estado.time, aux->estado.potenciaUtilizada);
			fprintf(fp, "%s", line);

			ultimaPotencia = aux->estado.potenciaUtilizada;
		}

		aux = aux->next;

	}//while(aux != NULL)

	fclose (fp);
}

int main(int argc, char *argv[]) {
	int Nestados;
	char nomeArquivo[255] = "scheduler.dat";

	if (argc < 2) {
		printf("ERROR#Arquivo não informado!\n");
		exit(0);
	}

	carregar(argv[1]);

	if (argc > 2) {
		if (strcmp(argv[2], "debug") == 0) {
			//	debug();
			DEBUG_FLAG = TRUE;

		} else {
			strcpy(nomeArquivo, argv[2]);
		}

		if (argc > 3&& strcmp(argv[3], "debug") == 0) {
			//	debug();	
			DEBUG_FLAG = TRUE;
		}

	}

	//Coleta Tempo1
	gettimeofday(&T1, 0);

	Nestados = simula();

	//Coleta Tempo2
	gettimeofday(&T2, 0);

	printf("%f\n", Tempo(T1,T2));

	//Nao gerou a escala
	if (Nestados < 2) {
		printf("\nNao encontrou scheduler\n");
		return -1;
	}

	IMPRIME_LTS(nomeArquivo);

	return 0;
}

