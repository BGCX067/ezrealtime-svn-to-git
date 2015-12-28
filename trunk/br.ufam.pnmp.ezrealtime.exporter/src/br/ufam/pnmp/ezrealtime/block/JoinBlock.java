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
 * $Id: JoinBlock.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
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

public class JoinBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	public JoinBlock() {
		super(BlockType.JOIN);
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
	}

	static int blockCreationCount = 0;

	/**
	 * This block consists of the creation of n concurrent process starting from
	 * a single parent process.
	 */
	@Override
	public void writeBlock(Page page, Task task, PlaceOffsetAndPosition pos)
			throws Exception {

	}

	@Override
	public void writeBlock(Page page, EList<?> tasks, PlaceOffsetAndPosition pos)
			throws Exception {

		int markingValue = 0;

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
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);

		PTNetBuilder netBuilder = PTNetBuilder.getInstance();

		/* ---- places and marking ------- */
		// Pj = {pf1 , ..., pfi , ..., pfn, pend}
		// pend: end of the system.
		pos.setPositionY(posY);
		Place pend = ptf.createPlace();
		netBuilder.writePlace(page, pend, Constants.PEND, pos, markingValue);

		/* ---- transitions -------------- */
		mameOffsetX = 20;
		mameOffsetY = 20;
		int transPositionX = posX - 72;
		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				mameOffsetX, mameOffsetY, transPositionX, posY);

		// Tj = {tend}
		// tend: end of tasks in the system.
		Transition tend = ptf.createTransition();
		netBuilder.writeTransition(page, tend, Constants.TEND, posTransition);

		// ARCS
		// Pre and post-conditions of the transition are:
		// tend* = {pend}
		ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

		Arc ds = ptf.createArc();
		Node source = tend;
		Node target = pend;
		netBuilder.writeArc(page, ds, "tend-pend", source, target, posArray, 1);

		for (Object object : tasks) {
			Task task = (Task) object;
			// psti : starting of task
			pos.setPositionX(posX - 133);
			pos.setPositionY(posY - 105);
			Place pf = ptf.createPlace();
			netBuilder.writePlace(page, pf, Constants.PF + task.getName(), pos,
					markingValue);

			// TODO Include weight information pf -> tend for all tasks

			// pf -> tend
			ds = ptf.createArc();
			source = pf;
			target = tend;
			netBuilder.writeArc(page, ds, "pf-tend-" + task.getName(), source,
					target, posArray, 1);
		}

	}
}
