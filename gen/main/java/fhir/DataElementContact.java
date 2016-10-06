/**
 */
package fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element Contact</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The formal description of a single piece of information that can be gathered and reported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.DataElementContact#getName <em>Name</em>}</li>
 *   <li>{@link fhir.DataElementContact#getTelecom <em>Telecom</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getDataElementContact()
 * @model extendedMetaData="name='DataElement.Contact' kind='elementOnly'"
 * @generated
 */
public interface DataElementContact extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of an individual to contact regarding the data element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(fhir.String)
	 * @see fhir.FhirPackage#getDataElementContact_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	fhir.String getName();

	/**
	 * Sets the value of the '{@link fhir.DataElementContact#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(fhir.String value);

	/**
	 * Returns the value of the '<em><b>Telecom</b></em>' containment reference list.
	 * The list contents are of type {@link fhir.ContactPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contact details for individual (if a name was provided) or the publisher.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telecom</em>' containment reference list.
	 * @see fhir.FhirPackage#getDataElementContact_Telecom()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='telecom' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ContactPoint> getTelecom();

} // DataElementContact
