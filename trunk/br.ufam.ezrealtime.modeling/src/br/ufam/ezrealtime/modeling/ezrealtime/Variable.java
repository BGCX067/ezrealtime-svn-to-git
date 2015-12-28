/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getAssignmentSymbol <em>Assignment Symbol</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType
	 * @see #setVisibility(VisibilityType)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getVariable_Visibility()
	 * @model
	 * @generated
	 */
	VisibilityType getVisibility();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityType value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' reference.
	 * @see #setTypeName(Datatype)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getVariable_TypeName()
	 * @model
	 * @generated
	 */
	Datatype getTypeName();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getTypeName <em>Type Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' reference.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(Datatype value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getVariable_Identifier()
	 * @model
	 * @generated
	 */
	EList<String> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Assignment Symbol</b></em>' attribute.
	 * The default value is <code>"="</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignment Symbol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignment Symbol</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getVariable_AssignmentSymbol()
	 * @model default="=" changeable="false"
	 * @generated
	 */
	String getAssignmentSymbol();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getVariable_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Variable
