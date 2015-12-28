/*
 * Copyright (c) 2008 Fabiano Cruz - UFAM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufam.pnmp.ezrealtime.exporter.ui.action;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import br.ufam.pnmp.ezrealtime.dot.exporter.Pnml2DotExporter;
import br.ufam.pnmp.ezrealtime.exporter.util.FileHelper;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Util;
import fr.lip6.move.pnml.utilities.PnmlException;

public class Pnml2DotAction implements IObjectActionDelegate {

	private IWorkbenchPart activePart;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.activePart = targetPart;
	}

	public void run(IAction action) {

		System.out.println("Pnml2DotAction.run()");

		StructuredSelection selection = (StructuredSelection) this.activePart
				.getSite().getSelectionProvider().getSelection();
		final String PNML_FILE_NAME = FileHelper.getPnmlFileSelected(selection);

		Thread t = new Thread(new Runnable() {
			public void run() {
				doExport();
			}

			private synchronized void doExport() {
				try {
					Pnml2DotExporter exportExample = new Pnml2DotExporter();
					exportExample.pnml2Dot(PNML_FILE_NAME);
				} catch (PnmlException e1) {
					e1.printStackTrace();
				}
			}
		});
		t.start();

		Shell shell = new Shell();
		try {
			Util.refreshWorkspace();
		} catch (CoreException e) {
			MessageDialog
					.openError(shell, "DOT Translator",
							"Unable do refresh the workspace.\nPlease refresh it manually");
		}

		System.out.println("Export into DOT done.");

	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
