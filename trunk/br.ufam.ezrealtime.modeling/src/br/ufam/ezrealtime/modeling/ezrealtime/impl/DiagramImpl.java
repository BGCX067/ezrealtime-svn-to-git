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
import br.ufam.ezrealtime.modeling.ezrealtime.Diagram;
import br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage;
import br.ufam.ezrealtime.modeling.ezrealtime.EntryPoint;
import br.ufam.ezrealtime.modeling.ezrealtime.File;
import br.ufam.ezrealtime.modeling.ezrealtime.Module;
import br.ufam.ezrealtime.modeling.ezrealtime.PreInit;
import br.ufam.ezrealtime.modeling.ezrealtime.Relationship;
import br.ufam.ezrealtime.modeling.ezrealtime.StructuredDataType;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedEntryPoint <em>Owned Entry Point</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedFiles <em>Owned Files</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedModules <em>Owned Modules</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedRelations <em>Owned Relations</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedConstraints <em>Owned Constraints</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedStructuredDataTypes <em>Owned Structured Data Types</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedCodeSnippets <em>Owned Code Snippets</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedPreInit <em>Owned Pre Init</em>}</li>
 *   <li>{@link br.ufam.ezrealtime.modeling.ezrealtime.impl.DiagramImpl#getOwnedComments <em>Owned Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramImpl extends EObjectImpl implements Diagram {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedEntryPoint() <em>Owned Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EntryPoint ownedEntryPoint;

	/**
	 * The cached value of the '{@link #getOwnedFiles() <em>Owned Files</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFiles()
	 * @generated
	 * @ordered
	 */
	protected EList<File> ownedFiles;

	/**
	 * The cached value of the '{@link #getOwnedModules() <em>Owned Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> ownedModules;

	/**
	 * The cached value of the '{@link #getOwnedRelations() <em>Owned Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> ownedRelations;

	/**
	 * The cached value of the '{@link #getOwnedConstraints() <em>Owned Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedConstraints;

	/**
	 * The cached value of the '{@link #getOwnedStructuredDataTypes() <em>Owned Structured Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStructuredDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredDataType> ownedStructuredDataTypes;

	/**
	 * The cached value of the '{@link #getOwnedCodeSnippets() <em>Owned Code Snippets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCodeSnippets()
	 * @generated
	 * @ordered
	 */
	protected CodeSnippet ownedCodeSnippets;

	/**
	 * The cached value of the '{@link #getOwnedPreInit() <em>Owned Pre Init</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPreInit()
	 * @generated
	 * @ordered
	 */
	protected PreInit ownedPreInit;

	/**
	 * The cached value of the '{@link #getOwnedComments() <em>Owned Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComments()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EZRealtimePackage.Literals.DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(Date newLastModified) {
		Date oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryPoint getOwnedEntryPoint() {
		return ownedEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedEntryPoint(EntryPoint newOwnedEntryPoint, NotificationChain msgs) {
		EntryPoint oldOwnedEntryPoint = ownedEntryPoint;
		ownedEntryPoint = newOwnedEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT, oldOwnedEntryPoint, newOwnedEntryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedEntryPoint(EntryPoint newOwnedEntryPoint) {
		if (newOwnedEntryPoint != ownedEntryPoint) {
			NotificationChain msgs = null;
			if (ownedEntryPoint != null)
				msgs = ((InternalEObject)ownedEntryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT, null, msgs);
			if (newOwnedEntryPoint != null)
				msgs = ((InternalEObject)newOwnedEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT, null, msgs);
			msgs = basicSetOwnedEntryPoint(newOwnedEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT, newOwnedEntryPoint, newOwnedEntryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<File> getOwnedFiles() {
		if (ownedFiles == null) {
			ownedFiles = new EObjectContainmentEList<File>(File.class, this, EZRealtimePackage.DIAGRAM__OWNED_FILES);
		}
		return ownedFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getOwnedModules() {
		if (ownedModules == null) {
			ownedModules = new EObjectContainmentEList<Module>(Module.class, this, EZRealtimePackage.DIAGRAM__OWNED_MODULES);
		}
		return ownedModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getOwnedRelations() {
		if (ownedRelations == null) {
			ownedRelations = new EObjectContainmentEList<Relationship>(Relationship.class, this, EZRealtimePackage.DIAGRAM__OWNED_RELATIONS);
		}
		return ownedRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedConstraints() {
		if (ownedConstraints == null) {
			ownedConstraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, EZRealtimePackage.DIAGRAM__OWNED_CONSTRAINTS);
		}
		return ownedConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredDataType> getOwnedStructuredDataTypes() {
		if (ownedStructuredDataTypes == null) {
			ownedStructuredDataTypes = new EObjectContainmentEList<StructuredDataType>(StructuredDataType.class, this, EZRealtimePackage.DIAGRAM__OWNED_STRUCTURED_DATA_TYPES);
		}
		return ownedStructuredDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeSnippet getOwnedCodeSnippets() {
		return ownedCodeSnippets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedCodeSnippets(CodeSnippet newOwnedCodeSnippets, NotificationChain msgs) {
		CodeSnippet oldOwnedCodeSnippets = ownedCodeSnippets;
		ownedCodeSnippets = newOwnedCodeSnippets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS, oldOwnedCodeSnippets, newOwnedCodeSnippets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCodeSnippets(CodeSnippet newOwnedCodeSnippets) {
		if (newOwnedCodeSnippets != ownedCodeSnippets) {
			NotificationChain msgs = null;
			if (ownedCodeSnippets != null)
				msgs = ((InternalEObject)ownedCodeSnippets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS, null, msgs);
			if (newOwnedCodeSnippets != null)
				msgs = ((InternalEObject)newOwnedCodeSnippets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS, null, msgs);
			msgs = basicSetOwnedCodeSnippets(newOwnedCodeSnippets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS, newOwnedCodeSnippets, newOwnedCodeSnippets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreInit getOwnedPreInit() {
		return ownedPreInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPreInit(PreInit newOwnedPreInit, NotificationChain msgs) {
		PreInit oldOwnedPreInit = ownedPreInit;
		ownedPreInit = newOwnedPreInit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT, oldOwnedPreInit, newOwnedPreInit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPreInit(PreInit newOwnedPreInit) {
		if (newOwnedPreInit != ownedPreInit) {
			NotificationChain msgs = null;
			if (ownedPreInit != null)
				msgs = ((InternalEObject)ownedPreInit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT, null, msgs);
			if (newOwnedPreInit != null)
				msgs = ((InternalEObject)newOwnedPreInit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT, null, msgs);
			msgs = basicSetOwnedPreInit(newOwnedPreInit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT, newOwnedPreInit, newOwnedPreInit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComments() {
		if (ownedComments == null) {
			ownedComments = new EObjectContainmentEList<Comment>(Comment.class, this, EZRealtimePackage.DIAGRAM__OWNED_COMMENTS);
		}
		return ownedComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT:
				return basicSetOwnedEntryPoint(null, msgs);
			case EZRealtimePackage.DIAGRAM__OWNED_FILES:
				return ((InternalEList<?>)getOwnedFiles()).basicRemove(otherEnd, msgs);
			case EZRealtimePackage.DIAGRAM__OWNED_MODULES:
				return ((InternalEList<?>)getOwnedModules()).basicRemove(otherEnd, msgs);
			case EZRealtimePackage.DIAGRAM__OWNED_RELATIONS:
				return ((InternalEList<?>)getOwnedRelations()).basicRemove(otherEnd, msgs);
			case EZRealtimePackage.DIAGRAM__OWNED_CONSTRAINTS:
				return ((InternalEList<?>)getOwnedConstraints()).basicRemove(otherEnd, msgs);
			case EZRealtimePackage.DIAGRAM__OWNED_STRUCTURED_DATA_TYPES:
				return ((InternalEList<?>)getOwnedStructuredDataTypes()).basicRemove(otherEnd, msgs);
			case EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS:
				return basicSetOwnedCodeSnippets(null, msgs);
			case EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT:
				return basicSetOwnedPreInit(null, msgs);
			case EZRealtimePackage.DIAGRAM__OWNED_COMMENTS:
				return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
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
			case EZRealtimePackage.DIAGRAM__TITLE:
				return getTitle();
			case EZRealtimePackage.DIAGRAM__AUTHOR:
				return getAuthor();
			case EZRealtimePackage.DIAGRAM__LAST_MODIFIED:
				return getLastModified();
			case EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT:
				return getOwnedEntryPoint();
			case EZRealtimePackage.DIAGRAM__OWNED_FILES:
				return getOwnedFiles();
			case EZRealtimePackage.DIAGRAM__OWNED_MODULES:
				return getOwnedModules();
			case EZRealtimePackage.DIAGRAM__OWNED_RELATIONS:
				return getOwnedRelations();
			case EZRealtimePackage.DIAGRAM__OWNED_CONSTRAINTS:
				return getOwnedConstraints();
			case EZRealtimePackage.DIAGRAM__OWNED_STRUCTURED_DATA_TYPES:
				return getOwnedStructuredDataTypes();
			case EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS:
				return getOwnedCodeSnippets();
			case EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT:
				return getOwnedPreInit();
			case EZRealtimePackage.DIAGRAM__OWNED_COMMENTS:
				return getOwnedComments();
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
			case EZRealtimePackage.DIAGRAM__TITLE:
				setTitle((String)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__AUTHOR:
				setAuthor((String)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__LAST_MODIFIED:
				setLastModified((Date)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT:
				setOwnedEntryPoint((EntryPoint)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_FILES:
				getOwnedFiles().clear();
				getOwnedFiles().addAll((Collection<? extends File>)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_MODULES:
				getOwnedModules().clear();
				getOwnedModules().addAll((Collection<? extends Module>)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_RELATIONS:
				getOwnedRelations().clear();
				getOwnedRelations().addAll((Collection<? extends Relationship>)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_CONSTRAINTS:
				getOwnedConstraints().clear();
				getOwnedConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_STRUCTURED_DATA_TYPES:
				getOwnedStructuredDataTypes().clear();
				getOwnedStructuredDataTypes().addAll((Collection<? extends StructuredDataType>)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS:
				setOwnedCodeSnippets((CodeSnippet)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT:
				setOwnedPreInit((PreInit)newValue);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_COMMENTS:
				getOwnedComments().clear();
				getOwnedComments().addAll((Collection<? extends Comment>)newValue);
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
			case EZRealtimePackage.DIAGRAM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case EZRealtimePackage.DIAGRAM__AUTHOR:
				setAuthor(AUTHOR_EDEFAULT);
				return;
			case EZRealtimePackage.DIAGRAM__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT:
				setOwnedEntryPoint((EntryPoint)null);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_FILES:
				getOwnedFiles().clear();
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_MODULES:
				getOwnedModules().clear();
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_RELATIONS:
				getOwnedRelations().clear();
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_CONSTRAINTS:
				getOwnedConstraints().clear();
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_STRUCTURED_DATA_TYPES:
				getOwnedStructuredDataTypes().clear();
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS:
				setOwnedCodeSnippets((CodeSnippet)null);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT:
				setOwnedPreInit((PreInit)null);
				return;
			case EZRealtimePackage.DIAGRAM__OWNED_COMMENTS:
				getOwnedComments().clear();
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
			case EZRealtimePackage.DIAGRAM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case EZRealtimePackage.DIAGRAM__AUTHOR:
				return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT.equals(author);
			case EZRealtimePackage.DIAGRAM__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case EZRealtimePackage.DIAGRAM__OWNED_ENTRY_POINT:
				return ownedEntryPoint != null;
			case EZRealtimePackage.DIAGRAM__OWNED_FILES:
				return ownedFiles != null && !ownedFiles.isEmpty();
			case EZRealtimePackage.DIAGRAM__OWNED_MODULES:
				return ownedModules != null && !ownedModules.isEmpty();
			case EZRealtimePackage.DIAGRAM__OWNED_RELATIONS:
				return ownedRelations != null && !ownedRelations.isEmpty();
			case EZRealtimePackage.DIAGRAM__OWNED_CONSTRAINTS:
				return ownedConstraints != null && !ownedConstraints.isEmpty();
			case EZRealtimePackage.DIAGRAM__OWNED_STRUCTURED_DATA_TYPES:
				return ownedStructuredDataTypes != null && !ownedStructuredDataTypes.isEmpty();
			case EZRealtimePackage.DIAGRAM__OWNED_CODE_SNIPPETS:
				return ownedCodeSnippets != null;
			case EZRealtimePackage.DIAGRAM__OWNED_PRE_INIT:
				return ownedPreInit != null;
			case EZRealtimePackage.DIAGRAM__OWNED_COMMENTS:
				return ownedComments != null && !ownedComments.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", author: ");
		result.append(author);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(')');
		return result.toString();
	}

} //DiagramImpl
