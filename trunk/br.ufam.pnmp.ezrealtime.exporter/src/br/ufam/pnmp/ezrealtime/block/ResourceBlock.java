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
 * $Id: ResourceBlock.java,v 1.3 2008/01/20 15:48:44 fabianocruz Exp $
 */

package br.ufam.pnmp.ezrealtime.block;

import org.eclipse.emf.ecore.EObject;

import br.ufam.pnmp.ezrealtime.Message;
import br.ufam.pnmp.ezrealtime.Processor;
import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.model.ResourceType;
import br.ufam.pnmp.ezrealtime.pnml.PTNetBuilder;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Constants;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;

public class ResourceBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;
	private ResourceType resType = null;

	public ResourceBlock() {
		super(BlockType.RESOURCES);
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();

	}

	public ResourceBlock(ResourceType resType) {
		this();
		this.resType = resType;
	}

	@Override
	public void writeBlock(Page page, EObject eObj, PlaceOffsetAndPosition pos) {

		/*
		 * int mameOffsetX = 20; int mameOffsetY = 0; int mkgOffsetX = 20; int
		 * mkgOffsetY = 32; int posX = 72; int posY = 129;
		 * 
		 * PlaceOffsetAndPosition pos = new PlaceOffsetAndPosition(mameOffsetX,
		 * mameOffsetY, mkgOffsetX, mkgOffsetY, posX, posY);
		 */

		// int mameOffsetX = pos.getNameOffsetX();
		// int mameOffsetY = pos.getNameOffsetY();
		// int mkgOffsetX = pos.getMarkingOffsetX();
		// int mkgOffsetY = pos.getMarkingOffsetY();
		int posX = pos.getPositionX();
		// int posY = pos.getPositionY();

		final int markingValue = 1;

		PTNetBuilder netBuilder = PTNetBuilder.getInstance();

		/* ---- places and marking ------- */
		switch (resType) {
		case PROCESSOR:
			Processor processor = null;
			if (!(eObj instanceof Processor)) {
				return;
			} else {
				processor = (Processor) eObj;
			}
			// pproc : processor
			pos.setPositionX(posX + 125);
			Place pproc = ptf.createPlace();
			netBuilder.writePlace(page, pproc, Constants.PPROC
					+ processor.getName(), pos, markingValue);
			break;
		case BUS:
			Message msg = null;
			if (!(eObj instanceof Message)) {
				return;
			} else {
				msg = (Message) eObj;
			}
			// pbus : bus
			pos.setPositionX(posX + 125);
			Place pbus = ptf.createPlace();
			netBuilder.writePlace(page, pbus, Constants.PBUS + msg.getName(),
					pos, markingValue);
			break;
		default:
			throw new RuntimeException("Bad Resource Type: " + resType);
		}
	}

	public void setResType(ResourceType resType) {
		this.resType = resType;
	}

	public ResourceType getResType() {
		return resType;
	}

	@Override
	public void writeBlock(Page page, Task task,
			PlaceOffsetAndPosition placePosition) throws Exception {
		// TODO Auto-generated method stub

	}

}// class
