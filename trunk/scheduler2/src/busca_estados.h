#include <search.h>
//#include "sch_model.h"
#include "global.h"

void *root = NULL;

int node_compare(const void *node1, const void *node2) {
	struct StateSlim *state1;
	struct StateSlim *state2;
	int i;

	state1 = (struct StateSlim *) node1;
	state2 = (struct StateSlim *) node2;

	for (i = 0; i < numOfPlaces; i++) {

		if (state1->M[i] != state2->M[i]) {
			return (state1->M[i] - state2->M[i]);
		}
	}

	if (state1->cardET != state2->cardET) {
		return (state1->cardET - state2->cardET);
	}

	for (i = 0; i <state1->cardET; i++) {
		if (state1->ET[i] != state2->ET[i]) {
			return (state1->ET[i] - state2->ET[i]);
		}
	}

	for (i = 0; i <state1->cardET; i++) {
		if (state1->VC[i] != state2->VC[i]) {
			return (state1->VC[i] - state2->VC[i]);
		}
	}

	//int result =  strcmp((char *) node1, (char*) node2);


	return 0;
}

void ADICIONA_ESTADO(struct State S) {
	//char *hashCode = NULL;
	//hashCode = S.fakeHashCode;

	tsearch((void *)S.state_s, &root, node_compare);
}

short EXISTE_ESTADO(struct State S) {
	void *resultado;

	//char *r;
	resultado = tfind((void *) S.state_s, &root, node_compare);

	if (resultado != NULL) {
		return TRUE;
	}

	return FALSE;
}

