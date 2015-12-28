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
 * $Id: InitialStateBlock.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.block;

import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.model.ArcPosition;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.model.TransitionOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.pnml.PTNetBuilder;
import br.ufam.pnmp.ezrealtime.pnml.exporter.Constants;
import fr.lip6.move.pnml.pnmlcoremodel.Node;
import fr.lip6.move.pnml.ptnet.Arc;
import fr.lip6.move.pnml.ptnet.Page;
import fr.lip6.move.pnml.ptnet.Place;
import fr.lip6.move.pnml.ptnet.PtnetFactory;
import fr.lip6.move.pnml.ptnet.PtnetPackage;
import fr.lip6.move.pnml.ptnet.Transition;

public class InitialStateBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	public InitialStateBlock() {
		super(BlockType.INITIAL_STATE);
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
	}

	@Override
	public void writeBlock(Page page, Task task, PlaceOffsetAndPosition pos) {

		/*
		 * int mameOffsetX = 20; int mameOffsetY = 0; int mkgOffsetX = 20; int
		 * mkgOffsetY = 32; int posX = 51; int posY = 282;
		 * 
		 * PlaceOffsetAndPosition pos = new PlaceOffsetAndPosition(mameOffsetX,
		 * mameOffsetY, mkgOffsetX, mkgOffsetY, posX, posY);
		 */

		int mameOffsetX = pos.getNameOffsetX();
		int mameOffsetY = pos.getNameOffsetY();
		// int mkgOffsetX = pos.getMarkingOffsetX();
		// int mkgOffsetY = pos.getMarkingOffsetY();
		int posX = pos.getPositionX();
		int posY = pos.getPositionY();

		final int markingValue = 1;

		PTNetBuilder netBuilder = PTNetBuilder.getInstance();

		/* ---- places and marking ------- */
		Place pStart = ptf.createPlace();
		netBuilder
				.writePlace(page, pStart, Constants.PSTART, pos, markingValue);

		// psti : starting of task
		pos.setPositionX(posX + 149);
		Place pst = ptf.createPlace();
		netBuilder.writePlace(page, pst, Constants.PST + task.getName(), pos,
				markingValue);

		/* ---- transitions -------------- */

		mameOffsetX = 3;
		mameOffsetY = -3;
		int transPosX = posX + 84;

		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				mameOffsetX, mameOffsetY, transPosX, posY);

		Transition tstart = ptf.createTransition();
		netBuilder.writeTransition(page, tstart, "tstart", posTransition);

		// ARCS
		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);

		// Pre and post-conditions of the transitions are:
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			// pstart -> tstart
			Arc ds = ptf.createArc();
			Node source = pStart;
			Node target = tstart;
			netBuilder.writeArc(page, ds, "pstart-tstart", source, target,
					posArray, 1);

			// tstart -> psti
			ds = ptf.createArc();
			source = tstart;
			target = pst;
			netBuilder.writeArc(page, ds, "tstart-pst_" + task.getName(),
					source, target, posArray, 1);
		}

	}

}// class
