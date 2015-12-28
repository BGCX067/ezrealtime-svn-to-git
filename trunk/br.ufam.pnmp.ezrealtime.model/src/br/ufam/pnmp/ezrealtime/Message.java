/*
 * Copyright (c) 2007 Fabiano Cruz - UFAM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufam.pnmp.ezrealtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Message#getPrecedes <em>Precedes</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Message#getName <em>Name</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Message#getBus <em>Bus</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Message#getGrantBus <em>Grant Bus</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Message#getCommunication <em>Communication</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.Message#getOid <em>Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getMessage()
 * @model extendedMetaData="name='Message' kind='elementOnly'"
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Precedes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precedes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precedes</em>' reference.
	 * @see #setPrecedes(Task)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getMessage_Precedes()
	 * @model
	 * @generated
	 */
	Task getPrecedes();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getPrecedes <em>Precedes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precedes</em>' reference.
	 * @see #getPrecedes()
	 * @generated
	 */
	void setPrecedes(Task value);

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
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getMessage_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' attribute.
	 * @see #setBus(String)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getMessage_Bus()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='bus'"
	 * @generated
	 */
	String getBus();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getBus <em>Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' attribute.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(String value);

	/**
	 * Returns the value of the '<em><b>Grant Bus</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grant Bus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grant Bus</em>' attribute.
	 * @see #isSetGrantBus()
	 * @see #unsetGrantBus()
	 * @see #setGrantBus(int)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getMessage_GrantBus()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='grantBus'"
	 * @generated
	 */
	int getGrantBus();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getGrantBus <em>Grant Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grant Bus</em>' attribute.
	 * @see #isSetGrantBus()
	 * @see #unsetGrantBus()
	 * @see #getGrantBus()
	 * @generated
	 */
	void setGrantBus(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getGrantBus <em>Grant Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGrantBus()
	 * @see #getGrantBus()
	 * @see #setGrantBus(int)
	 * @generated
	 */
	void unsetGrantBus();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getGrantBus <em>Grant Bus</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Grant Bus</em>' attribute is set.
	 * @see #unsetGrantBus()
	 * @see #getGrantBus()
	 * @see #setGrantBus(int)
	 * @generated
	 */
	boolean isSetGrantBus();

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Communication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication</em>' attribute.
	 * @see #isSetCommunication()
	 * @see #unsetCommunication()
	 * @see #setCommunication(int)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getMessage_Communication()
	 * @model default="0" unique="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int" required="true"
	 *        extendedMetaData="kind='element' name='communication'"
	 * @generated
	 */
	int getCommunication();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getCommunication <em>Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' attribute.
	 * @see #isSetCommunication()
	 * @see #unsetCommunication()
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getCommunication <em>Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCommunication()
	 * @see #getCommunication()
	 * @see #setCommunication(int)
	 * @generated
	 */
	void unsetCommunication();

	/**
	 * Returns whether the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getCommunication <em>Communication</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Communication</em>' attribute is set.
	 * @see #unsetCommunication()
	 * @see #getCommunication()
	 * @see #setCommunication(int)
	 * @generated
	 */
	boolean isSetCommunication();

	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(String)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getMessage_Oid()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='identifier'"
	 * @generated
	 */
	String getOid();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.Message#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(String value);

} // Message
