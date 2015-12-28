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
 * $Id: DispatcherOverheadBlock.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
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

public class DispatcherOverheadBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	public DispatcherOverheadBlock() {
		super(BlockType.DISPACHER_OVERHEAD);
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
		// Po = {pwri , pwgi , pwci , pprockT1 , . . . , pprockTnk, pwfi , pfi ,
		// pwdi , pprock}.
		// pwri : waiting for release time;
		Place pwr = ptf.createPlace();
		netBuilder.writePlace(page, pwr, Constants.PWR + task.getName(), pos,
				markingValue);

		// pwgi : waiting for processor granting;
		pos.setPositionX(posX + 154);
		Place pwg = ptf.createPlace();
		netBuilder.writePlace(page, pwg, Constants.PWG + task.getName(), pos,
				markingValue);

		// pwci : waiting for task computation;
		pos.setPositionX(posX + 311);
		pos.setPositionY(posY + 53);
		Place pwc = ptf.createPlace();
		netBuilder.writePlace(page, pwc, Constants.PWC + task.getName(), pos,
				markingValue);

		// pwfi : waiting for task instance end;
		pos.setPositionX(posX + 470);
		pos.setPositionY(posY - 4);
		Place pwf = ptf.createPlace();
		netBuilder.writePlace(page, pwf, Constants.PWF + task.getName(), pos,
				markingValue);

		// pfi : end of a task instance;
		pos.setPositionX(posX + 629);
		Place pf = ptf.createPlace();
		netBuilder.writePlace(page, pf, Constants.PF + task.getName(), pos,
				markingValue);

		// pprock : processor prock.
		pos.setPositionX(posX + 311);
		pos.setPositionY(posY + 156);
		Place pproc = ptf.createPlace();
		netBuilder.writePlace(page, pproc, Constants.PPROC + task.getName(),
				pos, markingValue);

		// pwdi : waiting for deadline missing.
		pos.setPositionX(posX);
		pos.setPositionY(posY - 177);
		Place pwd = ptf.createPlace();
		netBuilder.writePlace(page, pwd, Constants.PWD + task.getName(), pos,
				markingValue);

		// pprockTi : states that task ti was the last to be allocated to the
		// processor
		pos.setPositionX(posX + 316);
		pos.setPositionY(posY - 38);
		Place pprocStates = ptf.createPlace();
		netBuilder.writePlace(page, pprocStates, Constants.PPROC_STATES
				+ task.getName(), pos, markingValue);

		// prock, for 1 = i = nk;

		/* ---- transitions -------------- */
		mameOffsetX = 3;
		mameOffsetY = -3;
		int transPosX = posX + 76;
		int transPosY = posY;

		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				mameOffsetX, mameOffsetY, transPosX, transPosY);

		// To = {tri , tgwi , tgwoi , tci1 , . . . , tcink , tfpi , tfi}
		// tri : task releasing;
		Transition tr = ptf.createTransition();
		netBuilder.writeTransition(page, tr, Constants.TR + task.getName(),
				posTransition);

		// tgwoi : processor granting without dispatcher overhead (highest
		// priority);
		Transition tgwo = ptf.createTransition();
		posTransition.setPositionX(transPosX + 153);
		netBuilder.writeTransition(page, tgwo, Constants.TWGO + task.getName(),
				posTransition);

		// tcij : executes one task unit, removes the marking in place pprockTj
		// (1 <= j <= nk, j != i), releases the processor, and marks place
		// pprockTi (highest priority);

		// tcii : executes one task unit, releases the processor, and marks
		// place pprockTi
		// (lowest priority);

		// tfpi : concluding the task computation, and removes the marking
		// pprockTi
		// (higher priority than tfi)
		Transition tfp = ptf.createTransition();
		posTransition.setPositionX(transPosX + 473);
		posTransition.setPositionY(transPosY - 38);
		netBuilder.writeTransition(page, tfp, Constants.TFP + task.getName(),
				posTransition);

		// tgwi : processor granting with dispatcher overhead (lowest priority);
		Transition tgw = ptf.createTransition();
		posTransition.setPositionX(transPosX + 153);
		posTransition.setPositionY(transPosY + 53);
		netBuilder.writeTransition(page, tgw, Constants.TGW + task.getName(),
				posTransition);

		// tfi : concluding the task computation (lower priority than tfpi).
		Transition tf = ptf.createTransition();
		posTransition.setPositionX(transPosX + 471);
		posTransition.setPositionY(transPosY - 81);
		netBuilder.writeTransition(page, tf, Constants.TF + task.getName(),
				posTransition);

		// ARCS
		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);

		// Pre and post-conditions of the transitions are:
		// �tri = {pwri}; tri� = {pwgi};
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
		// Pre and post-conditions of the transitions are:
		// �tgwi = {pwgi , pprock}; tgwi� = {pwci};
		// �tgwoi = {pwgi , pprockTi , pprock}; tgwoi� = {pwci};

		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwg;
			Node target = tgwo;
			netBuilder.writeArc(page, ds, "pwg-tgwo-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = pwg;
			target = tgw;
			netBuilder.writeArc(page, ds, "pwg-tgw-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = pproc;
			target = tgw;
			netBuilder.writeArc(page, ds, "pproc-tgw-" + task.getName(),
					source, target, posArray, 1);

			ds = ptf.createArc();
			source = pproc;
			target = tgwo;
			netBuilder.writeArc(page, ds, "pproc-tgwo-" + task.getName(),
					source, target, posArray, 1);

			ds = ptf.createArc();
			source = pprocStates;
			target = tgwo;
			netBuilder.writeArc(page, ds,
					"pproc-states-tgwo-" + task.getName(), source, target,
					posArray, 1);

			ds = ptf.createArc();
			source = tgw;
			target = pwc;
			netBuilder.writeArc(page, ds, "tgw-pwc-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = tgwo;
			target = pwc;
			netBuilder.writeArc(page, ds, "tgwo-pwc-" + task.getName(), source,
					target, posArray, 1);

		}

		// �tcij = {pwci , pprockTj}; tcij� = {pprockTi , pwfi , pprock};
		// �tcii = {pwci}; tcii� = {pprockTi , pwfi , pprock};

		// �tfpi = {pwfi , pwdi , pprockTi}; tfpi� = {pfi}.
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwf;
			Node target = tfp;
			netBuilder.writeArc(page, ds, "pwf-tfp-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = pwd;
			target = tfp;
			netBuilder.writeArc(page, ds, "pwd-tfp-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = pprocStates;
			target = tfp;
			netBuilder.writeArc(page, ds, "pproc-states-tfp-" + task.getName(),
					source, target, posArray, 1);

			ds = ptf.createArc();
			source = tfp;
			target = pf;
			netBuilder.writeArc(page, ds, "tfp-pf-" + task.getName(), source,
					target, posArray, 1);

		}

		// �tfi = {pwfi , pwdi}; tfi� = {pfi}.
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwf;
			Node target = tf;
			netBuilder.writeArc(page, ds, "pwf-tf-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = pwd;
			target = tf;
			netBuilder.writeArc(page, ds, "pwd-tf-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = tf;
			target = pf;
			netBuilder.writeArc(page, ds, "tf-pf-" + task.getName(), source,
					target, posArray, 1);

		}

	}

}// class
