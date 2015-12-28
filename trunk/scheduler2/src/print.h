#ifndef __PRINT__
#define __PRINT__

void imprimeET(struct State S) {
	int i;

	printf("ET...CardET=%d\n", S.cardET);
	for (i=0; i<S.cardET; i++)
		printf ("(%d-%s, %d)\t", S.ET[i], transitions.name[S.ET[i]], S.VC[i]);
	printf("\n");
}

void imprimeMarking(int M[]) {
	int i;

	printf("Marking...\n");
	for (i=0; i<numOfPlaces; i++)
		printf ("%d\t", M[i]);
	printf("\n");
}

void imprimeFT(struct State S) {
	int i;

	printf("FT...CardFT=%d\n", S.cardFT);
	for (i=0; i<S.cardFT; i++)
		printf ("(%d-%s, %d)\t", S.FT_trans[i],
				transitions.name[S.FT_trans[i]], S.FT_tmin[i]);
	printf("\n");
}

void imprimePT(struct State S) {
	int i;

	//printf("PT...CardPT=%d\n", S.cardPT);
	for (i=0; i<S.cardPT; i++)
		printf ("(%d-%s, %d)\t", S.PT_trans[i],
				transitions.name[S.PT_trans[i]], S.PT_tmin[i]);
	printf("\n");
}

void imprimeTempoMax(struct State S) {
	printf("Tempo Maximo de Disparo: %d\n", S.time_max);
}

void imprimeTransTime(struct State S) {
	printf("ID: %d Transicao %d-%s escolhida para disparar no tempo %d\n",
			S.ID, S.trans, transitions.name[S.trans], S.time);
}

void printState(struct State state, struct TransitionData transitions, int visited,
		int valid) {
	int i=0;

	printf("\n\n============State ID:%04d===============", state.ID);

	printf("\n%04d-Enable:(%3d)#", state.ID, state.cardET);
	for (i = 0; i < state.cardET; i++) {
		printf("{%s} ", transitions.name[state.ET[i]]);
	}

	/*	printf("\n%04d-Type :(%3d)#",state.ID,state.cardET);	
	 for (i = 0; i < state.c; i++)
	 {
	 printf("{%3c} ",TransTypeToChar(transitions[state.enabled_trans_set[i].trans_idx].type));
	 }
	 */
	printf("\n%04d-Clock :(%3d)#", state.ID, state.cardET);
	for (i = 0; i < state.cardET; i++) {
		printf("{%3d} ", state.VC[i]);
	}

	printf("\n%04d-eft   :(%3d)#", state.ID, state.cardET);
	for (i = 0; i < state.cardET; i++) {
		printf("{%3d} ", transitions.eft[state.ET[i]]);
	}

	printf("\n%04d-lft   :(%3d)#", state.ID, state.cardET);
	for (i = 0; i < state.cardET; i++) {
		printf("{%3d} ", transitions.lft[state.ET[i]]);
	}

	printf("\n");

	printf("\n%04d-Fireable:(%3d)#", state.ID, state.cardFT);
	for (i = 0; i < state.cardFT; i++) {
		printf("{%s} ", transitions.name[state.FT_trans[i]]);
	}

	printf("\n");

	printf("\nVisitados  :%04d", visited);
	printf("\nValidos    :%04d", valid);

	printf("\n");
}

void printStatePruned(struct State state, struct TransitionData transitions,
		int visited, int valid) {
	int i;

	printf("\n============State ID:%04d===============", state.ID);

	printf("\n%04d-Enable:(%3d)#", state.ID, state.cardET);
	for (i = 0; i < state.cardET; i++) {
		printf("{%s} ", transitions.name[state.ET[i]]);
	}

	/*	printf("\n%04d-Type :(%3d)#",state.ID,state.cardET);	
	 for (i = 0; i < state.c; i++)
	 {
	 printf("{%3c} ",TransTypeToChar(transitions[state.enabled_trans_set[i].trans_idx].type));
	 }
	 */
	printf("\n%04d-Clock :(%3d)#", state.ID, state.cardET);
	for (i = 0; i < state.cardET; i++) {
		printf("{%3d} ", state.VC[i]);
	}

	printf("\n%04d-eft   :(%3d)#", state.ID, state.cardET);
	for (i = 0; i < state.cardET; i++) {
		printf("{%3d} ", transitions.eft[state.ET[i]]);
	}

	printf("\n%04d-lft   :(%3d)#", state.ID, state.cardET);
	for (i = 0; i < state.cardET; i++) {
		printf("{%3d} ", transitions.lft[state.ET[i]]);
	}

	printf("\n");

	printf("\n%04d-Fireable:(%3d)#", state.ID, state.cardFT);
	for (i = 0; i < state.cardFT; i++) {
		printf("{%s} ", transitions.name[state.FT_trans[i]]);
	}

	printf("\n%04d-Pruned  :(%3d)#", state.ID, state.cardPT);
	for (i = 0; i < state.cardPT; i++) {
		printf("{%s} ", transitions.name[state.PT_trans[i]]);
	}
	/*	
	 printf("\n%04d-Select :(%3d)#",state. ID,ID,state.cardPT);	
	 for (i = 0; i < state.cardPT; i++)
	 {
	 printf("{%3d} ",state.flag_inside_fireable_domain[i]);
	 }
	 */
	printf("\n");

	printf("\nFiring Trans: %s", transitions.name[state.trans]);
	printf("\nFiring Time : %3d", state.time);
	printf("\nFiring T_max: %3d", state.time_max);

	printf("\n");

	printf("\nVisitados  :%04d", visited);
	printf("\nValidos    :%04d", valid);

	printf("\n");
}

#endif
