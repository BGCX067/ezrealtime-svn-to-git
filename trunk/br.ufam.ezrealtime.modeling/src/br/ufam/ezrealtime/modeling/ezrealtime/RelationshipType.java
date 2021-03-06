/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package br.ufam.ezrealtime.modeling.ezrealtime;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Relationship Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getRelationshipType()
 * @model
 * @generated
 */
public enum RelationshipType implements Enumerator {
	/**
	 * The '<em><b>INCLUDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCLUDES_VALUE
	 * @generated
	 * @ordered
	 */
	INCLUDES(0, "INCLUDES", "INCLUDES"),

	/**
	 * The '<em><b>EXCLUDES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCLUDES_VALUE
	 * @generated
	 * @ordered
	 */
	EXCLUDES(1, "EXCLUDES", "EXCLUDES"),

	/**
	 * The '<em><b>EXTENSION POINT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	EXTENSION_POINT(2, "EXTENSION_POINT", "EXTENSION_POINT"),

	/**
	 * The '<em><b>SOCKET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCKET_VALUE
	 * @generated
	 * @ordered
	 */
	SOCKET(3, "SOCKET", "SOCKET"),

	/**
	 * The '<em><b>ASSOCIATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATION(4, "ASSOCIATION", "ASSOCIATION"),

	/**
	 * The '<em><b>LANG LINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LANG_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	LANG_LINK(5, "LANG_LINK", "LANG_LINK");

	/**
	 * The '<em><b>INCLUDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCLUDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCLUDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCLUDES_VALUE = 0;

	/**
	 * The '<em><b>EXCLUDES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCLUDES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCLUDES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCLUDES_VALUE = 1;

	/**
	 * The '<em><b>EXTENSION POINT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXTENSION POINT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTENSION_POINT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXTENSION_POINT_VALUE = 2;

	/**
	 * The '<em><b>SOCKET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOCKET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOCKET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SOCKET_VALUE = 3;

	/**
	 * The '<em><b>ASSOCIATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ASSOCIATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATION_VALUE = 4;

	/**
	 * The '<em><b>LANG LINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LANG LINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LANG_LINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LANG_LINK_VALUE = 5;

	/**
	 * An array of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RelationshipType[] VALUES_ARRAY =
		new RelationshipType[] {
			INCLUDES,
			EXCLUDES,
			EXTENSION_POINT,
			SOCKET,
			ASSOCIATION,
			LANG_LINK,
		};

	/**
	 * A public read-only list of all the '<em><b>Relationship Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RelationshipType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RelationshipType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Relationship Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RelationshipType get(int value) {
		switch (value) {
			case INCLUDES_VALUE: return INCLUDES;
			case EXCLUDES_VALUE: return EXCLUDES;
			case EXTENSION_POINT_VALUE: return EXTENSION_POINT;
			case SOCKET_VALUE: return SOCKET;
			case ASSOCIATION_VALUE: return ASSOCIATION;
			case LANG_LINK_VALUE: return LANG_LINK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RelationshipType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //RelationshipType
