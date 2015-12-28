/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedComments <em>Owned Comments</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedCodeSnippet <em>Owned Code Snippet</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getModelElement()
 * @model
 * @generated
 */
public interface ModelElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Constraint</em>' reference.
	 * @see #setOwnedConstraint(Constraint)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getModelElement_OwnedConstraint()
	 * @model
	 * @generated
	 */
	Constraint getOwnedConstraint();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedConstraint <em>Owned Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Constraint</em>' reference.
	 * @see #getOwnedConstraint()
	 * @generated
	 */
	void setOwnedConstraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comments</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comments</em>' reference.
	 * @see #setOwnedComments(Comment)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getModelElement_OwnedComments()
	 * @model
	 * @generated
	 */
	Comment getOwnedComments();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedComments <em>Owned Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Comments</em>' reference.
	 * @see #getOwnedComments()
	 * @generated
	 */
	void setOwnedComments(Comment value);

	/**
	 * Returns the value of the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Code Snippet</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Code Snippet</em>' reference.
	 * @see #setOwnedCodeSnippet(CodeSnippet)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getModelElement_OwnedCodeSnippet()
	 * @model
	 * @generated
	 */
	CodeSnippet getOwnedCodeSnippet();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedCodeSnippet <em>Owned Code Snippet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Code Snippet</em>' reference.
	 * @see #getOwnedCodeSnippet()
	 * @generated
	 */
	void setOwnedCodeSnippet(CodeSnippet value);

} // ModelElement
