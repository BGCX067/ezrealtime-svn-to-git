/**
 * 
 */
package br.ufam.pnmp.realtime.exporter.tests;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.pnml.EZRealtime2PnmlExport;
import br.ufam.pnmp.ezrealtime.pnml.exporter.EZRealtimeParser;
import fr.lip6.move.pnml.utilities.PnmlException;

/**
 * @author fabiano.cruz
 * 
 */
public class Realtime2PnmlExportTest {

	private static EZRealtimeSpec realtimeSystem;
	private EZRealtime2PnmlExport export;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setting up the realtime model ...");
		final String PATH_TO_RT_FILE = "data/semaforo.realtime";
		try {
			realtimeSystem = EZRealtimeParser.getInstance().parse(
					PATH_TO_RT_FILE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		export = new EZRealtime2PnmlExport();
	}

	@Test
	public void testRealtimeSpec2Pnml() {
		final String PNML_FILE_NAME = "semaforo.xml";
		try {
			export.realtimeSpec2Pnml(realtimeSystem, PNML_FILE_NAME);
		} catch (PnmlException e) {
			fail(e.getMessage());
		}
	}

}
