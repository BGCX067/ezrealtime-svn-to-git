package br.ufam.ezrealtime.cde.editors.manifest;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.jface.text.contentassist.ContentAssistant;
import org.eclipse.jface.text.contentassist.IContentAssistant;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.reconciler.IReconciler;
import org.eclipse.jface.text.reconciler.IReconcilingStrategy;
import org.eclipse.jface.text.reconciler.MonoReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.jface.text.rules.RuleBasedScanner;
import org.eclipse.jface.text.rules.Token;
import org.eclipse.jface.text.rules.WordRule;
import org.eclipse.jface.text.source.ISharedTextColors;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.ui.editors.text.TextSourceViewerConfiguration;
import org.eclipse.ui.texteditor.HippieProposalProcessor;

public class ManifestSourceViewerConfiguration extends
		TextSourceViewerConfiguration {

	private final ISharedTextColors fSharedColors;

	public ManifestSourceViewerConfiguration(ISharedTextColors sharedColors,
			IPreferenceStore preferenceStore) {
		super(preferenceStore);
		fSharedColors = sharedColors;
	}

	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return ManifestDocumentProvider.MF_PARTITIONING;
	}

	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] { ManifestDocumentProvider.CODE,
				ManifestDocumentProvider.COMMENT };
	}

	public IReconciler getReconciler(ISourceViewer sourceViewer) {
		IReconcilingStrategy strategy = new ManifestReconcileStrategy(
				sourceViewer);
		return new MonoReconciler(strategy, false);
	}

	public IContentAssistant getContentAssistant(
			final ISourceViewer sourceViewer) {
		ContentAssistant assistant = new ContentAssistant();
		assistant
				.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));

		assistant.setContentAssistProcessor(new HippieProposalProcessor(),
				ManifestDocumentProvider.COMMENT);
		assistant.setContentAssistProcessor(new ManifestTemplateProcessor(),
				ManifestDocumentProvider.CODE);

		return assistant;
	}

	public IPresentationReconciler getPresentationReconciler(
			ISourceViewer sourceViewer) {
		PresentationReconciler reconciler = new PresentationReconciler();
		reconciler
				.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));

		addDamagerRepairer(reconciler, createCommentScanner(),
				ManifestDocumentProvider.COMMENT);
		addDamagerRepairer(reconciler, createManifestScanner(),
				ManifestDocumentProvider.CODE);

		return reconciler;
	}

	private void addDamagerRepairer(PresentationReconciler reconciler,
			RuleBasedScanner commentScanner, String contentType) {
		DefaultDamagerRepairer commentDamagerRepairer = new DefaultDamagerRepairer(
				commentScanner);
		reconciler.setDamager(commentDamagerRepairer, contentType);
		reconciler.setRepairer(commentDamagerRepairer, contentType);
	}

	private RuleBasedScanner createManifestScanner() {
		RuleBasedScanner recipeScanner = new RuleBasedScanner();

		IRule[] rules = { createManifestAttributesRule(),
				createEBundleManifestEntriesRule() };
		recipeScanner.setRules(rules);
		return recipeScanner;
	}

	private IRule createEBundleManifestEntriesRule() {
		IToken eBundleAttToken = new Token(new TextAttribute(fSharedColors
				.getColor(new RGB(128, 0, 0)), // Êforeground
				null, // Êbackground
				SWT.BOLD) // Êstyle
		);
		WordRule wordRule = new WordRule(new WordDetector());
		for (EmbeddedBundleAttributes atts : EmbeddedBundleAttributes.values()) {
			wordRule.addWord(atts.getDisplayName(), eBundleAttToken);
		}
		wordRule.setColumnConstraint(0);
		return wordRule;
	}

	private IRule createManifestAttributesRule() {
		IToken mfAttToken = new Token(new TextAttribute(fSharedColors
				.getColor(new RGB(128, 0, 0))));
		WordRule wordRule = new WordRule(new WordDetector());
		for (ManifestAttributes atts : ManifestAttributes.values()) {
			wordRule.addWord(atts.getDisplayName(), mfAttToken);
		}
		wordRule.setColumnConstraint(0);
		return wordRule;
	}

	private RuleBasedScanner createCommentScanner() {
		Color gray = fSharedColors.getColor(new RGB(169, 169, 169));
		RuleBasedScanner commentScanner = new RuleBasedScanner();
		commentScanner
				.setDefaultReturnToken(new Token(new TextAttribute(gray)));
		return commentScanner;
	}

	private static final class WordDetector implements IWordDetector {
		public boolean isWordPart(final char c) {
			return !Character.isWhitespace(c);
		}

		public boolean isWordStart(final char c) {
			return !Character.isWhitespace(c);
		}
	}

}
