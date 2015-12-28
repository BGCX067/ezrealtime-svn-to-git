/*
 * Created on Jul 20, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adilson Arcoverde
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Task {
	private String name;
	private Processor processor;
	private List intervals;

	/**
	 * @return Returns the intervals.
	 */
	public List getIntervals() {
		return intervals;
	}
	/**
	 * @param intervals The intervals to set.
	 */
	public void setIntervals(List intervals) {
		this.intervals = intervals;
	}
	/**
	 * @return Returns the name.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name The name to set.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public void addInterval(Interval interval) {
		if( this.intervals == null ) {
			this.intervals = new ArrayList();
		}
		this.intervals.add( interval );
	}
	/**
	 * @return Returns the processor.
	 */
	public Processor getProcessor() {
		return processor;
	}
	/**
	 * @param processor The processor to set.
	 */
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
}
