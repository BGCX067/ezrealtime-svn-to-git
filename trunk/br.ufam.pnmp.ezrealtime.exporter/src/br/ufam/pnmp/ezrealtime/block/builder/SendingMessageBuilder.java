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
 * $Id: SendingMessageBuilder.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.block.builder;

import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.BlockFactory;
import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.block.SendingMessageBlock;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import fr.lip6.move.pnml.ptnet.Page;

public class SendingMessageBuilder extends BlockBuilder {

	private SendingMessageBlock sendingMessageBlock;

	public void buildBase() {
		System.out.println("Building Inter-processor Sending Message block");
		sendingMessageBlock = (SendingMessageBlock) BlockFactory
				.getBuildingBlock(BlockType.SENDING_MESSAGE);
	}

	public void addTaskItem(Page page, Task task, PlaceOffsetAndPosition pos) {

		sendingMessageBlock.writeBlock(page, task, pos);

	}

}
