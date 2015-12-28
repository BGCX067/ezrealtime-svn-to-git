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
 * $Id: Util.java,v 1.3 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.pnml.exporter;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.internal.resources.Workspace;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.wizard.ProgressMonitorPart;
import org.eclipse.ui.PlatformUI;

import br.ufam.pnmp.ezrealtime.Task;

public final class Util {

	/**
	 * Instead of computing a pre-runtime schedule considering an infinite
	 * period, the approach is to schedule the entire set of periodic tasks
	 * occurring within a time period that is equal to the least common multiple
	 * (LCM) among periods of the given set of tasks. The LCM is also called
	 * schedule period (PS).
	 * 
	 */
	/**
	 * @param tasks
	 * @return
	 */
	public static int getSchedulePeriod(EList<?> tasks) {

		int size = tasks.size();
		int deadlines[] = new int[size];
		int index = 0;
		// int deadlines[] = { 250, 250, 250, 250, 150, 150 };
		int result = 0;

		for (Object object : tasks) {
			Task task = (Task) object;
			deadlines[index++] = task.getDeadline();
		}

		if (size > 0) {
			result = deadlines[0];
			if (size >= 2) {
				for (int i = 1; i < size; i++) {
					result = lcm(result, deadlines[i]);
				}
			}
		}
		return result;
	}

	public static int lcm(int num1, int num2) {
		if (num1 != 0 && num2 != 0)
			return (num2 / gdc(num1, num2)) * num1;
		return 0;
	}

	/**
	 * the Euclidean algorithm for the GDC (greatest common divisor) also gives
	 * us a fast algorithm for the LCM (least common multiple or lowest common
	 * multiple).
	 * 
	 * example: lcm(21,6) = 21*6 / gdc(21,6) = 21*6 / 3 = 126 / 3 = 42
	 * 
	 */
	public static int gdc(int num1, int num2) {
		if (num2 == 0)
			return num1;
		else
			return gdc(num2, num1 % num2);
	}

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

	public static void main(String[] args) {
		int result = getSchedulePeriod(null);
		System.out.println(result);
	}

}
