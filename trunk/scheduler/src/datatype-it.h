#ifndef __DATATYPES__
#define __DATATYPES__

#include "consts.h"

struct state_slim {
	int *M;
	int *ET;
	int *VC;
	int cardM;
	int cardET;

};

struct placeData {
	char name[NUM_PLACE_MAX][NAME_SIZE_MAX];
};

struct prepos {
	int card;
	int lugar[MAX_ARCOS];
	int peso[MAX_ARCOS];
};

struct transData {
	char name[NUM_TRANS_MAX][NAME_SIZE_MAX];
	int eft[NUM_TRANS_MAX];
	int lft[NUM_TRANS_MAX];
};

struct set_trans {
	int card;
	int trans[NUM_TRANS_MAX];
};

//Novo. Representa as potencias de todas as transicoes de computacao
struct set_potencia {
	int card;
	int potencia[NUM_POTENCIA_MAX];
};

struct state {
	int ID; // identificador do estado
	int passou;
	int M[NUM_PLACE_MAX]; // marcacao atual do estado
	int PT_indice; // indicativo de qual foi o indice do PT escolhido para disparar
	int trans; // transicao disparara para sair deste estado
	int time; // tempo de disparo da transicao acima
	int time_max; // tempo maximo permitido (que eh o min(DLFT)
	int cardET;
	int cardFT;
	int cardPT;
	int ET [NUM_ET_MAX];
	int VC [NUM_VC_MAX];
	int FT_trans[NUM_PT_MAX];
	int FT_tmin [NUM_PT_MAX];
	int PT_trans[NUM_PT_MAX];
	int PT_tmin [NUM_PT_MAX];
	int potenciaUtilizada; // A potencia utilizada ate o momento
	//Formato do codigo do estado
	//"MARCACOES_ESTADO-TRANSICOES_HABILITADAS-CLOCKS_DAS_TRANSICOES"
	//Ex: "1000000-635-111"
	//char *fakeHashCode;
	struct state_slim *state_s;

};

struct state_list_item {
	struct state estado;
	struct state_list_item *next;
	struct state_list_item *previous;
};

struct set_proc {
	int card;
	char *proc_name;
	int *trans;
};

/*struct set_inib_arch {
 int card;
 int *lugar;
 int *trans;
 };*/

#endif

