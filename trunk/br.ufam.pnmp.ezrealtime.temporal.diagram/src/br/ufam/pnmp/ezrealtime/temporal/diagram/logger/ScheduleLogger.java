/*
 * Created on 12/12/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import br.ufam.pnmp.ezrealtime.temporal.diagram.Interval;
import br.ufam.pnmp.ezrealtime.temporal.diagram.Processor;
import br.ufam.pnmp.ezrealtime.temporal.diagram.Task;

/**
 * @author Adilson Arcoverde
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ScheduleLogger {
    
    private static final ScheduleLogger instance = new ScheduleLogger();
    
    /**
     * 
     */
    private ScheduleLogger() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public static ScheduleLogger getInstance() {
        return instance;
    }
    
    public void log( List processors, File logFile ) throws IOException {
        String lineSeparator = System.getProperty( "line.separator" );
        
        Set itensSet = new TreeSet( new ScheduleLoggerItemComparator() );
        
        FileWriter writer = new FileWriter( logFile, false );
        Iterator iterator = processors.iterator();
        while (iterator.hasNext()) {
            Processor nextProcessor = (Processor) iterator.next();
            String processorName = nextProcessor.getName();
            
            List tasksList = nextProcessor.getTasks();
            Iterator tasksListIterator = tasksList.iterator();
            while (tasksListIterator.hasNext()) {
                Task nextTask = (Task) tasksListIterator.next();
                String taskName = nextTask.getName();
                Iterator intervalsIterator = nextTask.getIntervals().iterator();
                while (intervalsIterator.hasNext()) {
                    Interval nextInterval = (Interval) intervalsIterator.next();
                    ScheduleLoggerItem newItem = new ScheduleLoggerItem();
                    newItem.setProcessorName( processorName );
                    newItem.setTaskName( taskName );
                    newItem.setInitialTime( nextInterval.getInitialTime() );
                    itensSet.add( newItem );
                }
            }
        }
        
        StringBuffer itensBuffer = new StringBuffer();
        Iterator itensIterator = itensSet.iterator();
        while (itensIterator.hasNext()) {
            ScheduleLoggerItem element = (ScheduleLoggerItem) itensIterator.next();
            itensBuffer.append( element.getProcessorName() );
            itensBuffer.append( "." );
            itensBuffer.append( element.getTaskName() );
            itensBuffer.append( "=" );
            itensBuffer.append( element.getInitialTime() );
            itensBuffer.append( lineSeparator );
        }
        
        writer.write( itensBuffer.toString() );
        writer.flush();
        writer.close();
    }

}
