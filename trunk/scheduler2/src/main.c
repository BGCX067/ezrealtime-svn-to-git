/**
 * section: 
 * synopsis: 
 * purpose: 
 * usage: 
 * test: 
 * author: Fabiano Cruz
 * copy: see Copyright for the status of this software.
 */

#include <libxml/parser.h>
#include <libxml/xpath.h>
#include <libxml/xmlreader.h>

#include <stdio.h>
#include <string.h>

//#include "constants.h"
//#include "datatypes.h"

#include <sys/time.h>

#include "busca_estados.h"

#define Tempo(T1,T2) ((double)(((T2.tv_sec-T1.tv_sec)*1000000)+(T2.tv_usec-T1.tv_usec))/1000000)
struct timeval T1, T2;

struct StateListItem *item_atual_lista= NULL, *lista_primeiro_item= NULL;

int atual, max=0;
short JAH_TEVE_TRANS_GRANT_ANTERIOR=FALSE, transicao_grant_anterior=-1;
int counter = 0;

unsigned long int card_resultados = 0;
unsigned long int card_visited = 0;

#include "global.h"
#include "parser.h"
#include "petri-net.h"
#include "debug.h"

#if defined(LIBXML_XPATH_ENABLED) && defined(LIBXML_SAX1_ENABLED) && defined(LIBXML_READER_ENABLED) 

struct StateListItem *CRIA_ITEM_NA_LISTA() {

	struct StateListItem *item = malloc(sizeof(struct StateListItem));

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

struct StateListItem *REMOVER_ITEM_NA_LISTA(struct StateListItem *item,
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
void escolheTransTime(struct State *St) {

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

void ADICIONA_NOS_ESTADOS_VISITADOS(struct State S) {
	card_visited = card_visited + 1;
	//printf("Estados visitados %d\n",card_visited);
	ADICIONA_ESTADO(S);
}

short CHECA_SE_ESTADO_JA_FOI_VISITADO(struct State S) {
	return EXISTE_ESTADO(S);
}

simula() {
	short estado_recem_gerado;
	struct StateListItem *item_atual;

	JAH_TEVE_TRANS_GRANT_ANTERIOR = FALSE;
	atual = 0;

	item_atual = CRIA_ITEM_NA_LISTA();
	item_atual->estado = initialState;

	enabledTrans(&item_atual->estado);
	firableTrans(&item_atual->estado);
	prunedTrans(&item_atual->estado);
	escolheTransTime(&item_atual->estado);
	item_atual->estado.passou = TRUE;

	//Debug print 
	if (DEBUG_ENABLE)
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
				if (DEBUG_ENABLE)
					printState(item_atual->estado, transitions, max, atual);
				item_atual = REMOVER_ITEM_NA_LISTA(item_atual, TRUE);
				atual--;

			} else {
				ADICIONA_NOS_ESTADOS_VISITADOS(item_atual->estado);
			}

			if (item_atual->estado.M[placeFinalMark]) {
				//Debug print	      
				if (DEBUG_ENABLE)
					printState(item_atual->estado, transitions, max, atual);
				return atual;
			}

		}// if (item_atual->estado.passou !=TRUE)


		//Se a variavel atual for igual a zero, entao o algoritmo nao deve prosseguir
		//ALTERADO POR EDUARDO
		if (atual == 0|| item_atual == NULL || item_atual->previous == NULL) {
			//Debug print
			if (DEBUG_ENABLE)
				printState(item_atual->estado, transitions, max, atual);
			item_atual == NULL;
			return FALSE;
		}

		if (item_atual->estado.cardPT > 0) {
			escolheTransTime(&(item_atual->estado));
			//Debug print
			if (DEBUG_ENABLE)
				printStatePruned(item_atual->estado, transitions, max, atual);
			//Verifica a potencia gasta e incrementa a potenciaUtilizada ate o presente
			//momento
			if (checkPower) {
				incrementaPotencia(item_atual->previous->estado,
						&item_atual->estado);
			}

			//Verifica se a potencia utilizada ate o momento e maior do que a permitida
			//Se for, retorna ao estado anterior
			if (checkPower && (item_atual->estado.potenciaUtilizada > maxPower)) {
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
					if (checkPower && (transicao_grant_anterior != -1)
							&& (transicao_grant_anterior
									!= item_atual->estado.trans)) {
						item_atual->estado.potenciaUtilizada
								+= powerChangeProcCtx;
					}

					transicao_grant_anterior=item_atual->estado.trans;

				}//if (TRANSICAO_GRANT_PROCESSOR(item_atual->estado.trans))

				item_atual = CRIA_ITEM_NA_LISTA();
				atual++;

			}// else 

		} else {

			//Debug print
			if (DEBUG_ENABLE)
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
	struct StateListItem *aux = lista_primeiro_item;
	int ultimaPotencia = 0;

	fp = fopen(nomeArquivo, "w");

	for (i = 0; i < numOfProcessors; i++) {
		sprintf(line, "Proc=%s\n", compProcTransSet[i].procName);
		fprintf(fp, "%s", line);

		for (j = 0; j < compProcTransSet[i].cardinality; j++) {
			sprintf(line, "%s=%d\n",
					transitions.name[compProcTransSet[i].transition[j]],
					transitions.eft[compProcTransSet[i].transition[j]]);
			fprintf(fp, "%s", line);

		}//for(j = 0; j < proc[i].card; j++)
		sprintf(line, "#\n", compProcTransSet[i].procName);
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

	fclose(fp);
}

char *search_and_replace(const char *source, const char token,
		const char *replace) {

	char *result, *q, *s, c;
	size_t l = 1, r = strlen(replace);

	const char *p;
	for (p=source; (c=*(p++)) != '\0';) {
		if (c==token){
			l += r;
			break;
		}else{
			l++;
		}	
	}

	if ((result = malloc(l)) == NULL)
		return result;

	p=source, q=result;
	while ((c = *(p++)) != '\0') {
		if (c == token){
			for (s=replace; *q = *(s++); q++);
			break;
		}else{
			*(q++) = c;
		}	
	}
	*q = 0;

	return result;

}

int main(int argc, char **argv) {
	char *docname= NULL;
	xmlDocPtr doc= NULL;
	xmlNode *root_element= NULL;
	xmlXPathObjectPtr result= NULL;
	xmlTextReaderPtr reader;

	//int numOfTransitions = 0;
	//int numOfPlaces = 0;

	int Nestados;
	//char nomeArquivo[255] = "scheduler.dat";
	char* nomeArquivo= NULL;

	if (argc != 2) {
		printf("File name is missing!\n");
		return (1);
	}

	/*
	 * this initialize the library and check potential ABI mismatches
	 * between the version it was compiled for and the actual shared
	 * library used.
	 */
	LIBXML_TEST_VERSION

	docname = argv[1];

	nomeArquivo = search_and_replace(docname, '.', ".rtd");

	printf("DOC NAME: %s | OUTPUT FILE: %s", docname, nomeArquivo);
	
	doc = streamFile(docname);

	reader = xmlReaderForFile(docname, NULL, 0);

	if (NULL == reader) {
		fprintf(stderr, "%s: failed to create reader\n", argv[1]);
		return (1);
	}

	if (NULL != doc) {

		result= getnodeset(doc, (xmlChar*) "//place", NULL);
		numOfPlaces = getNumOfOccurrences(result);

		result= getnodeset(doc, (xmlChar*) "//transition", NULL);
		numOfTransitions = getNumOfOccurrences(result);

		/* TODO: check power */
		/* TODO: power change processor's context */
		/* TODO: max power */

		/*Get the root element node */
		root_element = xmlDocGetRootElement(doc);

		if (NULL != root_element) {

			/* Deadline transitions */
			loadTransitionsSet(&deadlineTransSet, root_element, _TD, _CMP_SIZE);

			/* Arrival transitions */
			loadArrivalTransitionsSet(&arrivalTransSet, root_element, _TA, 
			_TPH, 
			_CMP_SIZE);

			/* Release transitions */
			loadTransitionsSet(&releaseTransSet, root_element, _TR, _CMP_SIZE);

			/* TODO: Exclusion transitions */

			/* Grant transitions */
			loadTransitionsSet(&grantTransSet, root_element, _TG, _CMP_SIZE);

			/* Computation transitions */
			loadTransitionsSet(&computationTransSet, root_element, _TC, 
			_CMP_SIZE);

			/* Final transitions */
			loadTransitionsSet(&finalTransSet, root_element, _TF, _CMP_SIZE);

			/* Others transitions */
			loadOthersTransitionsSet(&othersTransSet, root_element);

			/* Precende transitions */
			loadTransitionsSet(&precedenceTransSet, root_element, _TPREC, 
			_CMP_SIZE);

			/* TODO: Power consumption */

			compProcTransSet = loadTransitionCompProcSet(doc, root_element);

			/* Initial marking */
			loadInitialMarking(doc, root_element, &initialState);

			result= getnodeset(doc, (xmlChar*) "//place", NULL);
			loadAllPlaces(&places, result);

			result = getnodeset(doc, (xmlChar*) "//transition", NULL);
			loadAllTransitions(reader, &transitions);

			preCondition = loadPrePostConditions(doc, root_element, "PRE");

			postCondition = loadPrePostConditions(doc, root_element, "POST");

#if DEBUG_ENABLE
			printHeaderData(placeFinalMark, numOfPlaces, numOfTransitions,
					checkPower, powerChangeProcCtx, maxPower);
			printTransitionsSet();
			printSetProc(compProcTransSet);
			printInitialMarking(numOfPlaces);
			printAllPlaces(numOfPlaces);
			printAllTransitions(numOfTransitions);
			printAllPrePosConditions(preCondition, postCondition,
					numOfTransitions);
			printFinalDbgBlock();
#endif		

		}//(NULL != root_element)

		//printf("Doc name --> %s\n", docname);

	} else {
		return (1);
	}

	//TODO integrate original scheduler source code 
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

	if (NULL != root_element)
		xmlFreeNode(root_element);

	if (NULL != result)
		xmlXPathFreeObject(result);

	//if (NULL != doc)
	//xmlFreeDoc(doc);

	/*
	 * Cleanup function for the XML library.
	 */
	xmlCleanupParser();
	/*
	 * this is to debug memory for regression tests
	 */
	xmlMemoryDump();

	return (0);

}

#else
int main(void) {
	fprintf(stderr, "XPath support not compiled in\n");
	exit(1);
}
#endif
