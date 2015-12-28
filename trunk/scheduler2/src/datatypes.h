#ifndef __DATATYPES__
#define __DATATYPES__

#include "constants.h"

typedef enum {
	DEADLINE = 0,
	ARRIVAL,
	RELEASE,
	EXCLUSION,
	GRANT,
	COMPUTATION,
	FINAL,
	OTHERS,
	PRECEDENCE
} transitionType;

struct TransitionSet {
	transitionType *type;
	int cardinality;
	int transitions[MAX_NUM_TRANS];
};

struct TransitionCompProcSet {
	char *procName;
	int cardinality;
	int transition[MAX_NUM_TRANS];
};

struct PlaceData {
	char *name[MAX_NUM_PLACES];
};

struct TransitionData {
	char *name[MAX_NUM_TRANS];
	int eft[MAX_NUM_TRANS];
	int lft[MAX_NUM_TRANS];
};

struct PrePostCondition {
	int cardinality;
	int place[MAX_NUM_ARCS];
	int peso[MAX_NUM_ARCS];
};

struct State {
	int ID; // identificador do estado
	int passou;
	int M[MAX_NUM_PLACES]; // marcacao atual do estado
	int PT_indice; // indicativo de qual foi o indice do PT escolhido para disparar
	int trans; // transicao disparara para sair deste estado
	int time; // tempo de disparo da transicao acima
	int time_max; // tempo maximo permitido (que eh o min(DLFT)
	int cardET;
	int cardFT;
	int cardPT;
	int ET [MAX_NUM_ET];
	int VC [MAX_NUM_VC];
	int FT_trans[MAX_NUM_PT];
	int FT_tmin [MAX_NUM_PT];
	int PT_trans[MAX_NUM_PT];
	int PT_tmin [MAX_NUM_PT];
	int potenciaUtilizada; // A potencia utilizada ate o momento
	//Formato do codigo do estado
	//"MARCACOES_ESTADO-TRANSICOES_HABILITADAS-CLOCKS_DAS_TRANSICOES"
	//Ex: "1000000-635-111"
	//char *fakeHashCode;
	struct StateSlim *state_s;

};

struct StateSlim {
	int *M;
	int *ET;
	int *VC;
	int cardM;
	int cardET;

};

struct StateListItem {
	struct State estado;
	struct StateListItem *next;
	struct StateListItem *previous;
};

//Novo. Representa as potencias de todas as transicoes de computacao
struct SetPower {
	int card;
	int potencia[MAX_NUM_POWER];
};


#endif

