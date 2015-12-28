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
 * $Id: SchExporterWizard.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.exporter;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.converter.ModelConverter;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterDirectoryURIPage;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterOptionsPage;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterPackagePage;
import org.eclipse.emf.exporter.ui.contribution.base.ModelExporterWizard;

import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.pnml.PTNetBuilder;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Constants;
import br.ufam.pnmp.ezrealtime.pnml.exporter.EZRealtimeExporterPlugin;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.Place;

public class SchExporterWizard extends ModelExporterWizard {

	@Override
	protected ModelConverter createModelConverter() {
		// return new SchExporter();
		return null;
	}

	public void addPages() {
		ModelExporterDirectoryURIPage directoryURIPage = new ModelExporterDirectoryURIPage(
				getModelExporter(), "SchExporterBaseLocationPage");
		directoryURIPage.setTitle(EZRealtimeExporterPlugin.INSTANCE
				.getString("_UI_SchImport_title"));
		addPage(directoryURIPage);

		ModelExporterPackagePage packagePage = new ModelExporterPackagePage(
				getModelExporter(), "SchExporterGenModelDetailPage");
		packagePage.setTitle(EZRealtimeExporterPlugin.INSTANCE
				.getString("_UI_SchImport_title"));
		packagePage.setShowReferencedGenModels(true);
		addPage(packagePage);

		ModelExporterOptionsPage optionsPage = new ModelExporterOptionsPage(
				getModelExporter(), "SchExporterOptionsPage");
		optionsPage.setTitle(EZRealtimeExporterPlugin.INSTANCE
				.getString("_UI_SchImport_title"));
		addPage(optionsPage);
	}

	/**
	 * Implements the Sch model creation of the Petri net This model will be
	 * eventually written in a SCH document.
	 */
	public void realtimeSpec2Sch(final EZRealtimeSpec realtimeSystem,
			final String schFileName) throws IOException {

		PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();
		PetriNet ptNetModel = ptNetBuilder.createPetriNetModel();

		// mapeamento para SCH:
		DataOutputStream schDos = null;
		File schFile = null;
		try {
			schFile = new File(schFileName);
			schDos = new DataOutputStream(new FileOutputStream(schFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (schDos == null) {
			return;
		}

		schDos.write(("##BEGIN##").getBytes());
		schDos.write(("\n").getBytes());

		EList places = ptNetModel.getAllPlaces();
		int numPlacesUpPEnd = 0, count = 0;
		for (Object object : places) {
			Place place = (Place) object;
			if (Constants.PEND.equals(place.getId())) {
				numPlacesUpPEnd = count;
			}
			count++;
		}

		// PLACE_FINAL_MARK
		schDos.write((String.valueOf(numPlacesUpPEnd)).getBytes());
		schDos.write(("\n").getBytes());

		// NUM PLACES
		schDos.write((String.valueOf(places.size())).getBytes());
		schDos.write(("\n").getBytes());

		EList transitions = ptNetModel.getAllTransitions();

		// NUM TRANSITIONS
		schDos.write((String.valueOf(transitions.size())).getBytes());
		schDos.write(("\n").getBytes());

		final int checkPower = 0;
		final int maxPowerAllowed = 0;
		final int changePowerContext = 0;

		// CHECAR POTENCIA 0 false. 1 verdadeiro
		schDos.write((String.valueOf(checkPower)).getBytes());
		schDos.write(("\n").getBytes());

		// POTENCIA TROCA CONTEXTO PROCESSADOR
		schDos.write((String.valueOf(changePowerContext)).getBytes());
		schDos.write(("\n").getBytes());

		// POTENCIA MAXIMA PERMITIDA
		schDos.write((String.valueOf(maxPowerAllowed)).getBytes());
		schDos.write(("\n").getBytes());

		// ##PC##
		schDos.write(("##PC##").getBytes());
		schDos.write(("\n").getBytes());
		schDos.write(("0$").getBytes());
		schDos.write(("\n").getBytes());

		// ##TASK-PROC##
		schDos.write(("##TASK-PROC##").getBytes());
		schDos.write(("\n").getBytes());

		// EList processors = null; // TODO
		// schDos.write((String.valueOf(processors.size())).getBytes());
		// schDos.write(("\n").getBytes());

	}

}
