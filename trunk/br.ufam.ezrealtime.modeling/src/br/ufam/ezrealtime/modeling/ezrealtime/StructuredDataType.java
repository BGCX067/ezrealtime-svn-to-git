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
 * A representation of the model object '<em><b>Structured Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType#getOwnedStructures <em>Owned Structures</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getStructuredDataType()
 * @model
 * @generated
 */
public interface StructuredDataType extends Datatype, LabeledElement {
	/**
	 * Returns the value of the '<em><b>Owned Structures</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Structures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Structures</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getStructuredDataType_OwnedStructures()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructureType> getOwnedStructures();

} // StructuredDataType
