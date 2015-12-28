/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime.impl;

import br.ufam.ezrealtime.modeling.ezrealtime.Datatype;
import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage;
import br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement;
import br.ufam.ezrealtime.modeling.ezrealtime.Parameter;
import br.ufam.ezrealtime.modeling.ezrealtime.Task;
import br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl#getOwnedParameters <em>Owned Parameters</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl#getDependecies <em>Dependecies</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl#getOwnedLanguageElement <em>Owned Language Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EObjectImpl implements Task {
	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityType VISIBILITY_EDEFAULT = VisibilityType.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityType visibility = VISIBILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Datatype returnType;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameters() <em>Owned Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameters;

	/**
	 * The cached value of the '{@link #getDependecies() <em>Dependecies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependecies()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> dependecies;

	/**
	 * The cached value of the '{@link #getOwnedLanguageElement() <em>Owned Language Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLanguageElement()
	 * @generated
	 * @ordered
	 */
	protected LanguageElement ownedLanguageElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityType getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisibility(VisibilityType newVisibility) {
		VisibilityType oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.TASK__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getReturnType() {
		if (returnType != null && returnType.eIsProxy()) {
			InternalEObject oldReturnType = (InternalEObject)returnType;
			returnType = (Datatype)eResolveProxy(oldReturnType);
			if (returnType != oldReturnType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.TASK__RETURN_TYPE, oldReturnType, returnType));
			}
		}
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype basicGetReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Datatype newReturnType) {
		Datatype oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.TASK__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.TASK__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameters() {
		if (ownedParameters == null) {
			ownedParameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, EZRealtimePackage.TASK__OWNED_PARAMETERS);
		}
		return ownedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getDependecies() {
		if (dependecies == null) {
			dependecies = new EObjectResolvingEList<Task>(Task.class, this, EZRealtimePackage.TASK__DEPENDECIES);
		}
		return dependecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageElement getOwnedLanguageElement() {
		if (ownedLanguageElement != null && ownedLanguageElement.eIsProxy()) {
			InternalEObject oldOwnedLanguageElement = (InternalEObject)ownedLanguageElement;
			ownedLanguageElement = (LanguageElement)eResolveProxy(oldOwnedLanguageElement);
			if (ownedLanguageElement != oldOwnedLanguageElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EZRealtimePackage.TASK__OWNED_LANGUAGE_ELEMENT, oldOwnedLanguageElement, ownedLanguageElement));
			}
		}
		return ownedLanguageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageElement basicGetOwnedLanguageElement() {
		return ownedLanguageElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedLanguageElement(LanguageElement newOwnedLanguageElement) {
		LanguageElement oldOwnedLanguageElement = ownedLanguageElement;
		ownedLanguageElement = newOwnedLanguageElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.TASK__OWNED_LANGUAGE_ELEMENT, oldOwnedLanguageElement, ownedLanguageElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EZRealtimePackage.TASK__VISIBILITY:
				return getVisibility();
			case EZRealtimePackage.TASK__RETURN_TYPE:
				if (resolve) return getReturnType();
				return basicGetReturnType();
			case EZRealtimePackage.TASK__IDENTIFIER:
				return getIdentifier();
			case EZRealtimePackage.TASK__OWNED_PARAMETERS:
				return getOwnedParameters();
			case EZRealtimePackage.TASK__DEPENDECIES:
				return getDependecies();
			case EZRealtimePackage.TASK__OWNED_LANGUAGE_ELEMENT:
				if (resolve) return getOwnedLanguageElement();
				return basicGetOwnedLanguageElement();
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
			case EZRealtimePackage.TASK__VISIBILITY:
				setVisibility((VisibilityType)newValue);
				return;
			case EZRealtimePackage.TASK__RETURN_TYPE:
				setReturnType((Datatype)newValue);
				return;
			case EZRealtimePackage.TASK__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case EZRealtimePackage.TASK__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				getOwnedParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case EZRealtimePackage.TASK__DEPENDECIES:
				getDependecies().clear();
				getDependecies().addAll((Collection<? extends Task>)newValue);
				return;
			case EZRealtimePackage.TASK__OWNED_LANGUAGE_ELEMENT:
				setOwnedLanguageElement((LanguageElement)newValue);
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
			case EZRealtimePackage.TASK__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case EZRealtimePackage.TASK__RETURN_TYPE:
				setReturnType((Datatype)null);
				return;
			case EZRealtimePackage.TASK__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case EZRealtimePackage.TASK__OWNED_PARAMETERS:
				getOwnedParameters().clear();
				return;
			case EZRealtimePackage.TASK__DEPENDECIES:
				getDependecies().clear();
				return;
			case EZRealtimePackage.TASK__OWNED_LANGUAGE_ELEMENT:
				setOwnedLanguageElement((LanguageElement)null);
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
			case EZRealtimePackage.TASK__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case EZRealtimePackage.TASK__RETURN_TYPE:
				return returnType != null;
			case EZRealtimePackage.TASK__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case EZRealtimePackage.TASK__OWNED_PARAMETERS:
				return ownedParameters != null && !ownedParameters.isEmpty();
			case EZRealtimePackage.TASK__DEPENDECIES:
				return dependecies != null && !dependecies.isEmpty();
			case EZRealtimePackage.TASK__OWNED_LANGUAGE_ELEMENT:
				return ownedLanguageElement != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
