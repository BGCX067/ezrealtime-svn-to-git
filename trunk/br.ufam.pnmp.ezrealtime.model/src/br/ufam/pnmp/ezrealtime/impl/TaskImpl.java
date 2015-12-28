/*
 * Copyright (c) 2007 Fabiano Cruz - UFAM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufam.pnmp.ezrealtime.impl;

import br.ufam.pnmp.ezrealtime.EZRealtimePackage;
import br.ufam.pnmp.ezrealtime.Message;
import br.ufam.pnmp.ezrealtime.Processor;
import br.ufam.pnmp.ezrealtime.SchedulingType;
import br.ufam.pnmp.ezrealtime.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getPrecedesTasks <em>Precedes Tasks</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getPrecedesMessages <em>Precedes Messages</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getExcludesTasks <em>Excludes Tasks</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getPower <em>Power</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getSchedulingMode <em>Scheduling Mode</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getComputing <em>Computing</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.TaskImpl#getOid <em>Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The cached value of the '{@link #getPrecedesTasks() <em>Precedes Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedesTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> precedesTasks;

	/**
	 * The cached value of the '{@link #getPrecedesMessages() <em>Precedes Messages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedesMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> precedesMessages;

	/**
	 * The cached value of the '{@link #getExcludesTasks() <em>Excludes Tasks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludesTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> excludesTasks;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected Processor processor;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * This is true if the Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean periodESet;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected int phase = PHASE_EDEFAULT;

	/**
	 * This is true if the Phase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseESet;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected int power = POWER_EDEFAULT;

	/**
	 * This is true if the Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerESet;

	/**
	 * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected static final int RELEASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected int release = RELEASE_EDEFAULT;

	/**
	 * This is true if the Release attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean releaseESet;

	/**
	 * The default value of the '{@link #getSchedulingMode() <em>Scheduling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingMode()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingType SCHEDULING_MODE_EDEFAULT = SchedulingType.P;

	/**
	 * The cached value of the '{@link #getSchedulingMode() <em>Scheduling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingMode()
	 * @generated
	 * @ordered
	 */
	protected SchedulingType schedulingMode = SCHEDULING_MODE_EDEFAULT;

	/**
	 * This is true if the Scheduling Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schedulingModeESet;

	/**
	 * The default value of the '{@link #getComputing() <em>Computing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputing()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPUTING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getComputing() <em>Computing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputing()
	 * @generated
	 * @ordered
	 */
	protected int computing = COMPUTING_EDEFAULT;

	/**
	 * This is true if the Computing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean computingESet;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final int DEADLINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected int deadline = DEADLINE_EDEFAULT;

	/**
	 * This is true if the Deadline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadlineESet;

	/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final String OID_EDEFAULT = "ez123";

	/**
	 * The cached value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected String oid = OID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getPrecedesTasks() {
		if (precedesTasks == null) {
			precedesTasks = new EObjectWithInverseResolvingEList.ManyInverse<Task>(
					Task.class, this, EZRealtimePackage.TASK__PRECEDES_TASKS,
					EZRealtimePackage.TASK__EXCLUDES_TASKS);
		}
		return precedesTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPrecedesTasks(int index, Task value) {
		getPrecedesTasks().add(index, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removePrecedesTasks(Task value) {
		return getPrecedesTasks().remove(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getPrecedesMessages() {
		if (precedesMessages == null) {
			precedesMessages = new EObjectResolvingEList<Message>(
					Message.class, this,
					EZRealtimePackage.TASK__PRECEDES_MESSAGES);
		}
		return precedesMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addPrecedesMessages(int index, Message value) {
		getPrecedesMessages().add(index, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removePrecedesMessages(Message value) {
		return getPrecedesMessages().remove(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getExcludesTasks() {
		if (excludesTasks == null) {
			excludesTasks = new EObjectWithInverseResolvingEList.ManyInverse<Task>(
					Task.class, this, EZRealtimePackage.TASK__EXCLUDES_TASKS,
					EZRealtimePackage.TASK__PRECEDES_TASKS);
		}
		return excludesTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addExcludesTasks(int index, Task value) {
		getExcludesTasks().add(index, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeExcludesTasks(Task value) {
		return getExcludesTasks().remove(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Processor getProcessor() {
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessor(Processor newProcessor) {
		Processor oldProcessor = processor;
		processor = newProcessor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__PROCESSOR, oldProcessor, processor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		boolean oldPeriodESet = periodESet;
		periodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__PERIOD, oldPeriod, period,
					!oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeriod() {
		int oldPeriod = period;
		boolean oldPeriodESet = periodESet;
		period = PERIOD_EDEFAULT;
		periodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.TASK__PERIOD, oldPeriod, PERIOD_EDEFAULT,
					oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeriod() {
		return periodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(int newPhase) {
		int oldPhase = phase;
		phase = newPhase;
		boolean oldPhaseESet = phaseESet;
		phaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__PHASE, oldPhase, phase,
					!oldPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhase() {
		int oldPhase = phase;
		boolean oldPhaseESet = phaseESet;
		phase = PHASE_EDEFAULT;
		phaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.TASK__PHASE, oldPhase, PHASE_EDEFAULT,
					oldPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhase() {
		return phaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(int newPower) {
		int oldPower = power;
		power = newPower;
		boolean oldPowerESet = powerESet;
		powerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__POWER, oldPower, power,
					!oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPower() {
		int oldPower = power;
		boolean oldPowerESet = powerESet;
		power = POWER_EDEFAULT;
		powerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.TASK__POWER, oldPower, POWER_EDEFAULT,
					oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPower() {
		return powerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelease() {
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(int newRelease) {
		int oldRelease = release;
		release = newRelease;
		boolean oldReleaseESet = releaseESet;
		releaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__RELEASE, oldRelease, release,
					!oldReleaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelease() {
		int oldRelease = release;
		boolean oldReleaseESet = releaseESet;
		release = RELEASE_EDEFAULT;
		releaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.TASK__RELEASE, oldRelease,
					RELEASE_EDEFAULT, oldReleaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelease() {
		return releaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingType getSchedulingMode() {
		return schedulingMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingMode(SchedulingType newSchedulingMode) {
		SchedulingType oldSchedulingMode = schedulingMode;
		schedulingMode = newSchedulingMode == null ? SCHEDULING_MODE_EDEFAULT
				: newSchedulingMode;
		boolean oldSchedulingModeESet = schedulingModeESet;
		schedulingModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__SCHEDULING_MODE, oldSchedulingMode,
					schedulingMode, !oldSchedulingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSchedulingMode() {
		SchedulingType oldSchedulingMode = schedulingMode;
		boolean oldSchedulingModeESet = schedulingModeESet;
		schedulingMode = SCHEDULING_MODE_EDEFAULT;
		schedulingModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.TASK__SCHEDULING_MODE, oldSchedulingMode,
					SCHEDULING_MODE_EDEFAULT, oldSchedulingModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSchedulingMode() {
		return schedulingModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getComputing() {
		return computing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputing(int newComputing) {
		int oldComputing = computing;
		computing = newComputing;
		boolean oldComputingESet = computingESet;
		computingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__COMPUTING, oldComputing, computing,
					!oldComputingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComputing() {
		int oldComputing = computing;
		boolean oldComputingESet = computingESet;
		computing = COMPUTING_EDEFAULT;
		computingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.TASK__COMPUTING, oldComputing,
					COMPUTING_EDEFAULT, oldComputingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComputing() {
		return computingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(int newDeadline) {
		int oldDeadline = deadline;
		deadline = newDeadline;
		boolean oldDeadlineESet = deadlineESet;
		deadlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__DEADLINE, oldDeadline, deadline,
					!oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadline() {
		int oldDeadline = deadline;
		boolean oldDeadlineESet = deadlineESet;
		deadline = DEADLINE_EDEFAULT;
		deadlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.TASK__DEADLINE, oldDeadline,
					DEADLINE_EDEFAULT, oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadline() {
		return deadlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOid() {
		return oid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOid(String newOid) {
		String oldOid = oid;
		oid = newOid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.TASK__OID, oldOid, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EZRealtimePackage.TASK__PRECEDES_TASKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPrecedesTasks())
					.basicAdd(otherEnd, msgs);
		case EZRealtimePackage.TASK__EXCLUDES_TASKS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getExcludesTasks())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EZRealtimePackage.TASK__PRECEDES_TASKS:
			return ((InternalEList<?>) getPrecedesTasks()).basicRemove(
					otherEnd, msgs);
		case EZRealtimePackage.TASK__EXCLUDES_TASKS:
			return ((InternalEList<?>) getExcludesTasks()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EZRealtimePackage.TASK__PRECEDES_TASKS:
			return getPrecedesTasks();
		case EZRealtimePackage.TASK__PRECEDES_MESSAGES:
			return getPrecedesMessages();
		case EZRealtimePackage.TASK__EXCLUDES_TASKS:
			return getExcludesTasks();
		case EZRealtimePackage.TASK__PROCESSOR:
			return getProcessor();
		case EZRealtimePackage.TASK__NAME:
			return getName();
		case EZRealtimePackage.TASK__PERIOD:
			return new Integer(getPeriod());
		case EZRealtimePackage.TASK__PHASE:
			return new Integer(getPhase());
		case EZRealtimePackage.TASK__POWER:
			return new Integer(getPower());
		case EZRealtimePackage.TASK__RELEASE:
			return new Integer(getRelease());
		case EZRealtimePackage.TASK__SCHEDULING_MODE:
			return getSchedulingMode();
		case EZRealtimePackage.TASK__COMPUTING:
			return new Integer(getComputing());
		case EZRealtimePackage.TASK__DEADLINE:
			return new Integer(getDeadline());
		case EZRealtimePackage.TASK__OID:
			return getOid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EZRealtimePackage.TASK__PRECEDES_TASKS:
			getPrecedesTasks().clear();
			getPrecedesTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case EZRealtimePackage.TASK__PRECEDES_MESSAGES:
			getPrecedesMessages().clear();
			getPrecedesMessages().addAll(
					(Collection<? extends Message>) newValue);
			return;
		case EZRealtimePackage.TASK__EXCLUDES_TASKS:
			getExcludesTasks().clear();
			getExcludesTasks().addAll((Collection<? extends Task>) newValue);
			return;
		case EZRealtimePackage.TASK__PROCESSOR:
			setProcessor((Processor) newValue);
			return;
		case EZRealtimePackage.TASK__NAME:
			setName((String) newValue);
			return;
		case EZRealtimePackage.TASK__PERIOD:
			setPeriod(((Integer) newValue).intValue());
			return;
		case EZRealtimePackage.TASK__PHASE:
			setPhase(((Integer) newValue).intValue());
			return;
		case EZRealtimePackage.TASK__POWER:
			setPower(((Integer) newValue).intValue());
			return;
		case EZRealtimePackage.TASK__RELEASE:
			setRelease(((Integer) newValue).intValue());
			return;
		case EZRealtimePackage.TASK__SCHEDULING_MODE:
			setSchedulingMode((SchedulingType) newValue);
			return;
		case EZRealtimePackage.TASK__COMPUTING:
			setComputing(((Integer) newValue).intValue());
			return;
		case EZRealtimePackage.TASK__DEADLINE:
			setDeadline(((Integer) newValue).intValue());
			return;
		case EZRealtimePackage.TASK__OID:
			setOid((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EZRealtimePackage.TASK__PRECEDES_TASKS:
			getPrecedesTasks().clear();
			return;
		case EZRealtimePackage.TASK__PRECEDES_MESSAGES:
			getPrecedesMessages().clear();
			return;
		case EZRealtimePackage.TASK__EXCLUDES_TASKS:
			getExcludesTasks().clear();
			return;
		case EZRealtimePackage.TASK__PROCESSOR:
			setProcessor((Processor) null);
			return;
		case EZRealtimePackage.TASK__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EZRealtimePackage.TASK__PERIOD:
			unsetPeriod();
			return;
		case EZRealtimePackage.TASK__PHASE:
			unsetPhase();
			return;
		case EZRealtimePackage.TASK__POWER:
			unsetPower();
			return;
		case EZRealtimePackage.TASK__RELEASE:
			unsetRelease();
			return;
		case EZRealtimePackage.TASK__SCHEDULING_MODE:
			unsetSchedulingMode();
			return;
		case EZRealtimePackage.TASK__COMPUTING:
			unsetComputing();
			return;
		case EZRealtimePackage.TASK__DEADLINE:
			unsetDeadline();
			return;
		case EZRealtimePackage.TASK__OID:
			setOid(OID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EZRealtimePackage.TASK__PRECEDES_TASKS:
			return precedesTasks != null && !precedesTasks.isEmpty();
		case EZRealtimePackage.TASK__PRECEDES_MESSAGES:
			return precedesMessages != null && !precedesMessages.isEmpty();
		case EZRealtimePackage.TASK__EXCLUDES_TASKS:
			return excludesTasks != null && !excludesTasks.isEmpty();
		case EZRealtimePackage.TASK__PROCESSOR:
			return processor != null;
		case EZRealtimePackage.TASK__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EZRealtimePackage.TASK__PERIOD:
			return isSetPeriod();
		case EZRealtimePackage.TASK__PHASE:
			return isSetPhase();
		case EZRealtimePackage.TASK__POWER:
			return isSetPower();
		case EZRealtimePackage.TASK__RELEASE:
			return isSetRelease();
		case EZRealtimePackage.TASK__SCHEDULING_MODE:
			return isSetSchedulingMode();
		case EZRealtimePackage.TASK__COMPUTING:
			return isSetComputing();
		case EZRealtimePackage.TASK__DEADLINE:
			return isSetDeadline();
		case EZRealtimePackage.TASK__OID:
			return OID_EDEFAULT == null ? oid != null : !OID_EDEFAULT
					.equals(oid);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", period: ");
		if (periodESet)
			result.append(period);
		else
			result.append("<unset>");
		result.append(", phase: ");
		if (phaseESet)
			result.append(phase);
		else
			result.append("<unset>");
		result.append(", power: ");
		if (powerESet)
			result.append(power);
		else
			result.append("<unset>");
		result.append(", release: ");
		if (releaseESet)
			result.append(release);
		else
			result.append("<unset>");
		result.append(", schedulingMode: ");
		if (schedulingModeESet)
			result.append(schedulingMode);
		else
			result.append("<unset>");
		result.append(", computing: ");
		if (computingESet)
			result.append(computing);
		else
			result.append("<unset>");
		result.append(", deadline: ");
		if (deadlineESet)
			result.append(deadline);
		else
			result.append("<unset>");
		result.append(", oid: ");
		result.append(oid);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
