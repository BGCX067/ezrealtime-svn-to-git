/**
 * <copyright> 
 *
 * Copyright (c) 2008 Fabiano Cruz (UFAM - Universidade Federal do Amazonas) 
 * and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Fabiano Cruz [fabianoc at acm.org] - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: PlaceOffsetAndPosition.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.model;

public final class PlaceOffsetAndPosition {

	private Integer nameOffsetX = 0;
	private Integer nameOffsetY = 0;
	private Integer markingOffsetX = 0;
	private Integer markingOffsetY = 0;
	private Integer positionX = 0;
	private Integer positionY = 0;

	public PlaceOffsetAndPosition() {
	}

	public PlaceOffsetAndPosition(Integer nameOffsetX, Integer nameOffsetY,
			Integer markingOffsetX, Integer markingOffsetY, Integer positionX,
			Integer positionY) {
		super();
		this.nameOffsetX = nameOffsetX;
		this.nameOffsetY = nameOffsetY;
		this.markingOffsetX = markingOffsetX;
		this.markingOffsetY = markingOffsetY;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public Integer getNameOffsetX() {
		return nameOffsetX;
	}

	public void setNameOffsetX(Integer nameOffsetX) {
		this.nameOffsetX = nameOffsetX;
	}

	public Integer getNameOffsetY() {
		return nameOffsetY;
	}

	public void setNameOffsetY(Integer nameOffsetY) {
		this.nameOffsetY = nameOffsetY;
	}

	public Integer getMarkingOffsetX() {
		return markingOffsetX;
	}

	public void setMarkingOffsetX(Integer markingOffsetX) {
		this.markingOffsetX = markingOffsetX;
	}

	public Integer getMarkingOffsetY() {
		return markingOffsetY;
	}

	public void setMarkingOffsetY(Integer markingOffsetY) {
		this.markingOffsetY = markingOffsetY;
	}

	public Integer getPositionX() {
		return positionX;
	}

	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}

	public Integer getPositionY() {
		return positionY;
	}

	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}

	@Override
	public String toString() {
		return "[nameOffsetX = " + nameOffsetX + " | nameOffsetY = "
				+ nameOffsetY + " | markingOffsetX = " + markingOffsetX
				+ " | markingOffsetY = " + markingOffsetY + " | positionX = "
				+ positionX + " | positionY = " + positionY + " ]";
	}

}
