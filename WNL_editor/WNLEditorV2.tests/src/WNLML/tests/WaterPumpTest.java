/**
 */
package WNLML.tests;

import WNLML.WNLMLFactory;
import WNLML.WaterPump;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Water Pump</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaterPumpTest extends WNNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WaterPumpTest.class);
	}

	/**
	 * Constructs a new Water Pump test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterPumpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Water Pump test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WaterPump getFixture() {
		return (WaterPump)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WNLMLFactory.eINSTANCE.createWaterPump());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //WaterPumpTest
