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
 * $Id: ForkBlock.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.block;

import org.eclipse.emf.common.util.EList;

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

public class ForkBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	public ForkBlock() {
		super(BlockType.FORK);
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
	}

	/**
	 * This block consists of the creation of n concurrent process starting from
	 * a single parent process.
	 */
	@Override
	public void writeBlock(Page page, EList<?> tasks, PlaceOffsetAndPosition pos) {

		int markingValue = 1;

		int mameOffsetX = pos.getNameOffsetX();
		int mameOffsetY = pos.getNameOffsetY();
		// int mkgOffsetX = pos.getMarkingOffsetX();
		// int mkgOffsetY = pos.getMarkingOffsetY();
		int posX = pos.getPositionX();
		int posY = pos.getPositionY() + (71 * tasks.size());

		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */

		PTNetBuilder netBuilder = PTNetBuilder.getInstance();

		/* ---- places and marking ------- */
		// Pf = {pstart, pst1 , � � � , psti , � � � , pstn}
		// pstart: waiting for system starting.
		pos.setPositionY(posY);
		Place pstart = ptf.createPlace();
		netBuilder
				.writePlace(page, pstart, Constants.PSTART, pos, markingValue);

		/* ---- transitions -------------- */

		mameOffsetX = 3;
		mameOffsetY = -3;
		int transPosX = posX + 84;

		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				mameOffsetX, mameOffsetY, transPosX, posY);

		Transition tstart = ptf.createTransition();
		netBuilder.writeTransition(page, tstart, Constants.TSTART,
				posTransition);

		// ARCS
		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);

		// Pre and post-conditions of the transitions are:
		ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

		// pstart -> tstart
		Arc ds = ptf.createArc();
		Node source = pstart;
		Node target = tstart;
		netBuilder.writeArc(page, ds, "pstart-tstart", source, target,
				posArray, 1);

		for (Object object : tasks) {
			Task task = (Task) object;
			// psti : starting of task
			pos.setPositionX(posX + 149);
			pos.setPositionY(pos.getPositionY() + 84);
			Place pst = ptf.createPlace();
			netBuilder.writePlace(page, pst, Constants.PST + task.getName(),
					pos, markingValue);

			// Pre and post-conditions of the transitions are:
			// tstart -> psti
			ds = ptf.createArc();
			source = tstart;
			target = pst;
			netBuilder.writeArc(page, ds, "tstart-pst-" + task.getName(),
					source, target, posArray, 1);

		}

	}

	@Override
	public void writeBlock(Page page, Task task, PlaceOffsetAndPosition pos) {

	}
}
