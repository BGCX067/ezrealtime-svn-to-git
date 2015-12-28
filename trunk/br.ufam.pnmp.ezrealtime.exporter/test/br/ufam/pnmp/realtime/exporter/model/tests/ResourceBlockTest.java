package br.ufam.pnmp.realtime.exporter.model.tests;

import static org.junit.Assert.fail;

import org.eclipse.emf.common.util.EList;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.Message;
import br.ufam.pnmp.ezrealtime.Processor;
import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.block.ResourceBlock;
import br.ufam.pnmp.ezrealtime.exporter.util.BlockInititalPositionUtil;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.model.ResourceType;
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

public class ResourceBlockTest {

	private static EZRealtimeSpec realtimeSystem;
	private ResourceBlock resourceBlock;
	private static PTNetBuilder ptNetBuilder;
	private static PetriNet ptNetModel;
	private static Page page;

	private static final int DISTANCE_FACTOR = 100;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("ResourceBlockTest.setUpBeforeClass()");
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
		resourceBlock = new ResourceBlock();
		// TODO review
		EList<?> pages = ptNetModel.getCorePnmlpage();
		for (Object object : pages) {
			page = (Page) object;
		}
	}

	@Test
	public void testResourceBlock() {
		try {
			resourceBlock = new ResourceBlock();
		} catch (RuntimeException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void setResType() {
		if (resourceBlock == null) {
			fail("Resource Block not initialized yet!");
		}
		resourceBlock.setResType(ResourceType.PROCESSOR);
		if (resourceBlock.getResType() != ResourceType.PROCESSOR) {
			fail("Wrong Resource [PROCESSOR] type set");
		}
		resourceBlock.setResType(ResourceType.BUS);
		if (resourceBlock.getResType() != ResourceType.BUS) {
			fail("Wrong Resource [BUS] type set");
		}
	}

	@Test
	public void testGetType() {
		if (resourceBlock == null) {
			fail("Resource Block not initialized yet!");
		}
		BlockType type = resourceBlock.getType();
		if (type == null) {
			fail("Resource Block type is null");
		} else if (type != BlockType.RESOURCES) {
			fail("Wrong Block type set");
		}
	}

	@Test(timeout = 2000)
	public void testProcessorBlock() {
		if (page == null) {
			fail("PT Net Page tag is null!");
		} else {
			ptNetModel.getCorePnmlpage().add(page);
		}

		EList<?> tasks = realtimeSystem.getTask();
		EList<?> processors = realtimeSystem.getProcessor();
		if (processors.isEmpty()) {
			fail("Processor list is empty!");
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

			for (Object object : tasks) {
				Task task = (Task) object;
			}
		}
	}

	@Test(timeout = 2000)
	public void testBusBlock() {
		if (page == null) {
			fail("PT Net Page tag is null!");
		} else {
			ptNetModel.getCorePnmlpage().add(page);
		}

		EList<?> tasks = realtimeSystem.getTask();
		EList<?> messages = realtimeSystem.getMessage();
		if (messages.isEmpty()) {
			fail("Message list is empty!");
		} else {
			ResourceBlock resourceBlock = null;
			int distanceFactor = 0;
			for (Object var : messages) {
				Message msg = (Message) var;
				try {
					PlaceOffsetAndPosition pos = BlockInititalPositionUtil
							.createPlaceOffsetAndPosition(BlockType.RESOURCES);
					if (distanceFactor > 0)
						pos.setPositionY(pos.getPositionY() + distanceFactor);
					resourceBlock = new ResourceBlock(ResourceType.BUS);
					resourceBlock.writeBlock(page, msg, pos);
				} catch (Exception e) {
					fail(e.getMessage());
				}
				distanceFactor += DISTANCE_FACTOR;
			}

			for (Object object : tasks) {
				Task task = (Task) object;
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
			final String PNML_FILE_NAME = "output/resourceblock.xml";
			thePrinter.writePNMLDocument(pnmlDoc, LOGMEDIA.FILE_LITERAL,
					PNML_FILE_NAME);
		} catch (PnmlException e) {
			fail(e.getMessage());
		}
	}

}
