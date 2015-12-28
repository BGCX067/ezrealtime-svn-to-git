package br.ufam.ezrealtime.cde.editors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

import br.ufam.ezrealtime.cde.ui.forms.DependenciesPage;
import br.ufam.ezrealtime.cde.ui.forms.InterfacePage;
import br.ufam.ezrealtime.cde.ui.forms.OverviewPage;
import br.ufam.ezrealtime.cde.ui.forms.UIResources;

public class EBundleFormEditor extends FormEditor {

	public static final String ID = "br.ufam.ezrealtime.ebundle.editors.EBundleFormEditor";

	@Override
	protected FormToolkit createToolkit(Display display) {
		// Create a toolkit that shares colors between editors.
		return new FormToolkit(UIResources.getInstance().getFormColors(display));
	}

	@Override
	protected void addPages() {
		try {
			addPage(new OverviewPage(this, "overview", "Overview"));
			addPage(new DependenciesPage(this));
			addPage(new InterfacePage(this));

		} catch (PartInitException e) {
			//
		}

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

}
