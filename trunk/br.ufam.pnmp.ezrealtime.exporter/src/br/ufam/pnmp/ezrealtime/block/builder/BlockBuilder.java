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
 * $Id: BlockBuilder.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */

package br.ufam.pnmp.ezrealtime.block.builder;

import org.eclipse.emf.common.util.EList;

import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import fr.lip6.move.pnml.ptnet.Page;

abstract class BlockBuilder {

	public abstract void buildBase();

	public abstract void addTaskItem(Page page, Task task,
			PlaceOffsetAndPosition pos) throws Exception;

	public void addTaskItens(Page page, EList<?> tasks,
			PlaceOffsetAndPosition pos) {
	}

}// class
