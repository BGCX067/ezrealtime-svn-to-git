/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPeriod <em>Period</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPhase <em>Phase</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPower <em>Power</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getRelease <em>Release</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getSchedulingType <em>Scheduling Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getComputing <em>Computing</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getDeadline <em>Deadline</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getValueSpecification()
 * @model
 * @generated
 */
public interface ValueSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Period</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #setPeriod(int)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getValueSpecification_Period()
	 * @model default="0" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='period'"
	 * @generated
	 */
	int getPeriod();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #isSetPeriod()
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(int)
	 * @generated
	 */
	void unsetPeriod();

	/**
	 * Returns whether the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPeriod <em>Period</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Period</em>' attribute is set.
	 * @see #unsetPeriod()
	 * @see #getPeriod()
	 * @see #setPeriod(int)
	 * @generated
	 */
	boolean isSetPeriod();

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #setPhase(int)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getValueSpecification_Phase()
	 * @model default="0" unique="false" unsettable="true"
	 *        extendedMetaData="kind='element' name='phase'"
	 * @generated
	 */
	int getPhase();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhase()
	 * @see #getPhase()
	 * @see #setPhase(int)
	 * @generated
	 */
	void unsetPhase();

	/**
	 * Returns whether the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPhase <em>Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase</em>' attribute is set.
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @see #setPhase(int)
	 * @generated
	 */
	boolean isSetPhase();

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Power</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #setPower(int)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getValueSpecification_Power()
	 * @model default="0" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='power'"
	 * @generated
	 */
	int getPower();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #getPower()
	 * @generated
	 */
	void setPower(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPower()
	 * @see #getPower()
	 * @see #setPower(int)
	 * @generated
	 */
	void unsetPower();

	/**
	 * Returns whether the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPower <em>Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power</em>' attribute is set.
	 * @see #unsetPower()
	 * @see #getPower()
	 * @see #setPower(int)
	 * @generated
	 */
	boolean isSetPower();

	/**
	 * Returns the value of the '<em><b>Release</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' attribute.
	 * @see #isSetRelease()
	 * @see #unsetRelease()
	 * @see #setRelease(int)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getValueSpecification_Release()
	 * @model default="0" unique="false" unsettable="true"
	 *        extendedMetaData="kind='element' name='release'"
	 * @generated
	 */
	int getRelease();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' attribute.
	 * @see #isSetRelease()
	 * @see #unsetRelease()
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getRelease <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelease()
	 * @see #getRelease()
	 * @see #setRelease(int)
	 * @generated
	 */
	void unsetRelease();

	/**
	 * Returns whether the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getRelease <em>Release</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Release</em>' attribute is set.
	 * @see #unsetRelease()
	 * @see #getRelease()
	 * @see #setRelease(int)
	 * @generated
	 */
	boolean isSetRelease();

	/**
	 * Returns the value of the '<em><b>Scheduling Type</b></em>' attribute.
	 * The default value is <code>"P"</code>.
	 * The literals are from the enumeration {@link br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType
	 * @see #isSetSchedulingType()
	 * @see #unsetSchedulingType()
	 * @see #setSchedulingType(SchedulingType)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getValueSpecification_SchedulingType()
	 * @model default="P" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='schedulingMode'"
	 * @generated
	 */
	SchedulingType getSchedulingType();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getSchedulingType <em>Scheduling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Type</em>' attribute.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType
	 * @see #isSetSchedulingType()
	 * @see #unsetSchedulingType()
	 * @see #getSchedulingType()
	 * @generated
	 */
	void setSchedulingType(SchedulingType value);

	/**
	 * Unsets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getSchedulingType <em>Scheduling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchedulingType()
	 * @see #getSchedulingType()
	 * @see #setSchedulingType(SchedulingType)
	 * @generated
	 */
	void unsetSchedulingType();

	/**
	 * Returns whether the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getSchedulingType <em>Scheduling Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scheduling Type</em>' attribute is set.
	 * @see #unsetSchedulingType()
	 * @see #getSchedulingType()
	 * @see #setSchedulingType(SchedulingType)
	 * @generated
	 */
	boolean isSetSchedulingType();

	/**
	 * Returns the value of the '<em><b>Computing</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computing</em>' attribute.
	 * @see #isSetComputing()
	 * @see #unsetComputing()
	 * @see #setComputing(int)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getValueSpecification_Computing()
	 * @model default="0" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='computing'"
	 * @generated
	 */
	int getComputing();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getComputing <em>Computing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Computing</em>' attribute.
	 * @see #isSetComputing()
	 * @see #unsetComputing()
	 * @see #getComputing()
	 * @generated
	 */
	void setComputing(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getComputing <em>Computing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetComputing()
	 * @see #getComputing()
	 * @see #setComputing(int)
	 * @generated
	 */
	void unsetComputing();

	/**
	 * Returns whether the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getComputing <em>Computing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Computing</em>' attribute is set.
	 * @see #unsetComputing()
	 * @see #getComputing()
	 * @see #setComputing(int)
	 * @generated
	 */
	boolean isSetComputing();

	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #setDeadline(int)
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getValueSpecification_Deadline()
	 * @model default="0" unique="false" unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='deadline'"
	 * @generated
	 */
	int getDeadline();

	/**
	 * Sets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(int value);

	/**
	 * Unsets the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(int)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getDeadline <em>Deadline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadline</em>' attribute is set.
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(int)
	 * @generated
	 */
	boolean isSetDeadline();

} // ValueSpecification
