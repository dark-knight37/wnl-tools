/**
 */
package WNLML.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import WNLML.Conjuction;
import WNLML.Contaminant;
import WNLML.ContaminantType;
import WNLML.Pipe;
import WNLML.PipeStatus;
import WNLML.Reservoir;
import WNLML.Tank;
import WNLML.Valve;
import WNLML.WNLMLFactory;
import WNLML.WNLMLPackage;
import WNLML.WNNode;
import WNLML.WaterNetwork;
import WNLML.WaterPump;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WNLMLFactoryImpl extends EFactoryImpl implements WNLMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WNLMLFactory init() {
		try {
			WNLMLFactory theWNLMLFactory = (WNLMLFactory)EPackage.Registry.INSTANCE.getEFactory(WNLMLPackage.eNS_URI);
			if (theWNLMLFactory != null) {
				return theWNLMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WNLMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNLMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WNLMLPackage.WATER_NETWORK: return createWaterNetwork();
			case WNLMLPackage.WN_NODE: return createWNNode();
			case WNLMLPackage.PIPE: return createPipe();
			case WNLMLPackage.CONTAMINANT: return createContaminant();
			case WNLMLPackage.WATER_PUMP: return createWaterPump();
			case WNLMLPackage.VALVE: return createValve();
			case WNLMLPackage.RESERVOIR: return createReservoir();
			case WNLMLPackage.TANK: return createTank();
			case WNLMLPackage.CONJUCTION: return createConjuction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WNLMLPackage.CONTAMINANT_TYPE:
				return createContaminantTypeFromString(eDataType, initialValue);
			case WNLMLPackage.PIPE_STATUS:
				return createPipeStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WNLMLPackage.CONTAMINANT_TYPE:
				return convertContaminantTypeToString(eDataType, instanceValue);
			case WNLMLPackage.PIPE_STATUS:
				return convertPipeStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterNetwork createWaterNetwork() {
		WaterNetworkImpl waterNetwork = new WaterNetworkImpl();
		return waterNetwork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNNode createWNNode() {
		WNNodeImpl wnNode = new WNNodeImpl();
		return wnNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipe createPipe() {
		PipeImpl pipe = new PipeImpl();
		return pipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contaminant createContaminant() {
		ContaminantImpl contaminant = new ContaminantImpl();
		return contaminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaterPump createWaterPump() {
		WaterPumpImpl waterPump = new WaterPumpImpl();
		return waterPump;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Valve createValve() {
		ValveImpl valve = new ValveImpl();
		return valve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservoir createReservoir() {
		ReservoirImpl reservoir = new ReservoirImpl();
		return reservoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tank createTank() {
		TankImpl tank = new TankImpl();
		return tank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjuction createConjuction() {
		ConjuctionImpl conjuction = new ConjuctionImpl();
		return conjuction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContaminantType createContaminantTypeFromString(EDataType eDataType, String initialValue) {
		ContaminantType result = ContaminantType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContaminantTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeStatus createPipeStatusFromString(EDataType eDataType, String initialValue) {
		PipeStatus result = PipeStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPipeStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNLMLPackage getWNLMLPackage() {
		return (WNLMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WNLMLPackage getPackage() {
		return WNLMLPackage.eINSTANCE;
	}

} //WNLMLFactoryImpl
