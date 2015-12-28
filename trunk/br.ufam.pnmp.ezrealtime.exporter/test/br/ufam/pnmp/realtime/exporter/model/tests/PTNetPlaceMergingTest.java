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
import br.ufam.pnmp.ezrealtime.block.EndStateBlock;
import br.ufam.pnmp.ezrealtime.block.InitialStateBlock;
import br.ufam.pnmp.ezrealtime.block.PeriodicTaskArrivalBlock;
import br.ufam.pnmp.ezrealtime.block.PreemptiveTaskStructureBlock;
import br.ufam.pnmp.ezrealtime.exporter.util.BlockInititalPositionUtil;
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
import fr.lip6.move.pnml.utilities.LOGMEDIA;
import fr.lip6.move.pnml.utilities.PNMLPrinter;
import fr.lip6.move.pnml.utilities.PnmlException;
import fr.lip6.move.pnml.utilities.UtilitiesFactory;
import fr.lip6.move.pnml.utilities.UtilitiesPackage;

public class PTNetPlaceMergingTest {

	private static EZRealtimeSpec realtimeSystem;
	private PetriNet ptNetInitialState;
	private PetriNet ptNetArrival;
	private PetriNet ptNetStructure;
	private PetriNet ptNetDeadline;
	private PetriNet ptNetEnd;
	private Page pagePTNetArrival;
	private Page pagePTNetStructure;
	private Page pagePTNetDeadline;
	private Page pagePTNetInitialState;
	private Page pagePTNetEndState;
	private static PetriNet ptNetMerged;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("PTNetPlaceMergingTest.setUpBeforeClass()");
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
		PTNetBuilder ptNetBuilder = PTNetBuilder.getInstance();
		ptNetInitialState = ptNetBuilder.createPetriNetModel();
		ptNetArrival = ptNetBuilder.createPetriNetModel();
		ptNetStructure = ptNetBuilder.createPetriNetModel();
		ptNetDeadline = ptNetBuilder.createPetriNetModel();
		ptNetEnd = ptNetBuilder.createPetriNetModel();
		// TODO review
		pagePTNetInitialState = PTNetHelper.getFirstPage(ptNetInitialState);
		pagePTNetArrival = PTNetHelper.getFirstPage(ptNetArrival);
		pagePTNetStructure = PTNetHelper.getFirstPage(ptNetStructure);
		pagePTNetDeadline = PTNetHelper.getFirstPage(ptNetDeadline);
		pagePTNetEndState = PTNetHelper.getFirstPage(ptNetEnd);
	}

	@Test
	public void testPTNetPageAvailability() {
		checkPage(ptNetInitialState);
		checkPage(ptNetArrival);
		checkPage(ptNetStructure);
		checkPage(ptNetDeadline);
		checkPage(ptNetEnd);
	}

	@Test
	public void testPlaceMerging() {

		String taskName = null;
		EList<?> tasks = realtimeSystem.getTask();
		if (tasks.isEmpty()) {
			fail("Task list is empty!");
		} else {
			// creating the blocks
			InitialStateBlock initialStateBlock = new InitialStateBlock();
			PeriodicTaskArrivalBlock taskArrivalBlock = new PeriodicTaskArrivalBlock();
			PreemptiveTaskStructureBlock taskStructureBlock = new PreemptiveTaskStructureBlock();
			DeadlineCheckingBlock deadlineBlock = new DeadlineCheckingBlock();
			EndStateBlock endStateBlock = new EndStateBlock();
			for (Object object : tasks) {
				Task task = (Task) object;
				try {
					initialStateBlock
							.writeBlock(
									pagePTNetInitialState,
									task,
									BlockInititalPositionUtil
											.createPlaceOffsetAndPosition(BlockType.INITIAL_STATE));
					taskArrivalBlock
							.writeBlock(
									pagePTNetArrival,
									task,
									BlockInititalPositionUtil
											.createPlaceOffsetAndPosition(BlockType.TASK_ARRIVAL));

					taskStructureBlock
							.writeBlock(
									pagePTNetStructure,
									task,
									BlockInititalPositionUtil
											.createPlaceOffsetAndPosition(BlockType.TASK_STRUCTURE));

					deadlineBlock
							.writeBlock(
									pagePTNetDeadline,
									task,
									BlockInititalPositionUtil
											.createPlaceOffsetAndPosition(BlockType.DEADLINE_CHECKING));
					endStateBlock
							.writeBlock(
									pagePTNetEndState,
									task,
									BlockInititalPositionUtil
											.createPlaceOffsetAndPosition(BlockType.END_STATE));
				} catch (Exception e) {
					fail(e.getMessage());
				}

				taskName = task.getName();

				// creating for only one task - T0
				break;
			}
		}

		List<Place> mergingPlacesNet1 = null;
		List<Place> mergingPlacesNet2 = null;
		List<Place> mergedPlaces = null;

		// populating merging places data
		{

			Place pwr = (Place) PTNetHelper.findPlaceById(ptNetArrival, "pwr_"
					+ taskName);
			Place pwd = (Place) PTNetHelper.findPlaceById(ptNetArrival, "pwd_"
					+ taskName);

			mergingPlacesNet1 = new ArrayList<Place>();
			mergingPlacesNet1.add(pwr);
			mergingPlacesNet1.add(pwd);

			pwr = (Place) PTNetHelper.findPlaceById(ptNetStructure, "pwr_"
					+ taskName);
			pwd = (Place) PTNetHelper.findPlaceById(ptNetStructure, "pwd_"
					+ taskName);

			mergingPlacesNet2 = new ArrayList<Place>();
			mergingPlacesNet2.add(pwr);
			mergingPlacesNet2.add(pwd);

			PtnetFactory ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
			Place placeResult = ptf.createPlace();

			// set the place id - sample: <place id="PStart">
			placeResult.setId("pwr_fabiano");

			// set the place name - <name/>
			Name pSName = ptf.createName();
			pSName.setValue("pwr_fabiano");
			placeResult.setCorePnmlname(pSName);

			Place placeResult2 = ptf.createPlace();

			// set the place id - sample: <place id="PStart">
			placeResult2.setId("pwd_fabiano");

			// set the place name - <name/>
			pSName = ptf.createName();
			pSName.setValue("pwd_fabiano");
			placeResult2.setCorePnmlname(pSName);

			mergedPlaces = new ArrayList<Place>();
			mergedPlaces.add(placeResult);
			mergedPlaces.add(placeResult2);

		}

		// composing - PLACE_MERGING
		PTNetComposition netComposition = new PTNetComposition(
				PTNetOperatorType.PLACE_MERGING);

		// merging ptNetInitialState + ptNetArrival
		ptNetMerged = netComposition.placeMerging(ptNetInitialState,
				ptNetArrival);
		ptNetMerged = netComposition.placeMerging(ptNetMerged, ptNetStructure,
				mergingPlacesNet1, mergingPlacesNet2, mergedPlaces);
		// ptNetMerged = netComposition.placeMerging(ptNetMerged,
		// ptNetDeadline);
		// ptNetMerged = netComposition.placeMerging(ptNetMerged, ptNetEnd);

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		PtnetFactory ptf = null;
		UtilitiesFactory uf = null;
		try {
			ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
			uf = UtilitiesPackage.eINSTANCE.getUtilitiesFactory();
			PetriNetDoc pnmlDoc = ptf.createPetriNetDoc();
			pnmlDoc.getCorePnmlnet().add(ptNetMerged);
			PNMLPrinter thePrinter = uf.createPNMLPrinter();
			thePrinter.writePNMLDocument(pnmlDoc, LOGMEDIA.FILE_LITERAL,
					"output/ptNetMerged.xml");

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
			// System.out.println("PTNetPlaceMergingTest.checkPage()");
			ptNet.getCorePnmlpage().add(PTNetHelper.getFirstPage(ptNet));
		}
	}

}
