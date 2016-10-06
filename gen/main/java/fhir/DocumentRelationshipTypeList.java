/**
 */
package fhir;

import java.lang.String;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Document Relationship Type List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhir.FhirPackage#getDocumentRelationshipTypeList()
 * @model extendedMetaData="name='DocumentRelationshipType-list'"
 * @generated
 */
public enum DocumentRelationshipTypeList implements Enumerator {
	/**
	 * The '<em><b>Replaces</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REPLACES_VALUE
	 * @generated
	 * @ordered
	 */
	REPLACES(0, "replaces", "replaces"),

	/**
	 * The '<em><b>Transforms</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFORMS_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMS(1, "transforms", "transforms"),

	/**
	 * The '<em><b>Signs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNS_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNS(2, "signs", "signs"),

	/**
	 * The '<em><b>Appends</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPENDS_VALUE
	 * @generated
	 * @ordered
	 */
	APPENDS(3, "appends", "appends");

	/**
	 * The '<em><b>Replaces</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This document logically replaces or supersedes the target document.
	 * <!-- end-model-doc -->
	 * @see #REPLACES
	 * @model name="replaces"
	 * @generated
	 * @ordered
	 */
	public static final int REPLACES_VALUE = 0;

	/**
	 * The '<em><b>Transforms</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This document was generated by transforming the target document (e.g. format or language conversion).
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMS
	 * @model name="transforms"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMS_VALUE = 1;

	/**
	 * The '<em><b>Signs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This document is a signature of the target document.
	 * <!-- end-model-doc -->
	 * @see #SIGNS
	 * @model name="signs"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNS_VALUE = 2;

	/**
	 * The '<em><b>Appends</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This document adds additional information to the target document.
	 * <!-- end-model-doc -->
	 * @see #APPENDS
	 * @model name="appends"
	 * @generated
	 * @ordered
	 */
	public static final int APPENDS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Document Relationship Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DocumentRelationshipTypeList[] VALUES_ARRAY =
		new DocumentRelationshipTypeList[] {
			REPLACES,
			TRANSFORMS,
			SIGNS,
			APPENDS,
		};

	/**
	 * A public read-only list of all the '<em><b>Document Relationship Type List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DocumentRelationshipTypeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Document Relationship Type List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentRelationshipTypeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentRelationshipTypeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Relationship Type List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentRelationshipTypeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentRelationshipTypeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Relationship Type List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentRelationshipTypeList get(int value) {
		switch (value) {
			case REPLACES_VALUE: return REPLACES;
			case TRANSFORMS_VALUE: return TRANSFORMS;
			case SIGNS_VALUE: return SIGNS;
			case APPENDS_VALUE: return APPENDS;
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
	private DocumentRelationshipTypeList(int value, String name, String literal) {
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
	
} //DocumentRelationshipTypeList
