#ifndef __PRINTPARSER__
#define __PRINTPARSER__

void printSetTrans(struct set_trans set_trans, char* transName) {
	int i = 0;

	printf("%s ", transName);
	printf("{%d,{", set_trans.card);
	for (i = 0; i < set_trans.card; i++) {

		printf("%d", set_trans.trans[i]);

		if ((i + 1) != set_trans.card) {
			printf(",");
		}

	}

	printf("}}\n");
}

void printSetPotencia(struct set_potencia set_potencia, char* transName) {
	int i = 0;

	printf("%s ", transName);
	printf("{%d,{", set_potencia.card);
	for (i = 0; i < set_potencia.card; i++) {

		printf("%d", set_potencia.potencia[i]);

		if ((i + 1) != set_potencia.card) {
			printf(",");
		}

	}

	printf("}}\n");
}

void printPlaceData(struct placeData places, int NUM_PLACES) {
	int i = 0;

	printf("places ");
	printf("{");
	for (i = 0; i < NUM_PLACES; i++) {

		printf("%s", places.name[i]);

		if ((i + 1) != NUM_PLACES) {
			printf(",");
		}

	}

	printf("}\n");
}

void printArray(int array[], int tamanho, char* nome) {
	int i = 0;
	printf("%s ", nome);
	printf("{");
	for (i = 0; i < tamanho; i++) {

		printf("%d", array[i]);

		if ((i + 1) != tamanho) {
			printf(",");
		}

	}

	printf("}\n");

}
void printTransData(struct transData transitions, int NUM_TRANS) {
	int i = 0;

	printf("transitions ");
	printf("{");

	for (i = 0; i < NUM_TRANS; i++) {

		printf("%s", transitions.name[i]);

		if ((i + 1) != NUM_TRANS) {
			printf(",");
		}

	}

	printf("}\n");

	printArray(transitions.eft, NUM_TRANS, "eft");
	printArray(transitions.lft, NUM_TRANS, "lft");

}

void printPrePost(struct prepos* prepos, int NUM_TRANS, char* nome) {
	int i = 0;
	int j = 0;
	int tamanho = 0;

	printf("%s\n", nome);

	for (i = 0; i < NUM_TRANS; i++) {
		tamanho = prepos[i].card;

		printf("{%d,{", tamanho);

		for (j = 0; j < tamanho; j++) {
			printf("%d", prepos[i].lugar[j]);

			if ((j + 1) != tamanho) {
				printf(",");
			}

		}//for(j = 0; j < tamanho; j++)
		printf("},{");

		for (j = 0; j < tamanho; j++) {
			printf("%d", prepos[i].peso[j]);

			if ((j + 1) != tamanho) {
				printf(",");
			}

		}//for(j = 0; j < tamanho; j++)
		printf("}}\n");

	}//for(i = 0; i < NUM_TRANS; i++)

}

void printSetProc(struct set_proc* set_proc, int NUMERO_PROCESSADORES,
		char* nome) {
	int i = 0;
	int j = 0;
	int tamanho = 0;

	printf("%s\n", nome);

	for (i = 0; i < NUMERO_PROCESSADORES; i++) {
		tamanho = set_proc[i].card;

		printf("%s:{%d,{", set_proc[i].proc_name, tamanho);

		for (j = 0; j < tamanho; j++) {
			printf("%d", set_proc[i].trans[j]);

			if ((j + 1) != tamanho) {
				printf(",");
			}

		}//for(j = 0; j < tamanho; j++)
		printf("}}\n");

	}//for(i = 0; i < NUM_TRANS; i++)

}

/*void printSetInibArch(struct set_inib_arch inib_arch) {
 int i = 0;
 
 printf("set_inib_ach ");
 printf("{%d,", inib_arch.card);
 
 for(i = 0; i < inib_arch.card; i++) {
 
 printf("{%d,%d}", inib_arch.lugar[i], inib_arch.trans[i]);
 
 if((i + 1) != inib_arch.card) {
 printf(",");
 }
 
 }
 
 printf("}\n");
 
 
 }*/

#endif
