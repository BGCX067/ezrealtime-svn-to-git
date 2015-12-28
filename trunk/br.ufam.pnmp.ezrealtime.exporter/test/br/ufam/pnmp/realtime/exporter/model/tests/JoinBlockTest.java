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
import br.ufam.pnmp.ezrealtime.block.JoinBlock;
import br.ufam.pnmp.ezrealtime.exporter.util.BlockInititalPositionUtil;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.pnml.PTNetBuilder;
import br.ufam.pnmp.ezrealtime.pnml.exporter.EZRealtimeParser;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.PetriNet;
import fr.lip6.move.pnml.ptnet.PetriNetDoc;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.utilities.LOGMEDIA;
import fr.lip6.move.pnml.utilities.PNMLPrinter;
import fr.lip6.move.pnml.utilities.PnmlException;
import fr.lip6.move.pnml.utilities.UtilitiesFactory;
import fr.lip6.move.pnml.utilities.UtilitiesPackage;

public class JoinBlockTest {

	private static EZRealtimeSpec realtimeSystem;
	private static JoinBlock joinBlock;
	private static PTNetBuilder ptNetBuilder;
	private static PetriNet ptNetModel;
	private static Page page;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("JoinBlockTest.setUpBeforeClass()");
		final String PATH_TO_RT_FILE = "data/semaforo.ezrealtime";
		try {
			realtimeSystem = EZRealtimeParser.getInstance()
					.parse(PATH_TO_RT_FILE);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ptNetBuilder = PTNetBuilder.getInstance();
		ptNetModel = ptNetBuilder.createPetriNetModel();
		joinBlock = new JoinBlock();
		// TODO review
		EList<?> pages = ptNetModel.getCorePnmlpage();
		for (Object object : pages) {
			page = (Page) object;
		}
	}

	@Test
	public void testJoinBlock() {
		try {
			joinBlock = new JoinBlock();
		} catch (RuntimeException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testGetType() {
		if (joinBlock == null) {
			fail("Join Block not initialized yet!");
		}
		BlockType type = joinBlock.getType();
		if (type == null) {
			fail("Join Block type is null");
		} else if (type != BlockType.JOIN) {
			fail("Wrong Block type set");
		}
	}

	@Test(timeout = 2000)
	public void testWriteBlock() {
		if (page == null) {
			fail("PT Net Page tag is null!");
		} else {
			ptNetModel.getCorePnmlpage().add(page);
		}

		PlaceOffsetAndPosition pos = BlockInititalPositionUtil
				.createPlaceOffsetAndPosition(BlockType.JOIN);

		EList<?> tasks = realtimeSystem.getTask();
		if (tasks.isEmpty()) {
			fail("Task list is empty!");
		} else {
			for (Object object : tasks) {
				Task task = (Task) object;
				try {
					System.out.println("JoinBlockTest.testWriteBlock()");
					joinBlock.writeBlock(page, task, pos);
				} catch (Exception e) {
					fail(e.getMessage());
				}
				break;
			}
		}
	}

	@AfterClass
	public static void tearDownClass() {
		PtnetFactory ptf = null;
		UtilitiesFactory uf = null;
		try {
			ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
			uf = UtilitiesPackage.eINSTANCE.getUtilitiesFactory();
			PetriNetDoc pnmlDoc = ptf.createPetriNetDoc();
			pnmlDoc.getCorePnmlnet().add(ptNetModel);
			PNMLPrinter thePrinter = uf.createPNMLPrinter();
			final String PNML_FILE_NAME = "output/joinblock.xml";
			thePrinter.writePNMLDocument(pnmlDoc, LOGMEDIA.FILE_LITERAL,
					PNML_FILE_NAME);
		} catch (PnmlException e) {
			fail(e.getMessage());
		}
	}

}
