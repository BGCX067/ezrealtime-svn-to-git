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
 * $Id: PeriodicTaskArrivalBuilder.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */
package br.ufam.pnmp.ezrealtime.block.builder;

import br.ufam.pnmp.ezrealtime.Task;
import br.ufam.pnmp.ezrealtime.block.BlockFactory;
import br.ufam.pnmp.ezrealtime.block.BlockType;
import br.ufam.pnmp.ezrealtime.block.PeriodicTaskArrivalBlock;
import br.ufam.pnmp.ezrealtime.model.PlaceOffsetAndPosition;
import fr.lip6.move.pnml.ptnet.Page;

public class PeriodicTaskArrivalBuilder extends BlockBuilder {

	private PeriodicTaskArrivalBlock arrivalBlock;

	public void buildBase() {
		System.out.println("Building Periodic Task Arrival block");
		arrivalBlock = (PeriodicTaskArrivalBlock) BlockFactory
				.getBuildingBlock(BlockType.TASK_ARRIVAL);
	}

	public void addTaskItem(Page page, Task task, PlaceOffsetAndPosition pos) {

		// pegando os valores de todos os periodos...
		// int valoresPeriodos[] = new int[tasks.size()];
		//
		// for (int i = 0; i < tasks.size(); i++) {
		// valoresPeriodos[i] = ((Task) tasks.get(i)).getPeriod();
		// }
		//
		// // Ordena o valor dos periodos em ordem crescente:
		// Arrays.sort(valoresPeriodos);
		//
		// System.out.println(valoresPeriodos.length - 1);
		//
		// // Acha a lista de numeros primos <= que o maior dos periodos:
		// int crivo[] = Util
		// .crivoErastotenes(valoresPeriodos[valoresPeriodos.length - 1]);
		// int mmc = Util.calculaMMC(valoresPeriodos, crivo);

		arrivalBlock.writeBlock(page, task, pos);

	}

}
