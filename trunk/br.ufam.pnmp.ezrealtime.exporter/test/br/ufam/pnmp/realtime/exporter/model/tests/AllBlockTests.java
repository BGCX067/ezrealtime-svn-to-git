package br.ufam.pnmp.realtime.exporter.model.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses( { ForkBlockTest.class, DeadlineCheckingBlockTest.class })
public class AllBlockTests {

}
