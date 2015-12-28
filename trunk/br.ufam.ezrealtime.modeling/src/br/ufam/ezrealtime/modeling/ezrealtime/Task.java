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
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getDependecies <em>Dependecies</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getOwnedLanguageElement <em>Owned Language Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
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
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getTask_Visibility()
	 * @model
	 * @generated
	 */
	VisibilityType getVisibility();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(VisibilityType value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' reference.
	 * @see #setReturnType(Datatype)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getTask_ReturnType()
	 * @model
	 * @generated
	 */
	Datatype getReturnType();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getReturnType <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(Datatype value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getTask_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Owned Parameters</b></em>' reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Parameters</em>' reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getTask_OwnedParameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getOwnedParameters();

	/**
	 * Returns the value of the '<em><b>Dependecies</b></em>' reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependecies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependecies</em>' reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getTask_Dependecies()
	 * @model
	 * @generated
	 */
	EList<Task> getDependecies();

	/**
	 * Returns the value of the '<em><b>Owned Language Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Language Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Language Element</em>' reference.
	 * @see #setOwnedLanguageElement(LanguageElement)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getTask_OwnedLanguageElement()
	 * @model
	 * @generated
	 */
	LanguageElement getOwnedLanguageElement();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getOwnedLanguageElement <em>Owned Language Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Language Element</em>' reference.
	 * @see #getOwnedLanguageElement()
	 * @generated
	 */
	void setOwnedLanguageElement(LanguageElement value);

} // Task
