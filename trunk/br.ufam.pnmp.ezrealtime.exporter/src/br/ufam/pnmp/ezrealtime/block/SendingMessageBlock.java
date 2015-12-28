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
 * $Id: SendingMessageBlock.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
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

public class SendingMessageBlock extends Block {

	/*
	 * Place/Transition Net (PT Net) factory from PNML framework to create a PT
	 * net model elements (classes instances).
	 */
	private PtnetFactory ptf = null;

	public SendingMessageBlock() {
		super(BlockType.SENDING_MESSAGE);
		ptf = PtnetPackage.eINSTANCE.getPtnetFactory();
	}

	@Override
	public void writeBlock(Page page, Task task, PlaceOffsetAndPosition pos) {

		/*
		 * int mameOffsetX = 20; int mameOffsetY = 0; int mkgOffsetX = 20; int
		 * mkgOffsetY = 32; int posX = 78; int posY = 136;
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

		final int markingValue = 0;

		PTNetBuilder netBuilder = PTNetBuilder.getInstance();

		/* ---- places and marking ------- */
		// Psm = {pwgbij , pwsij , psbufij , prbufij}
		// pwgbij : waiting for bus granting;
		Place pwgb = ptf.createPlace();
		netBuilder.writePlace(page, pwgb, Constants.PWG + task.getName(), pos,
				markingValue);

		// pwsij : waiting for sending a message;
		pos.setPositionX(posX + 125);
		Place pws = ptf.createPlace();
		netBuilder.writePlace(page, pws, Constants.PWS + task.getName(), pos,
				markingValue);

		// psbufij : sending buffer; and
		pos.setPositionX(posX + 271);
		Place psbuf = ptf.createPlace();
		netBuilder.writePlace(page, psbuf, Constants.PSBUF + task.getName(),
				pos, markingValue);

		// prbufij : receiving buffer.
		pos.setPositionX(posX + 399);
		Place prbuf = ptf.createPlace();
		netBuilder.writePlace(page, prbuf, Constants.PRBUF + task.getName(),
				pos, markingValue);

		// pbus : bus
		pos.setPositionX(posX + 194);
		pos.setPositionY(posY - 85);
		Place pbus = ptf.createPlace();
		netBuilder.writePlace(page, pbus, Constants.PBUS + task.getName(), pos,
				markingValue);

		/* ---- transitions -------------- */

		mameOffsetX = 3;
		mameOffsetY = -3;
		posX = 140;

		TransitionOffsetAndPosition posTransition = new TransitionOffsetAndPosition(
				mameOffsetX, mameOffsetY, posX, posY);

		// Tsm = {tgbij , tsendi,j , tcommij}
		// tgbij : bus granting;
		Transition tgb = ptf.createTransition();
		netBuilder.writeTransition(page, tgb, Constants.TGB + task.getName(),
				posTransition);

		// tsendi,j : sending the message; and
		posTransition.setPositionX(posX + 136);
		Transition tsend = ptf.createTransition();
		netBuilder.writeTransition(page, tsend, Constants.TSEND
				+ task.getName(), posTransition);

		// tcommi,j : communication.
		posTransition.setPositionX(posX + 271);
		Transition tcomm = ptf.createTransition();
		netBuilder.writeTransition(page, tcomm, Constants.TCOMM
				+ task.getName(), posTransition);

		// ARCS
		/*
		 * In the following section we will create arcs. Each arc must have a
		 * source and target node. Arcs may have several intermediary positions.
		 */
		ArcPosition arcPos1 = new ArcPosition(8, 9);
		ArcPosition arcPos2 = new ArcPosition(18, 6);

		// Pre and post-conditions of the transitions are:
		// �tgbij = {pwgbij}; tgbij� = {pwsij};
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pwgb;
			Node target = tgb;
			netBuilder.writeArc(page, ds, "pwgb-tgb-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = tgb;
			target = pws;
			netBuilder.writeArc(page, ds, "tgb-pws-" + task.getName(), source,
					target, posArray, 1);
		}
		// Pre and post-conditions of the transitions are:
		// �tsendi,j = {pwsij}; tsendi,j� = {psbufij}.
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = pws;
			Node target = tsend;
			netBuilder.writeArc(page, ds, "pws-tsend-" + task.getName(),
					source, target, posArray, 1);

			ds = ptf.createArc();
			source = pbus;
			target = tgb;
			netBuilder.writeArc(page, ds, "pbus-tgb-" + task.getName(), source,
					target, posArray, 1);

			ds = ptf.createArc();
			source = tsend;
			target = psbuf;
			netBuilder.writeArc(page, ds, "tsend-psbuf-" + task.getName(),
					source, target, posArray, 1);

		}
		// Pre and post-conditions of the transitions are:
		// �tcommi,j = {psbufij}; tcommi,j� = {prbufij}.
		{
			ArcPosition[] posArray = new ArcPosition[] { arcPos1, arcPos2 };

			Arc ds = ptf.createArc();
			Node source = psbuf;
			Node target = tcomm;
			netBuilder.writeArc(page, ds, "psbuf-tcomm-" + task.getName(),
					source, target, posArray, 1);

			ds = ptf.createArc();
			source = tcomm;
			target = pbus;
			netBuilder.writeArc(page, ds, "tcomm-pbus-" + task.getName(),
					source, target, posArray, 1);

			ds = ptf.createArc();
			source = tcomm;
			target = prbuf;
			netBuilder.writeArc(page, ds, "tcomm-prbuf-" + task.getName(),
					source, target, posArray, 1);

		}

	}

}// class
