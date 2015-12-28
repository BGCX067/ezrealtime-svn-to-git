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
 * $Id: ResourceBuilder.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.block.builder;

import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.BlockFactory;
import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.block.ResourceBlock;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import br.ufam.pnmp.ezrealtime.model.ResourceType;
import fr.lip6.move.pnml.ptnet.Page;

public class ResourceBuilder extends BlockBuilder {

	private ResourceBlock resourceBlock;
	private ResourceType resType;

	public ResourceBuilder(ResourceType resType) {
		this.resType = resType;
	}

	public void buildBase() {
		System.out.println("Building Resource block");
		resourceBlock = (ResourceBlock) BlockFactory
				.getBuildingBlock(BlockType.RESOURCES);
		resourceBlock.setResType(resType);
	}

	public void addTaskItem(Page page, Task task, PlaceOffsetAndPosition pos) {

		// resourceBlock.writeBlock(page, null, pos);

	}

}
