/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime.impl;

import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage;
import br.ufam.ezrealtime.modeling.ezrealtime.File;
import br.ufam.ezrealtime.modeling.ezrealtime.Processor;
import br.ufam.ezrealtime.modeling.ezrealtime.Task;
import br.ufam.ezrealtime.modeling.ezrealtime.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.FileImpl#getOwnedVariables <em>Owned Variables</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.FileImpl#getOwnedTasks <em>Owned Tasks</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.FileImpl#getProcessor <em>Processor</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.FileImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends LabeledElementImpl implements File {
	/**
	 * The cached value of the '{@link #getOwnedVariables() <em>Owned Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> ownedVariables;

	/**
	 * The cached value of the '{@link #getOwnedTasks() <em>Owned Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> ownedTasks;

	/**
	 * The cached value of the '{@link #getProcessor() <em>Processor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Processor> processor;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<File> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getOwnedVariables() {
		if (ownedVariables == null) {
			ownedVariables = new EObjectContainmentEList<Variable>(Variable.class, this, EZRealtimePackage.FILE__OWNED_VARIABLES);
		}
		return ownedVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getOwnedTasks() {
		if (ownedTasks == null) {
			ownedTasks = new EObjectContainmentEList<Task>(Task.class, this, EZRealtimePackage.FILE__OWNED_TASKS);
		}
		return ownedTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Processor> getProcessor() {
		if (processor == null) {
			processor = new EObjectResolvingEList<Processor>(Processor.class, this, EZRealtimePackage.FILE__PROCESSOR);
		}
		return processor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectResolvingEList<File>(File.class, this, EZRealtimePackage.FILE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EZRealtimePackage.FILE__OWNED_VARIABLES:
				return ((InternalEList<?>)getOwnedVariables()).basicRemove(otherEnd, msgs);
			case EZRealtimePackage.FILE__OWNED_TASKS:
				return ((InternalEList<?>)getOwnedTasks()).basicRemove(otherEnd, msgs);
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
			case EZRealtimePackage.FILE__OWNED_VARIABLES:
				return getOwnedVariables();
			case EZRealtimePackage.FILE__OWNED_TASKS:
				return getOwnedTasks();
			case EZRealtimePackage.FILE__PROCESSOR:
				return getProcessor();
			case EZRealtimePackage.FILE__DEPENDENCIES:
				return getDependencies();
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
			case EZRealtimePackage.FILE__OWNED_VARIABLES:
				getOwnedVariables().clear();
				getOwnedVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case EZRealtimePackage.FILE__OWNED_TASKS:
				getOwnedTasks().clear();
				getOwnedTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case EZRealtimePackage.FILE__PROCESSOR:
				getProcessor().clear();
				getProcessor().addAll((Collection<? extends Processor>)newValue);
				return;
			case EZRealtimePackage.FILE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends File>)newValue);
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
			case EZRealtimePackage.FILE__OWNED_VARIABLES:
				getOwnedVariables().clear();
				return;
			case EZRealtimePackage.FILE__OWNED_TASKS:
				getOwnedTasks().clear();
				return;
			case EZRealtimePackage.FILE__PROCESSOR:
				getProcessor().clear();
				return;
			case EZRealtimePackage.FILE__DEPENDENCIES:
				getDependencies().clear();
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
			case EZRealtimePackage.FILE__OWNED_VARIABLES:
				return ownedVariables != null && !ownedVariables.isEmpty();
			case EZRealtimePackage.FILE__OWNED_TASKS:
				return ownedTasks != null && !ownedTasks.isEmpty();
			case EZRealtimePackage.FILE__PROCESSOR:
				return processor != null && !processor.isEmpty();
			case EZRealtimePackage.FILE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileImpl
