/*
 * Copyright (c) 2007 Fabiano Cruz - UFAM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufam.pnmp.ezrealtime.impl;

import br.ufam.pnmp.ezrealtime.EZRealtimePackage;
import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.Message;
import br.ufam.pnmp.ezrealtime.Processor;
import br.ufam.pnmp.ezrealtime.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.EZRealtimeSpecImpl#getTask <em>Task</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.EZRealtimeSpecImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.EZRealtimeSpecImpl#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EZRealtimeSpecImpl extends EObjectImpl implements EZRealtimeSpec {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> task;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processor;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EZRealtimeSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.EZ_REALTIME_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTask() {
		if (task == null) {
			task = new EObjectContainmentEList<Task>(Task.class, this,
					EZRealtimePackage.EZ_REALTIME_SPEC__TASK);
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addTask(int index, Task value) {
		getTask().add(index, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeTask(Task value) {
		return getTask().remove(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessor() {
		if (processor == null) {
			processor = new EObjectContainmentEList<Processor>(Processor.class,
					this, EZRealtimePackage.EZ_REALTIME_SPEC__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addProcessor(int index, Processor value) {
		getProcessor().add(index, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeProcessor(Processor value) {
		return getProcessor().remove(value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this,
					EZRealtimePackage.EZ_REALTIME_SPEC__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addMessage(int index, Message value) {
		getMessage().add(index, value);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean removeMessage(Message value) {
		return getMessage().remove(value);
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
		case EZRealtimePackage.EZ_REALTIME_SPEC__TASK:
			return ((InternalEList<?>) getTask()).basicRemove(otherEnd, msgs);
		case EZRealtimePackage.EZ_REALTIME_SPEC__PROCESSOR:
			return ((InternalEList<?>) getProcessor()).basicRemove(otherEnd,
					msgs);
		case EZRealtimePackage.EZ_REALTIME_SPEC__MESSAGE:
			return ((InternalEList<?>) getMessage())
					.basicRemove(otherEnd, msgs);
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
		case EZRealtimePackage.EZ_REALTIME_SPEC__TASK:
			return getTask();
		case EZRealtimePackage.EZ_REALTIME_SPEC__PROCESSOR:
			return getProcessor();
		case EZRealtimePackage.EZ_REALTIME_SPEC__MESSAGE:
			return getMessage();
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
		case EZRealtimePackage.EZ_REALTIME_SPEC__TASK:
			getTask().clear();
			getTask().addAll((Collection<? extends Task>) newValue);
			return;
		case EZRealtimePackage.EZ_REALTIME_SPEC__PROCESSOR:
			getProcessor().clear();
			getProcessor().addAll((Collection<? extends Processor>) newValue);
			return;
		case EZRealtimePackage.EZ_REALTIME_SPEC__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
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
		case EZRealtimePackage.EZ_REALTIME_SPEC__TASK:
			getTask().clear();
			return;
		case EZRealtimePackage.EZ_REALTIME_SPEC__PROCESSOR:
			getProcessor().clear();
			return;
		case EZRealtimePackage.EZ_REALTIME_SPEC__MESSAGE:
			getMessage().clear();
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
		case EZRealtimePackage.EZ_REALTIME_SPEC__TASK:
			return task != null && !task.isEmpty();
		case EZRealtimePackage.EZ_REALTIME_SPEC__PROCESSOR:
			return processor != null && !processor.isEmpty();
		case EZRealtimePackage.EZ_REALTIME_SPEC__MESSAGE:
			return message != null && !message.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EZRealtimeSpecImpl
