package br.ufam.ezrealtime.cde.editors.manifest;

import java.util.ResourceBundle;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;
import org.eclipse.ui.texteditor.ChainedPreferenceStore;
import org.eclipse.ui.texteditor.ContentAssistAction;
import org.eclipse.ui.texteditor.ITextEditorActionDefinitionIds;

import br.ufam.edu.ezrealtime.cde.Activator;

public class ManifestEditor extends AbstractDecoratedTextEditor {

	static final String CONTENT_ASSIST = "ContentAssist"; //$NON-NLS-1$

	public ManifestEditor() {
		super();
		setSourceViewerConfiguration(new ManifestSourceViewerConfiguration(
				getSharedColors(), getPreferenceStore()));
		setDocumentProvider(new ManifestDocumentProvider());
	}

	protected void initializeEditor() {
		IPreferenceStore[] stores = { EditorsUI.getPreferenceStore(),
				Activator.getDefault().getPreferenceStore() };
		setPreferenceStore(new ChainedPreferenceStore(stores));
	}

	protected void createActions() {
		super.createActions();

		ResourceBundle bundle = ManifestEditorMessages.getBundle();
		ContentAssistAction action = new ContentAssistAction(bundle,
				"contentAssist.", this); //$NON-NLS-1$
		action
				.setActionDefinitionId(ITextEditorActionDefinitionIds.CONTENT_ASSIST_PROPOSALS);
		setAction(CONTENT_ASSIST, action);
	}

}
