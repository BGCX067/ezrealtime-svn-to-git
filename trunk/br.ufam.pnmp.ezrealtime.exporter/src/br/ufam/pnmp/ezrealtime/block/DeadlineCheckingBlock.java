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
 * $Id: DeadlineCheckingBlock.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.block;

import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.model.ArcPosition;
import br.ufam.pnmp.ezrealtime.model.EZRealtimeToolInfo;
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

public class DeadlineCheckingBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	public DeadlineCheckingBlock() {
		super(BlockType.DEADLINE_CHECKING);
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
	}

	@Override
	public void writeBlock(Page page, Task task, PlaceOffsetAndPosition pos) {

		int mameOffsetX = pos.getNameOffsetX();
		int mameOffsetY = pos.getNameOffsetY();
		// int mkgOffsetX = pos.getMarkingOffsetX();
		// int mkgOffsetY = pos.getMarkingOffsetY();
		int posX = pos.getPositionX();
		int posY = pos.getPositionY();

		final int markingValue = 0;

		PTNetBuilder netBuilder = PTNetBuilder.getInstance();

		/* ---- places and marking ------- */
		// Pd = {pwdi , pwpci , pdmi , pwci}
		// pwdi : waiting for deadline missing;
		Place pwd = ptf.createPlace();
		netBuilder.writePlace(page, pwd, Constants.PWD + task.getName(), pos,
				markingValue);

		// pwpci : waiting for computation removing;
		pos.setPositionX(posX + 149);
		Place pwpc = ptf.createPlace();
		netBuilder.writePlace(page, pwpc, Constants.PWPC + task.getName(), pos,
				markingValue);

		// pdmi : deadline missed; and
		pos.setPositionX(posX + 308);
		Place pdm = ptf.createPlace();
		netBuilder.writePlace(page, pdm, Constants.PDM + task.getName(), pos,
				markingValue);

		// pwci : waiting for task computation.
		pos.setPositionX(posX + 227);
		pos.setPositionY(posY - 83);
		Place pwc = ptf.createPlace();
		netBuilder.writePlace(page, pwc, Constants.PWC + task.getName(), pos,
				markingValue);

		/* ---- transitions -------------- */
		mameOffsetX = 3;
		mameOffsetY = -3;
		int transPosX = posX + 76;

		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				mameOffsetX, mameOffsetY, transPosX, posY);

		EZRealtimeToolInfo toolInfo = new EZRealtimeToolInfo();
		toolInfo.setVersion("2.0.0");
		toolInfo.setTool("scheduler");

		toolInfo.setFromTime(Integer.toString(task.getDeadline()));
		toolInfo.setToTime(Integer.toString(task.getDeadline()));

		// Td = {tdi , trci}
		// tdi : deadline missing;
		Transition td = ptf.createTransition();
		netBuilder.writeTransition(page, td, Constants.TD + task.getName(),
				posTransition, toolInfo);

		// tpci : computation removing.
		Transition tpc = ptf.createTransition();
		posTransition.setPositionX(transPosX + 150);
		netBuilder.writeTransition(page, tpc, Constants.TPC + task.getName(),
				posTransition);

		// ARCS
		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);

		// Pre and post-conditions of the transitions are:
		// �tdi = {pwdi}; tdi� = {pwrci};
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwd;
			Node target = td;
			netBuilder.writeArc(page, ds, "pwd-td-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = td;
			target = pwpc;
			netBuilder.writeArc(page, ds, "td-pwpc-" + task.getName(), source,
					target, posArray, 1);
		}
		// Pre and post-conditions of the transitions are:
		// �trci = {pwrci , pwci}; trci� = {pdmi}.
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwpc;
			Node target = tpc;
			netBuilder.writeArc(page, ds, "pwpc-tpc-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = tpc;
			target = pdm;
			netBuilder.writeArc(page, ds, "tpc-pdm-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = pwc;
			target = tpc;
			netBuilder.writeArc(page, ds, "pwc-tpc-" + task.getName(), source,
					target, posArray, 1);

		}
	}

}// class
