/*
 * Copyright (c) 2007 Fabiano Cruz - UFAM and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package br.ufam.pnmp.ezrealtime.impl;

import br.ufam.pnmp.ezrealtime.EZRealtimeFactory;
import br.ufam.pnmp.ezrealtime.EZRealtimePackage;
import br.ufam.pnmp.ezrealtime.EZRealtimeSpec;
import br.ufam.pnmp.ezrealtime.Message;
import br.ufam.pnmp.ezrealtime.Processor;
import br.ufam.pnmp.ezrealtime.SchedulingType;
import br.ufam.pnmp.ezrealtime.SourceCode;
import br.ufam.pnmp.ezrealtime.Task;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EZRealtimePackageImpl extends EPackageImpl implements
		EZRealtimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ezRealtimeSpecEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType schedulingTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see br.ufam.pnmp.ezrealtime.EZRealtimePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EZRealtimePackageImpl() {
		super(eNS_URI, EZRealtimeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EZRealtimePackage init() {
		if (isInited)
			return (EZRealtimePackage) EPackage.Registry.INSTANCE
					.getEPackage(EZRealtimePackage.eNS_URI);

		// Obtain or create and register package
		EZRealtimePackageImpl theEZRealtimePackage = (EZRealtimePackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof EZRealtimePackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new EZRealtimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEZRealtimePackage.createPackageContents();

		// Initialize created meta-data
		theEZRealtimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEZRealtimePackage.freeze();

		return theEZRealtimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEZRealtimeSpec() {
		return ezRealtimeSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZRealtimeSpec_Task() {
		return (EReference) ezRealtimeSpecEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZRealtimeSpec_Processor() {
		return (EReference) ezRealtimeSpecEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEZRealtimeSpec_Message() {
		return (EReference) ezRealtimeSpecEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_PrecedesTasks() {
		return (EReference) taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_PrecedesMessages() {
		return (EReference) taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ExcludesTasks() {
		return (EReference) taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Processor() {
		return (EReference) taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Name() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Period() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Phase() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Power() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Release() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_SchedulingMode() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Computing() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Deadline() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Oid() {
		return (EAttribute) taskEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Precedes() {
		return (EReference) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Name() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Bus() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_GrantBus() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Communication() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Oid() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcessor() {
		return processorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Oid() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcessor_Name() {
		return (EAttribute) processorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceCode() {
		return sourceCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSourceCode_Content() {
		return (EAttribute) sourceCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingType() {
		return schedulingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSchedulingTypeObject() {
		return schedulingTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZRealtimeFactory getEZRealtimeFactory() {
		return (EZRealtimeFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		ezRealtimeSpecEClass = createEClass(EZ_REALTIME_SPEC);
		createEReference(ezRealtimeSpecEClass, EZ_REALTIME_SPEC__TASK);
		createEReference(ezRealtimeSpecEClass, EZ_REALTIME_SPEC__PROCESSOR);
		createEReference(ezRealtimeSpecEClass, EZ_REALTIME_SPEC__MESSAGE);

		taskEClass = createEClass(TASK);
		createEReference(taskEClass, TASK__PRECEDES_TASKS);
		createEReference(taskEClass, TASK__PRECEDES_MESSAGES);
		createEReference(taskEClass, TASK__EXCLUDES_TASKS);
		createEReference(taskEClass, TASK__PROCESSOR);
		createEAttribute(taskEClass, TASK__NAME);
		createEAttribute(taskEClass, TASK__PERIOD);
		createEAttribute(taskEClass, TASK__PHASE);
		createEAttribute(taskEClass, TASK__POWER);
		createEAttribute(taskEClass, TASK__RELEASE);
		createEAttribute(taskEClass, TASK__SCHEDULING_MODE);
		createEAttribute(taskEClass, TASK__COMPUTING);
		createEAttribute(taskEClass, TASK__DEADLINE);
		createEAttribute(taskEClass, TASK__OID);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__PRECEDES);
		createEAttribute(messageEClass, MESSAGE__NAME);
		createEAttribute(messageEClass, MESSAGE__BUS);
		createEAttribute(messageEClass, MESSAGE__GRANT_BUS);
		createEAttribute(messageEClass, MESSAGE__COMMUNICATION);
		createEAttribute(messageEClass, MESSAGE__OID);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__OID);
		createEAttribute(processorEClass, PROCESSOR__NAME);

		sourceCodeEClass = createEClass(SOURCE_CODE);
		createEAttribute(sourceCodeEClass, SOURCE_CODE__CONTENT);

		// Create enums
		schedulingTypeEEnum = createEEnum(SCHEDULING_TYPE);

		// Create data types
		schedulingTypeObjectEDataType = createEDataType(SCHEDULING_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(ezRealtimeSpecEClass, EZRealtimeSpec.class,
				"EZRealtimeSpec", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEZRealtimeSpec_Task(), this.getTask(), null, "task",
				null, 1, -1, EZRealtimeSpec.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEZRealtimeSpec_Task().getEKeys().add(this.getTask_Oid());
		initEReference(getEZRealtimeSpec_Processor(), this.getProcessor(),
				null, "processor", null, 1, -1, EZRealtimeSpec.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		getEZRealtimeSpec_Processor().getEKeys().add(this.getProcessor_Oid());
		initEReference(getEZRealtimeSpec_Message(), this.getMessage(), null,
				"message", null, 0, -1, EZRealtimeSpec.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getEZRealtimeSpec_Message().getEKeys().add(this.getMessage_Oid());

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTask_PrecedesTasks(), this.getTask(), this
				.getTask_ExcludesTasks(), "precedesTasks", null, 0, -1,
				Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		getTask_PrecedesTasks().getEKeys().add(this.getTask_Oid());
		initEReference(getTask_PrecedesMessages(), this.getMessage(), null,
				"precedesMessages", null, 0, -1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getTask_PrecedesMessages().getEKeys().add(this.getMessage_Oid());
		initEReference(getTask_ExcludesTasks(), this.getTask(), this
				.getTask_PrecedesTasks(), "excludesTasks", null, 0, -1,
				Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		getTask_ExcludesTasks().getEKeys().add(this.getTask_Oid());
		initEReference(getTask_Processor(), this.getProcessor(), null,
				"processor", null, 0, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		getTask_Processor().getEKeys().add(this.getProcessor_Oid());
		initEAttribute(getTask_Name(), theXMLTypePackage.getString(), "name",
				null, 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_Period(), theXMLTypePackage.getInt(), "period",
				"0", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_Phase(), theXMLTypePackage.getInt(), "phase",
				"0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_Power(), theXMLTypePackage.getInt(), "power",
				"0", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_Release(), theXMLTypePackage.getInt(),
				"release", "0", 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_SchedulingMode(), this.getSchedulingType(),
				"schedulingMode", "P", 1, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Computing(), theXMLTypePackage.getInt(),
				"computing", "0", 1, 1, Task.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Deadline(), theXMLTypePackage.getInt(),
				"deadline", "0", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTask_Oid(), theXMLTypePackage.getID(), "oid",
				"ez123", 1, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Precedes(), this.getTask(), null, "precedes",
				null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getMessage_Precedes().getEKeys().add(this.getTask_Oid());
		initEAttribute(getMessage_Name(), theXMLTypePackage.getString(),
				"name", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMessage_Bus(), theXMLTypePackage.getString(), "bus",
				null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMessage_GrantBus(), theXMLTypePackage.getInt(),
				"grantBus", "0", 1, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Communication(), theXMLTypePackage.getInt(),
				"communication", "0", 1, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Oid(), theXMLTypePackage.getID(), "oid",
				null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Oid(), theXMLTypePackage.getID(), "oid",
				null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getProcessor_Name(), theXMLTypePackage.getString(),
				"name", null, 1, 1, Processor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceCodeEClass, SourceCode.class, "SourceCode",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceCode_Content(), theXMLTypePackage.getString(),
				"content", null, 1, 1, SourceCode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(schedulingTypeEEnum, SchedulingType.class, "SchedulingType");
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.P);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.NP);

		// Initialize data types
		initEDataType(schedulingTypeObjectEDataType, SchedulingType.class,
				"SchedulingTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(ezRealtimeSpecEClass, source, new String[] { "name",
				"ez-spec", "kind", "elementOnly" });
		addAnnotation(getEZRealtimeSpec_Task(), source, new String[] { "kind",
				"element", "name", "Task" });
		addAnnotation(getEZRealtimeSpec_Processor(), source, new String[] {
				"kind", "element", "name", "processor" });
		addAnnotation(getEZRealtimeSpec_Message(), source, new String[] {
				"kind", "element", "name", "message" });
		addAnnotation(taskEClass, source, new String[] { "name", "Task",
				"kind", "elementOnly" });
		addAnnotation(getTask_Processor(), source, new String[] { "kind",
				"element", "name", "processor" });
		addAnnotation(getTask_Name(), source, new String[] { "kind", "element",
				"name", "name" });
		addAnnotation(getTask_Period(), source, new String[] { "kind",
				"element", "name", "period" });
		addAnnotation(getTask_Phase(), source, new String[] { "kind",
				"element", "name", "phase" });
		addAnnotation(getTask_Power(), source, new String[] { "kind",
				"element", "name", "power" });
		addAnnotation(getTask_Release(), source, new String[] { "kind",
				"element", "name", "release" });
		addAnnotation(getTask_SchedulingMode(), source, new String[] { "kind",
				"element", "name", "schedulingMode" });
		addAnnotation(getTask_Computing(), source, new String[] { "kind",
				"element", "name", "computing" });
		addAnnotation(getTask_Deadline(), source, new String[] { "kind",
				"element", "name", "deadline" });
		addAnnotation(getTask_Oid(), source, new String[] { "kind",
				"attribute", "name", "identifier" });
		addAnnotation(messageEClass, source, new String[] { "name", "Message",
				"kind", "elementOnly" });
		addAnnotation(getMessage_Name(), source, new String[] { "kind",
				"element", "name", "name" });
		addAnnotation(getMessage_Bus(), source, new String[] { "kind",
				"element", "name", "bus" });
		addAnnotation(getMessage_GrantBus(), source, new String[] { "kind",
				"element", "name", "grantBus" });
		addAnnotation(getMessage_Communication(), source, new String[] {
				"kind", "element", "name", "communication" });
		addAnnotation(getMessage_Oid(), source, new String[] { "kind",
				"attribute", "name", "identifier" });
		addAnnotation(processorEClass, source, new String[] { "name",
				"Processor", "kind", "elementOnly" });
		addAnnotation(getProcessor_Oid(), source, new String[] { "kind",
				"attribute", "name", "identifier" });
		addAnnotation(getProcessor_Name(), source, new String[] { "kind",
				"element", "name", "name" });
		addAnnotation(sourceCodeEClass, source, new String[] { "name",
				"SourceCode", "kind", "elementOnly" });
		addAnnotation(getSourceCode_Content(), source, new String[] { "kind",
				"element", "name", "content" });
		addAnnotation(schedulingTypeEEnum, source, new String[] { "name",
				"SchedulingType" });
		addAnnotation(schedulingTypeObjectEDataType, source, new String[] {
				"name", "SchedulingType:Object", "baseType", "SchedulingType" });
	}

} //EZRealtimePackageImpl
