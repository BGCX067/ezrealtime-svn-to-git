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
import br.ufam.pnmp.ezrealtime.Task;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.MessageImpl#getPrecedes <em>Precedes</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.MessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.MessageImpl#getBus <em>Bus</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.MessageImpl#getGrantBus <em>Grant Bus</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.MessageImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link br.ufam.pnmp.ezrealtime.impl.MessageImpl#getOid <em>Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageImpl extends EObjectImpl implements Message {
	/**
	 * The cached value of the '{@link #getPrecedes() <em>Precedes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedes()
	 * @generated
	 * @ordered
	 */
	protected Task precedes;

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
	 * The default value of the '{@link #getBus() <em>Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected static final String BUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBus() <em>Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBus()
	 * @generated
	 * @ordered
	 */
	protected String bus = BUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrantBus() <em>Grant Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantBus()
	 * @generated
	 * @ordered
	 */
	protected static final int GRANT_BUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGrantBus() <em>Grant Bus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantBus()
	 * @generated
	 * @ordered
	 */
	protected int grantBus = GRANT_BUS_EDEFAULT;

	/**
	 * This is true if the Grant Bus attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean grantBusESet;

	/**
	 * The default value of the '{@link #getCommunication() <em>Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected static final int COMMUNICATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected int communication = COMMUNICATION_EDEFAULT;

	/**
	 * This is true if the Communication attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean communicationESet;

	/**
	 * The default value of the '{@link #getOid() <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOid()
	 * @generated
	 * @ordered
	 */
	protected static final String OID_EDEFAULT = null;

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
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getPrecedes() {
		if (precedes != null && precedes.eIsProxy()) {
			InternalEObject oldPrecedes = (InternalEObject) precedes;
			precedes = (Task) eResolveProxy(oldPrecedes);
			if (precedes != oldPrecedes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EZRealtimePackage.MESSAGE__PRECEDES, oldPrecedes,
							precedes));
			}
		}
		return precedes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetPrecedes() {
		return precedes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecedes(Task newPrecedes) {
		Task oldPrecedes = precedes;
		precedes = newPrecedes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.MESSAGE__PRECEDES, oldPrecedes, precedes));
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
					EZRealtimePackage.MESSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBus() {
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBus(String newBus) {
		String oldBus = bus;
		bus = newBus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.MESSAGE__BUS, oldBus, bus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGrantBus() {
		return grantBus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrantBus(int newGrantBus) {
		int oldGrantBus = grantBus;
		grantBus = newGrantBus;
		boolean oldGrantBusESet = grantBusESet;
		grantBusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.MESSAGE__GRANT_BUS, oldGrantBus,
					grantBus, !oldGrantBusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGrantBus() {
		int oldGrantBus = grantBus;
		boolean oldGrantBusESet = grantBusESet;
		grantBus = GRANT_BUS_EDEFAULT;
		grantBusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.MESSAGE__GRANT_BUS, oldGrantBus,
					GRANT_BUS_EDEFAULT, oldGrantBusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGrantBus() {
		return grantBusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommunication() {
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication(int newCommunication) {
		int oldCommunication = communication;
		communication = newCommunication;
		boolean oldCommunicationESet = communicationESet;
		communicationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EZRealtimePackage.MESSAGE__COMMUNICATION, oldCommunication,
					communication, !oldCommunicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCommunication() {
		int oldCommunication = communication;
		boolean oldCommunicationESet = communicationESet;
		communication = COMMUNICATION_EDEFAULT;
		communicationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					EZRealtimePackage.MESSAGE__COMMUNICATION, oldCommunication,
					COMMUNICATION_EDEFAULT, oldCommunicationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCommunication() {
		return communicationESet;
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
					EZRealtimePackage.MESSAGE__OID, oldOid, oid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EZRealtimePackage.MESSAGE__PRECEDES:
			if (resolve)
				return getPrecedes();
			return basicGetPrecedes();
		case EZRealtimePackage.MESSAGE__NAME:
			return getName();
		case EZRealtimePackage.MESSAGE__BUS:
			return getBus();
		case EZRealtimePackage.MESSAGE__GRANT_BUS:
			return new Integer(getGrantBus());
		case EZRealtimePackage.MESSAGE__COMMUNICATION:
			return new Integer(getCommunication());
		case EZRealtimePackage.MESSAGE__OID:
			return getOid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EZRealtimePackage.MESSAGE__PRECEDES:
			setPrecedes((Task) newValue);
			return;
		case EZRealtimePackage.MESSAGE__NAME:
			setName((String) newValue);
			return;
		case EZRealtimePackage.MESSAGE__BUS:
			setBus((String) newValue);
			return;
		case EZRealtimePackage.MESSAGE__GRANT_BUS:
			setGrantBus(((Integer) newValue).intValue());
			return;
		case EZRealtimePackage.MESSAGE__COMMUNICATION:
			setCommunication(((Integer) newValue).intValue());
			return;
		case EZRealtimePackage.MESSAGE__OID:
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
		case EZRealtimePackage.MESSAGE__PRECEDES:
			setPrecedes((Task) null);
			return;
		case EZRealtimePackage.MESSAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case EZRealtimePackage.MESSAGE__BUS:
			setBus(BUS_EDEFAULT);
			return;
		case EZRealtimePackage.MESSAGE__GRANT_BUS:
			unsetGrantBus();
			return;
		case EZRealtimePackage.MESSAGE__COMMUNICATION:
			unsetCommunication();
			return;
		case EZRealtimePackage.MESSAGE__OID:
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
		case EZRealtimePackage.MESSAGE__PRECEDES:
			return precedes != null;
		case EZRealtimePackage.MESSAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT
					.equals(name);
		case EZRealtimePackage.MESSAGE__BUS:
			return BUS_EDEFAULT == null ? bus != null : !BUS_EDEFAULT
					.equals(bus);
		case EZRealtimePackage.MESSAGE__GRANT_BUS:
			return isSetGrantBus();
		case EZRealtimePackage.MESSAGE__COMMUNICATION:
			return isSetCommunication();
		case EZRealtimePackage.MESSAGE__OID:
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
		result.append(", bus: ");
		result.append(bus);
		result.append(", grantBus: ");
		if (grantBusESet)
			result.append(grantBus);
		else
			result.append("<unset>");
		result.append(", communication: ");
		if (communicationESet)
			result.append(communication);
		else
			result.append("<unset>");
		result.append(", oid: ");
		result.append(oid);
		result.append(')');
		return result.toString();
	}

} //MessageImpl
