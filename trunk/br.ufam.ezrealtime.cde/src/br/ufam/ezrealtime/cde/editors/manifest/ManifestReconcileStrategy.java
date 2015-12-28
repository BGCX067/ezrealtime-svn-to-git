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

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.reconciler.DirtyRegion;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.IReconcilingStrategyExtension;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModelExtension;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.spelling.ISpellingProblemCollector;
import org.eclipse.ui.texteditor.spelling.SpellingContext;
import org.eclipse.ui.texteditor.spelling.SpellingProblem;
import org.eclipse.ui.texteditor.spelling.SpellingService;

public class ManifestReconcileStrategy implements IReconcilingStrategy,
		IReconcilingStrategyExtension {

	private final class SpellingProblemCollector implements
			ISpellingProblemCollector {
		List fProblems;

		public void beginCollecting() {
			fProblems = new LinkedList();
		}

		public void accept(final SpellingProblem problem) {
			fProblems.add(problem);
		}

		public void endCollecting() {
		}

		public List getProblems() {
			return fProblems;
		}
	}

	private final ISourceViewer fSourceViewer;

	private IDocument fDocument;
	private IProgressMonitor fMonitor;

	Annotation[] fPreviousAnnotations;

	public ManifestReconcileStrategy(final ISourceViewer sourceViewer) {
		fSourceViewer = sourceViewer;
	}

	public void setDocument(final IDocument document) {
		fDocument = document;
	}

	public void reconcile(final DirtyRegion dirtyRegion, final IRegion subRegion) {
		assert false;
	}

	public void reconcile(final IRegion partition) {
		checkSpelling();
	}

	private void checkSpelling() {
		final List problems = collectSpellingProblems();
		final Map annotations = createAnnotations(problems);

		final IAnnotationModelExtension model = (IAnnotationModelExtension) fSourceViewer
				.getAnnotationModel();
		model.replaceAnnotations(fPreviousAnnotations, annotations);
		fPreviousAnnotations = (Annotation[]) annotations.keySet().toArray(
				new Annotation[0]);
	}

	private List collectSpellingProblems() {
		final SpellingService service = EditorsUI.getSpellingService();
		final SpellingProblemCollector collector = new SpellingProblemCollector();
		service.check(fDocument, new SpellingContext(), collector, fMonitor);
		final List problems = collector.getProblems();
		return problems;
	}

	private static final String SPELLING_ID = "org.eclipse.ui.workbench.texteditor.spelling"; //$NON-NLS-1$

	private Map createAnnotations(final List problems) {
		final Map annotations = new HashMap();
		for (final Iterator it = problems.iterator(); it.hasNext();) {
			final SpellingProblem problem = (SpellingProblem) it.next();
			final Annotation annotation = new Annotation(SPELLING_ID, false, problem
					.getMessage());
			final Position position = new Position(problem.getOffset(), problem
					.getLength() + 1);
			annotations.put(annotation, position);
		}
		return annotations;
	}

	public void setProgressMonitor(final IProgressMonitor monitor) {
		fMonitor = monitor;
	}

	public void initialReconcile() {
		reconcile(new Region(0, fDocument.getLength()));
	}

}
