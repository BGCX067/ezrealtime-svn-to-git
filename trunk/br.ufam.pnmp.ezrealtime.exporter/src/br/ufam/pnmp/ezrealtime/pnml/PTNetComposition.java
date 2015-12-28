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
 * $Id: PTNetComposition.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.pnml;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import br.ufam.pnmp.ezrealtime.model.ArcPosition;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.Transition;

public class PTNetComposition {

	private PTNetBuilder ptNetBuilder;
	private PTNetOperatorType operator;

	public PTNetComposition(PTNetOperatorType operator) {
		ptNetBuilder = PTNetBuilder.getInstance();
		this.operator = operator;
	}

	public void execute() {
		switch (operator) {
		case PLACE_MERGING:
			// placeMerging(ptNet1, ptNet2);
			break;
		default:
			break;
		}
	}

	/*
	 * public PetriNet placeMerging(PetriNet ptNet1, PetriNet ptNet2, Place[]
	 * mergingPlacesNet1, Place[] mergingPlacesNet2, Place[] mergedPlaces) {
	 */
	public PetriNet placeMerging(PetriNet ptNet1, PetriNet ptNet2,
			List<Place> mergingPlacesNet1, List<Place> mergingPlacesNet2,
			List<Place> mergedPlaces) {

		int baseLength = mergingPlacesNet1.size();

		if (mergingPlacesNet2.size() != baseLength
				&& mergedPlaces.size() != baseLength)
			return null;

		PetriNet pMerge = ptNetBuilder.createPetriNetModel();

		if (pMerge != null) {
			// TODO review
			EList<?> pages = pMerge.getCorePnmlpage();
			Page mergedPage = null;
			for (Object object : pages) {
				mergedPage = (Page) object;
			}

			List<String> placeIdList = new LinkedList<String>();
			EList<?> placesNet1 = ptNet1.getAllPlaces();
			for (Object object : placesNet1) {
				Place place = (Place) object;
				// the places automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(place);
				placeIdList.add(place.getId());
			}

			EList<?> placesNet2 = ptNet2.getAllPlaces();
			for (Object object : placesNet2) {
				Place place = (Place) object;
				// the places automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(place);
				placeIdList.add(place.getId());
			}

			EList<?> transitionsNet1 = ptNet1.getAllTransitions();
			for (Object object : transitionsNet1) {
				Transition transition = (Transition) object;
				// the transitions automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(transition);
			}

			EList<?> transitionsNet2 = ptNet2.getAllTransitions();
			for (Object object : transitionsNet2) {
				Transition transition = (Transition) object;
				// the transitions automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(transition);
			}

			EList<?> arcsNet1 = ptNet1.getAllArcs();
			for (Object object : arcsNet1) {
				Arc arc = (Arc) object;
				// the arcs automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(arc);
			}

			EList<?> arcsNet2 = ptNet2.getAllArcs();
			for (Object object : arcsNet2) {
				Arc arc = (Arc) object;
				// the arcs automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(arc);
			}

			for (int index = 0; index < baseLength; index++) {
				if (placeIdList.contains(mergingPlacesNet1.get(index).getId())
						&& placeIdList.contains(mergingPlacesNet2.get(index)
								.getId())) {

					mergedPage.getCorePnmlpnObjects().remove(
							mergingPlacesNet1.get(index));
					mergedPage.getCorePnmlpnObjects().remove(
							mergingPlacesNet2.get(index));

					mergedPlaces.get(index).setCorePnmlgraphics(
							mergingPlacesNet1.get(index).getCorePnmlgraphics());

					// adding the new merged place
					mergedPage.getCorePnmlpnObjects().add(
							mergedPlaces.get(index));

					PTNetHelper.relocateArcs(pMerge, mergedPage,
							mergingPlacesNet1.get(index), mergedPlaces
									.get(index));
					PTNetHelper.relocateArcs(pMerge, mergedPage,
							mergingPlacesNet2.get(index), mergedPlaces
									.get(index));
				}

			}

		}

		return pMerge;
	}

	@Deprecated
	public PetriNet placeMerging(PetriNet ptNet1, PetriNet ptNet2) {

		PetriNet pMerge = ptNetBuilder.createPetriNetModel();

		if (pMerge != null) {
			// TODO review
			EList<?> pages = pMerge.getCorePnmlpage();
			Page mergedPage = null;
			for (Object object : pages) {
				mergedPage = (Page) object;
			}

			List<String> placeIdList = new LinkedList<String>();
			EList<?> placesNet1 = ptNet1.getAllPlaces();
			for (Object object : placesNet1) {
				Place place = (Place) object;
				// the places automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(place);
				placeIdList.add(place.getId());
			}

			EList<?> placesNet2 = ptNet2.getAllPlaces();
			for (Object object : placesNet2) {
				Place place = (Place) object;
				if (!placeIdList.contains(place.getId())) {
					// the places automatically belongs to the default page
					mergedPage.getCorePnmlpnObjects().add(place);
				}
			}

			EList<?> transitionsNet1 = ptNet1.getAllTransitions();
			for (Object object : transitionsNet1) {
				Transition transition = (Transition) object;
				// the transitions automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(transition);
			}

			EList<?> transitionsNet2 = ptNet2.getAllTransitions();
			for (Object object : transitionsNet2) {
				Transition transition = (Transition) object;
				// the transitions automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(transition);
			}

			EList<?> arcsNet1 = ptNet1.getAllArcs();
			for (Object object : arcsNet1) {
				Arc arc = (Arc) object;
				// the arcs automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(arc);
			}

			EList<?> arcsNet2 = ptNet2.getAllArcs();
			for (Object object : arcsNet2) {
				Arc arc = (Arc) object;
				// the arcs automatically belongs to the default page
				mergedPage.getCorePnmlpnObjects().add(arc);
			}
		}

		return pMerge;
	}

	// serialPlaceRefinement
	public PetriNet serialPlaceRefinement(PetriNet ptNet, Place refiningPlace,
			Place refinedPlace1, Transition refinedTrans, Place refinedPlace2) {

		// serialPlaceRefinement(ptNet, refiningPlace,
		// pPrec, refinedTrans, pNewPwp);

		PetriNet ptRef = ptNet;

		Page page = PTNetHelper.getFirstPage(ptRef);

		page.getCorePnmlpnObjects().add(refinedPlace1);
		page.getCorePnmlpnObjects().add(refinedTrans);
		page.getCorePnmlpnObjects().add(refinedPlace2);

		PtnetFactory ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
		PTNetBuilder netBuilder = PTNetBuilder.getInstance();

		EList<?> arcs = ptRef.getAllArcs();
		for (Object object : arcs) {
			Arc arc = (Arc) object;
			if (arc.getTarget().getId().equals(refiningPlace.getId())) {
				System.out.println("Arc ID [target] -> " + arc.getId());
				page.getCorePnmlpnObjects().remove(arc);
				arc.setTarget(refinedPlace2);
				page.getCorePnmlpnObjects().add(arc);
			}

			if (arc.getSource().getId().equals(refiningPlace.getId())) {
				System.out.println("Arc ID [source] -> " + arc.getId());
				// page.getCorePnmlpnObjects().remove(arc);
			}
		}

		// ARCS
		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);

		// Pre and post-conditions of the transitions are:
		// �tgbij = {pwgbij}; tgbij� = {pwsij};
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = refinedPlace1;
			Node target = refinedTrans;
			netBuilder.writeArc(page, ds, refinedPlace1.getId() + "_"
					+ refinedTrans.getId(), source, target, posArray, 1);

			ds = ptf.createArc();
			source = refinedPlace2;
			target = refinedTrans;
			netBuilder.writeArc(page, ds, refinedPlace2.getId() + "_"
					+ refinedTrans.getId(), source, target, posArray, 1);

			ds = ptf.createArc();
			source = refinedTrans;
			target = refiningPlace;
			netBuilder.writeArc(page, ds, refinedTrans.getId() + "_"
					+ refiningPlace.getId(), source, target, posArray, 1);
		}

		return ptRef;

	}

	// arcAddition
	// arcRemoving
	// placeAddition

	// netUnion
	public PetriNet ptNetUnion(PetriNet ptNet1, PetriNet ptNet2) {

		PetriNet ptNetUnion = ptNetBuilder.createPetriNetModel();
		Page unionPage = PTNetHelper.getFirstPage(ptNetUnion);

		unionPage.getCorePnmlpnObjects().addAll(ptNet2.getAllPlaces());
		unionPage.getCorePnmlpnObjects().addAll(ptNet2.getAllTransitions());
		unionPage.getCorePnmlpnObjects().addAll(ptNet2.getAllArcs());
		unionPage.getCorePnmlpnObjects().addAll(ptNet1.getAllPlaces());
		unionPage.getCorePnmlpnObjects().addAll(ptNet1.getAllTransitions());
		unionPage.getCorePnmlpnObjects().addAll(ptNet1.getAllArcs());

		return ptNetUnion;

	}

}
