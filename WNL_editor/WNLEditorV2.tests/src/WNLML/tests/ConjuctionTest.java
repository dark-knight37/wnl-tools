/**
 */
package WNLML.tests;

import WNLML.Conjuction;
import WNLML.WNLMLFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conjuction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConjuctionTest extends WNNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConjuctionTest.class);
	}

	/**
	 * Constructs a new Conjuction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjuctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conjuction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Conjuction getFixture() {
		return (Conjuction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WNLMLFactory.eINSTANCE.createConjuction());
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

} //ConjuctionTest
