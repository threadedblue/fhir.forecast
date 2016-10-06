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
 * A representation of the literals of the enumeration '<em><b>Device Metric Calibration State List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhir.FhirPackage#getDeviceMetricCalibrationStateList()
 * @model extendedMetaData="name='DeviceMetricCalibrationState-list'"
 * @generated
 */
public enum DeviceMetricCalibrationStateList implements Enumerator {
	/**
	 * The '<em><b>Not Calibrated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_CALIBRATED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_CALIBRATED(0, "notCalibrated", "not-calibrated"),

	/**
	 * The '<em><b>Calibration Required</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALIBRATION_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	CALIBRATION_REQUIRED(1, "calibrationRequired", "calibration-required"),

	/**
	 * The '<em><b>Calibrated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALIBRATED_VALUE
	 * @generated
	 * @ordered
	 */
	CALIBRATED(2, "calibrated", "calibrated"),

	/**
	 * The '<em><b>Unspecified</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSPECIFIED(3, "unspecified", "unspecified");

	/**
	 * The '<em><b>Not Calibrated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metric has not been calibrated.
	 * <!-- end-model-doc -->
	 * @see #NOT_CALIBRATED
	 * @model name="notCalibrated" literal="not-calibrated"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_CALIBRATED_VALUE = 0;

	/**
	 * The '<em><b>Calibration Required</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metric needs to be calibrated.
	 * <!-- end-model-doc -->
	 * @see #CALIBRATION_REQUIRED
	 * @model name="calibrationRequired" literal="calibration-required"
	 * @generated
	 * @ordered
	 */
	public static final int CALIBRATION_REQUIRED_VALUE = 1;

	/**
	 * The '<em><b>Calibrated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metric has been calibrated.
	 * <!-- end-model-doc -->
	 * @see #CALIBRATED
	 * @model name="calibrated"
	 * @generated
	 * @ordered
	 */
	public static final int CALIBRATED_VALUE = 2;

	/**
	 * The '<em><b>Unspecified</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The state of calibration of this metric is unspecified.
	 * <!-- end-model-doc -->
	 * @see #UNSPECIFIED
	 * @model name="unspecified"
	 * @generated
	 * @ordered
	 */
	public static final int UNSPECIFIED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Device Metric Calibration State List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DeviceMetricCalibrationStateList[] VALUES_ARRAY =
		new DeviceMetricCalibrationStateList[] {
			NOT_CALIBRATED,
			CALIBRATION_REQUIRED,
			CALIBRATED,
			UNSPECIFIED,
		};

	/**
	 * A public read-only list of all the '<em><b>Device Metric Calibration State List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DeviceMetricCalibrationStateList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Device Metric Calibration State List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCalibrationStateList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceMetricCalibrationStateList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Metric Calibration State List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCalibrationStateList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DeviceMetricCalibrationStateList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Device Metric Calibration State List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DeviceMetricCalibrationStateList get(int value) {
		switch (value) {
			case NOT_CALIBRATED_VALUE: return NOT_CALIBRATED;
			case CALIBRATION_REQUIRED_VALUE: return CALIBRATION_REQUIRED;
			case CALIBRATED_VALUE: return CALIBRATED;
			case UNSPECIFIED_VALUE: return UNSPECIFIED;
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
	private DeviceMetricCalibrationStateList(int value, String name, String literal) {
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
	
} //DeviceMetricCalibrationStateList
