/**
 */
package WNLML;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see WNLML.WNLMLFactory
 * @model kind="package"
 * @generated
 */
public interface WNLMLPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "WNLML";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "WNL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "WNL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WNLMLPackage eINSTANCE = WNLML.impl.WNLMLPackageImpl.init();

	/**
	 * The meta object id for the '{@link WNLML.impl.WaterNetworkImpl <em>Water Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.WaterNetworkImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getWaterNetwork()
	 * @generated
	 */
	int WATER_NETWORK = 0;

	/**
	 * The feature id for the '<em><b>Contains Node</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_NETWORK__CONTAINS_NODE = 0;

	/**
	 * The feature id for the '<em><b>Contains Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_NETWORK__CONTAINS_LINK = 1;

	/**
	 * The feature id for the '<em><b>Contains Attack</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_NETWORK__CONTAINS_ATTACK = 2;

	/**
	 * The number of structural features of the '<em>Water Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_NETWORK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WNLML.impl.WNNodeImpl <em>WN Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.WNNodeImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getWNNode()
	 * @generated
	 */
	int WN_NODE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN_NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN_NODE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Monitoring Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN_NODE__MONITORING_SERVICE = 2;

	/**
	 * The number of structural features of the '<em>WN Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WN_NODE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link WNLML.impl.PipeImpl <em>Pipe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.PipeImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getPipe()
	 * @generated
	 */
	int PIPE = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__STATUS = 0;

	/**
	 * The feature id for the '<em><b>Flowrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__FLOWRATE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__DESTINATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Pipe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link WNLML.impl.ContaminantImpl <em>Contaminant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.ContaminantImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getContaminant()
	 * @generated
	 */
	int CONTAMINANT = 3;

	/**
	 * The feature id for the '<em><b>Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINANT__CONCENTRATION = 0;

	/**
	 * The feature id for the '<em><b>Attacks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINANT__ATTACKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINANT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINANT__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Contaminant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAMINANT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link WNLML.impl.WaterPumpImpl <em>Water Pump</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.WaterPumpImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getWaterPump()
	 * @generated
	 */
	int WATER_PUMP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_PUMP__NAME = WN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_PUMP__DESCRIPTION = WN_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Monitoring Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_PUMP__MONITORING_SERVICE = WN_NODE__MONITORING_SERVICE;

	/**
	 * The number of structural features of the '<em>Water Pump</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WATER_PUMP_FEATURE_COUNT = WN_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WNLML.impl.ValveImpl <em>Valve</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.ValveImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getValve()
	 * @generated
	 */
	int VALVE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__NAME = WN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__DESCRIPTION = WN_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Monitoring Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE__MONITORING_SERVICE = WN_NODE__MONITORING_SERVICE;

	/**
	 * The number of structural features of the '<em>Valve</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALVE_FEATURE_COUNT = WN_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WNLML.impl.ReservoirImpl <em>Reservoir</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.ReservoirImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getReservoir()
	 * @generated
	 */
	int RESERVOIR = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__NAME = WN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__DESCRIPTION = WN_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Monitoring Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR__MONITORING_SERVICE = WN_NODE__MONITORING_SERVICE;

	/**
	 * The number of structural features of the '<em>Reservoir</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVOIR_FEATURE_COUNT = WN_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WNLML.impl.TankImpl <em>Tank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.TankImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getTank()
	 * @generated
	 */
	int TANK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__NAME = WN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__DESCRIPTION = WN_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Monitoring Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK__MONITORING_SERVICE = WN_NODE__MONITORING_SERVICE;

	/**
	 * The number of structural features of the '<em>Tank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TANK_FEATURE_COUNT = WN_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WNLML.impl.ConjuctionImpl <em>Conjuction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.impl.ConjuctionImpl
	 * @see WNLML.impl.WNLMLPackageImpl#getConjuction()
	 * @generated
	 */
	int CONJUCTION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUCTION__NAME = WN_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUCTION__DESCRIPTION = WN_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Monitoring Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUCTION__MONITORING_SERVICE = WN_NODE__MONITORING_SERVICE;

	/**
	 * The number of structural features of the '<em>Conjuction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONJUCTION_FEATURE_COUNT = WN_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link WNLML.ContaminantType <em>Contaminant Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.ContaminantType
	 * @see WNLML.impl.WNLMLPackageImpl#getContaminantType()
	 * @generated
	 */
	int CONTAMINANT_TYPE = 9;

	/**
	 * The meta object id for the '{@link WNLML.PipeStatus <em>Pipe Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see WNLML.PipeStatus
	 * @see WNLML.impl.WNLMLPackageImpl#getPipeStatus()
	 * @generated
	 */
	int PIPE_STATUS = 10;


	/**
	 * Returns the meta object for class '{@link WNLML.WaterNetwork <em>Water Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Network</em>'.
	 * @see WNLML.WaterNetwork
	 * @generated
	 */
	EClass getWaterNetwork();

	/**
	 * Returns the meta object for the containment reference list '{@link WNLML.WaterNetwork#getContainsNode <em>Contains Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Node</em>'.
	 * @see WNLML.WaterNetwork#getContainsNode()
	 * @see #getWaterNetwork()
	 * @generated
	 */
	EReference getWaterNetwork_ContainsNode();

	/**
	 * Returns the meta object for the containment reference list '{@link WNLML.WaterNetwork#getContainsLink <em>Contains Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Link</em>'.
	 * @see WNLML.WaterNetwork#getContainsLink()
	 * @see #getWaterNetwork()
	 * @generated
	 */
	EReference getWaterNetwork_ContainsLink();

	/**
	 * Returns the meta object for the containment reference list '{@link WNLML.WaterNetwork#getContainsAttack <em>Contains Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains Attack</em>'.
	 * @see WNLML.WaterNetwork#getContainsAttack()
	 * @see #getWaterNetwork()
	 * @generated
	 */
	EReference getWaterNetwork_ContainsAttack();

	/**
	 * Returns the meta object for class '{@link WNLML.WNNode <em>WN Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WN Node</em>'.
	 * @see WNLML.WNNode
	 * @generated
	 */
	EClass getWNNode();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.WNNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WNLML.WNNode#getName()
	 * @see #getWNNode()
	 * @generated
	 */
	EAttribute getWNNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.WNNode#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WNLML.WNNode#getDescription()
	 * @see #getWNNode()
	 * @generated
	 */
	EAttribute getWNNode_Description();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.WNNode#getMonitoringService <em>Monitoring Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Service</em>'.
	 * @see WNLML.WNNode#getMonitoringService()
	 * @see #getWNNode()
	 * @generated
	 */
	EAttribute getWNNode_MonitoringService();

	/**
	 * Returns the meta object for class '{@link WNLML.Pipe <em>Pipe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipe</em>'.
	 * @see WNLML.Pipe
	 * @generated
	 */
	EClass getPipe();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.Pipe#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see WNLML.Pipe#getStatus()
	 * @see #getPipe()
	 * @generated
	 */
	EAttribute getPipe_Status();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.Pipe#getFlowrate <em>Flowrate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flowrate</em>'.
	 * @see WNLML.Pipe#getFlowrate()
	 * @see #getPipe()
	 * @generated
	 */
	EAttribute getPipe_Flowrate();

	/**
	 * Returns the meta object for the reference '{@link WNLML.Pipe#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see WNLML.Pipe#getSource()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Source();

	/**
	 * Returns the meta object for the reference '{@link WNLML.Pipe#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see WNLML.Pipe#getDestination()
	 * @see #getPipe()
	 * @generated
	 */
	EReference getPipe_Destination();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.Pipe#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see WNLML.Pipe#getId()
	 * @see #getPipe()
	 * @generated
	 */
	EAttribute getPipe_Id();

	/**
	 * Returns the meta object for class '{@link WNLML.Contaminant <em>Contaminant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contaminant</em>'.
	 * @see WNLML.Contaminant
	 * @generated
	 */
	EClass getContaminant();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.Contaminant#getConcentration <em>Concentration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concentration</em>'.
	 * @see WNLML.Contaminant#getConcentration()
	 * @see #getContaminant()
	 * @generated
	 */
	EAttribute getContaminant_Concentration();

	/**
	 * Returns the meta object for the reference list '{@link WNLML.Contaminant#getAttacks <em>Attacks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacks</em>'.
	 * @see WNLML.Contaminant#getAttacks()
	 * @see #getContaminant()
	 * @generated
	 */
	EReference getContaminant_Attacks();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.Contaminant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see WNLML.Contaminant#getName()
	 * @see #getContaminant()
	 * @generated
	 */
	EAttribute getContaminant_Name();

	/**
	 * Returns the meta object for the attribute '{@link WNLML.Contaminant#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see WNLML.Contaminant#getDescription()
	 * @see #getContaminant()
	 * @generated
	 */
	EAttribute getContaminant_Description();

	/**
	 * Returns the meta object for class '{@link WNLML.WaterPump <em>Water Pump</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Water Pump</em>'.
	 * @see WNLML.WaterPump
	 * @generated
	 */
	EClass getWaterPump();

	/**
	 * Returns the meta object for class '{@link WNLML.Valve <em>Valve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valve</em>'.
	 * @see WNLML.Valve
	 * @generated
	 */
	EClass getValve();

	/**
	 * Returns the meta object for class '{@link WNLML.Reservoir <em>Reservoir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservoir</em>'.
	 * @see WNLML.Reservoir
	 * @generated
	 */
	EClass getReservoir();

	/**
	 * Returns the meta object for class '{@link WNLML.Tank <em>Tank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tank</em>'.
	 * @see WNLML.Tank
	 * @generated
	 */
	EClass getTank();

	/**
	 * Returns the meta object for class '{@link WNLML.Conjuction <em>Conjuction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conjuction</em>'.
	 * @see WNLML.Conjuction
	 * @generated
	 */
	EClass getConjuction();

	/**
	 * Returns the meta object for enum '{@link WNLML.ContaminantType <em>Contaminant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contaminant Type</em>'.
	 * @see WNLML.ContaminantType
	 * @generated
	 */
	EEnum getContaminantType();

	/**
	 * Returns the meta object for enum '{@link WNLML.PipeStatus <em>Pipe Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pipe Status</em>'.
	 * @see WNLML.PipeStatus
	 * @generated
	 */
	EEnum getPipeStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WNLMLFactory getWNLMLFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link WNLML.impl.WaterNetworkImpl <em>Water Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.WaterNetworkImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getWaterNetwork()
		 * @generated
		 */
		EClass WATER_NETWORK = eINSTANCE.getWaterNetwork();

		/**
		 * The meta object literal for the '<em><b>Contains Node</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_NETWORK__CONTAINS_NODE = eINSTANCE.getWaterNetwork_ContainsNode();

		/**
		 * The meta object literal for the '<em><b>Contains Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_NETWORK__CONTAINS_LINK = eINSTANCE.getWaterNetwork_ContainsLink();

		/**
		 * The meta object literal for the '<em><b>Contains Attack</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WATER_NETWORK__CONTAINS_ATTACK = eINSTANCE.getWaterNetwork_ContainsAttack();

		/**
		 * The meta object literal for the '{@link WNLML.impl.WNNodeImpl <em>WN Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.WNNodeImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getWNNode()
		 * @generated
		 */
		EClass WN_NODE = eINSTANCE.getWNNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WN_NODE__NAME = eINSTANCE.getWNNode_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WN_NODE__DESCRIPTION = eINSTANCE.getWNNode_Description();

		/**
		 * The meta object literal for the '<em><b>Monitoring Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WN_NODE__MONITORING_SERVICE = eINSTANCE.getWNNode_MonitoringService();

		/**
		 * The meta object literal for the '{@link WNLML.impl.PipeImpl <em>Pipe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.PipeImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getPipe()
		 * @generated
		 */
		EClass PIPE = eINSTANCE.getPipe();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPE__STATUS = eINSTANCE.getPipe_Status();

		/**
		 * The meta object literal for the '<em><b>Flowrate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPE__FLOWRATE = eINSTANCE.getPipe_Flowrate();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__SOURCE = eINSTANCE.getPipe_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPE__DESTINATION = eINSTANCE.getPipe_Destination();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPE__ID = eINSTANCE.getPipe_Id();

		/**
		 * The meta object literal for the '{@link WNLML.impl.ContaminantImpl <em>Contaminant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.ContaminantImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getContaminant()
		 * @generated
		 */
		EClass CONTAMINANT = eINSTANCE.getContaminant();

		/**
		 * The meta object literal for the '<em><b>Concentration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAMINANT__CONCENTRATION = eINSTANCE.getContaminant_Concentration();

		/**
		 * The meta object literal for the '<em><b>Attacks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAMINANT__ATTACKS = eINSTANCE.getContaminant_Attacks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAMINANT__NAME = eINSTANCE.getContaminant_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAMINANT__DESCRIPTION = eINSTANCE.getContaminant_Description();

		/**
		 * The meta object literal for the '{@link WNLML.impl.WaterPumpImpl <em>Water Pump</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.WaterPumpImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getWaterPump()
		 * @generated
		 */
		EClass WATER_PUMP = eINSTANCE.getWaterPump();

		/**
		 * The meta object literal for the '{@link WNLML.impl.ValveImpl <em>Valve</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.ValveImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getValve()
		 * @generated
		 */
		EClass VALVE = eINSTANCE.getValve();

		/**
		 * The meta object literal for the '{@link WNLML.impl.ReservoirImpl <em>Reservoir</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.ReservoirImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getReservoir()
		 * @generated
		 */
		EClass RESERVOIR = eINSTANCE.getReservoir();

		/**
		 * The meta object literal for the '{@link WNLML.impl.TankImpl <em>Tank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.TankImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getTank()
		 * @generated
		 */
		EClass TANK = eINSTANCE.getTank();

		/**
		 * The meta object literal for the '{@link WNLML.impl.ConjuctionImpl <em>Conjuction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.impl.ConjuctionImpl
		 * @see WNLML.impl.WNLMLPackageImpl#getConjuction()
		 * @generated
		 */
		EClass CONJUCTION = eINSTANCE.getConjuction();

		/**
		 * The meta object literal for the '{@link WNLML.ContaminantType <em>Contaminant Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.ContaminantType
		 * @see WNLML.impl.WNLMLPackageImpl#getContaminantType()
		 * @generated
		 */
		EEnum CONTAMINANT_TYPE = eINSTANCE.getContaminantType();

		/**
		 * The meta object literal for the '{@link WNLML.PipeStatus <em>Pipe Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see WNLML.PipeStatus
		 * @see WNLML.impl.WNLMLPackageImpl#getPipeStatus()
		 * @generated
		 */
		EEnum PIPE_STATUS = eINSTANCE.getPipeStatus();

	}

} //WNLMLPackage
