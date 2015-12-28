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
 * $Id: BlockFactory.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.block;

public class BlockFactory {

	public static Block getBuildingBlock(BlockType blockType) {

		switch (blockType) {
		case TASK_ARRIVAL:
			return new PeriodicTaskArrivalBlock();
		case TASK_STRUCTURE:
			return new PreemptiveTaskStructureBlock();
		case DEADLINE_CHECKING:
			return new DeadlineCheckingBlock();
		case SENDING_MESSAGE:
			return new SendingMessageBlock();
		case RESOURCES:
			return new ResourceBlock();
		case FORK:
			return new ForkBlock();
		case JOIN:
			return new JoinBlock();
		case INITIAL_STATE:
			return new InitialStateBlock();
		case END_STATE:
			return new EndStateBlock();
		default:
			throw new RuntimeException("Bad block creation: " + blockType);
		}

	}

}// class
