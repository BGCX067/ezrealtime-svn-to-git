/*
 * Copyright (c) 2007 Fabiano Cruz - UFAM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufam.pnmp.ezrealtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getTask <em>Task</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getProcessor <em>Processor</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.EZRealtimeSpec#getMessage <em>Message</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getEZRealtimeSpec()
 * @model extendedMetaData="name='ez-spec' kind='elementOnly'"
 * @generated
 */
public interface EZRealtimeSpec extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.pnmp.ezrealtime.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' containment reference list.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getEZRealtimeSpec_Task()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Task'"
	 * @generated
	 */
	EList<Task> getTask();

	/**
	 * Adds the specified {@link br.ufam.pnmp.ezrealtime.Task} at the specified index in the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param index The index at which to add the {@link br.ufam.pnmp.ezrealtime.Task}.
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Task} to be added.
	 * @see #getTask()
	 * @generated
	 */
	void addTask(int index, Task value);

	/**
	 * Removes the specified {@link br.ufam.pnmp.ezrealtime.Task} from the '<em><b>Task</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Task} to be removed.
	 * @return Whether the {@link br.ufam.pnmp.ezrealtime.Task} was successfully removed.
	 * @see #getTask()
	 * @generated
	 */
	boolean removeTask(Task value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.pnmp.ezrealtime.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' containment reference list.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getEZRealtimeSpec_Processor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='processor'"
	 * @generated
	 */
	EList<Processor> getProcessor();

	/**
	 * Adds the specified {@link br.ufam.pnmp.ezrealtime.Processor} at the specified index in the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param index The index at which to add the {@link br.ufam.pnmp.ezrealtime.Processor}.
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Processor} to be added.
	 * @see #getProcessor()
	 * @generated
	 */
	void addProcessor(int index, Processor value);

	/**
	 * Removes the specified {@link br.ufam.pnmp.ezrealtime.Processor} from the '<em><b>Processor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Processor} to be removed.
	 * @return Whether the {@link br.ufam.pnmp.ezrealtime.Processor} was successfully removed.
	 * @see #getProcessor()
	 * @generated
	 */
	boolean removeProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.pnmp.ezrealtime.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getEZRealtimeSpec_Message()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='message'"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Adds the specified {@link br.ufam.pnmp.ezrealtime.Message} at the specified index in the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param index The index at which to add the {@link br.ufam.pnmp.ezrealtime.Message}.
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Message} to be added.
	 * @see #getMessage()
	 * @generated
	 */
	void addMessage(int index, Message value);

	/**
	 * Removes the specified {@link br.ufam.pnmp.ezrealtime.Message} from the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Message} to be removed.
	 * @return Whether the {@link br.ufam.pnmp.ezrealtime.Message} was successfully removed.
	 * @see #getMessage()
	 * @generated
	 */
	boolean removeMessage(Message value);

} // EZRealtimeSpec
