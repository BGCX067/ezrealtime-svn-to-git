/*
 * Created on Jul 20, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram;

import java.util.List;

/**
 * @author Adilson Arcoverde
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Processor {
	
	private String name;
	private List tasks;
	private List energies;
	
	private Interval interval;
	
	/**
	 * @return Returns the tasks.
	 */
	public List getTasks() {
		return tasks;
	}
	/**
	 * @param tasks The tasks to set.
	 */
	public void setTasks(List tasks) {
		this.tasks = tasks;
	}
	/**
	 * @return Returns the interval.
	 */
	public Interval getInterval() {
		return interval;
	}
	/**
	 * @param interval The interval to set.
	 */
	public void setInterval(Interval interval) {
		this.interval = interval;
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
	/**
	 * @return Returns the energies.
	 */
	public List getEnergies() {
		return energies;
	}
	/**
	 * @param energies The energies to set.
	 */
	public void setEnergies(List energies) {
		this.energies = energies;
	}
}
