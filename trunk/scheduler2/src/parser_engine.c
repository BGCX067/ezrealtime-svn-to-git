#ifndef PARSER_ENGINE_H_
#define PARSER_ENGINE_H_

#include <string.h>
#include <stdio.h>
#include <stdlib.h>

#include <libxml/parser.h>
#include <libxml/xpath.h>
#include <libxml/xpathInternals.h>

#include <assert.h>

#include "parser.h"

/**
 * register_namespaces:
 * @xpathCtx:		the pointer to an XPath context.
 * @nsList:		the list of known namespaces in 
 *			"<prefix1>=<href1> <prefix2>=href2> ..." format.
 *
 * Registers namespaces from @nsList in @xpathCtx.
 *
 * Returns 0 on success and a negative value otherwise.
 */
int register_namespaces(xmlXPathContextPtr xpathCtx, const xmlChar* nsList) {
	xmlChar* nsListDup;
	xmlChar* prefix;
	xmlChar* href;
	xmlChar* next;

	assert(xpathCtx);
	assert(nsList);

	nsListDup = xmlStrdup(nsList);
	if (nsListDup == NULL) {
		fprintf(stderr, "Error: unable to strdup namespaces list\n");
		return (-1);
	}

	next = nsListDup;
	while (next != NULL) {
		/* skip spaces */
		while ((*next) == ' ')
			next++;
		if ((*next) == '\0')
			break;

		/* find prefix */
		prefix = next;
		next = (xmlChar*)xmlStrchr(next, '=');
		if (next == NULL) {
			fprintf(stderr,"Error: invalid namespaces list format\n");
			xmlFree(nsListDup);
			return (-1);
		}
		*(next++) = '\0';

		/* find href */
		href = next;
		next = (xmlChar*)xmlStrchr(next, ' ');
		if (next != NULL) {
			*(next++) = '\0';
		}

		/* do register namespace */
		if (xmlXPathRegisterNs(xpathCtx, prefix, href) != 0) {
			fprintf(stderr,"Error: unable to register NS with prefix=\"%s\" and href=\"%s\"\n", prefix, href);
			xmlFree(nsListDup);
			return (-1);
		}
	}

	xmlFree(nsListDup);
	return (0);
}

xmlXPathObjectPtr getnodeset(xmlDocPtr doc, const xmlChar* xpath,
		const xmlChar* nsList) {

	xmlXPathContextPtr context;
	xmlXPathObjectPtr result;
	context = xmlXPathNewContext(doc);
	if (context == NULL) {
		printf("Error in xmlXPathNewContext\n");
		return NULL;
	}

	/* Register namespaces from list (if any) */
	if ((nsList != NULL) && (register_namespaces(context, nsList) < 0)) {
		fprintf(stderr,"Error: failed to register namespaces list \"%s\"\n", nsList);
		xmlXPathFreeContext(context);
		xmlFreeDoc(doc);
		return NULL;
	}

	result = xmlXPathEvalExpression(xpath, context);
	xmlXPathFreeContext(context);
	if (result == NULL) {
		printf("Error in xmlXPathEvalExpression\n");
		return NULL;
	}
	if (xmlXPathNodeSetIsEmpty(result->nodesetval)) {
		xmlXPathFreeObject(result);
		/*printf("No result\n");*/
		return NULL;
	}

	return result;
}

/**
 * streamFile:
 * @filename: the file name to parse
 *
 * Parse and print information about an XML file.
 */
xmlDocPtr streamFile(const char *filename) {
	xmlDocPtr doc;
	xmlNodePtr cur;
	
	if (filename == NULL) {
		printf("error, wrong file name!\n");
		return NULL;
	}

	doc = xmlParseFile(filename);
	if (doc == NULL) {
		fprintf(stderr,"Document not parsed successfully. \n");
		return NULL;
	}
	cur = xmlDocGetRootElement(doc);
	if (cur == NULL) {
		fprintf(stderr,"empty document\n");
		xmlFreeDoc(doc);
		return NULL;
	}
	if (xmlStrcmp(cur->name, (const xmlChar *) "pnml")) {
		fprintf(stderr,"document of the wrong type, root node != pnml\n");
		xmlFreeDoc(doc);
		return NULL;
	}

	return doc;
}

#endif /*PARSER_ENGINE_H_*/
