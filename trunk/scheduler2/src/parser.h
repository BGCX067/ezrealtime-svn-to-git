#ifndef PARSER_H_
#define PARSER_H_

#include <libxml/parser.h>
#include <libxml/xpath.h>
#include <libxml/xmlreader.h>

//#include "sch_model.h"
//#include "datatypes.h"

#include "global.h"

xmlDocPtr streamFile(const char *filename);

xmlXPathObjectPtr getnodeset(xmlDocPtr doc, const xmlChar* xpath,
		const xmlChar* nsList);

int getNumOfOccurrences(xmlXPathObjectPtr);

void loadTransitionsSet(struct TransitionSet *, xmlNode *, const char *,
		const int);

void loadOthersTransitionsSet(struct TransitionSet *othersTransSet,
		xmlNode *node);

void loadArrivalTransitionsSet(struct TransitionSet *transSet, xmlNode *node,
		const char *transName, const char *sectransName, const int sizeForCmp);

void loadAllPlaces(struct PlaceData *, xmlXPathObjectPtr);

void loadAllTransitions(xmlTextReaderPtr reader,
		struct TransitionData *transDataPtr);

void loadProcTransitionsSet(struct TransitionCompProcSet *transSet,
		xmlNode *node, char *buf[], const int);

void loadPrePostStruct(struct PrePostCondition *, xmlNode *, char *buf[],
		const int, const int);

struct TransitionCompProcSet* loadTransitionCompProcSet(xmlDocPtr, xmlNode *);

struct PrePostCondition* loadPrePostConditions(xmlDocPtr, xmlNode *,
		const char*);

void loadInitialMarking(xmlDocPtr doc,
		xmlNode *root_element, struct State *initialMarkingPtr);

#endif /*PARSER_H_*/
