/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Labeled Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement#getName <em>Name</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement#getDecorationType <em>Decoration Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getLabeledElement()
 * @model abstract="true"
 * @generated
 */
public interface LabeledElement extends ModelElement {
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
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getLabeledElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Decoration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decoration Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decoration Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType
	 * @see #setDecorationType(ElementDecorationType)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getLabeledElement_DecorationType()
	 * @model
	 * @generated
	 */
	ElementDecorationType getDecorationType();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement#getDecorationType <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType
	 * @see #getDecorationType()
	 * @generated
	 */
	void setDecorationType(ElementDecorationType value);

} // LabeledElement
