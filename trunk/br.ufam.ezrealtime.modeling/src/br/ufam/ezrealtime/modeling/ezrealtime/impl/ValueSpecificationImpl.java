/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime.impl;

import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage;
import br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType;
import br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl#getPhase <em>Phase</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl#getPower <em>Power</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl#getSchedulingType <em>Scheduling Type</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl#getComputing <em>Computing</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl#getDeadline <em>Deadline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueSpecificationImpl extends EObjectImpl implements ValueSpecification {
	/**
	 * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected int period = PERIOD_EDEFAULT;

	/**
	 * This is true if the Period attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean periodESet;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final int PHASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected int phase = PHASE_EDEFAULT;

	/**
	 * This is true if the Phase attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean phaseESet;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final int POWER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected int power = POWER_EDEFAULT;

	/**
	 * This is true if the Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerESet;

	/**
	 * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected static final int RELEASE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected int release = RELEASE_EDEFAULT;

	/**
	 * This is true if the Release attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean releaseESet;

	/**
	 * The default value of the '{@link #getSchedulingType() <em>Scheduling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingType()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingType SCHEDULING_TYPE_EDEFAULT = SchedulingType.PREEMPTIVE;

	/**
	 * The cached value of the '{@link #getSchedulingType() <em>Scheduling Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingType()
	 * @generated
	 * @ordered
	 */
	protected SchedulingType schedulingType = SCHEDULING_TYPE_EDEFAULT;

	/**
	 * This is true if the Scheduling Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schedulingTypeESet;

	/**
	 * The default value of the '{@link #getComputing() <em>Computing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputing()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPUTING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getComputing() <em>Computing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComputing()
	 * @generated
	 * @ordered
	 */
	protected int computing = COMPUTING_EDEFAULT;

	/**
	 * This is true if the Computing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean computingESet;

	/**
	 * The default value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected static final int DEADLINE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected int deadline = DEADLINE_EDEFAULT;

	/**
	 * This is true if the Deadline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deadlineESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.VALUE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(int newPeriod) {
		int oldPeriod = period;
		period = newPeriod;
		boolean oldPeriodESet = periodESet;
		periodESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.VALUE_SPECIFICATION__PERIOD, oldPeriod, period, !oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPeriod() {
		int oldPeriod = period;
		boolean oldPeriodESet = periodESet;
		period = PERIOD_EDEFAULT;
		periodESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EZRealtimePackage.VALUE_SPECIFICATION__PERIOD, oldPeriod, PERIOD_EDEFAULT, oldPeriodESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPeriod() {
		return periodESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(int newPhase) {
		int oldPhase = phase;
		phase = newPhase;
		boolean oldPhaseESet = phaseESet;
		phaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.VALUE_SPECIFICATION__PHASE, oldPhase, phase, !oldPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPhase() {
		int oldPhase = phase;
		boolean oldPhaseESet = phaseESet;
		phase = PHASE_EDEFAULT;
		phaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EZRealtimePackage.VALUE_SPECIFICATION__PHASE, oldPhase, PHASE_EDEFAULT, oldPhaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPhase() {
		return phaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(int newPower) {
		int oldPower = power;
		power = newPower;
		boolean oldPowerESet = powerESet;
		powerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.VALUE_SPECIFICATION__POWER, oldPower, power, !oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPower() {
		int oldPower = power;
		boolean oldPowerESet = powerESet;
		power = POWER_EDEFAULT;
		powerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EZRealtimePackage.VALUE_SPECIFICATION__POWER, oldPower, POWER_EDEFAULT, oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPower() {
		return powerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRelease() {
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(int newRelease) {
		int oldRelease = release;
		release = newRelease;
		boolean oldReleaseESet = releaseESet;
		releaseESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.VALUE_SPECIFICATION__RELEASE, oldRelease, release, !oldReleaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRelease() {
		int oldRelease = release;
		boolean oldReleaseESet = releaseESet;
		release = RELEASE_EDEFAULT;
		releaseESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EZRealtimePackage.VALUE_SPECIFICATION__RELEASE, oldRelease, RELEASE_EDEFAULT, oldReleaseESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelease() {
		return releaseESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingType getSchedulingType() {
		return schedulingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingType(SchedulingType newSchedulingType) {
		SchedulingType oldSchedulingType = schedulingType;
		schedulingType = newSchedulingType == null ? SCHEDULING_TYPE_EDEFAULT : newSchedulingType;
		boolean oldSchedulingTypeESet = schedulingTypeESet;
		schedulingTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.VALUE_SPECIFICATION__SCHEDULING_TYPE, oldSchedulingType, schedulingType, !oldSchedulingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSchedulingType() {
		SchedulingType oldSchedulingType = schedulingType;
		boolean oldSchedulingTypeESet = schedulingTypeESet;
		schedulingType = SCHEDULING_TYPE_EDEFAULT;
		schedulingTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EZRealtimePackage.VALUE_SPECIFICATION__SCHEDULING_TYPE, oldSchedulingType, SCHEDULING_TYPE_EDEFAULT, oldSchedulingTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSchedulingType() {
		return schedulingTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getComputing() {
		return computing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComputing(int newComputing) {
		int oldComputing = computing;
		computing = newComputing;
		boolean oldComputingESet = computingESet;
		computingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.VALUE_SPECIFICATION__COMPUTING, oldComputing, computing, !oldComputingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetComputing() {
		int oldComputing = computing;
		boolean oldComputingESet = computingESet;
		computing = COMPUTING_EDEFAULT;
		computingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EZRealtimePackage.VALUE_SPECIFICATION__COMPUTING, oldComputing, COMPUTING_EDEFAULT, oldComputingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetComputing() {
		return computingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(int newDeadline) {
		int oldDeadline = deadline;
		deadline = newDeadline;
		boolean oldDeadlineESet = deadlineESet;
		deadlineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.VALUE_SPECIFICATION__DEADLINE, oldDeadline, deadline, !oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeadline() {
		int oldDeadline = deadline;
		boolean oldDeadlineESet = deadlineESet;
		deadline = DEADLINE_EDEFAULT;
		deadlineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, EZRealtimePackage.VALUE_SPECIFICATION__DEADLINE, oldDeadline, DEADLINE_EDEFAULT, oldDeadlineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeadline() {
		return deadlineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EZRealtimePackage.VALUE_SPECIFICATION__PERIOD:
				return getPeriod();
			case EZRealtimePackage.VALUE_SPECIFICATION__PHASE:
				return getPhase();
			case EZRealtimePackage.VALUE_SPECIFICATION__POWER:
				return getPower();
			case EZRealtimePackage.VALUE_SPECIFICATION__RELEASE:
				return getRelease();
			case EZRealtimePackage.VALUE_SPECIFICATION__SCHEDULING_TYPE:
				return getSchedulingType();
			case EZRealtimePackage.VALUE_SPECIFICATION__COMPUTING:
				return getComputing();
			case EZRealtimePackage.VALUE_SPECIFICATION__DEADLINE:
				return getDeadline();
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
			case EZRealtimePackage.VALUE_SPECIFICATION__PERIOD:
				setPeriod((Integer)newValue);
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__PHASE:
				setPhase((Integer)newValue);
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__POWER:
				setPower((Integer)newValue);
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__RELEASE:
				setRelease((Integer)newValue);
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__SCHEDULING_TYPE:
				setSchedulingType((SchedulingType)newValue);
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__COMPUTING:
				setComputing((Integer)newValue);
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__DEADLINE:
				setDeadline((Integer)newValue);
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
			case EZRealtimePackage.VALUE_SPECIFICATION__PERIOD:
				unsetPeriod();
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__PHASE:
				unsetPhase();
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__POWER:
				unsetPower();
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__RELEASE:
				unsetRelease();
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__SCHEDULING_TYPE:
				unsetSchedulingType();
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__COMPUTING:
				unsetComputing();
				return;
			case EZRealtimePackage.VALUE_SPECIFICATION__DEADLINE:
				unsetDeadline();
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
			case EZRealtimePackage.VALUE_SPECIFICATION__PERIOD:
				return isSetPeriod();
			case EZRealtimePackage.VALUE_SPECIFICATION__PHASE:
				return isSetPhase();
			case EZRealtimePackage.VALUE_SPECIFICATION__POWER:
				return isSetPower();
			case EZRealtimePackage.VALUE_SPECIFICATION__RELEASE:
				return isSetRelease();
			case EZRealtimePackage.VALUE_SPECIFICATION__SCHEDULING_TYPE:
				return isSetSchedulingType();
			case EZRealtimePackage.VALUE_SPECIFICATION__COMPUTING:
				return isSetComputing();
			case EZRealtimePackage.VALUE_SPECIFICATION__DEADLINE:
				return isSetDeadline();
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
		result.append(" (period: ");
		if (periodESet) result.append(period); else result.append("<unset>");
		result.append(", phase: ");
		if (phaseESet) result.append(phase); else result.append("<unset>");
		result.append(", power: ");
		if (powerESet) result.append(power); else result.append("<unset>");
		result.append(", release: ");
		if (releaseESet) result.append(release); else result.append("<unset>");
		result.append(", schedulingType: ");
		if (schedulingTypeESet) result.append(schedulingType); else result.append("<unset>");
		result.append(", computing: ");
		if (computingESet) result.append(computing); else result.append("<unset>");
		result.append(", deadline: ");
		if (deadlineESet) result.append(deadline); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ValueSpecificationImpl
