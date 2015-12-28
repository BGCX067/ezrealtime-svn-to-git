/**
 * section: 
 * synopsis: 
 * purpose: 
 * usage: 
 * test: 
 * author: Fabiano Cruz
 * copy: see Copyright for the status of this software.
 */

#ifndef DEBUG_H_
#define DEBUG_H_

#include "global.h"

#include <stdio.h>

void checkLastItrElem(int i, int cmp) {
	if ((i + 1) != cmp) {
		printf("%s", "%");
	}
}

void printHeaderData(const int placeFinalMark, const int numOfPlaces,
		const int numOfTransitions, const int checkPower,
		const int powerChangeProcCtx, const int maxPower) {

	printf("\n// ********* Initial Block *********\n");
	printf("//  PLACE FINAL MARK\n");
	printf("//  NUM OF PLACES\n");
	printf("//  NUM OF TRANSITIONS\n");
	printf("//  CHECK POWER\n");
	printf("//  POWER CHANGE PROCESSOR' CONTEXT\n");
	printf("//  MAX POWER\n");
	printf("##BEGIN##\n");
	printf("%d\n", placeFinalMark);
	printf("%d\n", numOfPlaces);
	printf("%d\n", numOfTransitions);
	printf("%d\n", checkPower);
	printf("%d\n", powerChangeProcCtx);
	printf("%d\n", maxPower);

}

void printTransitionsSet() {
	int i;
	printf("\n// ********* Deadline Transitions *********\n");
	printf("//Cardinality$transition1%%transition2%%....%%transitionN\n");
	printf("##TD##\n");
	printf("%d$", deadlineTransSet.cardinality);
	for (i = 0; i < deadlineTransSet.cardinality; i++) {
		printf("%d", deadlineTransSet.transitions[i]);
		checkLastItrElem(i, deadlineTransSet.cardinality);
	}
	NEW_LINE;
	printf("\n// ********* Arrival Transitions *********\n");
	printf("//Cardinality$transition1%%transition2%%....%%transitionN\n");
	printf("##TA##\n");
	printf("%d$", arrivalTransSet.cardinality);
	for (i = 0; i < arrivalTransSet.cardinality; i++) {
		printf("%d", arrivalTransSet.transitions[i]);
		checkLastItrElem(i, arrivalTransSet.cardinality);
	}
	NEW_LINE;
	printf("\n// ********* Release Transitions *********\n");
	printf("//Cardinality$transition1%%transition2%%....%%transitionN\n");
	printf("##TR##\n");
	printf("%d$", releaseTransSet.cardinality);
	for (i = 0; i < releaseTransSet.cardinality; i++) {
		printf("%d", releaseTransSet.transitions[i]);
		checkLastItrElem(i, releaseTransSet.cardinality);
	}
	NEW_LINE;
	printf("\n// ********* Grant Transitions *********\n");
	printf("//Cardinality$transition1%%transition2%%....%%transitionN\n");
	printf("##TG##\n");
	printf("%d$", grantTransSet.cardinality);
	for (i = 0; i < grantTransSet.cardinality; i++) {
		printf("%d", grantTransSet.transitions[i]);
		checkLastItrElem(i, grantTransSet.cardinality);
	}
	NEW_LINE;
	printf("\n// ********* Computation Transitions *********\n");
	printf("//Cardinality$transition1%%transition2%%....%%transitionN\n");
	printf("##TC##\n");
	printf("%d$", computationTransSet.cardinality);
	for (i = 0; i < computationTransSet.cardinality; i++) {
		printf("%d", computationTransSet.transitions[i]);
		checkLastItrElem(i, computationTransSet.cardinality);
	}
	NEW_LINE;
	printf("\n// ********* Final Transitions *********\n");
	printf("//Cardinality$transition1%%transition2%%....%%transitionN\n");
	printf("##TF##\n");
	printf("%d$", finalTransSet.cardinality);
	for (i = 0; i < finalTransSet.cardinality; i++) {
		printf("%d", finalTransSet.transitions[i]);
		checkLastItrElem(i, finalTransSet.cardinality);
	}
	NEW_LINE;
	printf("\n// ********* Other Transitions *********\n");
	printf("//Cardinality$transition1%%transition2%%....%%transitionN\n");
	printf("##TO##\n");
	printf("%d$", othersTransSet.cardinality);
	for (i = 0; i < othersTransSet.cardinality; i++) {
		printf("%d", othersTransSet.transitions[i]);
		checkLastItrElem(i, othersTransSet.cardinality);
	}
	NEW_LINE;
	printf("\n// ********* Precedence Transitions *********\n");
	printf("//Cardinality$transition1%%transition2%%....%%transitionN\n");
	printf("##TP##\n");
	printf("%d$", precedenceTransSet.cardinality);
	for (i = 0; i < precedenceTransSet.cardinality; i++) {
		printf("%d", precedenceTransSet.transitions[i]);
		checkLastItrElem(i, precedenceTransSet.cardinality);
	}
	NEW_LINE;

}

void printSetProc(struct TransitionCompProcSet* set_proc) {
	int i = 0, j = 0, size = 0;

	printf("\n// ********* Computation x Processor Transitions *********\n");
	printf("// NUMERO_PROCESSADORES\n");
	printf("// Processador1:Cardinalidade$transicao1%%transicao2%%....%%transicaoN\n");
	printf("// Processador2:Cardinalidade$transicao1%%transicao2%%....%%transicaoN\n");
	printf("// ...\n");
	printf("// ProcessadorN:Cardinalidade$transicao1%%transicao2%%....%%transicaoN\n");
	printf("##TASK-PROC##\n");

	printf("%d\n", numOfProcessors);
	for (i = 0; i < numOfProcessors; i++) {
		printf("%s:", set_proc[i].procName);
		size = set_proc[i].cardinality;
		printf("%d%s", size, "$");
		for (j = 0; j < size; j++) {
			printf("%d", set_proc[i].transition[j]);
			checkLastItrElem(j, size);
		}
	}
	NEW_LINE;

}

void printInitialMarking(const int numPlaces) {

	int i = 0;

	printf("\n// ********* Initial Marking *********\n");
	printf("// Marking_1%%Marking_3%%Marking_3%%...Marking_N\n");
	printf("##ESTADO_INICIAL##\n");

	for (i = 0; i < numPlaces; i++) {
		printf("%d%", initialState.M[i]);
		checkLastItrElem(i, numPlaces);
	}		

	NEW_LINE;
}

void printAllPlaces(const int numPlaces) {

	int i;

	printf("\n// ********* ALL Places *********\n");
	printf("##PLACES##\n");
	/*printf("%d\n", numPlaces);*/
	for (i = 0; i < numPlaces; i++) {
		printf("%s", places.name[i]);
		checkLastItrElem(i, numPlaces);
	}
	NEW_LINE;

}

void printAllTransitions(const int numTransitions) {
	int i;

	printf("\n// ********* ALL Transitions *********\n");
	printf("//Trans_Name1%%Trans_Name2%%Trans_Name3...%%Trans_NameN\n");
	printf("//EFT_Trans1%%EFT_Trans2%%EFT_Trans3...%%EFT_TransN\n");
	printf("//LFT_Trans1%%LFT_Trans2%%LFT_Trans3...%%LFT_TransN\n");
	printf("##TRANSITIONS##\n");
	for (i = 0; i < numTransitions; i++) {
		printf("%s", transitions.name[i]);
		checkLastItrElem(i, numTransitions);
	}
	NEW_LINE;
	for (i = 0; i < numTransitions; i++) {
		printf("%d", transitions.eft[i]);
		checkLastItrElem(i, numTransitions);
	}
	NEW_LINE;
	for (i = 0; i < numTransitions; i++) {
		printf("%d", transitions.lft[i]);
		checkLastItrElem(i, numTransitions);
	}
	NEW_LINE;

}

void printAllPrePosConditions(struct PrePostCondition* _pre,
		struct PrePostCondition* _pos, const int numTransitions) {
	int i = 0, j = 0, size = 0;

	printf("\n// ********* Post Conditions *********\n");
	printf("// Cardinalidade1$Lugar1%%Lugar2%%...%%LugarN$Peso1%%Peso2%%...%%PesoN\n");
	printf("// Cardinalidade2$Lugar1%%Lugar2%%...%%LugarN$Peso1%%Peso2%%...%%PesoN\n");
	printf("// ...\n");
	printf("// CardinalidadeN$Lugar1%%Lugar2%%...%%LugarN$Peso1%%Peso2%%...%%PesoN\n");
	printf("##POST##\n");
	/*printf("NUM OF TRANSITIONS: %d\n", numTransitions);*/
	for (i = 0; i < numTransitions; i++) {
		size = _pos[i].cardinality;
		printf("%d%s", size, "$");
		for (j = 0; j < size; j++) {
			printf("%d", _pos[i].place[j]);
			checkLastItrElem(j, size);
		}
		printf("$");
		for (j = 0; j < size; j++) {
			printf("%d", _pos[i].peso[j]);
			checkLastItrElem(j, size);
		}
		NEW_LINE;
	}
	NEW_LINE;

	printf("\n// ********* Pre Conditions *********\n");
	printf("// Cardinalidade1$Lugar1%%Lugar2%%...%%LugarN$Peso1%%Peso2%%...%%PesoN\n");
	printf("// Cardinalidade2$Lugar1%%Lugar2%%...%%LugarN$Peso1%%Peso2%%...%%PesoN\n");
	printf("// ...\n");
	printf("// CardinalidadeN$Lugar1%%Lugar2%%...%%LugarN$Peso1%%Peso2%%...%%PesoN\n");
	printf("##PRE##\n");
	/*printf("NUM OF TRANSITIONS: %d\n", numTransitions);*/
	for (i = 0; i < numTransitions; i++) {
		size = _pre[i].cardinality;
		printf("%d%s", size, "$");
		for (j = 0; j < size; j++) {
			printf("%d", _pre[i].place[j]);
			checkLastItrElem(j, size);
		}
		printf("$");
		for (j = 0; j < size; j++) {
			printf("%d", _pre[i].peso[j]);
			checkLastItrElem(j, size);
		}
		NEW_LINE;
	}
	NEW_LINE;
}

void printFinalDbgBlock() {
	printf("\n// ********* Final Block *********\n");
	printf("##END-SPEC##\n");
	NEW_LINE;
	NEW_LINE;
}

#endif /*DEBUG_H_*/
