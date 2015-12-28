/*
 * Created on 07/10/2004
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package br.ufam.pnmp.ezrealtime.temporal.diagram;

/**
 * @author Gabriel Alves
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Energy {
	private double enegergy;
	private int changeTime;
	/**
	 * @return Returns the changeTime.
	 */
	public int getChangeTime() {
		return changeTime;
	}
	/**
	 * @param changeTime The changeTime to set.
	 */
	public void setChangeTime(int changeTime) {
		this.changeTime = changeTime;
	}
	/**
	 * @return Returns the enegergy.
	 */
	public double getEnegergy() {
		return enegergy;
	}
	/**
	 * @param enegergy The enegergy to set.
	 */
	public void setEnegergy(double enegergy) {
		this.enegergy = enegergy;
	}
}
