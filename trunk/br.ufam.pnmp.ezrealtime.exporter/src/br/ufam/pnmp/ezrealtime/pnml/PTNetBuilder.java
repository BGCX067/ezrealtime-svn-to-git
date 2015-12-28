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
 * $Id: PTNetBuilder.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.pnml;

import br.ufam.pnmp.ezrealtime.model.ArcPosition;
import br.ufam.pnmp.ezrealtime.model.EZRealtimeToolInfo;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.model.TransitionOffsetAndPosition;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.ptnet.AnnotationGraphics;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.NodeGraphics;
import fr.lip6.move.pnml.ptnet.Offset;
import fr.lip6.move.pnml.ptnet.PTArcInscription;
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.Position;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.Transition;
import fr.lip6.move.pnml.utilities.UtilitiesFactory;
import fr.lip6.move.pnml.utilities.UtilitiesPackage;

public final class PTNetBuilder {

	private static PTNetBuilder pnmlBuilder = new PTNetBuilder();

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	/*
	 * Utilities factory. The Utilities package provides useful services such as
	 * logging, command-line argument parsing and analysis, a class that handles
	 * PNML writing (provided the models), etc.
	 */
	private UtilitiesFactory uf = null;

	private PTNetBuilder() {
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
		uf = UtilitiesPackage.eINSTANCE.getUtilitiesFactory();
	}

	public static PTNetBuilder getInstance() {
		return pnmlBuilder;
	}

	public PetriNet createPetriNetModel() {

		// First we create the model top-level class.
		PetriNet ptNetModel = ptf.createPetriNet();

		/*
		 * We set the model id. Every Object in a model must have an id,
		 * including the model top-level object.
		 */
		ptNetModel.setId("id1");
		// We set the model name.
		Name modelName = ptf.createName();
		modelName.setValue("timedNet");
		// We tell the model what its name is.
		ptNetModel.setCorePnmlname(modelName);

		// Every PNML model must have at least one Page.
		Page firstPage = ptf.createPage();
		firstPage.setId("page1");

		/*
		 * We get the page inserted into the model. This particular form of
		 * instruction is used because a model can have several pages. In
		 * metamodelling jargon with EMF, this is called a reference containment
		 * list.
		 */
		ptNetModel.getCorePnmlpage().add(firstPage);

		return ptNetModel;
	}

	public void writePlace(Page page, Place place, final String placeName,
			PlaceOffsetAndPosition pos, final int markingValue) {

		// set the place id - sample: <place id="PStart">
		place.setId(placeName);

		// set the place name - <name/>
		Name pSName = ptf.createName();
		pSName.setValue(placeName);

		place.setCorePnmlname(pSName);

		// set the graphics for the places annotations, i.e., name and initial
		// marking - <graphics/> - Place name offset... <offset x=" " y=" "/>
		AnnotationGraphics sNameAG = ptf.createAnnotationGraphics();
		Offset sNameOff = ptf.createOffset();
		sNameOff.setX(new Integer(pos.getNameOffsetX()));
		sNameOff.setY(new Integer(pos.getNameOffsetY()));
		sNameAG.setCorePnmloffset(sNameOff);

		pSName.setCorePnmlgraphics(sNameAG);

		// Initial marking for place Start - <initialMarking/>
		PTMarking sMarking = ptf.createPTMarking();
		sMarking.setValue(new Integer(markingValue));

		place.setPtPnmlinitialMarking(sMarking);

		// ...and initial marking offset - <offset x=" " y=" "/>
		AnnotationGraphics sMkgAG = ptf.createAnnotationGraphics();
		Offset sMkgOff = ptf.createOffset();
		sMkgOff.setX(new Integer(pos.getMarkingOffsetX()));
		sMkgOff.setY(new Integer(pos.getMarkingOffsetY()));
		sMkgAG.setCorePnmloffset(sMkgOff);

		// sMarking
		sMarking.setCorePnmlgraphics(sMkgAG);

		/*
		 * The places graphics. For places, reference places, transitions and
		 * reference transitions, we need NodeGraphics objects - <graphics/>
		 */
		NodeGraphics sG = ptf.createNodeGraphics();
		Position sP = ptf.createPosition();
		sP.setX(new Integer(pos.getPositionX()));
		sP.setY(new Integer(pos.getPositionY()));
		sG.setCorePnmlposition(sP);

		place.setCorePnmlgraphics(sG);

		// the places automatically belongs to the default page
		page.getCorePnmlpnObjects().add(place);
	}

	public void writeTransition(Page page, Transition transition,
			final String transitionValue, TransitionOffsetAndPosition pos) {

		this.writeTransition(page, transition, transitionValue, pos, null);
	}

	public void writeTransition(Page page, Transition transition,
			final String transitionValue, TransitionOffsetAndPosition pos,
			EZRealtimeToolInfo toolInfo) {

		// set the id
		transition.setId(transitionValue);

		// set the name
		Name transName = ptf.createName();
		transName.setValue(transitionValue);
		transition.setCorePnmlname(transName);

		// Name graphics - Transition
		AnnotationGraphics nameAG = ptf.createAnnotationGraphics();

		Offset dNameOff = ptf.createOffset();
		dNameOff.setX(new Integer(pos.getNameOffsetX()));
		dNameOff.setY(new Integer(pos.getNameOffsetY()));

		nameAG.setCorePnmloffset(dNameOff);
		transName.setCorePnmlgraphics(nameAG);

		// Graphics - Transition
		NodeGraphics nodeGraph = ptf.createNodeGraphics();
		Position transPosition = ptf.createPosition();
		transPosition.setX(pos.getPositionX());
		transPosition.setY(pos.getPositionY());
		nodeGraph.setCorePnmlposition(transPosition);
		transition.setCorePnmlgraphics(nodeGraph);

		// Set the transitions into the default page containment list
		if (toolInfo != null){
			transition.getCorePnmltoolspecific().add(toolInfo);
			System.out.println("FROM TIME -> "+toolInfo.getFromTime());
			System.out.println("TO TIME -> "+toolInfo.getToTime());
		}	

		page.getCorePnmlpnObjects().add(transition);
	}

	public void writeArc(Page page, Arc arc, String arcName, Node source,
			Node target, ArcPosition[] posArray, int arcInscription) {

		arc.setId(arcName);
		arc.setSource(source);
		arc.setTarget(target);
		// ArcGraphics dsAG = ptf.createArcGraphics();
		// arc positions setting source -> target
		for (int i = 0; i < posArray.length; i++) {
			ArcPosition arcPosition = posArray[i];
			Position p = ptf.createPosition();
			p.setX(new Integer(arcPosition.getPositionX()));
			p.setY(new Integer(arcPosition.getPositionY()));
			// TODO check whether it is required or not
			// dsAG.getCorePnmlposition().add(p);
		}
		
		// arc.setCorePnmlgraphics(dsAG);
		// Its inscription
		PTArcInscription dsI = ptf.createPTArcInscription();
		dsI.setValue(new Integer(arcInscription));
		arc.setPtPnmlinscription(dsI);

		// Set the arcs into the default page containment list.
		page.getCorePnmlpnObjects().add(arc);

	}

}// class
