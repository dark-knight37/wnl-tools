/**
 */
package WNLML.util;

import WNLML.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see WNLML.WNLMLPackage
 * @generated
 */
public class WNLMLSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WNLMLPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNLMLSwitch() {
		if (modelPackage == null) {
			modelPackage = WNLMLPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WNLMLPackage.WATER_NETWORK: {
				WaterNetwork waterNetwork = (WaterNetwork)theEObject;
				T result = caseWaterNetwork(waterNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WNLMLPackage.WN_NODE: {
				WNNode wnNode = (WNNode)theEObject;
				T result = caseWNNode(wnNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WNLMLPackage.PIPE: {
				Pipe pipe = (Pipe)theEObject;
				T result = casePipe(pipe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WNLMLPackage.CONTAMINANT: {
				Contaminant contaminant = (Contaminant)theEObject;
				T result = caseContaminant(contaminant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WNLMLPackage.WATER_PUMP: {
				WaterPump waterPump = (WaterPump)theEObject;
				T result = caseWaterPump(waterPump);
				if (result == null) result = caseWNNode(waterPump);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WNLMLPackage.VALVE: {
				Valve valve = (Valve)theEObject;
				T result = caseValve(valve);
				if (result == null) result = caseWNNode(valve);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WNLMLPackage.RESERVOIR: {
				Reservoir reservoir = (Reservoir)theEObject;
				T result = caseReservoir(reservoir);
				if (result == null) result = caseWNNode(reservoir);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WNLMLPackage.TANK: {
				Tank tank = (Tank)theEObject;
				T result = caseTank(tank);
				if (result == null) result = caseWNNode(tank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WNLMLPackage.CONJUCTION: {
				Conjuction conjuction = (Conjuction)theEObject;
				T result = caseConjuction(conjuction);
				if (result == null) result = caseWNNode(conjuction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterNetwork(WaterNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>WN Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>WN Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWNNode(WNNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pipe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePipe(Pipe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contaminant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contaminant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContaminant(Contaminant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Water Pump</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Water Pump</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaterPump(WaterPump object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Valve</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Valve</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValve(Valve object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reservoir</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reservoir</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReservoir(Reservoir object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTank(Tank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conjuction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conjuction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConjuction(Conjuction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WNLMLSwitch
