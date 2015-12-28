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
 * $Id: TransitionOffsetAndPosition.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */

package br.ufam.pnmp.ezrealtime.model;

public final class TransitionOffsetAndPosition {

	private int nameOffsetX = 0;
	private int nameOffsetY = 0;
	private int positionX = 0;
	private int positionY = 0;

	public TransitionOffsetAndPosition(int nameOffsetX, int nameOffsetY,
			int positionX, int positionY) {
		super();
		this.nameOffsetX = nameOffsetX;
		this.nameOffsetY = nameOffsetY;
		this.positionX = positionX;
		this.positionY = positionY;
	}

	public int getNameOffsetX() {
		return nameOffsetX;
	}

	public void setNameOffsetX(int nameOffsetX) {
		this.nameOffsetX = nameOffsetX;
	}

	public int getNameOffsetY() {
		return nameOffsetY;
	}

	public void setNameOffsetY(int nameOffsetY) {
		this.nameOffsetY = nameOffsetY;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

}
