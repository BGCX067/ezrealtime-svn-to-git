/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getTitle <em>Title</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getAuthor <em>Author</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedEntryPoint <em>Owned Entry Point</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedFiles <em>Owned Files</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedModules <em>Owned Modules</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedRelations <em>Owned Relations</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedConstraints <em>Owned Constraints</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedStructuredDataTypes <em>Owned Structured Data Types</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedCodeSnippets <em>Owned Code Snippets</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedPreInit <em>Owned Pre Init</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedComments <em>Owned Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_Title()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Modified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_LastModified()
	 * @model
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

	/**
	 * Returns the value of the '<em><b>Owned Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Entry Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Entry Point</em>' containment reference.
	 * @see #setOwnedEntryPoint(EntryPoint)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedEntryPoint()
	 * @model containment="true"
	 * @generated
	 */
	EntryPoint getOwnedEntryPoint();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedEntryPoint <em>Owned Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Entry Point</em>' containment reference.
	 * @see #getOwnedEntryPoint()
	 * @generated
	 */
	void setOwnedEntryPoint(EntryPoint value);

	/**
	 * Returns the value of the '<em><b>Owned Files</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.File}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Files</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedFiles()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getOwnedFiles();

	/**
	 * Returns the value of the '<em><b>Owned Modules</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Module}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Modules</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedModules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Module> getOwnedModules();

	/**
	 * Returns the value of the '<em><b>Owned Relations</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Relations</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedRelations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getOwnedRelations();

	/**
	 * Returns the value of the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Constraints</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getOwnedConstraints();

	/**
	 * Returns the value of the '<em><b>Owned Structured Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Structured Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Structured Data Types</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedStructuredDataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<StructuredDataType> getOwnedStructuredDataTypes();

	/**
	 * Returns the value of the '<em><b>Owned Code Snippets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Code Snippets</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Code Snippets</em>' containment reference.
	 * @see #setOwnedCodeSnippets(CodeSnippet)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedCodeSnippets()
	 * @model containment="true"
	 * @generated
	 */
	CodeSnippet getOwnedCodeSnippets();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedCodeSnippets <em>Owned Code Snippets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Code Snippets</em>' containment reference.
	 * @see #getOwnedCodeSnippets()
	 * @generated
	 */
	void setOwnedCodeSnippets(CodeSnippet value);

	/**
	 * Returns the value of the '<em><b>Owned Pre Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Pre Init</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Pre Init</em>' containment reference.
	 * @see #setOwnedPreInit(PreInit)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedPreInit()
	 * @model containment="true"
	 * @generated
	 */
	PreInit getOwnedPreInit();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedPreInit <em>Owned Pre Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Pre Init</em>' containment reference.
	 * @see #getOwnedPreInit()
	 * @generated
	 */
	void setOwnedPreInit(PreInit value);

	/**
	 * Returns the value of the '<em><b>Owned Comments</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufam.ezrealtime.modeling.ezrealtime.Comment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Comments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Comments</em>' containment reference list.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getDiagram_OwnedComments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Comment> getOwnedComments();

} // Diagram
