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
 * $Id: Util.java,v 1.1 2008/01/21 14:19:49 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.scheduler.popup.actions;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.ui.PlatformUI;

public final class Util {

	public static void refreshWorkspace() throws CoreException {
		Workspace workspace = (Workspace) ResourcesPlugin.getWorkspace();
		ProgressMonitorPart pmp = new ProgressMonitorPart(PlatformUI
				.getWorkbench().getActiveWorkbenchWindow().getShell(), null);
		IProject[] projects = workspace.getRoot().getProjects();
		for (int i = 0; i < projects.length; i++) {
			IProject project = projects[i];
			project.refreshLocal(File.DEPTH_INFINITE, pmp);
		}
	}

}
