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
 * $Id: EZRealtime2PnmlExport.java,v 1.3 2008/01/20 15:48:44 fabianocruz Exp $
 */

package br.ufam.pnmp.ezrealtime.pnml;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.Processor;
import br.ufam.pnmp.ezrealtime.SchedulingType;
import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.block.DeadlineCheckingBlock;
import br.ufam.pnmp.ezrealtime.block.ForkBlock;
import br.ufam.pnmp.ezrealtime.block.JoinBlock;
import br.ufam.pnmp.ezrealtime.block.NonPreemptiveTaskStructureBlock;
import br.ufam.pnmp.ezrealtime.block.PeriodicTaskArrivalBlock;
import br.ufam.pnmp.ezrealtime.block.PreemptiveTaskStructureBlock;
import br.ufam.pnmp.ezrealtime.block.ResourceBlock;
import br.ufam.pnmp.ezrealtime.exporter.util.BlockInititalPositionUtil;
import br.ufam.pnmp.ezrealtime.model.ArcPosition;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.model.ResourceType;
import br.ufam.pnmp.ezrealtime.model.TransitionOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Constants;
import br.ufam.pnmp.ezrealtime.pnml.exporter.EZRealtimeParser;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Util;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.PTMarking;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.Transition;
import fr.lip6.move.pnml.utilities.LOGMEDIA;
import fr.lip6.move.pnml.utilities.PNMLPrinter;
import fr.lip6.move.pnml.utilities.PnmlException;
import fr.lip6.move.pnml.utilities.UtilitiesFactory;
import fr.lip6.move.pnml.utilities.UtilitiesPackage;

public class EZRealtime2PnmlExport {

	private static final int DISTANCE_FACTOR = 300;

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	PtnetFactory ptf = null;

	/*
	 * Utilities factory. The Utilities package provides useful services such as
	 * logging, command-line argument parsing and analysis, a class that handles
	 * PNML writing (provided the models), etc.
	 */
	UtilitiesFactory uf = null;

	PTNetBuilder netBuilder = null;

	public EZRealtime2PnmlExport() {
		/*
		 * The following piece of code retrieves the singleton instance of PT
		 * Net and Utilities factories. All factories always have a singleton
		 * instance. This principle comes from the design pattern "Factory".
		 */
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
		uf = UtilitiesPackage.eINSTANCE.getUtilitiesFactory();
		netBuilder = PTNetBuilder.getInstance();
	}

	/**
	 * Implements the PNML model creation of the Petri net This model will be
	 * eventually written in a PNML document.
	 */
	public void realtimeSpec2Pnml(final EZRealtimeSpec realtimeSystem,
			final String pnmlFileName) throws PnmlException {

		// init the net based on the realtime spec
		PetriNet ptNetModel = ptNetInit(realtimeSystem);

		/*
		 * Now we need the PNML document. It can contain many Petri net models.
		 * So, after having created our model, we add it to the final PNML
		 * document.
		 */
		PetriNetDoc pnmlDoc = ptf.createPetriNetDoc();
		pnmlDoc.getCorePnmlnet().add(ptNetModel);
		/*
		 * Final step of this example: get the model written in PNML. For this
		 * purpose, a PNMLPrinter interface is provided by the framework. It is
		 * handled by Utilities Factory. PNMLPrinter has a singleton instance.
		 * It means, wherever you retrieve it in your application via Utilities
		 * Factory, you will get its unique instance.
		 */
		PNMLPrinter thePrinter = uf.createPNMLPrinter();
		thePrinter.writePNMLDocument(pnmlDoc, LOGMEDIA.FILE_LITERAL,
				pnmlFileName);

		System.out.println("The output PNML file is " + pnmlFileName);
	}

	private PetriNet ptNetInit(EZRealtimeSpec realtimeSystem) {

		EList<?> tasks = realtimeSystem.getTask();
		if (tasks.isEmpty()) {
			System.err.println("Task list is empty!");
		} else {

			PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();

			PetriNet ptNetResult = ptNetBuilder.createPetriNetModel();

			Page page = PTNetHelper.getFirstPage(ptNetResult);

			int distance = 0;
			
			System.out.println("schedule period (PS): "+Util.getSchedulePeriod(tasks));
			
			for (Object object : tasks) {
				Task task = (Task) object;
				try {
					// creating PT NET blocks
					System.out.println("Creating PT NET blocks...");
					System.out.println("Task name: " + task.getName());
					PetriNet ptNetArrival = ptNetBuilder.createPetriNetModel();
					PetriNet ptNetStructure = ptNetBuilder
							.createPetriNetModel();
					PetriNet ptNetDeadline = ptNetBuilder.createPetriNetModel();

					PetriNet ptNet = writeTask(task, ptNetArrival,
							ptNetStructure, ptNetDeadline, distance);

					// composing - NET UNION
					PTNetComposition netUnion = new PTNetComposition(
							PTNetOperatorType.NET_UNION);

					ptNetResult = netUnion.ptNetUnion(ptNet, ptNetResult);

				} catch (Exception e) {
					e.printStackTrace();
				}

				distance += DISTANCE_FACTOR;
			}

			for (Object object : tasks) {
				Task task = (Task) object;
				EList<?> precedences = task.getPrecedesTasks();
				if (precedences.size() > 0) {
					for (Object obj : precedences) {
						Task precTask = (Task) obj;
						writePrecedenceRelation(ptNetResult, page, task,
								precTask);
					}
				}
			}

			EList<?> processors = realtimeSystem.getProcessor();
			ptNetResult = writeProcessors(ptNetResult, processors, tasks);

			ptNetResult = writeForkBlock(ptNetResult, tasks);

			ptNetResult = writeJoinBlock(ptNetResult, tasks);

			return ptNetResult;
		}

		return null;

	}

	private PetriNet writeTask(Task task, PetriNet ptNetArrival,
			PetriNet ptNetStructure, PetriNet ptNetDeadline,
			final int distanceFactor) {

		Page pagePTNetArrival = PTNetHelper.getFirstPage(ptNetArrival);
		Page pagePTNetStructure = PTNetHelper.getFirstPage(ptNetStructure);
		Page pagePTNetDeadline = PTNetHelper.getFirstPage(ptNetDeadline);

		PlaceOffsetAndPosition pos = BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.TASK_ARRIVAL);

		// creating PT NET blocks - Arrival
		if (distanceFactor > 0)
			pos.setPositionY(pos.getPositionY() + distanceFactor);

		PeriodicTaskArrivalBlock taskArrivalBlock = new PeriodicTaskArrivalBlock();
		taskArrivalBlock.writeBlock(pagePTNetArrival, task, pos);

		// creating PT NET blocks - Structure
		pos = BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.TASK_STRUCTURE);

		if (distanceFactor > 0)
			pos.setPositionY(pos.getPositionY() + distanceFactor);

		if (task.getSchedulingMode() == SchedulingType.P) {
			System.out.println("PREEMPTIVE");
			PreemptiveTaskStructureBlock taskStructureBlock = new PreemptiveTaskStructureBlock();
			taskStructureBlock.writeBlock(pagePTNetStructure, task, pos);
		} else if (task.getSchedulingMode() == SchedulingType.NP) {
			System.out.println("NON-PREEMPTIVE");
			NonPreemptiveTaskStructureBlock taskStructureBlock = new NonPreemptiveTaskStructureBlock();
			taskStructureBlock.writeBlock(pagePTNetStructure, task, pos);
		}
		// creating PT NET blocks - Deadline
		pos = BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.DEADLINE_CHECKING);

		if (distanceFactor > 0)
			pos.setPositionY(pos.getPositionY() + distanceFactor);

		DeadlineCheckingBlock deadlineBlock = new DeadlineCheckingBlock();
		deadlineBlock.writeBlock(pagePTNetDeadline, task, pos);

		PetriNet ptNetMerged = null;

		// composing - PLACE_MERGING
		PTNetComposition netComposition = new PTNetComposition(
				PTNetOperatorType.PLACE_MERGING);
		// merging ptNetArrival + ptNetStructure
		ptNetMerged = netComposition.placeMerging(ptNetArrival, ptNetStructure);
		// merging ptNetMerged + ptNetDeadline
		ptNetMerged = netComposition.placeMerging(ptNetMerged, ptNetDeadline);

		return ptNetMerged;

	}

	private PetriNet writeForkBlock(PetriNet ptNetModel, EList<?> tasks) {

		PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();

		PetriNet ptNetResult = ptNetBuilder.createPetriNetModel();

		PetriNet ptNetFork = ptNetBuilder.createPetriNetModel();
		
		Page pagePTNetFork = PTNetHelper.getFirstPage(ptNetFork);
		
		ForkBlock forkBlock = new ForkBlock();

		forkBlock.writeBlock(pagePTNetFork, tasks, BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.FORK));

		List<Place> mergingPlacesNet1 = PTNetHelper.findAllPlacesStartingWith(
				ptNetModel, Constants.PST);
		List<Place> mergingPlacesNet2 = PTNetHelper.findAllPlacesStartingWith(
				ptNetFork, Constants.PST);
		List<Place> mergedPlaces = new ArrayList<Place>();

		PtnetFactory ptf = PtnetPackage.eINSTANCE.getPtnetFactory();

		String name = "";
		for (int i = 0; i < tasks.size(); i++) {

			name += "" + i;

			Place placeResult = ptf.createPlace();

			// set the place id - sample: <place id="PStart">
			placeResult.setId(Constants.PST + name);

			// set the place name - <name/>
			Name pSName = ptf.createName();
			pSName.setValue(Constants.PST + name);
			placeResult.setCorePnmlname(pSName);

			// Initial marking for place Start - <initialMarking/>
			PTMarking sMarking = ptf.createPTMarking();
			sMarking.setValue(new Integer(0));

			placeResult.setPtPnmlinitialMarking(sMarking);

			mergedPlaces.add(placeResult);

		}

		// composing - PLACE_MERGING
		PTNetComposition netComposition = new PTNetComposition(
				PTNetOperatorType.PLACE_MERGING);

		ptNetResult = netComposition.placeMerging(ptNetModel, ptNetFork,
				mergingPlacesNet1, mergingPlacesNet2, mergedPlaces);

		return ptNetResult;
	}

	private PetriNet writeJoinBlock(PetriNet ptNetModel, EList<?> tasks) {

		PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();

		PetriNet ptNetResult = ptNetBuilder.createPetriNetModel();

		PetriNet ptNetJoin = ptNetBuilder.createPetriNetModel();
		Page pagePTNetJoin = PTNetHelper.getFirstPage(ptNetJoin);
		JoinBlock joinBlock = new JoinBlock();

		try {
			joinBlock.writeBlock(pagePTNetJoin, tasks,
					BlockInititalPositionUtil
							.createPlaceOffsetAndPosition(BlockType.JOIN));
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<Place> mergingPlacesNet1 = PTNetHelper.findAllPlacesStartingWith(
				ptNetModel, Constants.PF);
		List<Place> mergingPlacesNet2 = PTNetHelper.findAllPlacesStartingWith(
				ptNetJoin, Constants.PF);
		List<Place> mergedPlaces = new ArrayList<Place>();

		PtnetFactory ptf = PtnetPackage.eINSTANCE.getPtnetFactory();

		String name = "";
		for (int i = 0; i < tasks.size(); i++) {

			name += "" + i;

			Place placeResult = ptf.createPlace();

			// set the place id - sample: <place id="PStart">
			placeResult.setId(Constants.PF + name);

			// set the place name - <name/>
			Name pSName = ptf.createName();
			pSName.setValue(Constants.PF + name);
			placeResult.setCorePnmlname(pSName);

			// Initial marking for place Start - <initialMarking/>
			PTMarking sMarking = ptf.createPTMarking();
			sMarking.setValue(new Integer(0));

			placeResult.setPtPnmlinitialMarking(sMarking);

			mergedPlaces.add(placeResult);

		}

		// composing - PLACE_MERGING
		PTNetComposition netComposition = new PTNetComposition(
				PTNetOperatorType.PLACE_MERGING);

		ptNetResult = netComposition.placeMerging(ptNetModel, ptNetJoin,
				mergingPlacesNet1, mergingPlacesNet2, mergedPlaces);

		return ptNetResult;
	}

	private PetriNet writeProcessors(PetriNet ptNetInput, EList<?> processors,
			EList<?> tasks) {

		PetriNet ptNetResult = null;

		if (processors.isEmpty()) {
			return ptNetInput;
		} else {
			// composing - NET UNION
			PTNetComposition netUnion = new PTNetComposition(
					PTNetOperatorType.NET_UNION);

			PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();
			ResourceBlock resourceBlock = null;
			int distanceFactor = 0;
			for (Object var : processors) {
				Processor processor = (Processor) var;
				try {

					PetriNet ptNet = ptNetBuilder.createPetriNetModel();
					Page pagePTNet = PTNetHelper.getFirstPage(ptNet);

					PlaceOffsetAndPosition pos = BlockInititalPositionUtil
							.createPlaceOffsetAndPosition(BlockType.RESOURCES);
					// if (distanceFactor > 0)
					// pos.setPositionY(pos.getPositionY() +
					// distanceFactor);
					pos.setPositionX(pos.getPositionX() + (220 * tasks.size()));
					pos.setPositionY(pos.getPositionY() + (150 * tasks.size()));
					resourceBlock = new ResourceBlock(ResourceType.PROCESSOR);
					resourceBlock.writeBlock(pagePTNet, processor, pos);

					ptNetResult = netUnion.ptNetUnion(ptNet, ptNetInput);

				} catch (Exception e) {
					e.printStackTrace();
				}
				distanceFactor += DISTANCE_FACTOR;
			}

			List<Place> places = PTNetHelper.findAllPlacesStartingWith(
					ptNetResult, Constants.PPROC);

			for (Place pProc : places) {
				System.out.println("PPROC -> " + pProc.getId());
				ptNetResult = processorGrantingAndReleasing(ptNetResult, pProc,
						tasks);
			}
		}

		return ptNetResult;
	}

	private PetriNet processorGrantingAndReleasing(PetriNet ptNet, Place pProc,
			EList<?> tasks) {

		int index = 0;
		int position = 0;

		PetriNet ptNetResult = ptNet;
		Page page = PTNetHelper.getFirstPage(ptNetResult);

		for (Object object : tasks) {
			Task task = (Task) object;
			index++;

			if ((Constants.PPROC.concat(task.getProcessor().getName()))
					.equals(pProc.getId())) {

				// processor granting
				List<Transition> transitions = PTNetHelper
						.findAllTransitionsStartingWith(ptNet, Constants.TG
								+ task.getName());

				PtnetFactory ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
				PTNetBuilder netBuilder = PTNetBuilder.getInstance();

				if (transitions.size() > 0) {

					for (Transition transition : transitions) {
						// ARCS
						ArcPosition arcPos1 = new ArcPosition(8, 9);
						ArcPosition arcPos2 = new ArcPosition(18, 6);

						// Pre and post-conditions of the transitions are:
						ArcPosition[] posArray = new ArcPosition[] { arcPos1,
								arcPos2 };

						Arc ds = ptf.createArc();
						Node source = pProc;
						Node target = transition;
						netBuilder.writeArc(page, ds, pProc.getId() + "_"
								+ transition.getId(), source, target, posArray,
								1);

					}// processor granting

				}

				// processor releasing
				transitions = PTNetHelper.findAllTransitionsStartingWith(ptNet,
						Constants.TC + task.getName());

				if (transitions.size() > 0) {

					for (Transition transition : transitions) {
						// ARCS
						ArcPosition arcPos1 = new ArcPosition(8, 9);
						ArcPosition arcPos2 = new ArcPosition(18, 6);

						// Pre and post-conditions of the transitions are:
						ArcPosition[] posArray = new ArcPosition[] { arcPos1,
								arcPos2 };

						Arc ds = ptf.createArc();
						Node source = transition;
						Node target = pProc;
						netBuilder.writeArc(page, ds, transition.getId() + "_"
								+ pProc.getId(), source, target, posArray, 1);

					}// processor releasing
				}

			}
		}

		// page.getCorePnmlpnObjects().remove(pProc);
		//		
		// NodeGraphics ng = pProc.getCorePnmlgraphics();
		// Position pos = ng.getCorePnmlposition();
		// pos.setY(position / index);
		// ng.setCorePnmlposition(pos);
		//		
		// pProc.setCorePnmlgraphics(ng);

		page.getCorePnmlpnObjects().add(pProc);

		return ptNetResult;

	}

	private void writePrecedenceRelation(PetriNet ptNet, Page page,
			Task tPreceded, Task tPrecedes) {

		Place refiningPlace = null;
		Place pPrec = null;
		Place pNewPwp = null;
		Transition refinedTrans = null;
		PTNetBuilder netBuilder = PTNetBuilder.getInstance();
		PtnetFactory ptf = PtnetPackage.eINSTANCE.getPtnetFactory();

		// populating refined places data

		refiningPlace = (Place) PTNetHelper.findPlaceById(ptNet, "pwg_"
				+ tPrecedes.getName());

		pPrec = ptf.createPlace();

		String pPrecName = "prec_" + tPreceded.getName() + "_"
				+ tPrecedes.getName();

		// set the place id - sample: <place id="PStart">
		pPrec.setId(pPrecName);

		// set the place name - <name/>
		Name pSName = ptf.createName();
		pSName.setValue(pPrecName);
		pPrec.setCorePnmlname(pSName);

		// Initial marking for place Start - <initialMarking/>
		PTMarking sMarking = ptf.createPTMarking();
		sMarking.setValue(new Integer(0));

		pPrec.setPtPnmlinitialMarking(sMarking);

		pNewPwp = ptf.createPlace();

		String pNewPwpName = "pwp_" + tPreceded.getName() + "_"
				+ tPrecedes.getName();

		// set the place id - sample: <place id="PStart">
		pNewPwp.setId(pNewPwpName);

		// set the place name - <name/>
		pSName = ptf.createName();
		pSName.setValue(pNewPwpName);
		pNewPwp.setCorePnmlname(pSName);

		// Initial marking for place Start - <initialMarking/>
		sMarking = ptf.createPTMarking();
		sMarking.setValue(new Integer(0));

		pNewPwp.setPtPnmlinitialMarking(sMarking);

		/* ---- transitions -------------- */

		int mameOffsetX = 3;
		int mameOffsetY = -3;
		int posX = 140;
		int posY = 140;

		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				mameOffsetX, mameOffsetY, posX, posY);

		String tPrecName = "tprec_" + tPreceded.getName() + "_"
				+ tPrecedes.getName();

		// Tsm = {tgbij , tsendi,j , tcommij}
		// tgbij : bus granting;
		refinedTrans = ptf.createTransition();
		netBuilder
				.writeTransition(page, refinedTrans, tPrecName, posTransition);

		// composing - NET SERIAL PLACE REFINEMENT
		PTNetComposition netRefinementPlace = new PTNetComposition(
				PTNetOperatorType.SERIAL_PLACE_REFINEMENT);

		ptNet = netRefinementPlace.serialPlaceRefinement(ptNet, refiningPlace,
				pPrec, refinedTrans, pNewPwp);

		Page internalPage = PTNetHelper.getFirstPage(ptNet);

		// processor granting
		List<Transition> transitions = PTNetHelper
				.findAllTransitionsStartingWith(ptNet, Constants.TF
						+ tPreceded.getName());

		if (transitions.size() > 0) {

			for (Transition transition : transitions) {
				// ARCS
				ArcPosition arcPos1 = new ArcPosition(8, 9);
				ArcPosition arcPos2 = new ArcPosition(18, 6);

				// Pre and post-conditions of the transitions are:
				ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

				Arc ds = ptf.createArc();
				Node source = transition;
				Node target = pPrec;
				netBuilder.writeArc(internalPage, ds, transition.getId() + "_"
						+ pPrec.getId(), source, target, posArray, 1);

			}// tf -> pprec

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Export example into PNML - start.");

		EZRealtimeSpec realtimeSystem = null;
		final String PATH_TO_RT_FILE = "data/semaforo.ezrealtime";
		final String PNML_FILE_NAME = "output/semaforo.xml";

		try {
			realtimeSystem = EZRealtimeParser.getInstance().parse(
					PATH_TO_RT_FILE);
		} catch (Exception e) {
			e.printStackTrace();
		}

		EZRealtime2PnmlExport exportExample = new EZRealtime2PnmlExport();
		try {
			exportExample.realtimeSpec2Pnml(realtimeSystem, PNML_FILE_NAME);
		} catch (PnmlException e) {
			e.printStackTrace();
		}
		System.out.println("Export example into PNML done.");
	}

}// class
