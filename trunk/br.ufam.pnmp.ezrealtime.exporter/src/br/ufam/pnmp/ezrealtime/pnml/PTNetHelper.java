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
 * $Id: PTNetHelper.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.pnml;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.Transition;

public final class PTNetHelper {

	public static Node findPlaceById(PetriNet ptNetModel, final String placeId) {
		if (placeId == null || "".equals(placeId)) {
			return null;
		}
		EList<?> places = ptNetModel.getAllPlaces();
		for (Object object : places) {
			Place place = (Place) object;
			final String id = place.getId();
			if (id != null && !"".equals(id) && placeId.equals(id)) {
				System.out.println("Place ID -> " + id);
				return place;
			}
		}
		return null;
	}

	public static List<Place> findAllPlacesStartingWith(PetriNet ptNetModel,
			final String placeName) {
		if (placeName == null || "".equals(placeName)) {
			return null;
		}
		List<Place> places = new ArrayList<Place>();
		EList<?> originalPlaces = ptNetModel.getAllPlaces();
		for (Object object : originalPlaces) {
			Place place = (Place) object;
			final String id = place.getId();
			if (id != null && id.startsWith(placeName)) {
				System.out.println("Place ID [all places] -> " + id);
				places.add(place);
			}
		}
		return places;
	}

	public static List<Transition> findAllTransitionsStartingWith(PetriNet ptNetModel,
			final String transitionName) {
		if (transitionName == null || "".equals(transitionName)) {
			return null;
		}
		List<Transition> transitions = new ArrayList<Transition>();
		EList<?> originalTransitions = ptNetModel.getAllTransitions();
		for (Object object : originalTransitions) {
			Transition trans = (Transition) object;
			final String id = trans.getId();
			if (id != null && id.startsWith(transitionName)) {
				System.out.println("Transition ID [all transitions] -> " + id);
				transitions.add(trans);
			}
		}
		return transitions;
	}

	public static boolean relocateArcs(PetriNet ptNetModel, Page page,
			Place actualPlace, Place newPlace) {
		if (actualPlace == null || "".equals(actualPlace.getId())) {
			return false;
		}
		EList<?> arcs = ptNetModel.getAllArcs();
		for (Object object : arcs) {
			Arc arc = (Arc) object;
			if (arc.getTarget().getId().equals(actualPlace.getId())) {
				System.out.println("Arc ID [target] -> " + arc.getId());
				page.getCorePnmlpnObjects().remove(arc);
				arc.setTarget(newPlace);
				page.getCorePnmlpnObjects().add(arc);
			}

			if (arc.getSource().getId().equals(actualPlace.getId())) {
				System.out.println("Arc ID [source] -> " + arc.getId());
				page.getCorePnmlpnObjects().remove(arc);
				arc.setSource(newPlace);
				page.getCorePnmlpnObjects().add(arc);
			}
		}
		return true;
	}

	public static Place findLastPlaceByName(
			fr.lip6.move.pnml.pnmlcoremodel.PetriNet petriNet,
			final Place lastRefPlace) {
		if (lastRefPlace == null || "".equals(lastRefPlace.getId())) {
			return null;
		}
		EList<?> places = petriNet.getAllPlaces();
		int placeIndex = places.lastIndexOf(lastRefPlace);

		return (Place) places.get(placeIndex);
	}

	public static Page getFirstPage(PetriNet ptNet) {
		EList<?> pages = ptNet.getCorePnmlpage();
		for (Object object : pages) {
			Page ptNetPage = (Page) object;
			return ptNetPage;
		}
		return null;
	}

}
