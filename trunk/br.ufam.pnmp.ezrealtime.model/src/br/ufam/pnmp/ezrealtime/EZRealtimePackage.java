/*
 * Copyright (c) 2007 Fabiano Cruz - UFAM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufam.pnmp.ezrealtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufam.pnmp.ezrealtime.EZRealtimeFactory
 * @model kind="package"
 * @generated
 */
public interface EZRealtimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezrealtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pnmp.sf.net/EZRealtime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EZRealtimePackage eINSTANCE = br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl
			.init();

	/**
	 * The meta object id for the '{@link br.ufam.pnmp.ezrealtime.impl.EZRealtimeSpecImpl <em>Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimeSpecImpl
	 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getEZRealtimeSpec()
	 * @generated
	 */
	int EZ_REALTIME_SPEC = 0;

	/**
	 * The feature id for the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_REALTIME_SPEC__TASK = 0;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_REALTIME_SPEC__PROCESSOR = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_REALTIME_SPEC__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EZ_REALTIME_SPEC_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.pnmp.ezrealtime.impl.TaskImpl
	 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The feature id for the '<em><b>Precedes Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRECEDES_TASKS = 0;

	/**
	 * The feature id for the '<em><b>Precedes Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PRECEDES_MESSAGES = 1;

	/**
	 * The feature id for the '<em><b>Excludes Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__EXCLUDES_TASKS = 2;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PROCESSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 4;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PERIOD = 5;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PHASE = 6;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__POWER = 7;

	/**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RELEASE = 8;

	/**
	 * The feature id for the '<em><b>Scheduling Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__SCHEDULING_MODE = 9;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__COMPUTING = 10;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEADLINE = 11;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OID = 12;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link br.ufam.pnmp.ezrealtime.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.pnmp.ezrealtime.impl.MessageImpl
	 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Precedes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PRECEDES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BUS = 2;

	/**
	 * The feature id for the '<em><b>Grant Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__GRANT_BUS = 3;

	/**
	 * The feature id for the '<em><b>Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__COMMUNICATION = 4;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OID = 5;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link br.ufam.pnmp.ezrealtime.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.pnmp.ezrealtime.impl.ProcessorImpl
	 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 3;

	/**
	 * The feature id for the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__OID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 1;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.ufam.pnmp.ezrealtime.impl.SourceCodeImpl <em>Source Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.pnmp.ezrealtime.impl.SourceCodeImpl
	 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getSourceCode()
	 * @generated
	 */
	int SOURCE_CODE = 4;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Source Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_CODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.ufam.pnmp.ezrealtime.SchedulingType <em>Scheduling Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.pnmp.ezrealtime.SchedulingType
	 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getSchedulingType()
	 * @generated
	 */
	int SCHEDULING_TYPE = 5;

	/**
	 * The meta object id for the '<em>Scheduling Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.pnmp.ezrealtime.SchedulingType
	 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getSchedulingTypeObject()
	 * @generated
	 */
	int SCHEDULING_TYPE_OBJECT = 6;

	/**
	 * Returns the meta object for class '{@link br.ufam.pnmp.ezrealtime.EZRealtimeSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spec</em>'.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimeSpec
	 * @generated
	 */
	EClass getEZRealtimeSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getTask <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Task</em>'.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getTask()
	 * @see #getEZRealtimeSpec()
	 * @generated
	 */
	EReference getEZRealtimeSpec_Task();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processor</em>'.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getProcessor()
	 * @see #getEZRealtimeSpec()
	 * @generated
	 */
	EReference getEZRealtimeSpec_Processor();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getMessage()
	 * @see #getEZRealtimeSpec()
	 * @generated
	 */
	EReference getEZRealtimeSpec_Message();

	/**
	 * Returns the meta object for class '{@link br.ufam.pnmp.ezrealtime.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the reference list '{@link br.ufam.pnmp.ezrealtime.Task#getPrecedesTasks <em>Precedes Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precedes Tasks</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getPrecedesTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PrecedesTasks();

	/**
	 * Returns the meta object for the reference list '{@link br.ufam.pnmp.ezrealtime.Task#getPrecedesMessages <em>Precedes Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Precedes Messages</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getPrecedesMessages()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_PrecedesMessages();

	/**
	 * Returns the meta object for the reference list '{@link br.ufam.pnmp.ezrealtime.Task#getExcludesTasks <em>Excludes Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Excludes Tasks</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getExcludesTasks()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ExcludesTasks();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.pnmp.ezrealtime.Task#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Processor</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getProcessor()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Processor();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getPeriod()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Period();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getPhase()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Phase();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getPower()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Power();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getRelease()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Release();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getSchedulingMode <em>Scheduling Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Mode</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getSchedulingMode()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_SchedulingMode();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getComputing <em>Computing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computing</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getComputing()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Computing();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getDeadline()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Deadline();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Task#getOid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oid</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Task#getOid()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Oid();

	/**
	 * Returns the meta object for class '{@link br.ufam.pnmp.ezrealtime.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.pnmp.ezrealtime.Message#getPrecedes <em>Precedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precedes</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Message#getPrecedes()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Precedes();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Message#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Message#getBus()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Bus();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Message#getGrantBus <em>Grant Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grant Bus</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Message#getGrantBus()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_GrantBus();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Message#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Message#getCommunication()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Communication();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Message#getOid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oid</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Message#getOid()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Oid();

	/**
	 * Returns the meta object for class '{@link br.ufam.pnmp.ezrealtime.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Processor#getOid <em>Oid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oid</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Processor#getOid()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Oid();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufam.pnmp.ezrealtime.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for class '{@link br.ufam.pnmp.ezrealtime.SourceCode <em>Source Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Code</em>'.
	 * @see br.ufam.pnmp.ezrealtime.SourceCode
	 * @generated
	 */
	EClass getSourceCode();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.pnmp.ezrealtime.SourceCode#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see br.ufam.pnmp.ezrealtime.SourceCode#getContent()
	 * @see #getSourceCode()
	 * @generated
	 */
	EAttribute getSourceCode_Content();

	/**
	 * Returns the meta object for enum '{@link br.ufam.pnmp.ezrealtime.SchedulingType <em>Scheduling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Type</em>'.
	 * @see br.ufam.pnmp.ezrealtime.SchedulingType
	 * @generated
	 */
	EEnum getSchedulingType();

	/**
	 * Returns the meta object for data type '{@link br.ufam.pnmp.ezrealtime.SchedulingType <em>Scheduling Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scheduling Type Object</em>'.
	 * @see br.ufam.pnmp.ezrealtime.SchedulingType
	 * @model instanceClass="br.ufam.pnmp.ezrealtime.SchedulingType"
	 *        extendedMetaData="name='SchedulingType:Object' baseType='SchedulingType'"
	 * @generated
	 */
	EDataType getSchedulingTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EZRealtimeFactory getEZRealtimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.ufam.pnmp.ezrealtime.impl.EZRealtimeSpecImpl <em>Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimeSpecImpl
		 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getEZRealtimeSpec()
		 * @generated
		 */
		EClass EZ_REALTIME_SPEC = eINSTANCE.getEZRealtimeSpec();

		/**
		 * The meta object literal for the '<em><b>Task</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_REALTIME_SPEC__TASK = eINSTANCE.getEZRealtimeSpec_Task();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_REALTIME_SPEC__PROCESSOR = eINSTANCE
				.getEZRealtimeSpec_Processor();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EZ_REALTIME_SPEC__MESSAGE = eINSTANCE
				.getEZRealtimeSpec_Message();

		/**
		 * The meta object literal for the '{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.pnmp.ezrealtime.impl.TaskImpl
		 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Precedes Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PRECEDES_TASKS = eINSTANCE.getTask_PrecedesTasks();

		/**
		 * The meta object literal for the '<em><b>Precedes Messages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PRECEDES_MESSAGES = eINSTANCE
				.getTask_PrecedesMessages();

		/**
		 * The meta object literal for the '<em><b>Excludes Tasks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__EXCLUDES_TASKS = eINSTANCE.getTask_ExcludesTasks();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PROCESSOR = eINSTANCE.getTask_Processor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PERIOD = eINSTANCE.getTask_Period();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__PHASE = eINSTANCE.getTask_Phase();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__POWER = eINSTANCE.getTask_Power();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__RELEASE = eINSTANCE.getTask_Release();

		/**
		 * The meta object literal for the '<em><b>Scheduling Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__SCHEDULING_MODE = eINSTANCE.getTask_SchedulingMode();

		/**
		 * The meta object literal for the '<em><b>Computing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__COMPUTING = eINSTANCE.getTask_Computing();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__DEADLINE = eINSTANCE.getTask_Deadline();

		/**
		 * The meta object literal for the '<em><b>Oid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__OID = eINSTANCE.getTask_Oid();

		/**
		 * The meta object literal for the '{@link br.ufam.pnmp.ezrealtime.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.pnmp.ezrealtime.impl.MessageImpl
		 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Precedes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PRECEDES = eINSTANCE.getMessage_Precedes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__BUS = eINSTANCE.getMessage_Bus();

		/**
		 * The meta object literal for the '<em><b>Grant Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__GRANT_BUS = eINSTANCE.getMessage_GrantBus();

		/**
		 * The meta object literal for the '<em><b>Communication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__COMMUNICATION = eINSTANCE
				.getMessage_Communication();

		/**
		 * The meta object literal for the '<em><b>Oid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__OID = eINSTANCE.getMessage_Oid();

		/**
		 * The meta object literal for the '{@link br.ufam.pnmp.ezrealtime.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.pnmp.ezrealtime.impl.ProcessorImpl
		 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Oid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__OID = eINSTANCE.getProcessor_Oid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

		/**
		 * The meta object literal for the '{@link br.ufam.pnmp.ezrealtime.impl.SourceCodeImpl <em>Source Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.pnmp.ezrealtime.impl.SourceCodeImpl
		 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getSourceCode()
		 * @generated
		 */
		EClass SOURCE_CODE = eINSTANCE.getSourceCode();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_CODE__CONTENT = eINSTANCE.getSourceCode_Content();

		/**
		 * The meta object literal for the '{@link br.ufam.pnmp.ezrealtime.SchedulingType <em>Scheduling Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.pnmp.ezrealtime.SchedulingType
		 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getSchedulingType()
		 * @generated
		 */
		EEnum SCHEDULING_TYPE = eINSTANCE.getSchedulingType();

		/**
		 * The meta object literal for the '<em>Scheduling Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.pnmp.ezrealtime.SchedulingType
		 * @see br.ufam.pnmp.ezrealtime.impl.EZRealtimePackageImpl#getSchedulingTypeObject()
		 * @generated
		 */
		EDataType SCHEDULING_TYPE_OBJECT = eINSTANCE.getSchedulingTypeObject();

	}

} //EZRealtimePackage
