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
 * $Id: BlockContext.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */

package br.ufam.pnmp.ezrealtime.block.builder;

import org.eclipse.emf.common.util.EList;

import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.Block;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import fr.lip6.move.pnml.ptnet.Page;

public class BlockContext {

	private BlockBuilder bb;

	public BlockContext(BlockBuilder bb) {
		this.bb = bb; // Strategy-ish
	}

	@Deprecated
	public Block produceBlock(Page page, EList input) throws Exception {
		if (!input.isEmpty()) {
			bb.buildBase();
			for (Object object : input) {
				Task task = (Task) object;
				bb.addTaskItem(page, task, null);
			}
		}
		return null; // bb.getFinishedMedia();
	}

	public Block produceBlock(Page page, Task task, PlaceOffsetAndPosition pos)
			throws Exception {
		if (task != null) {
			bb.buildBase();
			bb.addTaskItem(page, task, pos);
		}
		return null; // bb.getFinishedMedia();
	}

	public Block produceBlock(Page page, EList tasks, PlaceOffsetAndPosition pos)
			throws Exception {
		if (tasks != null && tasks.size() > 0) {
			bb.buildBase();
			bb.addTaskItens(page, tasks, pos);
		}
		return null; // bb.getFinishedMedia();
	}

}
