/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Language Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getLanguageType <em>Language Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getDecorationType <em>Decoration Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getLanguageElement()
 * @model abstract="true"
 * @generated
 */
public interface LanguageElement extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Language Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageType
	 * @see #setLanguageType(LanguageType)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getLanguageElement_LanguageType()
	 * @model ordered="false"
	 * @generated
	 */
	LanguageType getLanguageType();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getLanguageType <em>Language Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageType
	 * @see #getLanguageType()
	 * @generated
	 */
	void setLanguageType(LanguageType value);

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
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getLanguageElement_DecorationType()
	 * @model required="true"
	 * @generated
	 */
	ElementDecorationType getDecorationType();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getDecorationType <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decoration Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType
	 * @see #getDecorationType()
	 * @generated
	 */
	void setDecorationType(ElementDecorationType value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getLanguageElement_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // LanguageElement
