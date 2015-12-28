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
 * A representation of the literals of the enumeration '<em><b>Element Decoration Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see br.ufam.ezrealtime.modeling.ezrealtime.EZRealtimePackage#getElementDecorationType()
 * @model
 * @generated
 */
public enum ElementDecorationType implements Enumerator {
	/**
	 * The '<em><b>Non Functional Reqs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_FUNCTIONAL_REQS_VALUE
	 * @generated
	 * @ordered
	 */
	NON_FUNCTIONAL_REQS(0, "nonFunctionalReqs", "<<nonFunctionalReqs>>"),

	/**
	 * The '<em><b>Constraints</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTRAINTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTRAINTS(1, "constraints", "<<constraints>>"),

	/**
	 * The '<em><b>Value Spec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VALUE_SPEC_VALUE
	 * @generated
	 * @ordered
	 */
	VALUE_SPEC(0, "valueSpec", "<<valueSpec>>");

	/**
	 * The '<em><b>Non Functional Reqs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Functional Reqs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_FUNCTIONAL_REQS
	 * @model name="nonFunctionalReqs" literal="<<nonFunctionalReqs>>"
	 * @generated
	 * @ordered
	 */
	public static final int NON_FUNCTIONAL_REQS_VALUE = 0;

	/**
	 * The '<em><b>Constraints</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Constraints</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONSTRAINTS
	 * @model name="constraints" literal="<<constraints>>"
	 * @generated
	 * @ordered
	 */
	public static final int CONSTRAINTS_VALUE = 1;

	/**
	 * The '<em><b>Value Spec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Value Spec</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VALUE_SPEC
	 * @model name="valueSpec" literal="<<valueSpec>>"
	 * @generated
	 * @ordered
	 */
	public static final int VALUE_SPEC_VALUE = 0;

	/**
	 * An array of all the '<em><b>Element Decoration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ElementDecorationType[] VALUES_ARRAY =
		new ElementDecorationType[] {
			NON_FUNCTIONAL_REQS,
			CONSTRAINTS,
			VALUE_SPEC,
		};

	/**
	 * A public read-only list of all the '<em><b>Element Decoration Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ElementDecorationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Element Decoration Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementDecorationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementDecorationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Decoration Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementDecorationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ElementDecorationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Element Decoration Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElementDecorationType get(int value) {
		switch (value) {
			case NON_FUNCTIONAL_REQS_VALUE: return NON_FUNCTIONAL_REQS;
			case CONSTRAINTS_VALUE: return CONSTRAINTS;
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
	private ElementDecorationType(int value, String name, String literal) {
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
	
} //ElementDecorationType
