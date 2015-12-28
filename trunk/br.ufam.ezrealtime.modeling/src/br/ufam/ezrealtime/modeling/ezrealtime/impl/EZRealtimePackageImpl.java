/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime.impl;

import br.ufam.ezrealtime.modeling.ezrealtime.Block;
import br.ufam.ezrealtime.modeling.ezrealtime.CLangKeywordsType;
import br.ufam.ezrealtime.modeling.ezrealtime.CodeSnippet;
import br.ufam.ezrealtime.modeling.ezrealtime.Comment;
import br.ufam.ezrealtime.modeling.ezrealtime.Constraint;
import br.ufam.ezrealtime.modeling.ezrealtime.Datatype;
import br.ufam.ezrealtime.modeling.ezrealtime.Diagram;
import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimeFactory;
import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage;
import br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType;
import br.ufam.ezrealtime.modeling.ezrealtime.EntryPoint;
import br.ufam.ezrealtime.modeling.ezrealtime.EnumerationType;
import br.ufam.ezrealtime.modeling.ezrealtime.File;
import br.ufam.ezrealtime.modeling.ezrealtime.IntegralType;
import br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement;
import br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement;
import br.ufam.ezrealtime.modeling.ezrealtime.LanguageType;
import br.ufam.ezrealtime.modeling.ezrealtime.Message;
import br.ufam.ezrealtime.modeling.ezrealtime.ModelElement;
import br.ufam.ezrealtime.modeling.ezrealtime.Module;
import br.ufam.ezrealtime.modeling.ezrealtime.Parameter;
import br.ufam.ezrealtime.modeling.ezrealtime.PreInit;
import br.ufam.ezrealtime.modeling.ezrealtime.PrimitiveDataType;
import br.ufam.ezrealtime.modeling.ezrealtime.Processor;
import br.ufam.ezrealtime.modeling.ezrealtime.RecordType;
import br.ufam.ezrealtime.modeling.ezrealtime.Relationship;
import br.ufam.ezrealtime.modeling.ezrealtime.RelationshipType;
import br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType;
import br.ufam.ezrealtime.modeling.ezrealtime.StructureType;
import br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType;
import br.ufam.ezrealtime.modeling.ezrealtime.Task;
import br.ufam.ezrealtime.modeling.ezrealtime.UnionType;
import br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification;
import br.ufam.ezrealtime.modeling.ezrealtime.Variable;
import br.ufam.ezrealtime.modeling.ezrealtime.VariantType;
import br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class EZRealtimePackageImpl extends EPackageImpl implements EZRealtimePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labeledElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass languageElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeSnippetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preInitEClass = null;

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
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

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
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datatypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integralTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityTypeEEnum = null;

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
	private EEnum relationshipTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementDecorationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cLangKeywordsTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recordTypeEEnum = null;

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
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#eNS_URI
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
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EZRealtimePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EZRealtimePackage init() {
		if (isInited) return (EZRealtimePackage)EPackage.Registry.INSTANCE.getEPackage(EZRealtimePackage.eNS_URI);

		// Obtain or create and register package
		EZRealtimePackageImpl theEZRealtimePackage = (EZRealtimePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EZRealtimePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EZRealtimePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEZRealtimePackage.createPackageContents();

		// Initialize created meta-data
		theEZRealtimePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEZRealtimePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EZRealtimePackage.eNS_URI, theEZRealtimePackage);
		return theEZRealtimePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Title() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_Author() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagram_LastModified() {
		return (EAttribute)diagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedEntryPoint() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedFiles() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedModules() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedRelations() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedConstraints() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedStructuredDataTypes() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedCodeSnippets() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedPreInit() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagram_OwnedComments() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelElement() {
		return modelElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_OwnedConstraint() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_OwnedComments() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelElement_OwnedCodeSnippet() {
		return (EReference)modelElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabeledElement() {
		return labeledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledElement_Name() {
		return (EAttribute)labeledElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabeledElement_DecorationType() {
		return (EAttribute)labeledElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLanguageElement() {
		return languageElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageElement_LanguageType() {
		return (EAttribute)languageElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageElement_DecorationType() {
		return (EAttribute)languageElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLanguageElement_Body() {
		return (EAttribute)languageElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_OwnedVariables() {
		return (EReference)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_OwnedTasks() {
		return (EReference)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Processor() {
		return (EReference)fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFile_Dependencies() {
		return (EReference)fileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryPoint() {
		return entryPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryPoint_PreInit() {
		return (EReference)entryPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModule_ModelElement() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeSnippet() {
		return codeSnippetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreInit() {
		return preInitEClass;
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
	public EAttribute getTask_Visibility() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_ReturnType() {
		return (EReference)taskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTask_Identifier() {
		return (EAttribute)taskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_OwnedParameters() {
		return (EReference)taskEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_Dependecies() {
		return (EReference)taskEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_OwnedLanguageElement() {
		return (EReference)taskEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Type() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Value() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Visibility() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_TypeName() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Identifier() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_AssignmentSymbol() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
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
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Bus() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_GrantBus() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Communication() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getProcessor_Name() {
		return (EAttribute)processorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSpecification_Period() {
		return (EAttribute)valueSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSpecification_Phase() {
		return (EAttribute)valueSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSpecification_Power() {
		return (EAttribute)valueSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSpecification_Release() {
		return (EAttribute)valueSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSpecification_SchedulingType() {
		return (EAttribute)valueSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSpecification_Computing() {
		return (EAttribute)valueSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueSpecification_Deadline() {
		return (EAttribute)valueSpecificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Label() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationship_Type() {
		return (EAttribute)relationshipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatatype() {
		return datatypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDataType() {
		return primitiveDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredDataType() {
		return structuredDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredDataType_OwnedStructures() {
		return (EReference)structuredDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegralType() {
		return integralTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructureType() {
		return structureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureType_RecordType() {
		return (EAttribute)structureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureType_TypeName() {
		return (EAttribute)structureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructureType_Type() {
		return (EReference)structureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureType_VariableNames() {
		return (EAttribute)structureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructureType_Variables() {
		return (EAttribute)structureTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnionType() {
		return unionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationType() {
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityType() {
		return visibilityTypeEEnum;
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
	public EEnum getRelationshipType() {
		return relationshipTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariantType() {
		return variantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguageType() {
		return languageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementDecorationType() {
		return elementDecorationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCLangKeywordsType() {
		return cLangKeywordsTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecordType() {
		return recordTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZRealtimeFactory getEZRealtimeFactory() {
		return (EZRealtimeFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		diagramEClass = createEClass(DIAGRAM);
		createEAttribute(diagramEClass, DIAGRAM__TITLE);
		createEAttribute(diagramEClass, DIAGRAM__AUTHOR);
		createEAttribute(diagramEClass, DIAGRAM__LAST_MODIFIED);
		createEReference(diagramEClass, DIAGRAM__OWNED_ENTRY_POINT);
		createEReference(diagramEClass, DIAGRAM__OWNED_FILES);
		createEReference(diagramEClass, DIAGRAM__OWNED_MODULES);
		createEReference(diagramEClass, DIAGRAM__OWNED_RELATIONS);
		createEReference(diagramEClass, DIAGRAM__OWNED_CONSTRAINTS);
		createEReference(diagramEClass, DIAGRAM__OWNED_STRUCTURED_DATA_TYPES);
		createEReference(diagramEClass, DIAGRAM__OWNED_CODE_SNIPPETS);
		createEReference(diagramEClass, DIAGRAM__OWNED_PRE_INIT);
		createEReference(diagramEClass, DIAGRAM__OWNED_COMMENTS);

		modelElementEClass = createEClass(MODEL_ELEMENT);
		createEReference(modelElementEClass, MODEL_ELEMENT__OWNED_CONSTRAINT);
		createEReference(modelElementEClass, MODEL_ELEMENT__OWNED_COMMENTS);
		createEReference(modelElementEClass, MODEL_ELEMENT__OWNED_CODE_SNIPPET);

		commentEClass = createEClass(COMMENT);
		createEAttribute(commentEClass, COMMENT__BODY);

		containerEClass = createEClass(CONTAINER);

		labeledElementEClass = createEClass(LABELED_ELEMENT);
		createEAttribute(labeledElementEClass, LABELED_ELEMENT__NAME);
		createEAttribute(labeledElementEClass, LABELED_ELEMENT__DECORATION_TYPE);

		languageElementEClass = createEClass(LANGUAGE_ELEMENT);
		createEAttribute(languageElementEClass, LANGUAGE_ELEMENT__LANGUAGE_TYPE);
		createEAttribute(languageElementEClass, LANGUAGE_ELEMENT__DECORATION_TYPE);
		createEAttribute(languageElementEClass, LANGUAGE_ELEMENT__BODY);

		fileEClass = createEClass(FILE);
		createEReference(fileEClass, FILE__OWNED_VARIABLES);
		createEReference(fileEClass, FILE__OWNED_TASKS);
		createEReference(fileEClass, FILE__PROCESSOR);
		createEReference(fileEClass, FILE__DEPENDENCIES);

		entryPointEClass = createEClass(ENTRY_POINT);
		createEReference(entryPointEClass, ENTRY_POINT__PRE_INIT);

		moduleEClass = createEClass(MODULE);
		createEReference(moduleEClass, MODULE__MODEL_ELEMENT);

		blockEClass = createEClass(BLOCK);

		codeSnippetEClass = createEClass(CODE_SNIPPET);

		constraintEClass = createEClass(CONSTRAINT);

		preInitEClass = createEClass(PRE_INIT);

		taskEClass = createEClass(TASK);
		createEAttribute(taskEClass, TASK__VISIBILITY);
		createEReference(taskEClass, TASK__RETURN_TYPE);
		createEAttribute(taskEClass, TASK__IDENTIFIER);
		createEReference(taskEClass, TASK__OWNED_PARAMETERS);
		createEReference(taskEClass, TASK__DEPENDECIES);
		createEReference(taskEClass, TASK__OWNED_LANGUAGE_ELEMENT);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__VALUE);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__VISIBILITY);
		createEReference(variableEClass, VARIABLE__TYPE_NAME);
		createEAttribute(variableEClass, VARIABLE__IDENTIFIER);
		createEAttribute(variableEClass, VARIABLE__ASSIGNMENT_SYMBOL);
		createEAttribute(variableEClass, VARIABLE__VALUE);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__PRECEDES);
		createEAttribute(messageEClass, MESSAGE__BUS);
		createEAttribute(messageEClass, MESSAGE__GRANT_BUS);
		createEAttribute(messageEClass, MESSAGE__COMMUNICATION);

		processorEClass = createEClass(PROCESSOR);
		createEAttribute(processorEClass, PROCESSOR__NAME);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);
		createEAttribute(valueSpecificationEClass, VALUE_SPECIFICATION__PERIOD);
		createEAttribute(valueSpecificationEClass, VALUE_SPECIFICATION__PHASE);
		createEAttribute(valueSpecificationEClass, VALUE_SPECIFICATION__POWER);
		createEAttribute(valueSpecificationEClass, VALUE_SPECIFICATION__RELEASE);
		createEAttribute(valueSpecificationEClass, VALUE_SPECIFICATION__SCHEDULING_TYPE);
		createEAttribute(valueSpecificationEClass, VALUE_SPECIFICATION__COMPUTING);
		createEAttribute(valueSpecificationEClass, VALUE_SPECIFICATION__DEADLINE);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);
		createEAttribute(relationshipEClass, RELATIONSHIP__LABEL);
		createEAttribute(relationshipEClass, RELATIONSHIP__TYPE);

		datatypeEClass = createEClass(DATATYPE);

		primitiveDataTypeEClass = createEClass(PRIMITIVE_DATA_TYPE);

		structuredDataTypeEClass = createEClass(STRUCTURED_DATA_TYPE);
		createEReference(structuredDataTypeEClass, STRUCTURED_DATA_TYPE__OWNED_STRUCTURES);

		integralTypeEClass = createEClass(INTEGRAL_TYPE);

		structureTypeEClass = createEClass(STRUCTURE_TYPE);
		createEAttribute(structureTypeEClass, STRUCTURE_TYPE__RECORD_TYPE);
		createEAttribute(structureTypeEClass, STRUCTURE_TYPE__TYPE_NAME);
		createEReference(structureTypeEClass, STRUCTURE_TYPE__TYPE);
		createEAttribute(structureTypeEClass, STRUCTURE_TYPE__VARIABLE_NAMES);
		createEAttribute(structureTypeEClass, STRUCTURE_TYPE__VARIABLES);

		unionTypeEClass = createEClass(UNION_TYPE);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);

		// Create enums
		visibilityTypeEEnum = createEEnum(VISIBILITY_TYPE);
		schedulingTypeEEnum = createEEnum(SCHEDULING_TYPE);
		relationshipTypeEEnum = createEEnum(RELATIONSHIP_TYPE);
		variantTypeEEnum = createEEnum(VARIANT_TYPE);
		languageTypeEEnum = createEEnum(LANGUAGE_TYPE);
		elementDecorationTypeEEnum = createEEnum(ELEMENT_DECORATION_TYPE);
		cLangKeywordsTypeEEnum = createEEnum(CLANG_KEYWORDS_TYPE);
		recordTypeEEnum = createEEnum(RECORD_TYPE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		commentEClass.getESuperTypes().add(this.getModelElement());
		containerEClass.getESuperTypes().add(this.getModelElement());
		labeledElementEClass.getESuperTypes().add(this.getModelElement());
		languageElementEClass.getESuperTypes().add(this.getModelElement());
		fileEClass.getESuperTypes().add(this.getLabeledElement());
		entryPointEClass.getESuperTypes().add(this.getLabeledElement());
		moduleEClass.getESuperTypes().add(this.getContainer());
		blockEClass.getESuperTypes().add(this.getContainer());
		codeSnippetEClass.getESuperTypes().add(this.getLanguageElement());
		constraintEClass.getESuperTypes().add(this.getLanguageElement());
		preInitEClass.getESuperTypes().add(this.getLanguageElement());
		primitiveDataTypeEClass.getESuperTypes().add(this.getDatatype());
		structuredDataTypeEClass.getESuperTypes().add(this.getDatatype());
		structuredDataTypeEClass.getESuperTypes().add(this.getLabeledElement());
		integralTypeEClass.getESuperTypes().add(this.getPrimitiveDataType());
		structureTypeEClass.getESuperTypes().add(this.getStructuredDataType());
		unionTypeEClass.getESuperTypes().add(this.getStructuredDataType());
		enumerationTypeEClass.getESuperTypes().add(this.getPrimitiveDataType());

		// Initialize classes and features; add operations and parameters
		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagram_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_Author(), ecorePackage.getEString(), "author", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagram_LastModified(), ecorePackage.getEDate(), "lastModified", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedEntryPoint(), this.getEntryPoint(), null, "ownedEntryPoint", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedFiles(), this.getFile(), null, "ownedFiles", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedModules(), this.getModule(), null, "ownedModules", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedRelations(), this.getRelationship(), null, "ownedRelations", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedConstraints(), this.getConstraint(), null, "ownedConstraints", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedStructuredDataTypes(), this.getStructuredDataType(), null, "ownedStructuredDataTypes", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedCodeSnippets(), this.getCodeSnippet(), null, "ownedCodeSnippets", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedPreInit(), this.getPreInit(), null, "ownedPreInit", null, 0, 1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_OwnedComments(), this.getComment(), null, "ownedComments", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelElementEClass, ModelElement.class, "ModelElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelElement_OwnedConstraint(), this.getConstraint(), null, "ownedConstraint", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_OwnedComments(), this.getComment(), null, "ownedComments", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelElement_OwnedCodeSnippet(), this.getCodeSnippet(), null, "ownedCodeSnippet", null, 0, 1, ModelElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComment_Body(), ecorePackage.getEString(), "body", "...", 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, br.ufam.ezrealtime.modeling.ezrealtime.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(labeledElementEClass, LabeledElement.class, "LabeledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabeledElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, LabeledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabeledElement_DecorationType(), this.getElementDecorationType(), "decorationType", null, 0, 1, LabeledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(languageElementEClass, LanguageElement.class, "LanguageElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLanguageElement_LanguageType(), this.getLanguageType(), "languageType", null, 0, 1, LanguageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLanguageElement_DecorationType(), this.getElementDecorationType(), "decorationType", null, 1, 1, LanguageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLanguageElement_Body(), ecorePackage.getEString(), "body", null, 0, 1, LanguageElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFile_OwnedVariables(), this.getVariable(), null, "ownedVariables", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_OwnedTasks(), this.getTask(), null, "ownedTasks", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_Processor(), this.getProcessor(), null, "processor", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFile_Dependencies(), this.getFile(), null, "dependencies", null, 0, -1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getFile_Dependencies().getEKeys().add(this.getLabeledElement_Name());

		initEClass(entryPointEClass, EntryPoint.class, "EntryPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryPoint_PreInit(), this.getPreInit(), null, "preInit", null, 0, 1, EntryPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModule_ModelElement(), this.getFile(), null, "modelElement", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeSnippetEClass, CodeSnippet.class, "CodeSnippet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(preInitEClass, PreInit.class, "PreInit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTask_Visibility(), this.getVisibilityType(), "visibility", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_ReturnType(), this.getDatatype(), null, "returnType", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTask_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_OwnedParameters(), this.getParameter(), null, "ownedParameters", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_Dependecies(), this.getTask(), null, "dependecies", null, 0, -1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTask_OwnedLanguageElement(), this.getLanguageElement(), null, "ownedLanguageElement", null, 0, 1, Task.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Type(), ecorePackage.getEString(), "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Visibility(), this.getVisibilityType(), "visibility", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_TypeName(), this.getDatatype(), null, "typeName", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Identifier(), ecorePackage.getEString(), "identifier", null, 0, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_AssignmentSymbol(), ecorePackage.getEString(), "assignmentSymbol", "=", 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Precedes(), this.getTask(), null, "precedes", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Bus(), ecorePackage.getEString(), "bus", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_GrantBus(), theXMLTypePackage.getInt(), "grantBus", "0", 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Communication(), theXMLTypePackage.getInt(), "communication", "0", 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processorEClass, Processor.class, "Processor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessor_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Processor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueSpecification_Period(), ecorePackage.getEInt(), "period", "0", 1, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueSpecification_Phase(), ecorePackage.getEInt(), "phase", "0", 0, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueSpecification_Power(), ecorePackage.getEInt(), "power", "0", 1, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueSpecification_Release(), ecorePackage.getEInt(), "release", "0", 0, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueSpecification_SchedulingType(), this.getSchedulingType(), "schedulingType", "P", 1, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueSpecification_Computing(), ecorePackage.getEInt(), "computing", "0", 1, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getValueSpecification_Deadline(), ecorePackage.getEInt(), "deadline", "0", 1, 1, ValueSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_Source(), this.getModelElement(), null, "source", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationship_Target(), this.getModelElement(), null, "target", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Label(), ecorePackage.getEString(), "label", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationship_Type(), this.getRelationshipType(), "type", null, 0, 1, Relationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveDataTypeEClass, PrimitiveDataType.class, "PrimitiveDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structuredDataTypeEClass, StructuredDataType.class, "StructuredDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredDataType_OwnedStructures(), this.getStructureType(), null, "ownedStructures", null, 0, -1, StructuredDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integralTypeEClass, IntegralType.class, "IntegralType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(structureTypeEClass, StructureType.class, "StructureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructureType_RecordType(), this.getRecordType(), "recordType", "struct", 0, 1, StructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructureType_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, StructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructureType_Type(), this.getDatatype(), null, "type", null, 0, 1, StructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructureType_VariableNames(), ecorePackage.getEString(), "variableNames", null, 0, -1, StructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStructureType_Variables(), ecorePackage.getEString(), "variables", null, 0, -1, StructureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unionTypeEClass, UnionType.class, "UnionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(visibilityTypeEEnum, VisibilityType.class, "VisibilityType");
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PUBLIC);
		addEEnumLiteral(visibilityTypeEEnum, VisibilityType.PRIVATE);

		initEEnum(schedulingTypeEEnum, SchedulingType.class, "SchedulingType");
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.PREEMPTIVE);
		addEEnumLiteral(schedulingTypeEEnum, SchedulingType.NON_PREEMPTIVE);

		initEEnum(relationshipTypeEEnum, RelationshipType.class, "RelationshipType");
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.INCLUDES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.EXCLUDES);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.EXTENSION_POINT);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.SOCKET);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.ASSOCIATION);
		addEEnumLiteral(relationshipTypeEEnum, RelationshipType.LANG_LINK);

		initEEnum(variantTypeEEnum, VariantType.class, "VariantType");
		addEEnumLiteral(variantTypeEEnum, VariantType.SIGNED);
		addEEnumLiteral(variantTypeEEnum, VariantType.UNSIGNED);

		initEEnum(languageTypeEEnum, LanguageType.class, "LanguageType");
		addEEnumLiteral(languageTypeEEnum, LanguageType.OCL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.VSL);
		addEEnumLiteral(languageTypeEEnum, LanguageType.ANSIC);

		initEEnum(elementDecorationTypeEEnum, ElementDecorationType.class, "ElementDecorationType");
		addEEnumLiteral(elementDecorationTypeEEnum, ElementDecorationType.NON_FUNCTIONAL_REQS);
		addEEnumLiteral(elementDecorationTypeEEnum, ElementDecorationType.CONSTRAINTS);
		addEEnumLiteral(elementDecorationTypeEEnum, ElementDecorationType.VALUE_SPEC);

		initEEnum(cLangKeywordsTypeEEnum, CLangKeywordsType.class, "CLangKeywordsType");
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.AUTO);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.BREAK);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.CASE);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.CHAR);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.CONST);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.CONTINUE);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.DEFAULT);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.DO);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.DOUBLE);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.ELSE);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.ENUM);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.EXTERN);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.FLOAT);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.FOR);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.GOTO);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.IF);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.INT);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.LONG);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.REGISTER);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.RETURN);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.SHORT);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.SIGNED);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.SIZEOF);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.STATIC);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.STRUCT);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.SWITCH);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.TYPEDEF);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.UNION);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.UNSIGNED);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.VOID);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.VOLATILE);
		addEEnumLiteral(cLangKeywordsTypeEEnum, CLangKeywordsType.WHILE);

		initEEnum(recordTypeEEnum, RecordType.class, "RecordType");
		addEEnumLiteral(recordTypeEEnum, RecordType.STRUCT);
		addEEnumLiteral(recordTypeEEnum, RecordType.UNION);

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
		addAnnotation
		  (getMessage_Bus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bus"
		   });		
		addAnnotation
		  (getMessage_GrantBus(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "grantBus"
		   });		
		addAnnotation
		  (getMessage_Communication(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "communication"
		   });		
		addAnnotation
		  (getProcessor_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getValueSpecification_Period(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "period"
		   });		
		addAnnotation
		  (getValueSpecification_Phase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phase"
		   });		
		addAnnotation
		  (getValueSpecification_Power(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "power"
		   });		
		addAnnotation
		  (getValueSpecification_Release(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "release"
		   });		
		addAnnotation
		  (getValueSpecification_SchedulingType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "schedulingMode"
		   });		
		addAnnotation
		  (getValueSpecification_Computing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "computing"
		   });		
		addAnnotation
		  (getValueSpecification_Deadline(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "deadline"
		   });
	}

} //EZRealtimePackageImpl
