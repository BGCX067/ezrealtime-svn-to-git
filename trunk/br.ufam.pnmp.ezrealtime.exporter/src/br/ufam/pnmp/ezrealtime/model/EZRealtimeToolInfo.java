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
 * $Id: EZRealtimeToolInfo.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.model;

import fr.lip6.move.pnml.ptnet.impl.ToolInfoImpl;
import fr.lip6.move.pnml.utilities.MyPrinter;
import fr.lip6.move.pnml.utilities.UtilitiesFactory;
import fr.lip6.move.pnml.utilities.UtilitiesPackage;

public class EZRealtimeToolInfo extends ToolInfoImpl {

	private String fromTime;

	private String toTime;

	@Override
	protected String writeMePnmlStart() {
		UtilitiesFactory ufa = UtilitiesPackage.eINSTANCE.getUtilitiesFactory();
		MyPrinter thePrinterRef = ufa.createMyPrinter();
		StringBuffer pnml = new StringBuffer("");
		pnml.append(thePrinterRef.actualIndent());
		pnml.append("<toolspecific");
		if (isSetTool()) {
			pnml.append(" tool=\"" + this.getTool().toString() + "\"");
		}
		if (isSetVersion()) {
			pnml.append(" version=\"" + this.getVersion().toString() + "\"");
		}

		boolean containsElement = false;

		containsElement = writeTimeElement(pnml);

		if (containsElement) {
			pnml.append("\n");
			pnml.append("    </toolspecific>");
		} else {
			pnml.append("/>");
		}

		return pnml.toString();
	}

	private boolean writeTimeElement(StringBuffer pnml) {
		if (fromTime != null || toTime != null) {
			pnml.append(">");
			pnml.append("\n");
			pnml.append("\t<time from=\"" + this.getFromTime() + "\" to=\""
					+ this.getToTime() + "\"");
			pnml.append("/>");

			return true;
		}
		return false;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

}
