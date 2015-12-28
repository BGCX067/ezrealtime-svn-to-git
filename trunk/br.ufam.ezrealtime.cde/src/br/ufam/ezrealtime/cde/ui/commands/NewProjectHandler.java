package br.ufam.ezrealtime.cde.ui.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufam.ezrealtime.cde.ui.wizards.NewProjectWizard;

public class NewProjectHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		NewProjectWizard wizard = new NewProjectWizard();

		WizardDialog dialog = new WizardDialog(HandlerUtil
				.getActiveShell(event), wizard) {
			@Override
			protected void configureShell(Shell newShell) {
				super.configureShell(newShell);
				newShell.setSize(500, 500);
			}
		};
		dialog.create();

		dialog.open();
		return null;
	}
}
