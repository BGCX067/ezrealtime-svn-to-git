package br.ufam.pnmp.ezrealtime.scheduler.popup.actions;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class RunSchedulerAction implements IObjectActionDelegate {

	private IWorkbenchPart activePart;

	/**
	 * Constructor for Action1.
	 */
	public RunSchedulerAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.activePart = targetPart;
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		Shell shell = new Shell();
		MessageDialog.openInformation(shell, "ezRealtime Scheduler Plug-in",
				"New Action was executed.");

		StructuredSelection selection = (StructuredSelection) this.activePart
				.getSite().getSelectionProvider().getSelection();
		File file = (File) selection.getFirstElement();

		try {
			String filePath = file.getLocation().toFile().getAbsolutePath();
			String fileExtension = file.getLocation().getFileExtension();
			int index = filePath.lastIndexOf(fileExtension);
			String newRtdFileName = filePath.substring(0, index) + "rtd";

			boolean isRtdConfirmed = false;

			FileDialog pnmlDialog = new FileDialog(shell, SWT.SAVE);
			pnmlDialog.setFileName(newRtdFileName);
			pnmlDialog.setFilterExtensions(new String[] { "*.rtd" });
			newRtdFileName = pnmlDialog.open();
			if (newRtdFileName != null) {
				if (!newRtdFileName.endsWith(".rtd")) {
					newRtdFileName = newRtdFileName + ".rtd";
				}
				boolean confirm = true;
				if (new java.io.File(newRtdFileName).exists()) {
					confirm = MessageDialog
							.openConfirm(
									shell,
									"Save As",
									"The file \""
											+ newRtdFileName
											+ "\" already exists. Do you want to replace it?");
				}
				if (confirm) {
					isRtdConfirmed = true;
				}
			}

			if (isRtdConfirmed) {
				Scheduler.getInstance().generateScale(filePath, newRtdFileName);
				MessageDialog.openInformation(shell, "Real Time Translator",
						"Time Scale generated sucessfully");
			}

		} catch (Exception e) {
			MessageDialog.openError(shell, "Real Time Translator",
					"Unable to gerenerate Time scale: \n" + e.getMessage());
		}

		try {
			Util.refreshWorkspace();
		} catch (CoreException e) {
			MessageDialog
					.openError(shell, "Real Time Translator",
							"Unable do refresh the workspace.\nPlease refresh it manually");
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
