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
 * 	 Adilson Arcoverde - Initial API and implementation
 *   Fabiano Cruz [fabianoc at acm.org] - changes to run with the scheduler2
 *
 * </copyright>
 *
 * $Id: Scheduler.java,v 1.1 2008/01/21 14:19:49 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.scheduler.popup.actions;

import java.io.File;

public class Scheduler {

	private static final Scheduler instance = new Scheduler();

	private Scheduler() {

	}

	public static Scheduler getInstance() {
		return instance;
	}

	public synchronized File generateScale(String inputSchFilePath,
			String outputDatFilePath) {
		File outputDatFile = new File(outputDatFilePath);
		String scheduler = this.discoverScheduler();

		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec(new String[] { scheduler,
					inputSchFilePath, outputDatFilePath });
			int endCode = process.waitFor();
			if (endCode < 0) {
				throw new Exception("Scheduler: Fatal error.");
			}
			process.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputDatFile;
	}

	private String discoverScheduler() {
		String result = null;
		String os = System.getProperty("os.name");
		if (os.startsWith("Windows")) {
			result = new File(
					"bin/windows/scheduler2.exe")
					.getAbsolutePath();
		} else if (os.startsWith("Linux")) {
			result = new File(
					"plugins/br.ufam.pnmp.ezrealtime.scheduler_1.0.0/lib/linux/scheduler2")
					.getAbsolutePath();
		}
		return result;
	}

}