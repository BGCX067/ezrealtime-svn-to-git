#ifndef __PARSER__
#define __PARSER__

#include "datatype-it.h"
#include "print_parser.h"
#include <string.h>
#include <stdio.h>
#include <stdlib.h>

int TAMANHO_BUFFER = 100000;

int PLACE_FINAL_MARK; //considerar que indice inicia de zero, i.e., [0,1,2,..]
int NUM_PLACE;
int NUM_TRANS;
int CHECAR_POTENCIA;
int POTENCIA_TROCA_CONTEXTO_PROCESSADOR;
int POTENCIA_MAXIMA;

struct set_trans TD;
struct set_trans TA;
struct set_trans TR;
struct set_trans TE;
struct set_trans TG;
struct set_trans TC;
struct set_trans TF;
struct set_trans TO;
struct set_trans TP;
struct set_potencia PC;

struct placeData places;
struct transData transitions;

struct state estado_inicial;

struct prepos *post;
struct prepos *pre;

struct set_proc *proc;

int NUMERO_PROCESSADORES;

/**
 * Realiza a carga do vetor
 */
int* carregarVetor(char *linha, int tamanho) {
	char *token;
	int *falsoVetor = (int*) malloc(sizeof(int) * tamanho);
	int contador = 0;

	token = strtok(linha, "%");

	while (token != NULL) {
		falsoVetor[contador] = atoi(token);
		token = strtok(NULL, "%");
		contador++;
	}

	return falsoVetor;
}

//Atenção usar a quebra de linha do UNIX
//e não do DOS
void removerQuebraLinha(char* linha) {
	int tamanho = strlen(linha);
	linha[tamanho - 1] = '\0';
}

struct prepos* carregarPrePos(FILE *filePtr, char *bufPtr) {
	char *token;
	char *token2;
	char *token3;
	int *falsoVetorLugar;
	int *falsoVetorPeso;
	int i, j;
	int contador = 0;
	struct prepos *prepos;

	prepos = (struct prepos*) malloc(sizeof(struct prepos) * NUM_TRANS);

	for (i = 0; i < NUM_TRANS; i++) {
		fgets(bufPtr, TAMANHO_BUFFER, filePtr);

		removerQuebraLinha(bufPtr);

		token = strtok(bufPtr, "$");
		token2 = strtok(NULL, "$");
		token3 = strtok(NULL, "$");

		prepos[i].card = atoi(token);

		//Pega os vetores de lugar

		falsoVetorLugar = carregarVetor(token2, prepos[i].card);

		//Pega os vetores de peso

		falsoVetorPeso = carregarVetor(token3, prepos[i].card);

		for (j = 0; j < prepos[i].card; j++) {
			prepos[i].lugar[j] = falsoVetorLugar[j];
			prepos[i].peso[j] = falsoVetorPeso[j];
		}

		free(falsoVetorLugar);
		free(falsoVetorPeso);

	}//for(i = 0; i < NUM_TRANS; i++)

	return prepos;
}

struct set_proc* carregarSetProc(FILE *filePtr, char *bufPtr) {
	char *token;
	char *token2;
	char *token3;
	int *falsoVetor;
	int i, j;
	struct set_proc *set_proc;

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);

	NUMERO_PROCESSADORES = atoi(bufPtr);

	set_proc = (struct set_proc*) malloc(sizeof(struct set_proc)
			* NUMERO_PROCESSADORES);

	for (i = 0; i < NUMERO_PROCESSADORES; i++) {
		fgets(bufPtr, TAMANHO_BUFFER, filePtr);
		removerQuebraLinha(bufPtr);

		token = strtok(bufPtr, ":");
		token2 = strtok(NULL, "$");
		token3 = strtok(NULL, "$");

		//Pega os vetores de lugar

		set_proc[i].proc_name = (char*) calloc((strlen(token) + 1),
				sizeof(char));
		set_proc[i].proc_name = strdup(token);

		set_proc[i].card = atoi(token2);
		set_proc[i].trans = (int*) malloc(sizeof(int) * set_proc[i].card);

		falsoVetor = carregarVetor(token3, set_proc[i].card);

		for (j = 0; j < set_proc[i].card; j++) {
			set_proc[i].trans[j] = falsoVetor[j];

		}

		free(falsoVetor);

	}//for(i = 0; i < NUM_TRANS; i++)

	return set_proc;
}

void carregarEstadoInicial(FILE *filePtr, char *bufPtr) {
	int *falsoVetor;
	int i;

	estado_inicial.ID = 1;
	estado_inicial.passou = 0;
	estado_inicial.PT_indice = -1;
	estado_inicial.trans = -1;
	estado_inicial.time = -1;
	estado_inicial.time_max = -1;

	//Marcação Inicial
	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);

	falsoVetor = carregarVetor(bufPtr, NUM_PLACE);

	for (i = 0; i < NUM_PLACE; i++) {
		estado_inicial.M[i] = falsoVetor[i];
	}

	free(falsoVetor);

}

void carregarNomesLugares(FILE *filePtr, char *bufPtr) {
	char *token;
	int contador = 0;

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);

	token = strtok(bufPtr, "%");

	while (token != NULL) {
		strcpy(places.name[contador], token);
		token = strtok(NULL, "%");
		contador++;
	}

}

void carregarTransicoes(FILE *filePtr, char *bufPtr) {
	int *falsoVetor;
	char *token;
	int contador = 0;
	int i = 0;

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);

	token = strtok(bufPtr, "%");

	while (token != NULL) {
		strcpy(transitions.name[contador], token);
		token = strtok(NULL, "%");
		contador++;
	}

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);

	falsoVetor = carregarVetor(bufPtr, NUM_TRANS);

	//EFT
	for (i = 0; i < NUM_TRANS; i++) {
		transitions.eft[i] = falsoVetor[i];
	}

	free(falsoVetor);

	//LFT
	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);

	falsoVetor = carregarVetor(bufPtr, NUM_TRANS);

	for (i = 0; i < NUM_TRANS; i++) {
		transitions.lft[i] = falsoVetor[i];
	}

	free(falsoVetor);

}

void carregarVariaveisGlobais(FILE *filePtr, char *bufPtr) {
	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);
	PLACE_FINAL_MARK = atoi(bufPtr);

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);
	NUM_PLACE = atoi(bufPtr);

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);
	NUM_TRANS = atoi(bufPtr);

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);
	CHECAR_POTENCIA = atoi(bufPtr);

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);
	POTENCIA_TROCA_CONTEXTO_PROCESSADOR = atoi(bufPtr);

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);
	POTENCIA_MAXIMA = atoi(bufPtr);
}

/**
 * Carrega uma estrutura do tipo set trans
 */
void carregarSetTrans(struct set_trans *set_trans, FILE *filePtr, char *bufPtr) {
	char *token;
	int valor = 0;
	int *falsoVetor;
	int i = 0;
	int tamanho;

	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);

	token = strtok(bufPtr, "$");

	set_trans->card = atoi(token);

	token = strtok(NULL, "$");

	tamanho = set_trans->card;

	if (tamanho > 0) {
		falsoVetor = carregarVetor(token, tamanho);

		for (i = 0; i < tamanho; i++) {
			set_trans->trans[i] = falsoVetor[i];
		}

		free(falsoVetor);

	}//if(tamanho > 0)

}//void carregarSetTrans(struct set_trans *set_trans, FILE *filePtr, char *bufPtr)


void carregarSetPotencia(struct set_potencia *set_potencia, FILE *filePtr,
		char *bufPtr) {
	char *token;
	int valor = 0;
	int *falsoVetor;
	int i = 0;
	int tamanho;
	fgets(bufPtr, TAMANHO_BUFFER, filePtr);
	removerQuebraLinha(bufPtr);

	token = strtok(bufPtr, "$");

	set_potencia->card = atoi(token);

	token = strtok(NULL, "$");

	tamanho = set_potencia->card;

	if (tamanho > 0) {
		falsoVetor = carregarVetor(token, tamanho);

		for (i = 0; i < tamanho; i++) {
			set_potencia->potencia[i] = falsoVetor[i];
		}

		free(falsoVetor);

	}//if(tamanho > 0)

}//void carregarSetTrans(struct set_trans *set_trans, FILE *filePtr, char *bufPtr)

void carregar(char* filename) {
	FILE *filePtr;

	//PARA EVITAR O USO DO HEAP
	char *bufPtr = (char*) malloc(sizeof(char) * TAMANHO_BUFFER);

	int i = 0;

	filePtr = fopen(filename, "r");

	if (filePtr == NULL) {
		printf("ERROR#Arquivo não encontrado!\n");
		exit(0);
	}

	while (!feof(filePtr)) {

		fgets(bufPtr, TAMANHO_BUFFER, filePtr);

		//Chegou no final do arquivo
		if (strcmp(bufPtr, "##END-SPEC##")==0) {
			return;
		}

		removerQuebraLinha(bufPtr);

		if (strcmp(bufPtr, "##BEGIN##") == 0) {
			carregarVariaveisGlobais(filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TD##") == 0) {
			carregarSetTrans(&TD, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TA##") == 0) {
			carregarSetTrans(&TA, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TR##") == 0) {
			carregarSetTrans(&TR, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TE##") == 0) {
			carregarSetTrans(&TE, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TG##") == 0) {
			carregarSetTrans(&TG, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TC##") == 0) {
			carregarSetTrans(&TC, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TF##") == 0) {
			carregarSetTrans(&TF, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TO##") == 0) {
			carregarSetTrans(&TO, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TP##") == 0) {
			carregarSetTrans(&TP, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##PC##") == 0) {
			carregarSetPotencia(&PC, filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TASK-PROC##") == 0) {
			proc = carregarSetProc(filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##ESTADO_INICIAL##") == 0) {
			carregarEstadoInicial(filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##PLACES##") == 0) {
			carregarNomesLugares(filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##TRANSITIONS##") == 0) {
			carregarTransicoes(filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##POST##") == 0) {
			post = carregarPrePos(filePtr, bufPtr);

		} else if (strcmp(bufPtr, "##PRE##") == 0) {
			pre = carregarPrePos(filePtr, bufPtr);

		}

	}//while(!feof(filePtr))

	fclose(filePtr);
	free(bufPtr);
	//	

}//void carregar(char* filename)

void debug() {

	printf("PLACE_FINAL_MARK %d\n", PLACE_FINAL_MARK);
	printf("NUM_PLACE %d\n", NUM_PLACE);
	printf("NUM_TRANS %d\n", NUM_TRANS);
	printf("CHECAR_POTENCIA %d\n", CHECAR_POTENCIA);
	printf("POTENCIA_TROCA_CONTEXTO_PROCESSADOR %d\n",
			POTENCIA_TROCA_CONTEXTO_PROCESSADOR);
	printf("POTENCIA_MAXIMA %d\n", POTENCIA_MAXIMA);

	printSetTrans(TD, "TD");
	printSetTrans(TA, "TA");
	printSetTrans(TR, "TR");
	printSetTrans(TE, "TE");
	printSetTrans(TG, "TG");
	printSetTrans(TC, "TC");
	printSetTrans(TF, "TF");
	printSetTrans(TO, "TO");
	printSetTrans(TP, "TP");
	printSetPotencia(PC, "PC");
	printPlaceData(places, NUM_PLACE);
	printTransData(transitions, NUM_TRANS);
	printArray(estado_inicial.M, NUM_PLACE, "Initial Marking");
	printPrePost(post, NUM_TRANS, "post");
	printPrePost(pre, NUM_TRANS, "pre");
	printSetProc(proc, NUMERO_PROCESSADORES, "proc");
	//	printSetInibArch(inib_arch);


}

#endif

