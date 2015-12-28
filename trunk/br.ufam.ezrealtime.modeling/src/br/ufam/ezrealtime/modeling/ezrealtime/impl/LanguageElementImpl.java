/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime.impl;

import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage;
import br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType;
import br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement;
import br.ufam.ezrealtime.modeling.ezrealtime.LanguageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Language Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.LanguageElementImpl#getLanguageType <em>Language Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.LanguageElementImpl#getDecorationType <em>Decoration Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.LanguageElementImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LanguageElementImpl extends ModelElementImpl implements LanguageElement {
	/**
	 * The default value of the '{@link #getLanguageType() <em>Language Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageType()
	 * @generated
	 * @ordered
	 */
	protected static final LanguageType LANGUAGE_TYPE_EDEFAULT = LanguageType.OCL;

	/**
	 * The cached value of the '{@link #getLanguageType() <em>Language Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageType()
	 * @generated
	 * @ordered
	 */
	protected LanguageType languageType = LANGUAGE_TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LanguageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.LANGUAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LanguageType getLanguageType() {
		return languageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageType(LanguageType newLanguageType) {
		LanguageType oldLanguageType = languageType;
		languageType = newLanguageType == null ? LANGUAGE_TYPE_EDEFAULT : newLanguageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.LANGUAGE_ELEMENT__LANGUAGE_TYPE, oldLanguageType, languageType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.LANGUAGE_ELEMENT__DECORATION_TYPE, oldDecorationType, decorationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.LANGUAGE_ELEMENT__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EZRealtimePackage.LANGUAGE_ELEMENT__LANGUAGE_TYPE:
				return getLanguageType();
			case EZRealtimePackage.LANGUAGE_ELEMENT__DECORATION_TYPE:
				return getDecorationType();
			case EZRealtimePackage.LANGUAGE_ELEMENT__BODY:
				return getBody();
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
			case EZRealtimePackage.LANGUAGE_ELEMENT__LANGUAGE_TYPE:
				setLanguageType((LanguageType)newValue);
				return;
			case EZRealtimePackage.LANGUAGE_ELEMENT__DECORATION_TYPE:
				setDecorationType((ElementDecorationType)newValue);
				return;
			case EZRealtimePackage.LANGUAGE_ELEMENT__BODY:
				setBody((String)newValue);
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
			case EZRealtimePackage.LANGUAGE_ELEMENT__LANGUAGE_TYPE:
				setLanguageType(LANGUAGE_TYPE_EDEFAULT);
				return;
			case EZRealtimePackage.LANGUAGE_ELEMENT__DECORATION_TYPE:
				setDecorationType(DECORATION_TYPE_EDEFAULT);
				return;
			case EZRealtimePackage.LANGUAGE_ELEMENT__BODY:
				setBody(BODY_EDEFAULT);
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
			case EZRealtimePackage.LANGUAGE_ELEMENT__LANGUAGE_TYPE:
				return languageType != LANGUAGE_TYPE_EDEFAULT;
			case EZRealtimePackage.LANGUAGE_ELEMENT__DECORATION_TYPE:
				return decorationType != DECORATION_TYPE_EDEFAULT;
			case EZRealtimePackage.LANGUAGE_ELEMENT__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
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
		result.append(" (languageType: ");
		result.append(languageType);
		result.append(", decorationType: ");
		result.append(decorationType);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} //LanguageElementImpl
