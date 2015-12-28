/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime.impl;

import br.ufam.ezrealtime.modeling.ezrealtime.Datatype;
import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage;
import br.ufam.ezrealtime.modeling.ezrealtime.RecordType;
import br.ufam.ezrealtime.modeling.ezrealtime.StructureType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl#getVariableNames <em>Variable Names</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureTypeImpl extends StructuredDataTypeImpl implements StructureType {
	/**
	 * The default value of the '{@link #getRecordType() <em>Record Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordType()
	 * @generated
	 * @ordered
	 */
	protected static final RecordType RECORD_TYPE_EDEFAULT = RecordType.STRUCT;

	/**
	 * The cached value of the '{@link #getRecordType() <em>Record Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordType()
	 * @generated
	 * @ordered
	 */
	protected RecordType recordType = RECORD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Datatype type;

	/**
	 * The cached value of the '{@link #getVariableNames() <em>Variable Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variableNames;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.STRUCTURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordType getRecordType() {
		return recordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordType(RecordType newRecordType) {
		RecordType oldRecordType = recordType;
		recordType = newRecordType == null ? RECORD_TYPE_EDEFAULT : newRecordType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.STRUCTURE_TYPE__RECORD_TYPE, oldRecordType, recordType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.STRUCTURE_TYPE__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (Datatype)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.STRUCTURE_TYPE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Datatype newType) {
		Datatype oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.STRUCTURE_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVariableNames() {
		if (variableNames == null) {
			variableNames = new EDataTypeUniqueEList<String>(String.class, this, EZRealtimePackage.STRUCTURE_TYPE__VARIABLE_NAMES);
		}
		return variableNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVariables() {
		if (variables == null) {
			variables = new EDataTypeUniqueEList<String>(String.class, this, EZRealtimePackage.STRUCTURE_TYPE__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EZRealtimePackage.STRUCTURE_TYPE__RECORD_TYPE:
				return getRecordType();
			case EZRealtimePackage.STRUCTURE_TYPE__TYPE_NAME:
				return getTypeName();
			case EZRealtimePackage.STRUCTURE_TYPE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case EZRealtimePackage.STRUCTURE_TYPE__VARIABLE_NAMES:
				return getVariableNames();
			case EZRealtimePackage.STRUCTURE_TYPE__VARIABLES:
				return getVariables();
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
			case EZRealtimePackage.STRUCTURE_TYPE__RECORD_TYPE:
				setRecordType((RecordType)newValue);
				return;
			case EZRealtimePackage.STRUCTURE_TYPE__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case EZRealtimePackage.STRUCTURE_TYPE__TYPE:
				setType((Datatype)newValue);
				return;
			case EZRealtimePackage.STRUCTURE_TYPE__VARIABLE_NAMES:
				getVariableNames().clear();
				getVariableNames().addAll((Collection<? extends String>)newValue);
				return;
			case EZRealtimePackage.STRUCTURE_TYPE__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends String>)newValue);
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
			case EZRealtimePackage.STRUCTURE_TYPE__RECORD_TYPE:
				setRecordType(RECORD_TYPE_EDEFAULT);
				return;
			case EZRealtimePackage.STRUCTURE_TYPE__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case EZRealtimePackage.STRUCTURE_TYPE__TYPE:
				setType((Datatype)null);
				return;
			case EZRealtimePackage.STRUCTURE_TYPE__VARIABLE_NAMES:
				getVariableNames().clear();
				return;
			case EZRealtimePackage.STRUCTURE_TYPE__VARIABLES:
				getVariables().clear();
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
			case EZRealtimePackage.STRUCTURE_TYPE__RECORD_TYPE:
				return recordType != RECORD_TYPE_EDEFAULT;
			case EZRealtimePackage.STRUCTURE_TYPE__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case EZRealtimePackage.STRUCTURE_TYPE__TYPE:
				return type != null;
			case EZRealtimePackage.STRUCTURE_TYPE__VARIABLE_NAMES:
				return variableNames != null && !variableNames.isEmpty();
			case EZRealtimePackage.STRUCTURE_TYPE__VARIABLES:
				return variables != null && !variables.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (recordType: ");
		result.append(recordType);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", variableNames: ");
		result.append(variableNames);
		result.append(", variables: ");
		result.append(variables);
		result.append(')');
		return result.toString();
	}

} //StructureTypeImpl
