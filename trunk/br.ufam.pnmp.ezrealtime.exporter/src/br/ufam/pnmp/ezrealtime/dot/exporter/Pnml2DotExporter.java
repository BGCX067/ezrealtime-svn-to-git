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
 * $Id: Pnml2DotExporter.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */

package br.ufam.pnmp.ezrealtime.dot.exporter;

import fr.lip6.move.pnml.example.pnml2dotty.MainProgram.DottyRunner;
import fr.lip6.move.pnml.example.pnml2dotty.MainProgram.DottyRunnerImpl;
import fr.lip6.move.pnml.utilities.PnmlException;

public class Pnml2DotExporter {

	/**
	 * Implements the PNML model creation of the Petri net This model will be
	 * eventually written in a PNML document.
	 */
	public void pnml2Dot(String pnmlFileName) throws PnmlException {

		System.out.println("PNML File name: " + pnmlFileName);

		System.out.println("Export into DOT - start.");

		DottyRunner dr = new DottyRunnerImpl();
		dr.run(new String[] { "-p2dot", pnmlFileName });

	}

}
