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
 * $Id: PeriodicTaskArrivalBlock.java,v 1.3 2008/01/20 15:48:44 fabianocruz Exp $
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

public class PeriodicTaskArrivalBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	public PeriodicTaskArrivalBlock() {
		super(BlockType.TASK_ARRIVAL);
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
	}

	@Override
	/**
	 * Building Block Arrival
	 */
	public void writeBlock(Page page, Task task, PlaceOffsetAndPosition pos) {

		//int mameOffsetX = pos.getNameOffsetX();
		//int mameOffsetY = pos.getNameOffsetY();
		//int mkgOffsetX = pos.getMarkingOffsetX();
		//int mkgOffsetY = pos.getMarkingOffsetY();
		int posX = pos.getPositionX();
		int posY = pos.getPositionY();

		final int markingValue = 0;

		PTNetBuilder netBuilder = PTNetBuilder.getInstance();

		// The building block periodic task arrival is a TPN Na = (Pa, Ta,
		// Fa,Wa, M0a, Ia), such that:

		/* ---- places and marking ------- */
		// Pa = {psti , pwai , pwdi , pwri}
		// psti : starting of task
		Place pst = ptf.createPlace();
		netBuilder.writePlace(page, pst, Constants.PST + task.getName(), pos,
				markingValue);

		// pwai : waiting for the arrival of another task instance
		pos.setPositionY(posY - 177);
		Place pwa = ptf.createPlace();
		netBuilder.writePlace(page, pwa, Constants.PWA + task.getName(), pos,
				markingValue);

		// pwdi : waiting for deadline missing
		pos.setPositionX(posX + 150);
		pos.setPositionY(posY);
		Place pwd = ptf.createPlace();
		netBuilder.writePlace(page, pwd, Constants.PWD + task.getName(), pos,
				markingValue);

		// pwri : waiting for release time
		pos.setPositionY(posY - 177);
		Place pwr = ptf.createPlace();
		netBuilder.writePlace(page, pwr, Constants.PWR + task.getName(), pos,
				markingValue);

		// final int numTimes = mmc / task.getPeriod();

		int transNameOffsetX = 3;
		int transNameOffsetY = -3;
		int transRelativePosX = posX + 77;
		int transRelativePosY = posY - 177;

		/* ---- transitions -------------- */
		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				transNameOffsetX, transNameOffsetY, transRelativePosX,
				transRelativePosY);

		EZRealtimeToolInfo toolInfo = new EZRealtimeToolInfo();
		toolInfo.setVersion("2.0.0");
		toolInfo.setTool("scheduler");

		toolInfo.setFromTime(Integer.toString(task.getPeriod()));
		toolInfo.setToTime(Integer.toString(task.getPeriod()));

		// Ta = {tai , tphi}
		Transition ta = ptf.createTransition();
		netBuilder.writeTransition(page, ta, Constants.TA + task.getName(),
				posTransition, toolInfo);

		posTransition.setPositionY(posY);
		Transition tph = ptf.createTransition();

		toolInfo = new EZRealtimeToolInfo();
		toolInfo.setVersion("2.0.0");
		toolInfo.setTool("scheduler");

		toolInfo.setFromTime(Integer.toString(task.getPhase()));
		toolInfo.setToTime(Integer.toString(task.getPhase()));

		netBuilder.writeTransition(page, tph, Constants.TPH + task.getName(),
				posTransition, toolInfo);

		// ARCS
		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);
		// pst -> tph
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pst;
			Node target = tph;
			netBuilder.writeArc(page, ds, "pst-tph-" + task.getName(), source,
					target, posArray, 1);
		}
		// pwa -> ta
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwa;
			Node target = ta;
			netBuilder.writeArc(page, ds, "pwa-ta-" + task.getName(), source,
					target, posArray, 1);
		}
		// tph -> pwa
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			// TODO Include weight information tph -> pwa
			Arc ds = ptf.createArc();
			Node source = tph;
			Node target = pwa;
			netBuilder.writeArc(page, ds, "tph-pwa-" + task.getName(), source,
					target, posArray, 1);
		}
		// ta -> pwr
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = ta;
			Node target = pwr;
			netBuilder.writeArc(page, ds, "ta-pwr-" + task.getName(), source,
					target, posArray, 1);
		}
		// ta -> pwd
		{
			ArcPosition[] posArray = new ArcPosition[] { new ArcPosition(8, 9),
					new ArcPosition(18, 6) };

			Arc ds = ptf.createArc();
			Node source = ta;
			Node target = pwd;
			netBuilder.writeArc(page, ds, "ta-pwd-" + task.getName(), source,
					target, posArray, 1);
		}

		// tph -> pwr
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = tph;
			Node target = pwr;
			netBuilder.writeArc(page, ds, "tph-pwr-" + task.getName(), source,
					target, posArray, 1);
		}
		// tph -> pwd
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = tph;
			Node target = pwd;
			netBuilder.writeArc(page, ds, "tph-pwd-" + task.getName(), source,
					target, posArray, 1);
		}

	}

}// class
