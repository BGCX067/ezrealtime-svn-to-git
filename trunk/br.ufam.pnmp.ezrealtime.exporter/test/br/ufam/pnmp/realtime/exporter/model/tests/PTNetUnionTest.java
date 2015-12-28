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
import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.block.DeadlineCheckingBlock;
import br.ufam.pnmp.ezrealtime.block.ForkBlock;
import br.ufam.pnmp.ezrealtime.block.JoinBlock;
import br.ufam.pnmp.ezrealtime.block.PeriodicTaskArrivalBlock;
import br.ufam.pnmp.ezrealtime.block.PreemptiveTaskStructureBlock;
import br.ufam.pnmp.ezrealtime.exporter.util.BlockInititalPositionUtil;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.pnml.PTNetBuilder;
import br.ufam.pnmp.ezrealtime.pnml.PTNetComposition;
import br.ufam.pnmp.ezrealtime.pnml.PTNetHelper;
import br.ufam.pnmp.ezrealtime.pnml.PTNetOperatorType;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Constants;
import br.ufam.pnmp.ezrealtime.pnml.exporter.EZRealtimeParser;
import fr.lip6.move.pnml.ptnet.Name;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.utilities.LOGMEDIA;
import fr.lip6.move.pnml.utilities.PNMLPrinter;
import fr.lip6.move.pnml.utilities.PnmlException;
import fr.lip6.move.pnml.utilities.UtilitiesFactory;
import fr.lip6.move.pnml.utilities.UtilitiesPackage;

public class PTNetUnionTest {

	private static EZRealtimeSpec realtimeSystem;

	private static PetriNet ptNetResult;

	private static final int DISTANCE_FACTOR = 300;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("PTNetUnionTest.setUpBeforeClass()");
		final String PATH_TO_RT_FILE = "data/semaforo.ezrealtime";
		try {
			realtimeSystem = EZRealtimeParser.getInstance().parse(
					PATH_TO_RT_FILE);
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
	public void testPTNetUnion() {
		EList<?> tasks = realtimeSystem.getTask();
		if (tasks.isEmpty()) {
			fail("Task list is empty!");
		} else {

			PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();

			ptNetResult = ptNetBuilder.createPetriNetModel();

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

				distance += DISTANCE_FACTOR;
			}

			writeForkBlock(ptNetResult, tasks);

			writeJoinBlock(ptNetResult, tasks);

		}
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
					"output/ptNetUnion.xml");

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
