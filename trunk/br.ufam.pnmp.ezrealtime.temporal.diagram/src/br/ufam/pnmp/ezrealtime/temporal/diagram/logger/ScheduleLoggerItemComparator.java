/*
 * Created on 12/12/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram.logger;

import java.util.Comparator;

/**
 * @author Adilson Arcoverde
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class ScheduleLoggerItemComparator implements Comparator {

    /**
     * 
     */
    public ScheduleLoggerItemComparator() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int compare(Object o1, Object o2) {
        int result = 0;
        ScheduleLoggerItem item1 = (ScheduleLoggerItem) o1;
        ScheduleLoggerItem item2 = (ScheduleLoggerItem) o2;
        
        String itemProcessor1 = item1.getProcessorName();
        String itemProcessor2 = item2.getProcessorName();
        
        if( itemProcessor1.equals( itemProcessor2 ) ) {
            Integer initialTime1 = new Integer(item1.getInitialTime());
            Integer initialTime2 = new Integer(item2.getInitialTime());
            result = initialTime1.compareTo( initialTime2 );
        } else {
            result = itemProcessor1.compareTo( itemProcessor2 );
        }
        return result;
    }

}
