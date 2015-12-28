package br.ufam.pnmp.realtime.exporter.model.tests;

import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.EList;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.block.DeadlineCheckingBlock;
import br.ufam.pnmp.ezrealtime.block.ForkBlock;
import br.ufam.pnmp.ezrealtime.block.JoinBlock;
import br.ufam.pnmp.ezrealtime.block.PeriodicTaskArrivalBlock;
import br.ufam.pnmp.ezrealtime.block.PreemptiveTaskStructureBlock;
import br.ufam.pnmp.ezrealtime.exporter.util.BlockInititalPositionUtil;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.model.TransitionOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.pnml.PTNetBuilder;
import br.ufam.pnmp.ezrealtime.pnml.PTNetComposition;
import br.ufam.pnmp.ezrealtime.pnml.PTNetHelper;
import br.ufam.pnmp.ezrealtime.pnml.PTNetOperatorType;
import br.ufam.pnmp.ezrealtime.pnml.exporter.EZRealtimeParser;
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

public class PTNetPrecedenceRelationTest {

	private static EZRealtimeSpec realtimeSystem;

	private static PetriNet ptNetPrecedence;

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
	public void testPTNetPrecedenceRelation() {
		EList<?> tasks = realtimeSystem.getTask();
		if (tasks.isEmpty()) {
			fail("Task list is empty!");
		} else {

			PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();

			PetriNet ptNetFork = ptNetBuilder.createPetriNetModel();
			PetriNet ptNetJoin = ptNetBuilder.createPetriNetModel();
			Page pagePTNetFork = PTNetHelper.getFirstPage(ptNetFork);
			Page pagePTNetJoin = PTNetHelper.getFirstPage(ptNetJoin);
			ForkBlock forkBlock = new ForkBlock();
			JoinBlock joinBlock = new JoinBlock();

			PetriNet ptNetArrival = null;
			PetriNet ptNetStructure = null;
			PetriNet ptNetDeadline = null;

			PetriNet ptNet1 = null;
			PetriNet ptNet2 = null;

			String secondTaskName = null;
			int taskCount = 0;
			for (Object object : tasks) {
				taskCount++;
				Task task = (Task) object;
				try {
					// creating PT NET blocks
					System.out.println("Creating PT NET blocks...");
					System.out.println("Task name: " + task.getName());
					if (taskCount == 1) {
						ptNetArrival = ptNetBuilder.createPetriNetModel();
						ptNetStructure = ptNetBuilder.createPetriNetModel();
						ptNetDeadline = ptNetBuilder.createPetriNetModel();
						ptNet1 = writeAndMergeFirstTask(task, ptNetArrival,
								ptNetStructure, ptNetDeadline);
					} else if (taskCount == 2) {
						ptNetArrival = ptNetBuilder.createPetriNetModel();
						ptNetStructure = ptNetBuilder.createPetriNetModel();
						ptNetDeadline = ptNetBuilder.createPetriNetModel();
						ptNet2 = writeAndMergeSecondTask(task, ptNetArrival,
								ptNetStructure, ptNetDeadline);
						secondTaskName = task.getName();
					}
					forkBlock
							.writeBlock(
									pagePTNetFork,
									task,
									BlockInititalPositionUtil
											.createPlaceOffsetAndPosition(BlockType.FORK));
					joinBlock
							.writeBlock(
									pagePTNetJoin,
									task,
									BlockInititalPositionUtil
											.createPlaceOffsetAndPosition(BlockType.JOIN));
				} catch (Exception e) {
					fail(e.getMessage());
				}
				if (taskCount == 2) {
					// creating for only two tasks - T0 and T1
					break;
				}
			}

			// composing - NET UNION
			PTNetComposition netUnion = new PTNetComposition(
					PTNetOperatorType.NET_UNION);

			ptNetPrecedence = netUnion.ptNetUnion(ptNet1, ptNet2);

			// composing - PLACE_MERGING
			PTNetComposition netComposition = new PTNetComposition(
					PTNetOperatorType.PLACE_MERGING);

			Place refiningPlace = null;
			Place refinedPlace1 = null;
			Place refinedPlace2 = null;
			Transition refinedTrans = null;

			// populating refined places data
			{

				refiningPlace = (Place) PTNetHelper.findPlaceById(
						ptNetPrecedence, "pwg_" + secondTaskName);

				PtnetFactory ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
				refinedPlace1 = ptf.createPlace();

				// set the place id - sample: <place id="PStart">
				refinedPlace1.setId("pprec");

				// set the place name - <name/>
				Name pSName = ptf.createName();
				pSName.setValue("pperc");
				refinedPlace1.setCorePnmlname(pSName);

				refinedPlace2 = ptf.createPlace();

				// set the place id - sample: <place id="PStart">
				refinedPlace2.setId("pwp");

				// set the place name - <name/>
				pSName = ptf.createName();
				pSName.setValue("pwp");
				refinedPlace2.setCorePnmlname(pSName);

				/* ---- transitions -------------- */

				int mameOffsetX = 3;
				int mameOffsetY = -3;
				int posX = 140;
				int posY = 140;

				TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
						mameOffsetX, mameOffsetY, posX, posY);

				PTNetBuilder netBuilder = PTNetBuilder.getInstance();

				Page page = PTNetHelper.getFirstPage(ptNetPrecedence);

				// Tsm = {tgbij , tsendi,j , tcommij}
				// tgbij : bus granting;
				refinedTrans = ptf.createTransition();
				netBuilder.writeTransition(page, refinedTrans, "tprec",
						posTransition);

			}

			// composing - NET SERIAL PLACE REFINEMENT
			PTNetComposition netRefinementPlace = new PTNetComposition(
					PTNetOperatorType.SERIAL_PLACE_REFINEMENT);

			ptNetPrecedence = netRefinementPlace.serialPlaceRefinement(
					ptNetPrecedence, refiningPlace, refinedPlace1,
					refinedTrans, refinedPlace2);

			ptNetPrecedence = netComposition.placeMerging(ptNetPrecedence,
					ptNetFork);
			ptNetPrecedence = netComposition.placeMerging(ptNetPrecedence,
					ptNetJoin);

		}
	}

	private PetriNet writeAndMergeFirstTask(Task task, PetriNet ptNetArrival,
			PetriNet ptNetStructure, PetriNet ptNetDeadline) {

		// TODO review
		Page pagePTNetArrival = PTNetHelper.getFirstPage(ptNetArrival);
		Page pagePTNetStructure = PTNetHelper.getFirstPage(ptNetStructure);
		Page pagePTNetDeadline = PTNetHelper.getFirstPage(ptNetDeadline);

		// creating PT NET blocks - Arrival
		PeriodicTaskArrivalBlock taskArrivalBlock = new PeriodicTaskArrivalBlock();
		taskArrivalBlock.writeBlock(pagePTNetArrival, task,
				BlockInititalPositionUtil
						.createPlaceOffsetAndPosition(BlockType.TASK_ARRIVAL));
		// creating PT NET blocks - Structure
		PreemptiveTaskStructureBlock taskStructureBlock = new PreemptiveTaskStructureBlock();
		taskStructureBlock
				.writeBlock(pagePTNetStructure, task, BlockInititalPositionUtil
						.createPlaceOffsetAndPosition(BlockType.TASK_STRUCTURE));
		// creating PT NET blocks - Deadline
		DeadlineCheckingBlock deadlineBlock = new DeadlineCheckingBlock();
		deadlineBlock
				.writeBlock(
						pagePTNetDeadline,
						task,
						BlockInititalPositionUtil
								.createPlaceOffsetAndPosition(BlockType.DEADLINE_CHECKING));
		// creating PT NET blocks - End State

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

	private PetriNet writeAndMergeSecondTask(Task task, PetriNet ptNetArrival,
			PetriNet ptNetStructure, PetriNet ptNetDeadline) {

		// TODO review
		Page pagePTNetArrival = PTNetHelper.getFirstPage(ptNetArrival);
		Page pagePTNetStructure = PTNetHelper.getFirstPage(ptNetStructure);
		Page pagePTNetDeadline = PTNetHelper.getFirstPage(ptNetDeadline);

		PlaceOffsetAndPosition pos = BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.TASK_ARRIVAL);
		// creating PT NET blocks - Arrival
		pos.setPositionY(pos.getPositionY() + DISTANCE_FACTOR);
		PeriodicTaskArrivalBlock taskArrivalBlock = new PeriodicTaskArrivalBlock();
		taskArrivalBlock.writeBlock(pagePTNetArrival, task, pos);
		// creating PT NET blocks - Structure
		pos = BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.TASK_STRUCTURE);
		pos.setPositionY(pos.getPositionY() + DISTANCE_FACTOR);
		PreemptiveTaskStructureBlock taskStructureBlock = new PreemptiveTaskStructureBlock();
		taskStructureBlock.writeBlock(pagePTNetStructure, task, pos);
		// creating PT NET blocks - Deadline
		pos = BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.DEADLINE_CHECKING);
		pos.setPositionY(pos.getPositionY() + DISTANCE_FACTOR);
		DeadlineCheckingBlock deadlineBlock = new DeadlineCheckingBlock();
		deadlineBlock.writeBlock(pagePTNetDeadline, task, pos);
		// creating PT NET blocks - End State

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
			pnmlDoc.getCorePnmlnet().add(ptNetPrecedence);
			PNMLPrinter thePrinter = uf.createPNMLPrinter();
			thePrinter.writePNMLDocument(pnmlDoc, LOGMEDIA.FILE_LITERAL,
					"output/ptNetPrecedence.xml");

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
