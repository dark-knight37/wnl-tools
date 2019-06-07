/**
 */
package WNLML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Contaminant Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see WNLML.WNLMLPackage#getContaminantType()
 * @model
 * @generated
 */
public enum ContaminantType implements Enumerator {
	/**
	 * The '<em><b>Disinfection By Product</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISINFECTION_BY_PRODUCT_VALUE
	 * @generated
	 * @ordered
	 */
	DISINFECTION_BY_PRODUCT(0, "DisinfectionByProduct", "DisinfectionByProduct"),

	/**
	 * The '<em><b>Microorganism</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICROORGANISM_VALUE
	 * @generated
	 * @ordered
	 */
	MICROORGANISM(0, "Microorganism", "Microorganism"),

	/**
	 * The '<em><b>Organic Chemical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORGANIC_CHEMICAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANIC_CHEMICAL(0, "OrganicChemical", "OrganicChemical"),

	/**
	 * The '<em><b>Inorganic Chemical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INORGANIC_CHEMICAL_VALUE
	 * @generated
	 * @ordered
	 */
	INORGANIC_CHEMICAL(0, "InorganicChemical", "InorganicChemical"),

	/**
	 * The '<em><b>Radio Nuclides</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_NUCLIDES_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO_NUCLIDES(0, "RadioNuclides", "RadioNuclides");

	/**
	 * The '<em><b>Disinfection By Product</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disinfection By Product</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISINFECTION_BY_PRODUCT
	 * @model name="DisinfectionByProduct"
	 * @generated
	 * @ordered
	 */
	public static final int DISINFECTION_BY_PRODUCT_VALUE = 0;

	/**
	 * The '<em><b>Microorganism</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Microorganism</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICROORGANISM
	 * @model name="Microorganism"
	 * @generated
	 * @ordered
	 */
	public static final int MICROORGANISM_VALUE = 0;

	/**
	 * The '<em><b>Organic Chemical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Organic Chemical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORGANIC_CHEMICAL
	 * @model name="OrganicChemical"
	 * @generated
	 * @ordered
	 */
	public static final int ORGANIC_CHEMICAL_VALUE = 0;

	/**
	 * The '<em><b>Inorganic Chemical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inorganic Chemical</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INORGANIC_CHEMICAL
	 * @model name="InorganicChemical"
	 * @generated
	 * @ordered
	 */
	public static final int INORGANIC_CHEMICAL_VALUE = 0;

	/**
	 * The '<em><b>Radio Nuclides</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Radio Nuclides</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIO_NUCLIDES
	 * @model name="RadioNuclides"
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_NUCLIDES_VALUE = 0;

	/**
	 * An array of all the '<em><b>Contaminant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContaminantType[] VALUES_ARRAY =
		new ContaminantType[] {
			DISINFECTION_BY_PRODUCT,
			MICROORGANISM,
			ORGANIC_CHEMICAL,
			INORGANIC_CHEMICAL,
			RADIO_NUCLIDES,
		};

	/**
	 * A public read-only list of all the '<em><b>Contaminant Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContaminantType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Contaminant Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContaminantType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContaminantType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contaminant Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContaminantType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContaminantType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Contaminant Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContaminantType get(int value) {
		switch (value) {
			case DISINFECTION_BY_PRODUCT_VALUE: return DISINFECTION_BY_PRODUCT;
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
	private ContaminantType(int value, String name, String literal) {
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
	
} //ContaminantType
