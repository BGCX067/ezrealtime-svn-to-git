/*
 * Copyright (c) 2007 Fabiano Cruz - UFAM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufam.pnmp.ezrealtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Code</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.pnmp.ezrealtime.SourceCode#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getSourceCode()
 * @model extendedMetaData="name='SourceCode' kind='elementOnly'"
 * @generated
 */
public interface SourceCode extends EObject {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#getSourceCode_Content()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='content'"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link br.ufam.pnmp.ezrealtime.SourceCode#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // SourceCode
