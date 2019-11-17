/**
 */
package WNLML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see WNLML.WNLMLPackage
 * @generated
 */
public interface WNLMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WNLMLFactory eINSTANCE = WNLML.impl.WNLMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Water Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Network</em>'.
	 * @generated
	 */
	WaterNetwork createWaterNetwork();

	/**
	 * Returns a new object of class '<em>WN Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>WN Node</em>'.
	 * @generated
	 */
	WNNode createWNNode();

	/**
	 * Returns a new object of class '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pipe</em>'.
	 * @generated
	 */
	Pipe createPipe();

	/**
	 * Returns a new object of class '<em>Contaminant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contaminant</em>'.
	 * @generated
	 */
	Contaminant createContaminant();

	/**
	 * Returns a new object of class '<em>Water Pump</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Water Pump</em>'.
	 * @generated
	 */
	WaterPump createWaterPump();

	/**
	 * Returns a new object of class '<em>Valve</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valve</em>'.
	 * @generated
	 */
	Valve createValve();

	/**
	 * Returns a new object of class '<em>Reservoir</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservoir</em>'.
	 * @generated
	 */
	Reservoir createReservoir();

	/**
	 * Returns a new object of class '<em>Tank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tank</em>'.
	 * @generated
	 */
	Tank createTank();

	/**
	 * Returns a new object of class '<em>Conjuction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjuction</em>'.
	 * @generated
	 */
	Conjuction createConjuction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WNLMLPackage getWNLMLPackage();

} //WNLMLFactory
