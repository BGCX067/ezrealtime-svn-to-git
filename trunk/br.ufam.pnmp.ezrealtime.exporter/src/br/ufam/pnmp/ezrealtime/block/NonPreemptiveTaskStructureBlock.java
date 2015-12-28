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
 * $Id: NonPreemptiveTaskStructureBlock.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
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

public class NonPreemptiveTaskStructureBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	public NonPreemptiveTaskStructureBlock() {
		super(BlockType.TASK_STRUCTURE);
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
		// Pp = {pwri , pwgi , pwci , pwfi , pfi , pdmi , pprock}
		// pwri : waiting for releasing;
		Place pwr = ptf.createPlace();
		netBuilder.writePlace(page, pwr, Constants.PWR + task.getName(), pos,
				markingValue);

		// pwgi : waiting for processor granting;
		pos.setPositionX(posX + 149);
		Place pwg = ptf.createPlace();
		netBuilder.writePlace(page, pwg, Constants.PWG + task.getName(), pos,
				markingValue);

		// pwci : waiting for task computation;
		pos.setPositionX(posX + 308);
		Place pwc = ptf.createPlace();
		netBuilder.writePlace(page, pwc, Constants.PWC + task.getName(), pos,
				markingValue);

		// pwfi : waiting for task instance end;
		pos.setPositionX(posX + 448);
		Place pwf = ptf.createPlace();
		netBuilder.writePlace(page, pwf, Constants.PWF + task.getName(), pos,
				markingValue);

		// pfi : end of a task instance;
		pos.setPositionX(posX + 581);
		Place pf = ptf.createPlace();
		netBuilder.writePlace(page, pf, Constants.PF + task.getName(), pos,
				markingValue);

		// pwdi : waiting for deadline missing.
		pos.setPositionX(posX + 514);
		pos.setPositionY(posY + 71);
		Place pwd = ptf.createPlace();
		netBuilder.writePlace(page, pwd, Constants.PWD + task.getName(), pos,
				markingValue);

		// pprock : processor.
		/*
		 * pos.setPositionX(posX + 371); pos.setPositionY(posY - 87); Place
		 * pproc = ptf.createPlace(); netBuilder.writePlace(page, pproc,
		 * Constants.PPROC + task.getName(), pos, markingValue);
		 */

		/* ---- transitions -------------- */

		mameOffsetX = 3;
		mameOffsetY = -3;
		int transPosX = posX + 78;

		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				mameOffsetX, mameOffsetY, transPosX, posY);

		// Tp = {tri , tgi , tci , tfi}

		EZRealtimeToolInfo toolInfo = new EZRealtimeToolInfo();
		toolInfo.setVersion("2.0.0");
		toolInfo.setTool("scheduler");

		toolInfo.setFromTime(Integer.toString(task.getRelease()));
		toolInfo.setToTime(Integer.toString(task.getDeadline()
				- task.getComputing()));

		// tri : task releasing;
		Transition tr = ptf.createTransition();
		netBuilder.writeTransition(page, tr, Constants.TR + task.getName(),
				posTransition, toolInfo);

		// tgi : processor granting;
		Transition tg = ptf.createTransition();
		posTransition.setPositionX(transPosX + 149);
		netBuilder.writeTransition(page, tg, Constants.TG + task.getName(),
				posTransition);

		toolInfo = new EZRealtimeToolInfo();
		toolInfo.setVersion("2.0.0");
		toolInfo.setTool("scheduler");

		toolInfo.setFromTime(Integer.toString(task.getComputing()));
		toolInfo.setToTime(Integer.toString(task.getComputing()));

		// tci : executing one task unit, and processor releasing; and
		posTransition.setPositionX(transPosX + 292);
		Transition tc = ptf.createTransition();
		netBuilder.writeTransition(page, tc, Constants.TC + task.getName(),
				posTransition, toolInfo);

		// tfi : concluding the task computation;
		posTransition.setPositionX(transPosX + 436);
		Transition tf = ptf.createTransition();
		netBuilder.writeTransition(page, tf, Constants.TF + task.getName(),
				posTransition);

		// ARCS
		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);
		/*
		 * Pre and post-conditions of the transitions are: �tr = {pwr}; tr� =
		 * {pwg};
		 */
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwr;
			Node target = tr;
			netBuilder.writeArc(page, ds, "pwr-tr-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = tr;
			target = pwg;
			netBuilder.writeArc(page, ds, "tr-pwg-" + task.getName(), source,
					target, posArray, 1);
		}
		/*
		 * Pre and post-conditions of the transitions are: �tg = {pwg,
		 * pprock}; tg� = {pwc};
		 */
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwg;
			Node target = tg;
			netBuilder.writeArc(page, ds, "pwg-tg-" + task.getName(), source,
					target, posArray, 1);

			/*
			 * ds = ptf.createArc(); source = pproc; target = tg;
			 * netBuilder.writeArc(page, ds, "pproc-tg-" + task.getName(),
			 * source, target, posArray, 1);
			 */

			ds = ptf.createArc();
			source = tg;
			target = pwc;
			netBuilder.writeArc(page, ds, "tg-pwc-" + task.getName(), source,
					target, posArray, 1);

		}
		/*
		 * Pre and post-conditions of the transitions are: �tc = {pwc}; tc� =
		 * {pwf, pprock};
		 */
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwc;
			Node target = tc;
			netBuilder.writeArc(page, ds, "pwc-tc-" + task.getName(), source,
					target, posArray, 1);

			/*
			 * ds = ptf.createArc(); source = tc; target = pproc;
			 * netBuilder.writeArc(page, ds, "tc-pproc-" + task.getName(),
			 * source, target, posArray, 1);
			 */

			ds = ptf.createArc();
			source = tc;
			target = pwf;
			netBuilder.writeArc(page, ds, "tc-pwf-" + task.getName(), source,
					target, posArray, 1);

		}

		/*
		 * Pre and post-conditions of the transitions are: �tf = {pwf, pwd};
		 * tf� = {pf}
		 */
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwf;
			Node target = tf;
			netBuilder.writeArc(page, ds, "pwf-tf-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = tf;
			target = pf;
			netBuilder.writeArc(page, ds, "tf-pf-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = pwd;
			target = tf;
			netBuilder.writeArc(page, ds, "pwd-tf-" + task.getName(), source,
					target, posArray, 1);

		}

	}

}// class
