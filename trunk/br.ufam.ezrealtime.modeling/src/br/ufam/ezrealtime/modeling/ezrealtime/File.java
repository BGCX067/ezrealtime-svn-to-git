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
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.File#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.File#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.File#getProcessor <em>Processor</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.File#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getFile()
 * @model
 * @generated
 */
public interface File extends LabeledElement {
	/**
	 * Returns the value of the '<em><b>Owned Variables</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Variables</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getFile_OwnedVariables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getOwnedVariables();

	/**
	 * Returns the value of the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Tasks</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getFile_OwnedTasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getOwnedTasks();

	/**
	 * Returns the value of the '<em><b>Processor</b></em>' reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Processor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor</em>' reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getFile_Processor()
	 * @model
	 * @generated
	 */
	EList<Processor> getProcessor();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getFile_Dependencies()
	 * @model keys="name"
	 * @generated
	 */
	EList<File> getDependencies();

} // File
