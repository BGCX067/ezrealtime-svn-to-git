/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getRecordType <em>Record Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getType <em>Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getVariableNames <em>Variable Names</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getStructureType()
 * @model
 * @generated
 */
public interface StructureType extends StructuredDataType {
	/**
	 * Returns the value of the '<em><b>Record Type</b></em>' attribute.
	 * The default value is <code>"struct"</code>.
	 * The literals are from the enumeration {@link br.ufam.ezrealtime.modeling.ezrealtime.RecordType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.RecordType
	 * @see #setRecordType(RecordType)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getStructureType_RecordType()
	 * @model default="struct"
	 * @generated
	 */
	RecordType getRecordType();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getRecordType <em>Record Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.RecordType
	 * @see #getRecordType()
	 * @generated
	 */
	void setRecordType(RecordType value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getStructureType_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Datatype)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getStructureType_Type()
	 * @model
	 * @generated
	 */
	Datatype getType();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Variable Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Names</em>' attribute list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getStructureType_VariableNames()
	 * @model
	 * @generated
	 */
	EList<String> getVariableNames();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getStructureType_Variables()
	 * @model
	 * @generated
	 */
	EList<String> getVariables();

} // StructureType
