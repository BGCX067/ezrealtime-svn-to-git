/**
 * section: 
 * synopsis: 
 * purpose: 
 * usage: 
 * test: 
 * author: Fabiano Cruz
 * copy: see Copyright for the status of this software.
 */

#include "sch_model.h"
#include "parser.h"

#include <stdio.h>
#include <string.h>

#include <libxml/parser.h>
#include <libxml/xpath.h>
#include <libxml/xpathInternals.h>

int getNumOfOccurrences(xmlXPathObjectPtr result) {
	int numOfOccurrences = 0;
	xmlNodeSetPtr nodeset;
	if (result) {
		nodeset = result->nodesetval;
		numOfOccurrences = (nodeset) ? nodeset->nodeNr : 0;
	}
	return numOfOccurrences;
}

void loadAllPlaces(struct PlaceData *placeDataPtr, xmlXPathObjectPtr xpathResult) {

	xmlNodeSetPtr placeNodeSet;
	xmlNodePtr placeNode= NULL;

	xmlChar *placeID= NULL;
	int i = 0, index = 0;

	placeNodeSet = xpathResult->nodesetval;
	index = (placeNodeSet) ? placeNodeSet->nodeNr : 0;

	if (xpathResult) {

		for (i = 0; i < index; ++i) {
			if (placeNodeSet->nodeTab[i]->type == XML_ELEMENT_NODE) {
				placeNode = placeNodeSet->nodeTab[i];
				placeID = xmlGetProp(placeNode, (xmlChar*) "id");
				if (placeID != NULL) {
					/*printf("Place ID [%d] = %s \n", i, (char*)placeID);*/
					placeDataPtr->name[i] = (char*) calloc(
							(strlen((char*)placeID)+ 1), sizeof(char));
					placeDataPtr->name[i] = (char*) placeID;

					if ((!xmlStrcmp(placeID, (const xmlChar *)_PEND))) {
						placeFinalMark = i;
					}

				}
			}
		}

		/*xmlFree(placeID);*/
		/*xmlFreeNode(placeNode);*/

	}

	return;
}

void loadAllTransitions(xmlTextReaderPtr reader,
		struct TransitionData *transDataPtr) {

	const xmlChar *name, *value;
	xmlNodePtr curr_node=NULL;
	xmlChar *eft= NULL;
	xmlChar *transID= NULL;
	xmlChar *lft= NULL;

	int ret= 0, nodeType= 0, i= 0, auxidx= 0;

	ret = xmlTextReaderRead(reader);
	while (ret == 1) {

		name = xmlTextReaderConstName(reader);
		if (name == NULL)
			name = BAD_CAST "--";

		value = xmlTextReaderConstValue(reader);

		nodeType = xmlTextReaderNodeType(reader);

		if ((!xmlStrcmp(name, (const xmlChar *)"transition")) && nodeType == 1) {
			curr_node = xmlTextReaderCurrentNode(reader);
			transID = xmlGetProp(curr_node, (xmlChar*) "id");
			/*printf(" Current Node [%d]: %s | ID -> %s \n", i, curr_node->name,
			 (char*)transID);*/

			transDataPtr->name[i] = (char*) calloc((strlen((char*)transID)+ 1),
					sizeof(char));
			transDataPtr->name[i] = (char*) transID;

			auxidx = i++;
		}

		if ((!xmlStrcmp(name, (const xmlChar *)"time"))) {
			curr_node = xmlTextReaderCurrentNode(reader);
			eft = xmlGetProp(curr_node, (xmlChar*) "from");
			transDataPtr->eft[auxidx] = atoi((char*)eft);
			lft = xmlGetProp(curr_node, (xmlChar*) "to");
			transDataPtr->lft[auxidx] = atoi((char*)lft);
			/*printf(" Current Node [%d]: %s | EFT -> %s | LFT -> %s \n", auxidx,
			 curr_node->name, (char*)eft, (char*)lft);*/
		}

		ret = xmlTextReaderRead(reader);
	}
	xmlFreeTextReader(reader);
	if (ret != 0) {
		fprintf(stderr, ": failed to parse the file\n");
	}

}

struct TransitionCompProcSet* loadTransitionCompProcSet(xmlDocPtr doc,
		xmlNode *root_element) {

	struct TransitionCompProcSet *set_proc= NULL;

	xmlNodeSetPtr placeNodeSet;
	xmlNodeSetPtr arcNodeSet;

	xmlXPathObjectPtr result= NULL;
	xmlXPathObjectPtr result2= NULL;

	xmlNodePtr procPlaceNode= NULL;

	xmlChar *placeID= NULL;
	xmlChar *key= NULL;
	xmlChar *transSourceID= NULL;

	char *buf[MAX_NUM_TRANS];
	char *xpathExp= NULL;

	int i= 0, bufSize= 0, j= 0, z= 0;

	result = getnodeset(doc,
			(xmlChar*) "//place/name[starts-with(text, 'pproc_')]", NULL);

	if (result) {
		placeNodeSet = result->nodesetval;
		numOfProcessors = (placeNodeSet) ? placeNodeSet->nodeNr : 0;

		set_proc
				= (struct TransitionCompProcSet*) malloc(sizeof(struct TransitionCompProcSet)
						* numOfProcessors);

		for (i = 0; i < numOfProcessors; ++i) {

			bufSize = 0;

			if (placeNodeSet->nodeTab[i]->type == XML_ELEMENT_NODE) {

				procPlaceNode = placeNodeSet->nodeTab[i]->parent;
				placeID = xmlGetProp(procPlaceNode, (xmlChar*) "id");
				/*printf("PPROC Place ID: %s\n", (char*)placeID);*/

				procPlaceNode = placeNodeSet->nodeTab[i]->xmlChildrenNode;

				while (procPlaceNode != NULL) {
					if ((!xmlStrcmp(procPlaceNode->name,
							(const xmlChar *)"text"))) {
						/*printf("= element node \"%s\"\n", cur_node->name);*/
						key = xmlNodeListGetString(doc,
								procPlaceNode->xmlChildrenNode, 1);
						if (key != NULL) {
							set_proc[i].procName = (char*) calloc(
									(strlen((char*)key)+ 1), sizeof(char));
							set_proc[i].procName = strdup((char*)key);
						}
						xmlFree(key);
					}
					procPlaceNode = procPlaceNode->next;
				}

				xpathExp = (char*) calloc((strlen((char*)placeID)+ 18),
						sizeof(char));
				strcat(xpathExp, "//arc[@target='");
				strcat(xpathExp, (char*)placeID);
				strcat(xpathExp, "']");

				/*printf("XPATH EXP %s\n", xpathExp);*/

				result2 = getnodeset(doc, (xmlChar*)xpathExp, NULL);

				if (result2) {
					arcNodeSet = result2->nodesetval;

					/*printf("loadTransitionCompProcSet - result: %d\n",
					 arcNodeSet->nodeNr);*/

					for (j = 0; j < arcNodeSet->nodeNr; j++) {
						transSourceID = xmlGetProp(arcNodeSet->nodeTab[j],
								(xmlChar*) "source");
						buf[j] = (char*) malloc(sizeof(char)
								* arcNodeSet->nodeNr);
						buf[j] = (char*) transSourceID;
						bufSize = j;
					}

					xmlXPathFreeObject(result2);

				}
				/*printf("BUFFER SIZE: %d\n", bufSize);*/

				if (bufSize > 0) {
					loadProcTransitionsSet(set_proc, root_element, buf, bufSize);

					for (z = 0; z < bufSize + 1; z++) {
						free(buf[z]);
					}
				}

				xmlFree(placeID);
				free(xpathExp);
			}/*if */

		}/*for*/

		xmlFreeNode(procPlaceNode);
		xmlXPathFreeObject(result);

	}

	return set_proc;

}

static void populateWeight(xmlDocPtr doc, xmlNode * a_node,
		struct PrePostCondition *pre_post, int index, int i) {
	xmlNode *cur_node= NULL;
	xmlChar *weight= NULL;

	for (cur_node = a_node; cur_node; cur_node = cur_node->next) {
		if (cur_node->type == XML_ELEMENT_NODE) {
			/*printf("node type: Element, name: %s\n", cur_node->name);*/
			if ((!xmlStrcmp(cur_node->name, (const xmlChar *)"text"))) {
				weight= xmlNodeListGetString(doc, cur_node->xmlChildrenNode, 1);
				if (weight != NULL) {
					/*printf("PrePost [%d] | Key [%d]: %s\n", index, i,
					 (char*)weight);*/
					pre_post[index].peso[i] = atoi((char*)weight);
				}
				xmlFree(weight);
			}
		}

		populateWeight(doc, cur_node->children, pre_post, index, i);
	}
}

struct PrePostCondition* loadPrePostConditions(xmlDocPtr doc,
		xmlNode *root_element, const char* condType) {

	struct PrePostCondition *prePostStruct= NULL;

	xmlNodeSetPtr transNodeSet;
	xmlNodeSetPtr arcNodeSet;

	xmlXPathObjectPtr result= NULL;
	xmlXPathObjectPtr resultArcs= NULL;

	xmlNodePtr transNode= NULL;

	xmlChar *transID= NULL;
	xmlChar *placeID= NULL;

	char *buf[MAX_NUM_ARCS];

	char *xpathExp= NULL;

	int i= 0, j= 0, bufSize= 0, size= 0, z= 0, auxidx= 0;

	result = getnodeset(doc, (xmlChar*) "//transition", NULL);

	if (result) {
		transNodeSet = result->nodesetval;
		size = (transNodeSet) ? transNodeSet->nodeNr : 0;

		prePostStruct
				= (struct PrePostCondition*) malloc(sizeof(struct PrePostCondition)
						* size);

		for (i = 0; i < size; i++) {

			if (transNodeSet->nodeTab[i]->type == XML_ELEMENT_NODE) {

				transNode = transNodeSet->nodeTab[i];
				transID = xmlGetProp(transNode, (xmlChar*) "id");

				xpathExp = (char*) calloc((strlen((char*)transID)+ 18),
						sizeof(char));
				if (!(strcmp(condType, "PRE"))) {
					strcat(xpathExp, "//arc[@target='");
				} else if (!(strcmp(condType, "POST"))) {
					strcat(xpathExp, "//arc[@source='");
				}
				strcat(xpathExp, (char*)transID);
				strcat(xpathExp, "']");

				resultArcs = getnodeset(doc, (xmlChar*)xpathExp, NULL);

				/*printf("\nTransition ID: %s \t| ", (char*)transID);*/
				if (resultArcs) {
					arcNodeSet = resultArcs->nodesetval;

					/*printf("SIZE: %d\n", arcNodeSet->nodeNr);*/

					for (j = 0; j < arcNodeSet->nodeNr; j++) {

						if (!(strcmp(condType, "PRE"))) {
							placeID = xmlGetProp(arcNodeSet->nodeTab[j],
									(xmlChar*) "source");
						} else if (!(strcmp(condType, "POST"))) {
							placeID = xmlGetProp(arcNodeSet->nodeTab[j],
									(xmlChar*) "target");
						}

						buf[j] = (char*) malloc(sizeof(char)
								* arcNodeSet->nodeNr);
						buf[j] = (char*) placeID;

						populateWeight(doc,
								arcNodeSet->nodeTab[j]->xmlChildrenNode,
								prePostStruct, auxidx, j);

						bufSize = j;
					}

					if (arcNodeSet->nodeNr > 0) {

						loadPrePostStruct(prePostStruct, root_element, buf,
								bufSize, auxidx);

						/*printf("XPATH EXP %s \t | RESULT = %d \n", xpathExp,
						 bufSize+1);*/

						for (z = 0; z < bufSize + 1; z++) {
							free(buf[z]);
						}

					}

					bufSize = 0;

					xmlXPathFreeObject(resultArcs);

				}/* if (resultArcs) */

				/*xmlFree(placeSourceID);*/
				free(xpathExp);

			}/*if XML_ELEMENT_NODE */

			auxidx++;

		}/*for*/

		/*xmlFreeNode(transNode);*/
		xmlXPathFreeObject(result);

	}

	return prePostStruct;

}

void loadPrePostStruct(struct PrePostCondition *pre_post, xmlNode *node,
		char *buf[], const int bufSize, const int index) {

	int arrayIndex= 0, i= 0, j =0, count= 0;
	xmlChar *prop= NULL;
	xmlNode *cur_node= NULL;

	for (cur_node = node; cur_node; cur_node = cur_node->next) {
		if (cur_node->type == XML_ELEMENT_NODE) {
			if ((!xmlStrcmp(cur_node->name, (xmlChar*) "place"))) {
				prop = xmlGetProp(cur_node, (xmlChar*) "id");
				/*printf("Property [%d]: %s\n", i, prop);*/
				for (j = 0; j < bufSize + 1; j++) {
					if ((!strcmp((char*) prop, buf[j]))) {
						pre_post[index].cardinality = ++count;
						pre_post[index].place[arrayIndex++] = i;
						/*printf("\t PLACE [%d] -> %s\n", i, buf[j]);*/
						/*printf("=> CARD: %d\n\n", count);*/
					}
				}
				i++;
				xmlFree(prop);
			}
		}
		loadPrePostStruct(pre_post, cur_node->children, buf, bufSize, index);
	}

	xmlFreeNode(cur_node);

	return;
}

void loadProcTransitionsSet(struct TransitionCompProcSet *transSet,
		xmlNode *node, char *buf[], const int bufSize) {

	int arrayIndex= 0, i= 0, j =0, count= 0;
	xmlChar *prop= NULL;
	xmlNode *cur_node= NULL;

	for (cur_node = node; cur_node; cur_node = cur_node->next) {
		if (cur_node->type == XML_ELEMENT_NODE) {
			if ((!xmlStrcmp(cur_node->name, (xmlChar*) "transition"))) {
				prop = xmlGetProp(cur_node, (xmlChar*) "id");
				/*printf("Property [%d]: %s\n", i, prop);*/
				for (j = 0; j < bufSize + 1; j++) {
					if ((!strcmp((char*) prop, buf[j]))) {
						transSet->cardinality = ++count;
						transSet->transition[arrayIndex++] = i;
						/*printf("TRANSITION -> %s\n", buf[j]);*/
					}
				}
				i++;
				xmlFree(prop);
			}
		}
		loadProcTransitionsSet(transSet, cur_node->children, buf, bufSize);
	}

	xmlFreeNode(cur_node);

	return;
}

void loadTransitionsSet(struct TransitionSet *transSet, xmlNode *node,
		const char *transName, const int sizeForCmp) {

	int arrayIndex= 0, i= 0, count= 0;
	xmlChar *prop= NULL;
	xmlNode *cur_node= NULL;

	for (cur_node = node; cur_node; cur_node = cur_node->next) {
		if (cur_node->type == XML_ELEMENT_NODE) {
			if ((!xmlStrcmp(cur_node->name, (xmlChar*) "transition"))) {
				prop = xmlGetProp(cur_node, (xmlChar*) "id");
				if ((!strncmp((char*) prop, transName, sizeForCmp))) {
					transSet->cardinality = ++count;
					transSet->transitions[arrayIndex++] = i;
					/*printf("Property [%d]: %s\n", count, prop);*/
				}
				i++;
				xmlFree(prop);
			}
		}
		loadTransitionsSet(transSet, cur_node->children, transName, sizeForCmp);
	}

	xmlFreeNode(cur_node);

	return;
}

void loadInitialMarking(xmlDocPtr doc, xmlNode *root_element,
		struct State *initialMarkingPtr) {

	xmlNodeSetPtr placeNodeSet;

	xmlXPathObjectPtr result= NULL;

	xmlNodePtr placeNode= NULL;
	xmlNodePtr auxPlaceNode= NULL;
	
	xmlChar *placeID= NULL;
	xmlChar *key= NULL;
	
	int numOfNodes= 0, i= 0;

	initialMarkingPtr->ID = 1;
	initialMarkingPtr->passou = 0;
	initialMarkingPtr->PT_indice = -1;
	initialMarkingPtr->trans = -1;
	initialMarkingPtr->time = -1;
	initialMarkingPtr->time_max = -1;

	result = getnodeset(doc, (xmlChar*) "//place/initialMarking", NULL);

	if (result) {

		placeNodeSet = result->nodesetval;

		numOfNodes = (placeNodeSet) ? placeNodeSet->nodeNr : 0;

		//printf(" NumOfNodes: %d \n", numOfNodes);

		for (i = 0; i < numOfNodes; ++i) {

			if (placeNodeSet->nodeTab[i]->type == XML_ELEMENT_NODE) {
				
				auxPlaceNode = placeNodeSet->nodeTab[i]->parent;
				placeID = xmlGetProp(auxPlaceNode, (xmlChar*) "id");
				//printf("Place ID: %s\n", (char*)placeID);

				placeNode = placeNodeSet->nodeTab[i]->xmlChildrenNode;

				while (placeNode != NULL) {
					if ((!xmlStrcmp(placeNode->name, (const xmlChar *)"text"))) {
						//printf("\t element node [%d] \"%s\"\n", index++, placeNode->name);
						key = xmlNodeListGetString(doc,
								placeNode->xmlChildrenNode, 1);
						if (key != NULL) {
							initialMarkingPtr->M[i] = atoi((char*)key);

//							printf(" Current Node [%d]: %s | Marking -> %d \n", i,
//									placeID, initialMarkingPtr->M[i]);
						}
						xmlFree(key);
					}
					placeNode = placeNode->next;
				}

			}

		}

		xmlFreeNode(placeNode);
		xmlXPathFreeObject(result);

	}
	
}

int isKnownTransName(char *transProp) {

	int i= 0, sizeForCmp = 0;

	char *knownTrans[NUM_OF_KNOWN_TRANS] = { _TD, _TA, _TPH, _TR, _TG, _TC,
			_TF, _TPREC };

	for (i = 0; i < NUM_OF_KNOWN_TRANS; i ++) {
		if (NULL != transProp && NULL != knownTrans[i]) {
			sizeForCmp = strlen(knownTrans[i]);
			if ((!strncmp(transProp, knownTrans[i], sizeForCmp))) {
				return (1);
			}
		}
	}

	return (0);
}

void loadOthersTransitionsSet(struct TransitionSet *othersTransSet,
		xmlNode *node) {

	int arrayIndex= 0, i= 0, count= 0;
	xmlChar *prop= NULL;
	xmlNode *cur_node= NULL;

	for (cur_node = node; cur_node; cur_node = cur_node->next) {
		if (cur_node->type == XML_ELEMENT_NODE) {
			if ((!xmlStrcmp(cur_node->name, (xmlChar*) "transition"))) {
				prop = xmlGetProp(cur_node, (xmlChar*) "id");
				if (!(isKnownTransName((char*)prop))) {
					othersTransSet->cardinality = ++count;
					othersTransSet->transitions[arrayIndex++] = i;
					//printf("Property [%d]: %s\n", count, prop);
				}
				i++;
				xmlFree(prop);
			}
		}
		loadOthersTransitionsSet(othersTransSet, cur_node->children);
	}

	xmlFreeNode(cur_node);

	return;
}

void loadArrivalTransitionsSet(struct TransitionSet *transSet, xmlNode *node,
		const char *transName, const char *secTransName, const int sizeForCmp) {

	int arrayIndex= 0, i= 0, count= 0;
	xmlChar *prop= NULL;
	xmlNode *cur_node= NULL;

	for (cur_node = node; cur_node; cur_node = cur_node->next) {
		if (cur_node->type == XML_ELEMENT_NODE) {
			if ((!xmlStrcmp(cur_node->name, (xmlChar*) "transition"))) {
				prop = xmlGetProp(cur_node, (xmlChar*) "id");
				if ((!strncmp((char*) prop, transName, sizeForCmp))) {
					transSet->cardinality = ++count;
					transSet->transitions[arrayIndex++] = i;
					/*printf("Property [%d]: %s\n", count, prop);*/
				}
				if ((!strncmp((char*) prop, secTransName, sizeForCmp))) {
					/*printf("%s \t| Index = %d \n", (char*) prop, i);*/
					transSet->cardinality = ++count;
					transSet->transitions[arrayIndex++] = i;
				}
				i++;
				xmlFree(prop);
			}
		}
		loadArrivalTransitionsSet(transSet, cur_node->children, transName,
				secTransName, sizeForCmp);
	}

	xmlFreeNode(cur_node);

	return;
}
