/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime.impl;

import br.ufam.ezrealtime.modeling.ezrealtime.CodeSnippet;
import br.ufam.ezrealtime.modeling.ezrealtime.Comment;
import br.ufam.ezrealtime.modeling.ezrealtime.Constraint;
import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage;
import br.ufam.ezrealtime.modeling.ezrealtime.ModelElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ModelElementImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ModelElementImpl#getOwnedComments <em>Owned Comments</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ModelElementImpl#getOwnedCodeSnippet <em>Owned Code Snippet</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelElementImpl extends EObjectImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getOwnedConstraint() <em>Owned Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint ownedConstraint;

	/**
	 * The cached value of the '{@link #getOwnedComments() <em>Owned Comments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComments()
	 * @generated
	 * @ordered
	 */
	protected Comment ownedComments;

	/**
	 * The cached value of the '{@link #getOwnedCodeSnippet() <em>Owned Code Snippet</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCodeSnippet()
	 * @generated
	 * @ordered
	 */
	protected CodeSnippet ownedCodeSnippet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getOwnedConstraint() {
		if (ownedConstraint != null && ownedConstraint.eIsProxy()) {
			InternalEObject oldOwnedConstraint = (InternalEObject)ownedConstraint;
			ownedConstraint = (Constraint)eResolveProxy(oldOwnedConstraint);
			if (ownedConstraint != oldOwnedConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.MODEL_ELEMENT__OWNED_CONSTRAINT, oldOwnedConstraint, ownedConstraint));
			}
		}
		return ownedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetOwnedConstraint() {
		return ownedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConstraint(Constraint newOwnedConstraint) {
		Constraint oldOwnedConstraint = ownedConstraint;
		ownedConstraint = newOwnedConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.MODEL_ELEMENT__OWNED_CONSTRAINT, oldOwnedConstraint, ownedConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getOwnedComments() {
		if (ownedComments != null && ownedComments.eIsProxy()) {
			InternalEObject oldOwnedComments = (InternalEObject)ownedComments;
			ownedComments = (Comment)eResolveProxy(oldOwnedComments);
			if (ownedComments != oldOwnedComments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.MODEL_ELEMENT__OWNED_COMMENTS, oldOwnedComments, ownedComments));
			}
		}
		return ownedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment basicGetOwnedComments() {
		return ownedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedComments(Comment newOwnedComments) {
		Comment oldOwnedComments = ownedComments;
		ownedComments = newOwnedComments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.MODEL_ELEMENT__OWNED_COMMENTS, oldOwnedComments, ownedComments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSnippet getOwnedCodeSnippet() {
		if (ownedCodeSnippet != null && ownedCodeSnippet.eIsProxy()) {
			InternalEObject oldOwnedCodeSnippet = (InternalEObject)ownedCodeSnippet;
			ownedCodeSnippet = (CodeSnippet)eResolveProxy(oldOwnedCodeSnippet);
			if (ownedCodeSnippet != oldOwnedCodeSnippet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.MODEL_ELEMENT__OWNED_CODE_SNIPPET, oldOwnedCodeSnippet, ownedCodeSnippet));
			}
		}
		return ownedCodeSnippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSnippet basicGetOwnedCodeSnippet() {
		return ownedCodeSnippet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCodeSnippet(CodeSnippet newOwnedCodeSnippet) {
		CodeSnippet oldOwnedCodeSnippet = ownedCodeSnippet;
		ownedCodeSnippet = newOwnedCodeSnippet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.MODEL_ELEMENT__OWNED_CODE_SNIPPET, oldOwnedCodeSnippet, ownedCodeSnippet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_CONSTRAINT:
				if (resolve) return getOwnedConstraint();
				return basicGetOwnedConstraint();
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_COMMENTS:
				if (resolve) return getOwnedComments();
				return basicGetOwnedComments();
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_CODE_SNIPPET:
				if (resolve) return getOwnedCodeSnippet();
				return basicGetOwnedCodeSnippet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_CONSTRAINT:
				setOwnedConstraint((Constraint)newValue);
				return;
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_COMMENTS:
				setOwnedComments((Comment)newValue);
				return;
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_CODE_SNIPPET:
				setOwnedCodeSnippet((CodeSnippet)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_CONSTRAINT:
				setOwnedConstraint((Constraint)null);
				return;
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_COMMENTS:
				setOwnedComments((Comment)null);
				return;
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_CODE_SNIPPET:
				setOwnedCodeSnippet((CodeSnippet)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_CONSTRAINT:
				return ownedConstraint != null;
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_COMMENTS:
				return ownedComments != null;
			case EZRealtimePackage.MODEL_ELEMENT__OWNED_CODE_SNIPPET:
				return ownedCodeSnippet != null;
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
