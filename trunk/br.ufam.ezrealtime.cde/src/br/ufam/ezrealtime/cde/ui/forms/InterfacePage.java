package br.ufam.ezrealtime.cde.ui.forms;

import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.ScrolledForm;

public class InterfacePage extends FormPage {
	private InterfacePropertiesBlock block;

	public InterfacePage(FormEditor editor) {
		super(editor, "interface", "Interface");
		block = new InterfacePropertiesBlock(this);
	}

	@Override
	protected void createFormContent(final IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		// FormToolkit toolkit = managedForm.getToolkit();
		form.setText("Form with scrolled sections");
		// form.setBackgroundImage(ExamplesPlugin.getDefault().getImage(
		// ExamplesPlugin.IMG_FORM_BG));
		block.createContent(managedForm);
	}
}
