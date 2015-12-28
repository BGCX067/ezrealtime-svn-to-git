/**
 * <copyright> 
 *
 * Copyright (c) 2008 Fabiano Cruz (UFAM - Universidade Federal do Amazonas) 
 * and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Fabiano Cruz [fabianoc at acm.org] - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: EZRealtime2PnmlAction.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.exporter.ui.action;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.exporter.util.FileHelper;
import br.ufam.pnmp.ezrealtime.pnml.EZRealtime2PnmlExport;
import br.ufam.pnmp.ezrealtime.pnml.exporter.EZRealtimeParser;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Util;
import fr.lip6.move.pnml.utilities.PnmlException;

public class EZRealtime2PnmlAction implements IObjectActionDelegate {

	private IWorkbenchPart activePart;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.activePart = targetPart;
	}

	public void run(IAction action) {

		System.out.println("Export into PNML - start.");

		StructuredSelection selection = (StructuredSelection) this.activePart
				.getSite().getSelectionProvider().getSelection();

		org.eclipse.core.internal.resources.File file = (org.eclipse.core.internal.resources.File) selection
				.getFirstElement();

		String pathToRealtimeFile = file.getLocation().toFile()
				.getAbsolutePath();

		final String PNML_FILE_NAME = FileHelper.getPnmlFileSelected(selection);

		EZRealtimeSpec realtimeSystem;
		try {
			realtimeSystem = EZRealtimeParser.getInstance().parse(
					pathToRealtimeFile);

			java.io.File pnmlFile = new java.io.File(PNML_FILE_NAME);
			if (pnmlFile.exists() && pnmlFile.isFile()) {
				System.out.println("Deleting pnml file...");
				pnmlFile.delete();
			}

			EZRealtime2PnmlExport exportExample = new EZRealtime2PnmlExport();
			exportExample.realtimeSpec2Pnml(realtimeSystem, PNML_FILE_NAME);

		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (PnmlException e1) {
			e1.printStackTrace();
		}

		System.out.println("Export into PNML done.");

		Shell shell = new Shell();

		try {
			Util.refreshWorkspace();
		} catch (CoreException e) {
			MessageDialog
					.openError(shell, "Real Time Translator",
							"Unable do refresh the workspace.\nPlease refresh it manually");
		}

	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

}
