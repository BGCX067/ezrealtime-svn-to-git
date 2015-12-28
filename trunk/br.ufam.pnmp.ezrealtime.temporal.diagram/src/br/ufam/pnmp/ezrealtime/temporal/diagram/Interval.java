/*
 * Created on Jul 20, 2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram;

/**
 * @author Adilson Arcoverde
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Interval {
	private int initialTime;
	private int endTime;

	public Interval( int initialTime, int endTime ) {
		this.setInitialTime(initialTime);
		this.setEndTime(endTime);
	}
	/**
	 * @return Returns the endTime.
	 */
	public int getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime The endTime to set.
	 */
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return Returns the initialTime.
	 */
	public int getInitialTime() {
		return initialTime;
	}
	/**
	 * @param initialTime The initialTime to set.
	 */
	public void setInitialTime(int initialTime) {
		this.initialTime = initialTime;
	}
	
	public String toString() {
		return "(" + initialTime + "," + endTime + ")";
	}
}
