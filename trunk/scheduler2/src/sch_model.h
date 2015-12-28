/**
 * section: 
 * synopsis: 
 * purpose: 
 * usage: 
 * test: 
 * author: Fabiano Cruz
 * copy: see Copyright for the status of this software.
 */

#ifndef SCH_MODEL_H_
#define SCH_MODEL_H_

#include "datatypes.h"

int placeFinalMark; /**considerar que indice inicia de zero, i.e., [0,1,2,..]*/
int numOfPlaces;
int numOfTransitions;
int numOfProcessors;
int checkPower;
int powerChangeProcCtx;
int maxPower;

struct TransitionSet deadlineTransSet;
struct TransitionSet arrivalTransSet;
struct TransitionSet releaseTransSet;
struct TransitionSet exclusionTransSet;
struct TransitionSet grantTransSet;
struct TransitionSet computationTransSet;
struct TransitionSet finalTransSet;
struct TransitionSet precedenceTransSet;
struct TransitionSet othersTransSet;

//new
struct SetPower PC;

struct TransitionCompProcSet *compProcTransSet;

struct PlaceData places;

struct TransitionData transitions;

struct PrePostCondition *preCondition;

struct PrePostCondition *postCondition;

struct State initialState;

#endif /*SCH_MODEL_H_*/
