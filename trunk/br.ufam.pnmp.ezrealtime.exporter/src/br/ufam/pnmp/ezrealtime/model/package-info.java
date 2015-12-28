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
 * $Id: package-info.java,v 1.2 2008/01/20 15:48:44 fabianocruz Exp $
 */

/**
 * 
 * The specification model construction consists of the following steps:
 * <ul>
 * <li>
 * defining the timing constraints of a set of cooperating sequential tasks;
 * </li>
 * <li>
 * identifying all critical sections, that is, code of sections that access shared resources, as well as any code sections of tasks that must be executed before some sections of other tasks;
 * </li>
 * <li>
 * dividing each task into subtasks such that appropriate exclusion and/or precedence relations can be defined in pairs of subtasks;
 * </li>
 * <li>
 * calculating the release time and deadline of each subtasks defined in previous item;
 * </li>
 * <li>
 * defining appropriate inter-tasks relations, such as exclusion and precedence relations;
 * </li>
 * <li>
 * translating each sporadic task into an equivalent periodic one;
 * </li>
 * <li>
 * choosing the scheduling method (preemptive or non-preemptive) for each task-subtask;
 * </li>
 * <li>
 * performing the allocation of tasks to processors;
 * </li>
 * <li>
 * providing the source code of each task/subtask;
 * </li>
 * <li>
 * analyzing the source code to obtain the communication pattern, whether adopted a multi-processor architecture.
 * </li>
 * </ul>
 * 
 * @author Fabiano Cruz
 */
package br.ufam.pnmp.ezrealtime.model;

