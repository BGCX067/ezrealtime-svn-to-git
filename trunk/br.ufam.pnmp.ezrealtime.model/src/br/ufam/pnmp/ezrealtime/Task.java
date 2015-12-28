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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getPrecedesTasks <em>Precedes Tasks</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getPrecedesMessages <em>Precedes Messages</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getExcludesTasks <em>Excludes Tasks</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getProcessor <em>Processor</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getName <em>Name</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getPeriod <em>Period</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getPhase <em>Phase</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getPower <em>Power</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getRelease <em>Release</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getSchedulingMode <em>Scheduling Mode</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getComputing <em>Computing</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Task#getOid <em>Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask()
 * @model extendedMetaData="name='Task' kind='elementOnly'"
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Precedes Tasks</b></em>' reference list.
	 * The list contents are of type {@link br.ufam.pnmp.ezrealtime.Task}.
	 * It is bidirectional and its opposite is '{@link br.ufam.pnmp.ezrealtime.Task#getExcludesTasks <em>Excludes Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedes Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedes Tasks</em>' reference list.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_PrecedesTasks()
	 * @see br.ufam.pnmp.ezrealtime.Task#getExcludesTasks
	 * @model opposite="excludesTasks"
	 * @generated
	 */
	EList<Task> getPrecedesTasks();

	/**
	 * Adds the specified {@link br.ufam.pnmp.ezrealtime.Task} at the specified index in the '<em><b>Precedes Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param index The index at which to add the {@link br.ufam.pnmp.ezrealtime.Task}.
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Task} to be added.
	 * @see #getPrecedesTasks()
	 * @generated
	 */
	void addPrecedesTasks(int index, Task value);

	/**
	 * Removes the specified {@link br.ufam.pnmp.ezrealtime.Task} from the '<em><b>Precedes Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Task} to be removed.
	 * @return Whether the {@link br.ufam.pnmp.ezrealtime.Task} was successfully removed.
	 * @see #getPrecedesTasks()
	 * @generated
	 */
	boolean removePrecedesTasks(Task value);

	/**
	 * Returns the value of the '<em><b>Precedes Messages</b></em>' reference list.
	 * The list contents are of type {@link br.ufam.pnmp.ezrealtime.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedes Messages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedes Messages</em>' reference list.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_PrecedesMessages()
	 * @model
	 * @generated
	 */
	EList<Message> getPrecedesMessages();

	/**
	 * Adds the specified {@link br.ufam.pnmp.ezrealtime.Message} at the specified index in the '<em><b>Precedes Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param index The index at which to add the {@link br.ufam.pnmp.ezrealtime.Message}.
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Message} to be added.
	 * @see #getPrecedesMessages()
	 * @generated
	 */
	void addPrecedesMessages(int index, Message value);

	/**
	 * Removes the specified {@link br.ufam.pnmp.ezrealtime.Message} from the '<em><b>Precedes Messages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Message} to be removed.
	 * @return Whether the {@link br.ufam.pnmp.ezrealtime.Message} was successfully removed.
	 * @see #getPrecedesMessages()
	 * @generated
	 */
	boolean removePrecedesMessages(Message value);

	/**
	 * Returns the value of the '<em><b>Excludes Tasks</b></em>' reference list.
	 * The list contents are of type {@link br.ufam.pnmp.ezrealtime.Task}.
	 * It is bidirectional and its opposite is '{@link br.ufam.pnmp.ezrealtime.Task#getPrecedesTasks <em>Precedes Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Excludes Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excludes Tasks</em>' reference list.
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_ExcludesTasks()
	 * @see br.ufam.pnmp.ezrealtime.Task#getPrecedesTasks
	 * @model opposite="precedesTasks"
	 * @generated
	 */
	EList<Task> getExcludesTasks();

	/**
	 * Adds the specified {@link br.ufam.pnmp.ezrealtime.Task} at the specified index in the '<em><b>Excludes Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param index The index at which to add the {@link br.ufam.pnmp.ezrealtime.Task}.
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Task} to be added.
	 * @see #getExcludesTasks()
	 * @generated
	 */
	void addExcludesTasks(int index, Task value);

	/**
	 * Removes the specified {@link br.ufam.pnmp.ezrealtime.Task} from the '<em><b>Excludes Tasks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value The {@link br.ufam.pnmp.ezrealtime.Task} to be removed.
	 * @return Whether the {@link br.ufam.pnmp.ezrealtime.Task} was successfully removed.
	 * @see #getExcludesTasks()
	 * @generated
	 */
	boolean removeExcludesTasks(Task value);

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' reference.
	 * @see #setProcessor(Processor)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Processor()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='processor'"
	 * @generated
	 */
	Processor getProcessor();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getProcessor <em>Processor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor</em>' reference.
	 * @see #getProcessor()
	 * @generated
	 */
	void setProcessor(Processor value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(int)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Period()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='period'"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(int)
	 * @generated
	 */
	void unsetPeriod();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(int)
	 * @generated
	 */
	boolean isSetPeriod();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #setPhase(int)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Phase()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='phase'"
	 * @generated
	 */
	int getPhase();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhase()
	 * @see #getPhase()
	 * @see #setPhase(int)
	 * @generated
	 */
	void unsetPhase();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPhase <em>Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase</em>' attribute is set.
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @see #setPhase(int)
	 * @generated
	 */
	boolean isSetPhase();

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #setPower(int)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Power()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='power'"
	 * @generated
	 */
	int getPower();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #getPower()
	 * @generated
	 */
	void setPower(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPower()
	 * @see #getPower()
	 * @see #setPower(int)
	 * @generated
	 */
	void unsetPower();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getPower <em>Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power</em>' attribute is set.
	 * @see #unsetPower()
	 * @see #getPower()
	 * @see #setPower(int)
	 * @generated
	 */
	boolean isSetPower();

	/**
	 * Returns the value of the '<em><b>Release</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' attribute.
	 * @see #isSetRelease()
	 * @see #unsetRelease()
	 * @see #setRelease(int)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Release()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='element' name='release'"
	 * @generated
	 */
	int getRelease();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #isSetRelease()
	 * @see #unsetRelease()
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelease()
	 * @see #getRelease()
	 * @see #setRelease(int)
	 * @generated
	 */
	void unsetRelease();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getRelease <em>Release</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Release</em>' attribute is set.
	 * @see #unsetRelease()
	 * @see #getRelease()
	 * @see #setRelease(int)
	 * @generated
	 */
	boolean isSetRelease();

	/**
	 * Returns the value of the '<em><b>Scheduling Mode</b></em>' attribute.
	 * The default value is <code>"P"</code>.
	 * The literals are from the enumeration {@link br.ufam.pnmp.ezrealtime.SchedulingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Mode</em>' attribute.
	 * @see br.ufam.pnmp.ezrealtime.SchedulingType
	 * @see #isSetSchedulingMode()
	 * @see #unsetSchedulingMode()
	 * @see #setSchedulingMode(SchedulingType)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_SchedulingMode()
	 * @model default="P" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='schedulingMode'"
	 * @generated
	 */
	SchedulingType getSchedulingMode();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getSchedulingMode <em>Scheduling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Mode</em>' attribute.
	 * @see br.ufam.pnmp.ezrealtime.SchedulingType
	 * @see #isSetSchedulingMode()
	 * @see #unsetSchedulingMode()
	 * @see #getSchedulingMode()
	 * @generated
	 */
	void setSchedulingMode(SchedulingType value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getSchedulingMode <em>Scheduling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchedulingMode()
	 * @see #getSchedulingMode()
	 * @see #setSchedulingMode(SchedulingType)
	 * @generated
	 */
	void unsetSchedulingMode();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getSchedulingMode <em>Scheduling Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scheduling Mode</em>' attribute is set.
	 * @see #unsetSchedulingMode()
	 * @see #getSchedulingMode()
	 * @see #setSchedulingMode(SchedulingType)
	 * @generated
	 */
	boolean isSetSchedulingMode();

	/**
	 * Returns the value of the '<em><b>Computing</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing</em>' attribute.
	 * @see #isSetComputing()
	 * @see #unsetComputing()
	 * @see #setComputing(int)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Computing()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='computing'"
	 * @generated
	 */
	int getComputing();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getComputing <em>Computing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing</em>' attribute.
	 * @see #isSetComputing()
	 * @see #unsetComputing()
	 * @see #getComputing()
	 * @generated
	 */
	void setComputing(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getComputing <em>Computing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComputing()
	 * @see #getComputing()
	 * @see #setComputing(int)
	 * @generated
	 */
	void unsetComputing();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getComputing <em>Computing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Computing</em>' attribute is set.
	 * @see #unsetComputing()
	 * @see #getComputing()
	 * @see #setComputing(int)
	 * @generated
	 */
	boolean isSetComputing();

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #setDeadline(int)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Deadline()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='deadline'"
	 * @generated
	 */
	int getDeadline();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(int)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getDeadline <em>Deadline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadline</em>' attribute is set.
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(int)
	 * @generated
	 */
	boolean isSetDeadline();

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * The default value is <code>"ez123"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(String)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getTask_Oid()
	 * @model default="ez123" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='identifier'"
	 * @generated
	 */
	String getOid();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Task#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(String value);

} // Task
