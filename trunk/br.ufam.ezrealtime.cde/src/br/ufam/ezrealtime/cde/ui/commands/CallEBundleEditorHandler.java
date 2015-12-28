package br.ufam.ezrealtime.cde.ui.commands;

import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import br.ufam.ezrealtime.cde.editors.EBundleEditorInput;
import br.ufam.ezrealtime.cde.editors.EBundleFormEditor;

public class CallEBundleEditorHandler extends AbstractHandler implements
		IHandler {

	@SuppressWarnings("unchecked")
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Get the view
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindow(event);
		IWorkbenchPage page = window.getActivePage();

		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage().getSelection();
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection strucSelection = (IStructuredSelection) selection;
			for (Iterator<Object> iterator = strucSelection.iterator(); iterator
					.hasNext();) {
				Object element = iterator.next();
				System.out.println(element.toString());

//				Person person = (Person) element;
//				MyPersonEditorInput input = new MyPersonEditorInput(person);

				EBundleEditorInput sfi = new EBundleEditorInput("Simple Editor");

				try {
					page.openEditor(sfi, EBundleFormEditor.ID);

				} catch (PartInitException e) {
					System.out.println(e.getStackTrace());
				}

			}
		}
		return null;
	}

}
