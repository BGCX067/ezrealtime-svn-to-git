/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package br.ufam.ezrealtime.cde.editors.manifest;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.rules.IPredicateRule;
import org.eclipse.jface.text.rules.RuleBasedPartitionScanner;
import org.eclipse.jface.text.rules.SingleLineRule;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.ui.editors.text.FileDocumentProvider;

public class ManifestDocumentProvider extends FileDocumentProvider {
	/**
	 * The recipe partitioning. It contains two partition types: {@link #CODE}
	 * and {@link #COMMENT}.
	 */
	public static final String MF_PARTITIONING = "br.ufam.ezrealtime.cde.editors.manifest.partitioning"; //$NON-NLS-1$

	/**
	 * The identifier of the comment body type.
	 */
	public static final String CODE = IDocument.DEFAULT_CONTENT_TYPE;
	/**
	 * The identifier of the comment partition type.
	 */
	public static final String COMMENT = "RECIPE_COMMENT"; //$NON-NLS-1$

	private static final String[] CONTENT_TYPES = { CODE, COMMENT };

	protected void setupDocument(Object element, IDocument document) {
		if (document instanceof IDocumentExtension3) {
			IDocumentExtension3 ext = (IDocumentExtension3) document;
			IDocumentPartitioner partitioner = createPartitioner();
			ext.setDocumentPartitioner(MF_PARTITIONING, partitioner);
			partitioner.connect(document);
		}
	}

	private IDocumentPartitioner createPartitioner() {
		IPredicateRule[] rules = { new SingleLineRule(
				"#", null, new Token(COMMENT), (char) 0, true, false) }; //$NON-NLS-1$

		RuleBasedPartitionScanner scanner = new RuleBasedPartitionScanner();
		scanner.setPredicateRules(rules);

		return new FastPartitioner(scanner, CONTENT_TYPES);
	}

}
