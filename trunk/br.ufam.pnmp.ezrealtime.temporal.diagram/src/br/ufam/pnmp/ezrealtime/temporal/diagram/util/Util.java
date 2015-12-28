/*
 * Created on 12/12/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram.util;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.ui.PlatformUI;

/**
 * @author Adilson Arcoverde
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Util {
    public static void refreshWorkspace() throws CoreException {
        Workspace workspace = (Workspace) ResourcesPlugin.getWorkspace();
        ProgressMonitorPart pmp = new ProgressMonitorPart(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), null);
        IProject[] projects = workspace.getRoot().getProjects();
        for (int i = 0; i < projects.length; i++) {
            IProject project = projects[i];
            project.refreshLocal(File.DEPTH_INFINITE, pmp);
        }
    }
}