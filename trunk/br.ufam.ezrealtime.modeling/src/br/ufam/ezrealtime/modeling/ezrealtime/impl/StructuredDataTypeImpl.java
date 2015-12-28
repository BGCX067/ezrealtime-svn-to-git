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
import br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType;
import br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement;
import br.ufam.ezrealtime.modeling.ezrealtime.ModelElement;
import br.ufam.ezrealtime.modeling.ezrealtime.StructureType;
import br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl#getOwnedComments <em>Owned Comments</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl#getOwnedCodeSnippet <em>Owned Code Snippet</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl#getDecorationType <em>Decoration Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl#getOwnedStructures <em>Owned Structures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredDataTypeImpl extends DatatypeImpl implements StructuredDataType {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecorationType() <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationType()
	 * @generated
	 * @ordered
	 */
	protected static final ElementDecorationType DECORATION_TYPE_EDEFAULT = ElementDecorationType.NON_FUNCTIONAL_REQS;

	/**
	 * The cached value of the '{@link #getDecorationType() <em>Decoration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecorationType()
	 * @generated
	 * @ordered
	 */
	protected ElementDecorationType decorationType = DECORATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedStructures() <em>Owned Structures</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStructures()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureType> ownedStructures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.STRUCTURED_DATA_TYPE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT, oldOwnedConstraint, ownedConstraint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT, oldOwnedConstraint, ownedConstraint));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_COMMENTS, oldOwnedComments, ownedComments));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_COMMENTS, oldOwnedComments, ownedComments));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET, oldOwnedCodeSnippet, ownedCodeSnippet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET, oldOwnedCodeSnippet, ownedCodeSnippet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.STRUCTURED_DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementDecorationType getDecorationType() {
		return decorationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecorationType(ElementDecorationType newDecorationType) {
		ElementDecorationType oldDecorationType = decorationType;
		decorationType = newDecorationType == null ? DECORATION_TYPE_EDEFAULT : newDecorationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.STRUCTURED_DATA_TYPE__DECORATION_TYPE, oldDecorationType, decorationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureType> getOwnedStructures() {
		if (ownedStructures == null) {
			ownedStructures = new EObjectContainmentEList<StructureType>(StructureType.class, this, EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_STRUCTURES);
		}
		return ownedStructures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_STRUCTURES:
				return ((InternalEList<?>)getOwnedStructures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT:
				if (resolve) return getOwnedConstraint();
				return basicGetOwnedConstraint();
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_COMMENTS:
				if (resolve) return getOwnedComments();
				return basicGetOwnedComments();
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET:
				if (resolve) return getOwnedCodeSnippet();
				return basicGetOwnedCodeSnippet();
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__NAME:
				return getName();
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__DECORATION_TYPE:
				return getDecorationType();
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_STRUCTURES:
				return getOwnedStructures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT:
				setOwnedConstraint((Constraint)newValue);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_COMMENTS:
				setOwnedComments((Comment)newValue);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET:
				setOwnedCodeSnippet((CodeSnippet)newValue);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__DECORATION_TYPE:
				setDecorationType((ElementDecorationType)newValue);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_STRUCTURES:
				getOwnedStructures().clear();
				getOwnedStructures().addAll((Collection<? extends StructureType>)newValue);
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
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT:
				setOwnedConstraint((Constraint)null);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_COMMENTS:
				setOwnedComments((Comment)null);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET:
				setOwnedCodeSnippet((CodeSnippet)null);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__DECORATION_TYPE:
				setDecorationType(DECORATION_TYPE_EDEFAULT);
				return;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_STRUCTURES:
				getOwnedStructures().clear();
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
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT:
				return ownedConstraint != null;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_COMMENTS:
				return ownedComments != null;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET:
				return ownedCodeSnippet != null;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__DECORATION_TYPE:
				return decorationType != DECORATION_TYPE_EDEFAULT;
			case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_STRUCTURES:
				return ownedStructures != null && !ownedStructures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (derivedFeatureID) {
				case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT: return EZRealtimePackage.MODEL_ELEMENT__OWNED_CONSTRAINT;
				case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_COMMENTS: return EZRealtimePackage.MODEL_ELEMENT__OWNED_COMMENTS;
				case EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET: return EZRealtimePackage.MODEL_ELEMENT__OWNED_CODE_SNIPPET;
				default: return -1;
			}
		}
		if (baseClass == LabeledElement.class) {
			switch (derivedFeatureID) {
				case EZRealtimePackage.STRUCTURED_DATA_TYPE__NAME: return EZRealtimePackage.LABELED_ELEMENT__NAME;
				case EZRealtimePackage.STRUCTURED_DATA_TYPE__DECORATION_TYPE: return EZRealtimePackage.LABELED_ELEMENT__DECORATION_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ModelElement.class) {
			switch (baseFeatureID) {
				case EZRealtimePackage.MODEL_ELEMENT__OWNED_CONSTRAINT: return EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT;
				case EZRealtimePackage.MODEL_ELEMENT__OWNED_COMMENTS: return EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_COMMENTS;
				case EZRealtimePackage.MODEL_ELEMENT__OWNED_CODE_SNIPPET: return EZRealtimePackage.STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET;
				default: return -1;
			}
		}
		if (baseClass == LabeledElement.class) {
			switch (baseFeatureID) {
				case EZRealtimePackage.LABELED_ELEMENT__NAME: return EZRealtimePackage.STRUCTURED_DATA_TYPE__NAME;
				case EZRealtimePackage.LABELED_ELEMENT__DECORATION_TYPE: return EZRealtimePackage.STRUCTURED_DATA_TYPE__DECORATION_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", decorationType: ");
		result.append(decorationType);
		result.append(')');
		return result.toString();
	}

} //StructuredDataTypeImpl
