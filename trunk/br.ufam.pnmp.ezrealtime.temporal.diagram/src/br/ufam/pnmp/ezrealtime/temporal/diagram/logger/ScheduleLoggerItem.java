/*
 * Created on 12/12/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram.logger;

/**
 * @author Adilson Arcoverde
 * 
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class ScheduleLoggerItem {

    private String processorName;

    private String taskName;

    private int initialTime;

    /**
     *  
     */
    public ScheduleLoggerItem() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public int getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(int startTime) {
        this.initialTime = startTime;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}