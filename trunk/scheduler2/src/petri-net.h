#ifndef __PETRI__
#define __PETRI__

//#include "parse.h"
#include "global.h"

//#include "datatypes.h"
//#include "sch_model.h"

#include "print.h"

//--------------------------------------------------------
//Retorna a potancia de uma transicao. Se nao for uma 
//transicao de computacao retorna 0.
//--------------------------------------------------------
int getPotencia(int transicao) {
	int resultado = 0;
	int i = 0;

	for (i = 0; i < computationTransSet.cardinality; i++) {
		if (computationTransSet.transitions[i] == transicao) {
			resultado = PC.potencia[i];
			break;
		}

	}

	return resultado;
}

//-------------------------------------------------------
// Atualiza a potencia utilizada ate o momento
//-------------------------------------------------------
void incrementaPotencia(struct State S, struct State *newS) {
	int potenciaTransicao = getPotencia(newS->trans);
	int potenciaAnterior = 0;

	potenciaAnterior = S.potenciaUtilizada;

	newS->potenciaUtilizada = potenciaAnterior + potenciaTransicao;

}

//--------------------------------------------------------
// checa se transicao t esta habilitada na marcacao M
//--------------------------------------------------------
int isEnabled(int M[], int t) {
	int i;
	for (i=0; i<preCondition[t].cardinality; i++)
		if (M[preCondition[t].place[i]] < preCondition[t].peso[i])
			return FALSE;
	return TRUE;
}

//Verifica se uma transição pode disparar de acordo com o arco inibidor
/*unsigned char verifyInhibiterArch(struct state *S, int trans) {
 unsigned char result = FALSE;
 int i;

 for(i = 0; i < inib_arch.card ;i++) {
 
 if(trans == inib_arch.trans[i]) {
 
 if(S->M[inib_arch.lugar[i]] > 0) {
 return TRUE;

 }
 
 return FALSE;
 }//if(trans == inib_arc.trans)
 
 }//for(i = 0; i < inib_arc.card ;i++)

 return result;
 }*/

//--------------------------------------------------------
// Gera o conjunto das transicoes habilitadas em um estado
//--------------------------------------------------------
void enabledTrans(struct State *S) {
	char enable=TRUE;
	int i, j;

	S->cardET = 0;
	for (i=0; i<numOfTransitions; i++) {
		enable = TRUE;
		//printf("transicao %s\n", transitions.name[i]);
		for (j=0; j<preCondition[i].cardinality; j++) {

			if ((S->M[preCondition[i].place[j]] < preCondition[i].peso[j])) {
				enable = FALSE;
			}

		}//for (j=0; j<pre[i].card; j++)

		if (enable) {
			S->ET[S->cardET] = i;
			S->cardET++;
		}//if (enable)

	}//for (i=0; i<NUM_TRANS; i++)

}//void enabledTrans(struct state *S)

//---------------------------------------------------------------
// Gera uma nova marcacao (newM) pelo disparo de uma transicao t
// - Ha a necessidade de M por que so sera alterado os lugares pre(t)
//   e pos(t).
//---------------------------------------------------------------
void newMarking(int M[], int newM[], int t) {
	int i;

	for (i=0; i<numOfPlaces; i++)
		newM[i] = M[i];
	
	if (isEnabled(M, t)) {
		for (i=0; i<preCondition[t].cardinality; i++)
			newM[preCondition[t].place[i]] = newM[preCondition[t].place[i]] - preCondition[t].peso[i];
		for (i=0; i<postCondition[t].cardinality; i++)
			newM[postCondition[t].place[i]] = newM[postCondition[t].place[i]] + postCondition[t].peso[i];
	} else {
		printf("TRANSICAO %s NAO HABILITADA!!\n", transitions.name[t]);
		exit(0);
	}
}

int MAXIMO(int v1, int v2) {
	if (v2>v1)
		return v2;
	return v1;
}

int ENCONTRA_POS_NO_VC(struct State *S, int trans) {
	int i;
	for (i=0; i<S->cardET; i++)
		if (S->ET[i]==trans)
			return i;
	printf("ENCONTRA POS NO CLOCK: TRANSICAO NAO HABILITADA\n");
	exit(1);
}

int DLFT(struct State *S, int trans) {
	int pos;
	pos = ENCONTRA_POS_NO_VC (S, trans);
	return transitions.lft[trans] - S->VC[pos];
}

int DEFT(struct State *S, int trans) {
	int pos;
	pos = ENCONTRA_POS_NO_VC (S, trans);
	return MAXIMO(0, transitions.eft[trans] - S->VC[pos]);
}

//---------------------------------------------------------------
// Em um estado S, gera o conjunto das transicoes disparaveis
// - A partir das transicoes habilitadas...
// - tempo maximo de disparo das transicoes = min(DLFT) entre
//   todas as transicoes habilitadas
//---------------------------------------------------------------
void firableTrans(struct State *S) {
	int i, j;
	int Deft, Dlft; // para cada transicao eh calculado o DEFT e o DLFT

	S->time_max = 3200000; // tempo de disparo maximo

	//---------------------------------------------------------------------------------
	// 1) calculando minDLFT (que eh o tempo maximo de disparo) dentre todas as ET's...
	//---------------------------------------------------------------------------------
	for (i=0; i<S->cardET; i++) {
		Dlft = DLFT(S, S->ET[i]);
		if (S->time_max > Dlft)
			S->time_max = Dlft;
	}

	//---------------------------------------------------------------------------
	// 2) selecionando quais transicoes tem DEFT menores ou iguais que o minDLFT
	//---------------------------------------------------------------------------
	S->cardFT=0;

	for (i=0; i<S->cardET; i++) {
		Deft = DEFT(S, S->ET[i]);
		if (Deft <= S->time_max) {
			S->FT_trans[S->cardFT] = S->ET[i];
			S->FT_tmin [S->cardFT] = Deft;
			S->cardFT++;
		}
	}
}

void ajustaVC(struct State S, struct State *newS) {
	int i, j;

	for (i=0; i<newS->cardET; i++) {
		newS->VC[i]=0; // default VC = 0
		//--------------------------------------------------------------------
		// Checando se esta transicao estava habilitada no estado anterior
		// - EXCECAO: se for igual a mesma transicao disparada para levar ao
		//   novo estado, nesse caso o valor do VC sera igual a 0
		//--------------------------------------------------------------------
		if (newS->ET[i]!=S.trans)
			for (j=0; j<S.cardET; j++)
				if (newS->ET[i]==S.ET[j])
					newS->VC[i] = S.VC[j] + S.time;
	}
}

void generateStateSlim(struct State *newS) {

	int i;
	newS->state_s = malloc(sizeof(struct StateSlim));

	if (newS->state_s == NULL) {
		printf("Sem memória para alocar state_s\n");
		exit(-1);
	}

	newS->state_s->M = malloc(sizeof(int) * numOfPlaces);
	newS->state_s->ET = malloc(sizeof(int) * newS->cardET);
	newS->state_s->VC = malloc(sizeof(int) * newS->cardET);

	if (newS->state_s->M == NULL || newS->state_s->ET == NULL
			|| newS->state_s->VC == NULL) {
		printf("Sem memória para alocar state_s arrays\n");
		exit(-1);
	}

	newS->state_s->cardET = newS->cardET;

	for (i = 0; i < numOfPlaces; i++) {
		newS->state_s->M[i] = newS->M[i];
	}

	for (i = 0; i < newS->cardET; i++) {
		newS->state_s->ET[i] = newS->ET[i];
		newS->state_s->VC[i] = newS->VC[i];
	}

}

/*void generateHashCode(struct state *newS) {
 int i;
 char buff[10];
 char *hashCodeSlim;
 //Esta incluso no somatorio da memoria alocada 2 hifens e o caractere de fim da string
 //Foi adicionado mais memoria para evitar problemas de segmentation fault
 newS->fakeHashCode= (char*) calloc(8 * NUM_PLACE + (8 * newS->cardET) + (8 * newS->cardET)+ 2, sizeof(char));
 
 if(newS->fakeHashCode == NULL) {
 printf("ERRO NA CRIACAO DO FAKE HASH CODE DO ESTADO. FALTA MEMORIA\n");
 exit(1);
 }

 
 for(i = 0; i < NUM_PLACE; i++) {
 sprintf(buff,"%d",newS->M[i]);
 strcat(newS->fakeHashCode,buff);
 
 if(i < (NUM_PLACE - 1)) {
 strcat(newS->fakeHashCode,"$");
 }
 }
 
 strcat(newS->fakeHashCode,"-");
 
 for(i = 0; i < newS->cardET; i++) {
 sprintf(buff, "%d", newS->ET[i]);
 strcat(newS->fakeHashCode,buff);		

 if(i < (newS->cardET - 1)) {
 strcat(newS->fakeHashCode,"$");
 }

 }
 strcat(newS->fakeHashCode,"-");

 for(i = 0; i < newS->cardET; i++) {
 sprintf(buff, "%d", newS->VC[i]);
 strcat(newS->fakeHashCode,buff);	

 if(i < (newS->cardET - 1)) {
 strcat(newS->fakeHashCode,"$");
 }

 }
 
 //Remove o espaço de memória que não está sendo utilizado
 //pelo fakehashCode
 //Eh a melhor forma?????
 hashCodeSlim = (char*) calloc(strlen(newS->fakeHashCode) + 1, sizeof(char));
 strcpy(hashCodeSlim,newS->fakeHashCode);
 free(newS->fakeHashCode);
 newS->fakeHashCode = hashCodeSlim;
 
 //printf("Hash code :%s\n",newS->fakeHashCode);
 
 
 }*/
void newStateGen(struct State S, struct State *newS) {
	int i = 0;

	newS->PT_indice = -1;
	newS->passou = TRUE;
	newMarking(S.M, newS->M, S.trans);
	enabledTrans(newS);
	ajustaVC(S, newS);
	firableTrans(newS);
	generateStateSlim(newS);

}

int TRANSICAO_DEADLINE(int trans) {
	int i;

	for (i=0; i<deadlineTransSet.cardinality; i++)
		if (deadlineTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int TRANSICAO_ARRIVAL(int trans) {
	int i;

	for (i=0; i<arrivalTransSet.cardinality; i++)
		if (arrivalTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int TRANSICAO_RELEASE(int trans) {
	int i;

	for (i=0; i<releaseTransSet.cardinality; i++)
		if (releaseTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int TRANSICAO_EXCLUSION(int trans) {
	int i;

	for (i=0; i<exclusionTransSet.cardinality; i++)
		if (exclusionTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int TRANSICAO_GRANT_PROCESSOR(int trans) {
	int i;

	for (i=0; i<grantTransSet.cardinality; i++)
		if (grantTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int TRANSICAO_COMPUTATION(int trans) {
	int i;

	for (i=0; i<computationTransSet.cardinality; i++)
		if (computationTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int TRANSICAO_FINAL_TASK(int trans) {
	int i;

	for (i=0; i<finalTransSet.cardinality; i++)
		if (finalTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int TRANSICAO_PRECEDENCE(int trans) {
	int i;

	for (i=0; i<precedenceTransSet.cardinality; i++)
		if (precedenceTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int TRANSICAO_OUTRAS(int trans) {
	int i;

	for (i=0; i<othersTransSet.cardinality; i++)
		if (othersTransSet.transitions[i]==trans)
			return TRUE;
	return FALSE;
}

int PRIORIDADE_MAX(struct State *S) {
	int i, max = 0;
	for (i=0; i<S->cardFT; i++) {
		if ((TRANSICAO_OUTRAS(S->FT_trans[i])) && (max<30))
			max = 30;
		if ((TRANSICAO_COMPUTATION(S->FT_trans[i])) && (max<23))
			max = 23;
		if ((TRANSICAO_RELEASE(S->FT_trans[i])) && (max<22))
			max = 22;

		if ((TRANSICAO_ARRIVAL(S->FT_trans[i])) && (max<20))
			max = 20;

		if ((TRANSICAO_PRECEDENCE(S->FT_trans[i])) && (max<18))
			max = 18;
		if ((TRANSICAO_FINAL_TASK(S->FT_trans[i])) && (max<17))
			max = 17;

		if ((TRANSICAO_EXCLUSION(S->FT_trans[i])) && (max<2))
			max = 2;
		if ((TRANSICAO_GRANT_PROCESSOR(S->FT_trans[i])) && (max<1))
			max = 1;
	}
	return max;
}

int BUSCA_POS_GRANT_PROCESSOR(int trans) {
	int i;

	for (i=0; i<grantTransSet.cardinality; i++)
		if (grantTransSet.transitions[i]==trans)
			return i;
	printf("BUSCA POS GRANT PROCESSOR: TRANSICAO NAO EH GRANT PROCESSOR\n");
	exit(1);
}

// Dada uma transicao grant-processor(t), retorna a respectiva transicao deadline
int TRANS_DEADLINE(int t) {
	return deadlineTransSet.transitions[BUSCA_POS_GRANT_PROCESSOR(t)];
}

// ordena as transicoes de grant-processor pelo minimo DLFT de todas as
// respectivas transicoes deadlines (das tarefas)
void ordenaMinDLFTDeadline(struct State *S) {
	int i, j, tmp;
	for (i=0; i<S->cardPT; i++)
		for (j=0; j<S->cardPT-1-i; j++) {
			if (DLFT(S, TRANS_DEADLINE(S->PT_trans[j])) > DLFT(S,
					TRANS_DEADLINE(S->PT_trans[j+1]))) {
				tmp = S->PT_trans[j];
				S->PT_trans[j] = S->PT_trans[j+1];
				S->PT_trans[j+1] = tmp;
			}
		}
}

void TRAZ_PRA_FRENTE_TRANS_GRANT_ANT(struct State *S, int trans) {
	int i, trans_temp, tempo_temp;

	if (trans==-1)
		return;
	for (i=0; i<S->cardPT; i++)
		if ((S->PT_trans[i]==trans)&& (i>0)) {
			trans_temp = S->PT_trans[i];
			tempo_temp = S->PT_tmin [i];
			S->PT_trans[i] = S->PT_trans[0];
			S->PT_tmin [i] = S->PT_tmin [0];
			S->PT_trans[0] = trans_temp;
			S->PT_tmin [0] = tempo_temp;
			return;
		}
}

void prunedTrans(struct State *S) {
	int i, max;
	//--------------------------------------------------------------------
	// Priorizando (PARTIAL-ORDER REDUCTION METHOD)
	// - Note que foram retiradas as transicoes que levam a estados 
	//   indesejaveis (Deadline missed)
	//--------------------------------------------------------------------
	max = PRIORIDADE_MAX(S);
	S->cardPT = 0;
	for (i=0; i<S->cardFT; i++) {
		switch (max) {
		case 20:
			if (TRANSICAO_ARRIVAL(S->FT_trans[i])) {
				S->PT_trans[S->cardPT] = S->FT_trans[i];
				S->PT_tmin[S->cardPT] = S->FT_tmin[i];
				S->cardPT++;
			}
			break;
		case 22:
			if (TRANSICAO_RELEASE(S->FT_trans[i])) {
				S->PT_trans[S->cardPT] = S->FT_trans[i];
				S->PT_tmin[S->cardPT] = S->FT_tmin[i];
				S->cardPT++;
			}
			break;
		case 18:
			if (TRANSICAO_PRECEDENCE(S->FT_trans[i])) {
				S->PT_trans[S->cardPT] = S->FT_trans[i];
				S->PT_tmin[S->cardPT] = S->FT_tmin[i];
				S->cardPT++;
			}
			break;
		case 17:
			if (TRANSICAO_FINAL_TASK(S->FT_trans[i])) {
				S->PT_trans[S->cardPT] = S->FT_trans[i];
				S->PT_tmin[S->cardPT] = S->FT_tmin[i];
				S->cardPT++;
			}
			break;
		case 23:
			if (TRANSICAO_COMPUTATION(S->FT_trans[i])) {
				S->PT_trans[S->cardPT] = S->FT_trans[i];
				S->PT_tmin[S->cardPT] = S->FT_tmin[i];
				S->cardPT++;
			}
			break;
		case 30:
			if (TRANSICAO_OUTRAS(S->FT_trans[i])) {
				S->PT_trans[S->cardPT] = S->FT_trans[i];
				S->PT_tmin[S->cardPT] = S->FT_tmin[i];
				S->cardPT++;
			}
			break;
		case 2:
			if (TRANSICAO_EXCLUSION(S->FT_trans[i])) {
				S->PT_trans[S->cardPT] = S->FT_trans[i];
				S->PT_tmin[S->cardPT] = S->FT_tmin[i];
				S->cardPT++;
			}
			break;
		case 1:
			if (TRANSICAO_GRANT_PROCESSOR(S->FT_trans[i])) {
				S->PT_trans[S->cardPT] = S->FT_trans[i];
				S->PT_tmin[S->cardPT] = S->FT_tmin[i];
				S->cardPT++;
			}
			break;
		}
	}
	// GUIAR A BUSCA 
	if (max==1) {
		//----------------------------------------------------------
		// 1. ORDENAR PELO EDF
		//----------------------------------------------------------
		ordenaMinDLFTDeadline(S);

		//----------------------------------------------------------
		// 2. Manter a mesma transicao de grant-processor anterior
		//----------------------------------------------------------
		TRAZ_PRA_FRENTE_TRANS_GRANT_ANT(S, transicao_grant_anterior);

	}
	//if (max==19) {imprimePT(*S);imprimeTempoMax(*S);getchar();}
}

#endif
