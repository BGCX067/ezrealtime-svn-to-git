/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimeFactory
 * @model kind="package"
 * @generated
 */
public interface EZRealtimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezrealtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://pnmp.sf.net/EZRealtime";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezrt";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EZRealtimePackage eINSTANCE = br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl.init();

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getDiagram()
	 * @generated
	 */
	int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__LAST_MODIFIED = 2;

	/**
	 * The feature id for the '<em><b>Owned Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_ENTRY_POINT = 3;

	/**
	 * The feature id for the '<em><b>Owned Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_FILES = 4;

	/**
	 * The feature id for the '<em><b>Owned Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_MODULES = 5;

	/**
	 * The feature id for the '<em><b>Owned Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_RELATIONS = 6;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_CONSTRAINTS = 7;

	/**
	 * The feature id for the '<em><b>Owned Structured Data Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_STRUCTURED_DATA_TYPES = 8;

	/**
	 * The feature id for the '<em><b>Owned Code Snippets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_CODE_SNIPPETS = 9;

	/**
	 * The feature id for the '<em><b>Owned Pre Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_PRE_INIT = 10;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM__OWNED_COMMENTS = 11;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ModelElementImpl <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ModelElementImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getModelElement()
	 * @generated
	 */
	int MODEL_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_CONSTRAINT = 0;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_COMMENTS = 1;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT__OWNED_CODE_SNIPPET = 2;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.CommentImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_CONSTRAINT = MODEL_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_COMMENTS = MODEL_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__OWNED_CODE_SNIPPET = MODEL_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__BODY = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ContainerImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNED_CONSTRAINT = MODEL_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNED_COMMENTS = MODEL_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__OWNED_CODE_SNIPPET = MODEL_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.LabeledElementImpl <em>Labeled Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.LabeledElementImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getLabeledElement()
	 * @generated
	 */
	int LABELED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT__OWNED_CONSTRAINT = MODEL_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT__OWNED_COMMENTS = MODEL_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT__OWNED_CODE_SNIPPET = MODEL_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT__NAME = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT__DECORATION_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Labeled Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABELED_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.LanguageElementImpl <em>Language Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.LanguageElementImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getLanguageElement()
	 * @generated
	 */
	int LANGUAGE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ELEMENT__OWNED_CONSTRAINT = MODEL_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ELEMENT__OWNED_COMMENTS = MODEL_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ELEMENT__OWNED_CODE_SNIPPET = MODEL_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Language Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ELEMENT__LANGUAGE_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ELEMENT__DECORATION_TYPE = MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ELEMENT__BODY = MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Language Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANGUAGE_ELEMENT_FEATURE_COUNT = MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.FileImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 6;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNED_CONSTRAINT = LABELED_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNED_COMMENTS = LABELED_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNED_CODE_SNIPPET = LABELED_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = LABELED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DECORATION_TYPE = LABELED_ELEMENT__DECORATION_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNED_VARIABLES = LABELED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__OWNED_TASKS = LABELED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Processor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PROCESSOR = LABELED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__DEPENDENCIES = LABELED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = LABELED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.EntryPointImpl <em>Entry Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EntryPointImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getEntryPoint()
	 * @generated
	 */
	int ENTRY_POINT = 7;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OWNED_CONSTRAINT = LABELED_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OWNED_COMMENTS = LABELED_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__OWNED_CODE_SNIPPET = LABELED_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__NAME = LABELED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__DECORATION_TYPE = LABELED_ELEMENT__DECORATION_TYPE;

	/**
	 * The feature id for the '<em><b>Pre Init</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT__PRE_INIT = LABELED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entry Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_POINT_FEATURE_COUNT = LABELED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ModuleImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 8;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_CONSTRAINT = CONTAINER__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_COMMENTS = CONTAINER__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__OWNED_CODE_SNIPPET = CONTAINER__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__MODEL_ELEMENT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.BlockImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_CONSTRAINT = CONTAINER__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_COMMENTS = CONTAINER__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_CODE_SNIPPET = CONTAINER__OWNED_CODE_SNIPPET;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.CodeSnippetImpl <em>Code Snippet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.CodeSnippetImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getCodeSnippet()
	 * @generated
	 */
	int CODE_SNIPPET = 10;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SNIPPET__OWNED_CONSTRAINT = LANGUAGE_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SNIPPET__OWNED_COMMENTS = LANGUAGE_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SNIPPET__OWNED_CODE_SNIPPET = LANGUAGE_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Language Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SNIPPET__LANGUAGE_TYPE = LANGUAGE_ELEMENT__LANGUAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SNIPPET__DECORATION_TYPE = LANGUAGE_ELEMENT__DECORATION_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SNIPPET__BODY = LANGUAGE_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>Code Snippet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_SNIPPET_FEATURE_COUNT = LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ConstraintImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 11;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNED_CONSTRAINT = LANGUAGE_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNED_COMMENTS = LANGUAGE_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__OWNED_CODE_SNIPPET = LANGUAGE_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Language Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__LANGUAGE_TYPE = LANGUAGE_ELEMENT__LANGUAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DECORATION_TYPE = LANGUAGE_ELEMENT__DECORATION_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__BODY = LANGUAGE_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.PreInitImpl <em>Pre Init</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.PreInitImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getPreInit()
	 * @generated
	 */
	int PRE_INIT = 12;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INIT__OWNED_CONSTRAINT = LANGUAGE_ELEMENT__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INIT__OWNED_COMMENTS = LANGUAGE_ELEMENT__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INIT__OWNED_CODE_SNIPPET = LANGUAGE_ELEMENT__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Language Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INIT__LANGUAGE_TYPE = LANGUAGE_ELEMENT__LANGUAGE_TYPE;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INIT__DECORATION_TYPE = LANGUAGE_ELEMENT__DECORATION_TYPE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INIT__BODY = LANGUAGE_ELEMENT__BODY;

	/**
	 * The number of structural features of the '<em>Pre Init</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_INIT_FEATURE_COUNT = LANGUAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 13;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Owned Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OWNED_PARAMETERS = 3;

	/**
	 * The feature id for the '<em><b>Dependecies</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__DEPENDECIES = 4;

	/**
	 * The feature id for the '<em><b>Owned Language Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__OWNED_LANGUAGE_ELEMENT = 5;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ParameterImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.VariableImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 15;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VISIBILITY = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IDENTIFIER = 2;

	/**
	 * The feature id for the '<em><b>Assignment Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ASSIGNMENT_SYMBOL = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 4;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.MessageImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 16;

	/**
	 * The feature id for the '<em><b>Precedes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PRECEDES = 0;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__BUS = 1;

	/**
	 * The feature id for the '<em><b>Grant Bus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__GRANT_BUS = 2;

	/**
	 * The feature id for the '<em><b>Communication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__COMMUNICATION = 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ProcessorImpl <em>Processor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ProcessorImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getProcessor()
	 * @generated
	 */
	int PROCESSOR = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Processor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getValueSpecification()
	 * @generated
	 */
	int VALUE_SPECIFICATION = 18;

	/**
	 * The feature id for the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__PERIOD = 0;

	/**
	 * The feature id for the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__PHASE = 1;

	/**
	 * The feature id for the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__POWER = 2;

	/**
	 * The feature id for the '<em><b>Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__RELEASE = 3;

	/**
	 * The feature id for the '<em><b>Scheduling Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__SCHEDULING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Computing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__COMPUTING = 5;

	/**
	 * The feature id for the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION__DEADLINE = 6;

	/**
	 * The number of structural features of the '<em>Value Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_SPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.RelationshipImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 19;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DatatypeImpl <em>Datatype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.DatatypeImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getDatatype()
	 * @generated
	 */
	int DATATYPE = 20;

	/**
	 * The number of structural features of the '<em>Datatype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATATYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.PrimitiveDataTypeImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getPrimitiveDataType()
	 * @generated
	 */
	int PRIMITIVE_DATA_TYPE = 21;

	/**
	 * The number of structural features of the '<em>Primitive Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DATA_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl <em>Structured Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getStructuredDataType()
	 * @generated
	 */
	int STRUCTURED_DATA_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT = DATATYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE__OWNED_COMMENTS = DATATYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET = DATATYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE__NAME = DATATYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE__DECORATION_TYPE = DATATYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Owned Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE__OWNED_STRUCTURES = DATATYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Structured Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURED_DATA_TYPE_FEATURE_COUNT = DATATYPE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.IntegralTypeImpl <em>Integral Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.IntegralTypeImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getIntegralType()
	 * @generated
	 */
	int INTEGRAL_TYPE = 23;

	/**
	 * The number of structural features of the '<em>Integral Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRAL_TYPE_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl <em>Structure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getStructureType()
	 * @generated
	 */
	int STRUCTURE_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__OWNED_CONSTRAINT = STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__OWNED_COMMENTS = STRUCTURED_DATA_TYPE__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__OWNED_CODE_SNIPPET = STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__NAME = STRUCTURED_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__DECORATION_TYPE = STRUCTURED_DATA_TYPE__DECORATION_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__OWNED_STRUCTURES = STRUCTURED_DATA_TYPE__OWNED_STRUCTURES;

	/**
	 * The feature id for the '<em><b>Record Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__RECORD_TYPE = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__TYPE_NAME = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__TYPE = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Variable Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__VARIABLE_NAMES = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE__VARIABLES = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Structure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_TYPE_FEATURE_COUNT = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.UnionTypeImpl <em>Union Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.UnionTypeImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getUnionType()
	 * @generated
	 */
	int UNION_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Owned Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__OWNED_CONSTRAINT = STRUCTURED_DATA_TYPE__OWNED_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Owned Comments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__OWNED_COMMENTS = STRUCTURED_DATA_TYPE__OWNED_COMMENTS;

	/**
	 * The feature id for the '<em><b>Owned Code Snippet</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__OWNED_CODE_SNIPPET = STRUCTURED_DATA_TYPE__OWNED_CODE_SNIPPET;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__NAME = STRUCTURED_DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Decoration Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__DECORATION_TYPE = STRUCTURED_DATA_TYPE__DECORATION_TYPE;

	/**
	 * The feature id for the '<em><b>Owned Structures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE__OWNED_STRUCTURES = STRUCTURED_DATA_TYPE__OWNED_STRUCTURES;

	/**
	 * The number of structural features of the '<em>Union Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNION_TYPE_FEATURE_COUNT = STRUCTURED_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EnumerationTypeImpl
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 26;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = PRIMITIVE_DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType <em>Visibility Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getVisibilityType()
	 * @generated
	 */
	int VISIBILITY_TYPE = 27;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType <em>Scheduling Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getSchedulingType()
	 * @generated
	 */
	int SCHEDULING_TYPE = 28;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.RelationshipType <em>Relationship Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.RelationshipType
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getRelationshipType()
	 * @generated
	 */
	int RELATIONSHIP_TYPE = 29;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.VariantType <em>Variant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.VariantType
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getVariantType()
	 * @generated
	 */
	int VARIANT_TYPE = 30;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageType <em>Language Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageType
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getLanguageType()
	 * @generated
	 */
	int LANGUAGE_TYPE = 31;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType <em>Element Decoration Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getElementDecorationType()
	 * @generated
	 */
	int ELEMENT_DECORATION_TYPE = 32;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.CLangKeywordsType <em>CLang Keywords Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.CLangKeywordsType
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getCLangKeywordsType()
	 * @generated
	 */
	int CLANG_KEYWORDS_TYPE = 33;

	/**
	 * The meta object id for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.RecordType <em>Record Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.RecordType
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getRecordType()
	 * @generated
	 */
	int RECORD_TYPE = 34;


	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram
	 * @generated
	 */
	EClass getDiagram();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getTitle()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Title();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getAuthor()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_Author();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getLastModified()
	 * @see #getDiagram()
	 * @generated
	 */
	EAttribute getDiagram_LastModified();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedEntryPoint <em>Owned Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Entry Point</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedEntryPoint()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedEntryPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedFiles <em>Owned Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Files</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedFiles()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedFiles();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedModules <em>Owned Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Modules</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedModules()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedModules();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedRelations <em>Owned Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Relations</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedRelations()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedRelations();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedConstraints <em>Owned Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Constraints</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedConstraints()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedStructuredDataTypes <em>Owned Structured Data Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Structured Data Types</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedStructuredDataTypes()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedStructuredDataTypes();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedCodeSnippets <em>Owned Code Snippets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Code Snippets</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedCodeSnippets()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedCodeSnippets();

	/**
	 * Returns the meta object for the containment reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedPreInit <em>Owned Pre Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Pre Init</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedPreInit()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedPreInit();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedComments <em>Owned Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Comments</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Diagram#getOwnedComments()
	 * @see #getDiagram()
	 * @generated
	 */
	EReference getDiagram_OwnedComments();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ModelElement
	 * @generated
	 */
	EClass getModelElement();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedConstraint <em>Owned Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Constraint</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedConstraint()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_OwnedConstraint();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedComments <em>Owned Comments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Comments</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedComments()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_OwnedComments();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedCodeSnippet <em>Owned Code Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Code Snippet</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ModelElement#getOwnedCodeSnippet()
	 * @see #getModelElement()
	 * @generated
	 */
	EReference getModelElement_OwnedCodeSnippet();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Comment#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Comment#getBody()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Body();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement <em>Labeled Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Labeled Element</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement
	 * @generated
	 */
	EClass getLabeledElement();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement#getName()
	 * @see #getLabeledElement()
	 * @generated
	 */
	EAttribute getLabeledElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement#getDecorationType <em>Decoration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LabeledElement#getDecorationType()
	 * @see #getLabeledElement()
	 * @generated
	 */
	EAttribute getLabeledElement_DecorationType();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement <em>Language Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Language Element</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement
	 * @generated
	 */
	EClass getLanguageElement();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getLanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getLanguageType()
	 * @see #getLanguageElement()
	 * @generated
	 */
	EAttribute getLanguageElement_LanguageType();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getDecorationType <em>Decoration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decoration Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getDecorationType()
	 * @see #getLanguageElement()
	 * @generated
	 */
	EAttribute getLanguageElement_DecorationType();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageElement#getBody()
	 * @see #getLanguageElement()
	 * @generated
	 */
	EAttribute getLanguageElement_Body();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.File#getOwnedVariables <em>Owned Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Variables</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.File#getOwnedVariables()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_OwnedVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.File#getOwnedTasks <em>Owned Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Tasks</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.File#getOwnedTasks()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_OwnedTasks();

	/**
	 * Returns the meta object for the reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.File#getProcessor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Processor</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.File#getProcessor()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Processor();

	/**
	 * Returns the meta object for the reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.File#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependencies</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.File#getDependencies()
	 * @see #getFile()
	 * @generated
	 */
	EReference getFile_Dependencies();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.EntryPoint <em>Entry Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Point</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EntryPoint
	 * @generated
	 */
	EClass getEntryPoint();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.EntryPoint#getPreInit <em>Pre Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre Init</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EntryPoint#getPreInit()
	 * @see #getEntryPoint()
	 * @generated
	 */
	EReference getEntryPoint_PreInit();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Module#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Element</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Module#getModelElement()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_ModelElement();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.CodeSnippet <em>Code Snippet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Snippet</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.CodeSnippet
	 * @generated
	 */
	EClass getCodeSnippet();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.PreInit <em>Pre Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Init</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.PreInit
	 * @generated
	 */
	EClass getPreInit();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Task#getVisibility()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Visibility();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Task#getReturnType()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Task#getIdentifier()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Identifier();

	/**
	 * Returns the meta object for the reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getOwnedParameters <em>Owned Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owned Parameters</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Task#getOwnedParameters()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OwnedParameters();

	/**
	 * Returns the meta object for the reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getDependecies <em>Dependecies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependecies</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Task#getDependecies()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Dependecies();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Task#getOwnedLanguageElement <em>Owned Language Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owned Language Element</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Task#getOwnedLanguageElement()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_OwnedLanguageElement();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Variable#getVisibility()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Visibility();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type Name</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Variable#getTypeName()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_TypeName();

	/**
	 * Returns the meta object for the attribute list '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Identifier</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Variable#getIdentifier()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getAssignmentSymbol <em>Assignment Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment Symbol</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Variable#getAssignmentSymbol()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_AssignmentSymbol();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Message#getPrecedes <em>Precedes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precedes</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Message#getPrecedes()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Precedes();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Message#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bus</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Message#getBus()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Bus();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Message#getGrantBus <em>Grant Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grant Bus</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Message#getGrantBus()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_GrantBus();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Message#getCommunication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Communication</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Message#getCommunication()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Communication();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Processor <em>Processor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processor</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Processor
	 * @generated
	 */
	EClass getProcessor();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Processor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Processor#getName()
	 * @see #getProcessor()
	 * @generated
	 */
	EAttribute getProcessor_Name();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification <em>Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Specification</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification
	 * @generated
	 */
	EClass getValueSpecification();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPeriod <em>Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Period</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPeriod()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EAttribute getValueSpecification_Period();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPhase <em>Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phase</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPhase()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EAttribute getValueSpecification_Phase();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPower <em>Power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Power</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getPower()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EAttribute getValueSpecification_Power();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getRelease()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EAttribute getValueSpecification_Release();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getSchedulingType <em>Scheduling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getSchedulingType()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EAttribute getValueSpecification_SchedulingType();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getComputing <em>Computing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Computing</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getComputing()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EAttribute getValueSpecification_Computing();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getDeadline <em>Deadline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deadline</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ValueSpecification#getDeadline()
	 * @see #getValueSpecification()
	 * @generated
	 */
	EAttribute getValueSpecification_Deadline();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Relationship#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Relationship#getLabel()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Label();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.Datatype <em>Datatype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datatype</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.Datatype
	 * @generated
	 */
	EClass getDatatype();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.PrimitiveDataType <em>Primitive Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Data Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.PrimitiveDataType
	 * @generated
	 */
	EClass getPrimitiveDataType();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType <em>Structured Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structured Data Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType
	 * @generated
	 */
	EClass getStructuredDataType();

	/**
	 * Returns the meta object for the containment reference list '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType#getOwnedStructures <em>Owned Structures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Structures</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType#getOwnedStructures()
	 * @see #getStructuredDataType()
	 * @generated
	 */
	EReference getStructuredDataType_OwnedStructures();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.IntegralType <em>Integral Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integral Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.IntegralType
	 * @generated
	 */
	EClass getIntegralType();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType <em>Structure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.StructureType
	 * @generated
	 */
	EClass getStructureType();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getRecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getRecordType()
	 * @see #getStructureType()
	 * @generated
	 */
	EAttribute getStructureType_RecordType();

	/**
	 * Returns the meta object for the attribute '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getTypeName()
	 * @see #getStructureType()
	 * @generated
	 */
	EAttribute getStructureType_TypeName();

	/**
	 * Returns the meta object for the reference '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getType()
	 * @see #getStructureType()
	 * @generated
	 */
	EReference getStructureType_Type();

	/**
	 * Returns the meta object for the attribute list '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getVariableNames <em>Variable Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variable Names</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getVariableNames()
	 * @see #getStructureType()
	 * @generated
	 */
	EAttribute getStructureType_VariableNames();

	/**
	 * Returns the meta object for the attribute list '{@link br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variables</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.StructureType#getVariables()
	 * @see #getStructureType()
	 * @generated
	 */
	EAttribute getStructureType_Variables();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.UnionType <em>Union Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Union Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.UnionType
	 * @generated
	 */
	EClass getUnionType();

	/**
	 * Returns the meta object for class '{@link br.ufam.ezrealtime.modeling.ezrealtime.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for enum '{@link br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType <em>Visibility Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Visibility Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType
	 * @generated
	 */
	EEnum getVisibilityType();

	/**
	 * Returns the meta object for enum '{@link br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType <em>Scheduling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType
	 * @generated
	 */
	EEnum getSchedulingType();

	/**
	 * Returns the meta object for enum '{@link br.ufam.ezrealtime.modeling.ezrealtime.RelationshipType <em>Relationship Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relationship Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.RelationshipType
	 * @generated
	 */
	EEnum getRelationshipType();

	/**
	 * Returns the meta object for enum '{@link br.ufam.ezrealtime.modeling.ezrealtime.VariantType <em>Variant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Variant Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.VariantType
	 * @generated
	 */
	EEnum getVariantType();

	/**
	 * Returns the meta object for enum '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageType <em>Language Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageType
	 * @generated
	 */
	EEnum getLanguageType();

	/**
	 * Returns the meta object for enum '{@link br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType <em>Element Decoration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Decoration Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType
	 * @generated
	 */
	EEnum getElementDecorationType();

	/**
	 * Returns the meta object for enum '{@link br.ufam.ezrealtime.modeling.ezrealtime.CLangKeywordsType <em>CLang Keywords Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CLang Keywords Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.CLangKeywordsType
	 * @generated
	 */
	EEnum getCLangKeywordsType();

	/**
	 * Returns the meta object for enum '{@link br.ufam.ezrealtime.modeling.ezrealtime.RecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Record Type</em>'.
	 * @see br.ufam.ezrealtime.modeling.ezrealtime.RecordType
	 * @generated
	 */
	EEnum getRecordType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EZRealtimeFactory getEZRealtimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getDiagram()
		 * @generated
		 */
		EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__TITLE = eINSTANCE.getDiagram_Title();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__AUTHOR = eINSTANCE.getDiagram_Author();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM__LAST_MODIFIED = eINSTANCE.getDiagram_LastModified();

		/**
		 * The meta object literal for the '<em><b>Owned Entry Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_ENTRY_POINT = eINSTANCE.getDiagram_OwnedEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Owned Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_FILES = eINSTANCE.getDiagram_OwnedFiles();

		/**
		 * The meta object literal for the '<em><b>Owned Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_MODULES = eINSTANCE.getDiagram_OwnedModules();

		/**
		 * The meta object literal for the '<em><b>Owned Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_RELATIONS = eINSTANCE.getDiagram_OwnedRelations();

		/**
		 * The meta object literal for the '<em><b>Owned Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_CONSTRAINTS = eINSTANCE.getDiagram_OwnedConstraints();

		/**
		 * The meta object literal for the '<em><b>Owned Structured Data Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_STRUCTURED_DATA_TYPES = eINSTANCE.getDiagram_OwnedStructuredDataTypes();

		/**
		 * The meta object literal for the '<em><b>Owned Code Snippets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_CODE_SNIPPETS = eINSTANCE.getDiagram_OwnedCodeSnippets();

		/**
		 * The meta object literal for the '<em><b>Owned Pre Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_PRE_INIT = eINSTANCE.getDiagram_OwnedPreInit();

		/**
		 * The meta object literal for the '<em><b>Owned Comments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM__OWNED_COMMENTS = eINSTANCE.getDiagram_OwnedComments();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ModelElementImpl <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ModelElementImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getModelElement()
		 * @generated
		 */
		EClass MODEL_ELEMENT = eINSTANCE.getModelElement();

		/**
		 * The meta object literal for the '<em><b>Owned Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__OWNED_CONSTRAINT = eINSTANCE.getModelElement_OwnedConstraint();

		/**
		 * The meta object literal for the '<em><b>Owned Comments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__OWNED_COMMENTS = eINSTANCE.getModelElement_OwnedComments();

		/**
		 * The meta object literal for the '<em><b>Owned Code Snippet</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_ELEMENT__OWNED_CODE_SNIPPET = eINSTANCE.getModelElement_OwnedCodeSnippet();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.CommentImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__BODY = eINSTANCE.getComment_Body();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ContainerImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.LabeledElementImpl <em>Labeled Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.LabeledElementImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getLabeledElement()
		 * @generated
		 */
		EClass LABELED_ELEMENT = eINSTANCE.getLabeledElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_ELEMENT__NAME = eINSTANCE.getLabeledElement_Name();

		/**
		 * The meta object literal for the '<em><b>Decoration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABELED_ELEMENT__DECORATION_TYPE = eINSTANCE.getLabeledElement_DecorationType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.LanguageElementImpl <em>Language Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.LanguageElementImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getLanguageElement()
		 * @generated
		 */
		EClass LANGUAGE_ELEMENT = eINSTANCE.getLanguageElement();

		/**
		 * The meta object literal for the '<em><b>Language Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_ELEMENT__LANGUAGE_TYPE = eINSTANCE.getLanguageElement_LanguageType();

		/**
		 * The meta object literal for the '<em><b>Decoration Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_ELEMENT__DECORATION_TYPE = eINSTANCE.getLanguageElement_DecorationType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANGUAGE_ELEMENT__BODY = eINSTANCE.getLanguageElement_Body();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.FileImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Owned Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__OWNED_VARIABLES = eINSTANCE.getFile_OwnedVariables();

		/**
		 * The meta object literal for the '<em><b>Owned Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__OWNED_TASKS = eINSTANCE.getFile_OwnedTasks();

		/**
		 * The meta object literal for the '<em><b>Processor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__PROCESSOR = eINSTANCE.getFile_Processor();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE__DEPENDENCIES = eINSTANCE.getFile_Dependencies();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.EntryPointImpl <em>Entry Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EntryPointImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getEntryPoint()
		 * @generated
		 */
		EClass ENTRY_POINT = eINSTANCE.getEntryPoint();

		/**
		 * The meta object literal for the '<em><b>Pre Init</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_POINT__PRE_INIT = eINSTANCE.getEntryPoint_PreInit();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ModuleImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__MODEL_ELEMENT = eINSTANCE.getModule_ModelElement();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.BlockImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.CodeSnippetImpl <em>Code Snippet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.CodeSnippetImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getCodeSnippet()
		 * @generated
		 */
		EClass CODE_SNIPPET = eINSTANCE.getCodeSnippet();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ConstraintImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.PreInitImpl <em>Pre Init</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.PreInitImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getPreInit()
		 * @generated
		 */
		EClass PRE_INIT = eINSTANCE.getPreInit();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.TaskImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__VISIBILITY = eINSTANCE.getTask_Visibility();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__RETURN_TYPE = eINSTANCE.getTask_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__IDENTIFIER = eINSTANCE.getTask_Identifier();

		/**
		 * The meta object literal for the '<em><b>Owned Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OWNED_PARAMETERS = eINSTANCE.getTask_OwnedParameters();

		/**
		 * The meta object literal for the '<em><b>Dependecies</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__DEPENDECIES = eINSTANCE.getTask_Dependecies();

		/**
		 * The meta object literal for the '<em><b>Owned Language Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__OWNED_LANGUAGE_ELEMENT = eINSTANCE.getTask_OwnedLanguageElement();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ParameterImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.VariableImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VISIBILITY = eINSTANCE.getVariable_Visibility();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE_NAME = eINSTANCE.getVariable_TypeName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__IDENTIFIER = eINSTANCE.getVariable_Identifier();

		/**
		 * The meta object literal for the '<em><b>Assignment Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ASSIGNMENT_SYMBOL = eINSTANCE.getVariable_AssignmentSymbol();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.MessageImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Precedes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__PRECEDES = eINSTANCE.getMessage_Precedes();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__BUS = eINSTANCE.getMessage_Bus();

		/**
		 * The meta object literal for the '<em><b>Grant Bus</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__GRANT_BUS = eINSTANCE.getMessage_GrantBus();

		/**
		 * The meta object literal for the '<em><b>Communication</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__COMMUNICATION = eINSTANCE.getMessage_Communication();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ProcessorImpl <em>Processor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ProcessorImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getProcessor()
		 * @generated
		 */
		EClass PROCESSOR = eINSTANCE.getProcessor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSOR__NAME = eINSTANCE.getProcessor_Name();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl <em>Value Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.ValueSpecificationImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getValueSpecification()
		 * @generated
		 */
		EClass VALUE_SPECIFICATION = eINSTANCE.getValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPECIFICATION__PERIOD = eINSTANCE.getValueSpecification_Period();

		/**
		 * The meta object literal for the '<em><b>Phase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPECIFICATION__PHASE = eINSTANCE.getValueSpecification_Phase();

		/**
		 * The meta object literal for the '<em><b>Power</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPECIFICATION__POWER = eINSTANCE.getValueSpecification_Power();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPECIFICATION__RELEASE = eINSTANCE.getValueSpecification_Release();

		/**
		 * The meta object literal for the '<em><b>Scheduling Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPECIFICATION__SCHEDULING_TYPE = eINSTANCE.getValueSpecification_SchedulingType();

		/**
		 * The meta object literal for the '<em><b>Computing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPECIFICATION__COMPUTING = eINSTANCE.getValueSpecification_Computing();

		/**
		 * The meta object literal for the '<em><b>Deadline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_SPECIFICATION__DEADLINE = eINSTANCE.getValueSpecification_Deadline();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.RelationshipImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__LABEL = eINSTANCE.getRelationship_Label();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DatatypeImpl <em>Datatype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.DatatypeImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getDatatype()
		 * @generated
		 */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.PrimitiveDataTypeImpl <em>Primitive Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.PrimitiveDataTypeImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getPrimitiveDataType()
		 * @generated
		 */
		EClass PRIMITIVE_DATA_TYPE = eINSTANCE.getPrimitiveDataType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl <em>Structured Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.StructuredDataTypeImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getStructuredDataType()
		 * @generated
		 */
		EClass STRUCTURED_DATA_TYPE = eINSTANCE.getStructuredDataType();

		/**
		 * The meta object literal for the '<em><b>Owned Structures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURED_DATA_TYPE__OWNED_STRUCTURES = eINSTANCE.getStructuredDataType_OwnedStructures();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.IntegralTypeImpl <em>Integral Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.IntegralTypeImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getIntegralType()
		 * @generated
		 */
		EClass INTEGRAL_TYPE = eINSTANCE.getIntegralType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl <em>Structure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.StructureTypeImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getStructureType()
		 * @generated
		 */
		EClass STRUCTURE_TYPE = eINSTANCE.getStructureType();

		/**
		 * The meta object literal for the '<em><b>Record Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_TYPE__RECORD_TYPE = eINSTANCE.getStructureType_RecordType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_TYPE__TYPE_NAME = eINSTANCE.getStructureType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_TYPE__TYPE = eINSTANCE.getStructureType_Type();

		/**
		 * The meta object literal for the '<em><b>Variable Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_TYPE__VARIABLE_NAMES = eINSTANCE.getStructureType_VariableNames();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE_TYPE__VARIABLES = eINSTANCE.getStructureType_Variables();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.UnionTypeImpl <em>Union Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.UnionTypeImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getUnionType()
		 * @generated
		 */
		EClass UNION_TYPE = eINSTANCE.getUnionType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EnumerationTypeImpl
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType <em>Visibility Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.VisibilityType
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getVisibilityType()
		 * @generated
		 */
		EEnum VISIBILITY_TYPE = eINSTANCE.getVisibilityType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType <em>Scheduling Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.SchedulingType
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getSchedulingType()
		 * @generated
		 */
		EEnum SCHEDULING_TYPE = eINSTANCE.getSchedulingType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.RelationshipType <em>Relationship Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.RelationshipType
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getRelationshipType()
		 * @generated
		 */
		EEnum RELATIONSHIP_TYPE = eINSTANCE.getRelationshipType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.VariantType <em>Variant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.VariantType
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getVariantType()
		 * @generated
		 */
		EEnum VARIANT_TYPE = eINSTANCE.getVariantType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.LanguageType <em>Language Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.LanguageType
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getLanguageType()
		 * @generated
		 */
		EEnum LANGUAGE_TYPE = eINSTANCE.getLanguageType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType <em>Element Decoration Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.ElementDecorationType
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getElementDecorationType()
		 * @generated
		 */
		EEnum ELEMENT_DECORATION_TYPE = eINSTANCE.getElementDecorationType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.CLangKeywordsType <em>CLang Keywords Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.CLangKeywordsType
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getCLangKeywordsType()
		 * @generated
		 */
		EEnum CLANG_KEYWORDS_TYPE = eINSTANCE.getCLangKeywordsType();

		/**
		 * The meta object literal for the '{@link br.ufam.ezrealtime.modeling.ezrealtime.RecordType <em>Record Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.RecordType
		 * @see br.ufam.ezrealtime.modeling.ezrealtime.impl.EZRealtimePackageImpl#getRecordType()
		 * @generated
		 */
		EEnum RECORD_TYPE = eINSTANCE.getRecordType();

	}

} //EZRealtimePackage
