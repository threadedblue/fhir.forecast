/**
 */
package fhir;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Script Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhir.TestScriptAction#getOperation <em>Operation</em>}</li>
 *   <li>{@link fhir.TestScriptAction#getAssert <em>Assert</em>}</li>
 * </ul>
 *
 * @see fhir.FhirPackage#getTestScriptAction()
 * @model extendedMetaData="name='TestScript.Action' kind='elementOnly'"
 * @generated
 */
public interface TestScriptAction extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation to perform.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(TestScriptOperation)
	 * @see fhir.FhirPackage#getTestScriptAction_Operation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptOperation getOperation();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAction#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(TestScriptOperation value);

	/**
	 * Returns the value of the '<em><b>Assert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assert</em>' containment reference.
	 * @see #setAssert(TestScriptAssert)
	 * @see fhir.FhirPackage#getTestScriptAction_Assert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='assert' namespace='##targetNamespace'"
	 * @generated
	 */
	TestScriptAssert getAssert();

	/**
	 * Sets the value of the '{@link fhir.TestScriptAction#getAssert <em>Assert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assert</em>' containment reference.
	 * @see #getAssert()
	 * @generated
	 */
	void setAssert(TestScriptAssert value);

} // TestScriptAction
