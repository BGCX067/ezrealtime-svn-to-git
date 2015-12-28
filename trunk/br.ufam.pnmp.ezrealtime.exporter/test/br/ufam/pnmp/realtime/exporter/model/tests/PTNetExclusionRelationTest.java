package br.ufam.pnmp.realtime.exporter.model.tests;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.Processor;
import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.block.DeadlineCheckingBlock;
import br.ufam.pnmp.ezrealtime.block.ForkBlock;
import br.ufam.pnmp.ezrealtime.block.JoinBlock;
import br.ufam.pnmp.ezrealtime.block.PeriodicTaskArrivalBlock;
import br.ufam.pnmp.ezrealtime.block.PreemptiveTaskStructureBlock;
import br.ufam.pnmp.ezrealtime.block.ResourceBlock;
import br.ufam.pnmp.ezrealtime.exporter.util.BlockInititalPositionUtil;
import br.ufam.pnmp.ezrealtime.model.ArcPosition;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.model.ResourceType;
import br.ufam.pnmp.ezrealtime.model.TransitionOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.pnml.PTNetBuilder;
import br.ufam.pnmp.ezrealtime.pnml.PTNetComposition;
import br.ufam.pnmp.ezrealtime.pnml.PTNetHelper;
import br.ufam.pnmp.ezrealtime.pnml.PTNetOperatorType;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Constants;
import br.ufam.pnmp.ezrealtime.pnml.exporter.EZRealtimeParser;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Name;
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

public class PTNetExclusionRelationTest {

	private static EZRealtimeSpec realtimeSystem;

	private static PetriNet ptNetResult;

	private static final int DISTANCE_FACTOR = 300;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("PTNetUnionTest.setUpBeforeClass()");
		final String PATH_TO_RT_FILE = "data/semaforo.ezrealtime";
		try {
			realtimeSystem = EZRealtimeParser.getInstance()
					.parse(PATH_TO_RT_FILE);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testPTNetPageAvailability() {
		// checkPage(ptNetInitialState);
		// checkPage(ptNetArrival);
		// checkPage(ptNetStructure);
		// checkPage(ptNetDeadline);
		// checkPage(ptNetEnd);
	}

	@Test
	public void testPTNetExclusionRelation() {
		EList<?> tasks = realtimeSystem.getTask();
		if (tasks.isEmpty()) {
			fail("Task list is empty!");
		} else {

			PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();

			ptNetResult = ptNetBuilder.createPetriNetModel();

			String lastTaskName = null;
			int distance = 0;
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
					fail(e.getMessage());
				}

				lastTaskName = task.getName();

				distance += DISTANCE_FACTOR;
			}

			Page page = PTNetHelper.getFirstPage(ptNetResult);

			// populating refined places data
			Place refiningPlace = null;
			Place refinedPlace1 = null;
			Place refinedPlace2 = null;
			Transition refinedTrans = null;
			{
				refiningPlace = (Place) PTNetHelper.findPlaceById(ptNetResult,
						"pwg_" + lastTaskName);

				PtnetFactory ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
				refinedPlace1 = ptf.createPlace();

				// set the place id - sample: <place id="PStart">
				refinedPlace1.setId("pexcl");

				// set the place name - <name/>
				Name pSName = ptf.createName();
				pSName.setValue("pexcl");
				refinedPlace1.setCorePnmlname(pSName);

				refinedPlace2 = ptf.createPlace();

				// set the place id - sample: <place id="PStart">
				refinedPlace2.setId("pwexcl");

				// set the place name - <name/>
				pSName = ptf.createName();
				pSName.setValue("pwexcl");
				refinedPlace2.setCorePnmlname(pSName);

				/* ---- transitions -------------- */

				int mameOffsetX = 3;
				int mameOffsetY = -3;
				int posX = 140;
				int posY = 140;

				TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
						mameOffsetX, mameOffsetY, posX, posY);

				PTNetBuilder netBuilder = PTNetBuilder.getInstance();

				refinedTrans = ptf.createTransition();
				netBuilder.writeTransition(page, refinedTrans, "texcl",
						posTransition);

			}

			// composing - NET SERIAL PLACE REFINEMENT
			PTNetComposition netRefinementPlace = new PTNetComposition(
					PTNetOperatorType.SERIAL_PLACE_REFINEMENT);

			ptNetResult = netRefinementPlace.serialPlaceRefinement(ptNetResult,
					refiningPlace, refinedPlace1, refinedTrans, refinedPlace2);

			EList<?> processors = realtimeSystem.getProcessor();
			addProcessor(ptNetResult, page, processors, tasks);

			writeForkBlock(ptNetResult, tasks);

			writeJoinBlock(ptNetResult, tasks);

		}
	}

	private void addProcessor(PetriNet ptNet, Page page, EList<?> processors,
			EList<?> tasks) {

		if (processors.isEmpty()) {
			return;
		} else {
			ResourceBlock resourceBlock = null;
			int distanceFactor = 0;
			for (Object var : processors) {
				Processor processor = (Processor) var;
				try {
					PlaceOffsetAndPosition pos = BlockInititalPositionUtil
							.createPlaceOffsetAndPosition(BlockType.RESOURCES);
					if (distanceFactor > 0)
						pos.setPositionY(pos.getPositionY() + distanceFactor);
					resourceBlock = new ResourceBlock(ResourceType.PROCESSOR);
					resourceBlock.writeBlock(page, processor, pos);
				} catch (Exception e) {
					fail(e.getMessage());
				}
				distanceFactor += DISTANCE_FACTOR;
			}

			List<Place> places = PTNetHelper.findAllPlacesStartingWith(ptNet,
					Constants.PPROC);
			for (Place pProc : places) {
				processorGrantingAndReleasing(ptNet, page, pProc, tasks);
			}
		}
	}

	private void processorGrantingAndReleasing(PetriNet ptNet, Page page,
			Place pProc, EList<?> tasks) {

		int index = 0;
		int position = 0;

		for (Object object : tasks) {
			Task task = (Task) object;
			index++;

			if ((Constants.PPROC.concat(task.getProcessor().getName()))
					.equals(pProc.getId())) {

				// processor granting
				List<Transition> transitions = PTNetHelper
						.findAllTransitionsStartingWith(ptNet, Constants.TG);

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
						netBuilder.writeArc(page, ds, pProc.getId() + "-tg",
								source, target, posArray, 1);

					}// processor granting

				}

				// processor releasing
				transitions = PTNetHelper.findAllTransitionsStartingWith(ptNet,
						Constants.TC);

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
						netBuilder.writeArc(page, ds, Constants.TC
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

	}

	private void writeForkBlock(PetriNet ptNet, EList<?> tasks) {

		PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();

		PetriNet ptNetFork = ptNetBuilder.createPetriNetModel();
		Page pagePTNetFork = PTNetHelper.getFirstPage(ptNetFork);
		ForkBlock forkBlock = new ForkBlock();

		forkBlock.writeBlock(pagePTNetFork, tasks, BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.FORK));

		List<Place> mergingPlacesNet1 = PTNetHelper.findAllPlacesStartingWith(
				ptNet, Constants.PST);
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

			mergedPlaces.add(placeResult);

		}

		// composing - PLACE_MERGING
		PTNetComposition netComposition = new PTNetComposition(
				PTNetOperatorType.PLACE_MERGING);

		ptNetResult = netComposition.placeMerging(ptNet, ptNetFork,
				mergingPlacesNet1, mergingPlacesNet2, mergedPlaces);

	}

	private void writeJoinBlock(PetriNet ptNet, EList<?> tasks) {

		PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();

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
				ptNet, Constants.PF);
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

			mergedPlaces.add(placeResult);

		}

		// composing - PLACE_MERGING
		PTNetComposition netComposition = new PTNetComposition(
				PTNetOperatorType.PLACE_MERGING);

		ptNetResult = netComposition.placeMerging(ptNet, ptNetJoin,
				mergingPlacesNet1, mergingPlacesNet2, mergedPlaces);

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

		PreemptiveTaskStructureBlock taskStructureBlock = new PreemptiveTaskStructureBlock();
		taskStructureBlock.writeBlock(pagePTNetStructure, task, pos);

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

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		PtnetFactory ptf = null;
		UtilitiesFactory uf = null;
		try {
			ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
			uf = UtilitiesPackage.eINSTANCE.getUtilitiesFactory();
			PetriNetDoc pnmlDoc = ptf.createPetriNetDoc();
			pnmlDoc.getCorePnmlnet().add(ptNetResult);
			PNMLPrinter thePrinter = uf.createPNMLPrinter();
			thePrinter.writePNMLDocument(pnmlDoc, LOGMEDIA.FILE_LITERAL,
					"output/ptNetExclusion.xml");

		} catch (PnmlException e) {
			fail(e.getMessage());
		} finally {
			ptf = null;
			uf = null;
		}
	}

	private void checkPage(PetriNet ptNet) {
		if (ptNet == null) {
			fail("PT Net - Page tag is null!");
		} else {
			ptNet.getCorePnmlpage().add(PTNetHelper.getFirstPage(ptNet));
		}
	}

}
