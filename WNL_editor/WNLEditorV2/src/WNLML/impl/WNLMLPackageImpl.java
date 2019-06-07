/**
 */
package WNLML.impl;

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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WNLMLPackageImpl extends EPackageImpl implements WNLMLPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterNetworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wnNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contaminantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waterPumpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservoirEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjuctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contaminantTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pipeStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see WNLML.WNLMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WNLMLPackageImpl() {
		super(eNS_URI, WNLMLFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link WNLMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WNLMLPackage init() {
		if (isInited) return (WNLMLPackage)EPackage.Registry.INSTANCE.getEPackage(WNLMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredWNLMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		WNLMLPackageImpl theWNLMLPackage = registeredWNLMLPackage instanceof WNLMLPackageImpl ? (WNLMLPackageImpl)registeredWNLMLPackage : new WNLMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theWNLMLPackage.createPackageContents();

		// Initialize created meta-data
		theWNLMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWNLMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WNLMLPackage.eNS_URI, theWNLMLPackage);
		return theWNLMLPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterNetwork() {
		return waterNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaterNetwork_ContainsNode() {
		return (EReference)waterNetworkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaterNetwork_ContainsLink() {
		return (EReference)waterNetworkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaterNetwork_ContainsAttack() {
		return (EReference)waterNetworkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWNNode() {
		return wnNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWNNode_Name() {
		return (EAttribute)wnNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWNNode_Description() {
		return (EAttribute)wnNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWNNode_MonitoringService() {
		return (EAttribute)wnNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipe() {
		return pipeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipe_Status() {
		return (EAttribute)pipeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipe_Source() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipe_Destination() {
		return (EReference)pipeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipe_Id() {
		return (EAttribute)pipeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContaminant() {
		return contaminantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContaminant_Concentration() {
		return (EAttribute)contaminantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContaminant_Attacks() {
		return (EReference)contaminantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContaminant_Name() {
		return (EAttribute)contaminantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContaminant_Description() {
		return (EAttribute)contaminantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaterPump() {
		return waterPumpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValve() {
		return valveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservoir() {
		return reservoirEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTank() {
		return tankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjuction() {
		return conjuctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContaminantType() {
		return contaminantTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPipeStatus() {
		return pipeStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNLMLFactory getWNLMLFactory() {
		return (WNLMLFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		waterNetworkEClass = createEClass(WATER_NETWORK);
		createEReference(waterNetworkEClass, WATER_NETWORK__CONTAINS_NODE);
		createEReference(waterNetworkEClass, WATER_NETWORK__CONTAINS_LINK);
		createEReference(waterNetworkEClass, WATER_NETWORK__CONTAINS_ATTACK);

		wnNodeEClass = createEClass(WN_NODE);
		createEAttribute(wnNodeEClass, WN_NODE__NAME);
		createEAttribute(wnNodeEClass, WN_NODE__DESCRIPTION);
		createEAttribute(wnNodeEClass, WN_NODE__MONITORING_SERVICE);

		pipeEClass = createEClass(PIPE);
		createEAttribute(pipeEClass, PIPE__STATUS);
		createEReference(pipeEClass, PIPE__SOURCE);
		createEReference(pipeEClass, PIPE__DESTINATION);
		createEAttribute(pipeEClass, PIPE__ID);

		contaminantEClass = createEClass(CONTAMINANT);
		createEAttribute(contaminantEClass, CONTAMINANT__CONCENTRATION);
		createEReference(contaminantEClass, CONTAMINANT__ATTACKS);
		createEAttribute(contaminantEClass, CONTAMINANT__NAME);
		createEAttribute(contaminantEClass, CONTAMINANT__DESCRIPTION);

		waterPumpEClass = createEClass(WATER_PUMP);

		valveEClass = createEClass(VALVE);

		reservoirEClass = createEClass(RESERVOIR);

		tankEClass = createEClass(TANK);

		conjuctionEClass = createEClass(CONJUCTION);

		// Create enums
		contaminantTypeEEnum = createEEnum(CONTAMINANT_TYPE);
		pipeStatusEEnum = createEEnum(PIPE_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		waterPumpEClass.getESuperTypes().add(this.getWNNode());
		valveEClass.getESuperTypes().add(this.getWNNode());
		reservoirEClass.getESuperTypes().add(this.getWNNode());
		tankEClass.getESuperTypes().add(this.getWNNode());
		conjuctionEClass.getESuperTypes().add(this.getWNNode());

		// Initialize classes and features; add operations and parameters
		initEClass(waterNetworkEClass, WaterNetwork.class, "WaterNetwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaterNetwork_ContainsNode(), this.getWNNode(), null, "containsNode", null, 0, -1, WaterNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWaterNetwork_ContainsLink(), this.getPipe(), null, "containsLink", null, 0, -1, WaterNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWaterNetwork_ContainsAttack(), this.getContaminant(), null, "containsAttack", null, 0, -1, WaterNetwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wnNodeEClass, WNNode.class, "WNNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWNNode_Name(), ecorePackage.getEString(), "name", null, 0, 1, WNNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWNNode_Description(), ecorePackage.getEString(), "description", null, 0, 1, WNNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWNNode_MonitoringService(), ecorePackage.getEString(), "monitoringService", null, 0, 1, WNNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pipeEClass, Pipe.class, "Pipe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPipe_Status(), this.getPipeStatus(), "status", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipe_Source(), this.getWNNode(), null, "source", null, 1, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipe_Destination(), this.getWNNode(), null, "destination", null, 1, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPipe_Id(), ecorePackage.getEFloat(), "id", null, 0, 1, Pipe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contaminantEClass, Contaminant.class, "Contaminant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContaminant_Concentration(), ecorePackage.getEFloat(), "concentration", null, 0, 1, Contaminant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContaminant_Attacks(), this.getWNNode(), null, "attacks", null, 1, -1, Contaminant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContaminant_Name(), ecorePackage.getEString(), "name", null, 0, 1, Contaminant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContaminant_Description(), ecorePackage.getEString(), "description", null, 0, 1, Contaminant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waterPumpEClass, WaterPump.class, "WaterPump", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valveEClass, Valve.class, "Valve", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reservoirEClass, Reservoir.class, "Reservoir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tankEClass, Tank.class, "Tank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjuctionEClass, Conjuction.class, "Conjuction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(contaminantTypeEEnum, ContaminantType.class, "ContaminantType");
		addEEnumLiteral(contaminantTypeEEnum, ContaminantType.DISINFECTION_BY_PRODUCT);
		addEEnumLiteral(contaminantTypeEEnum, ContaminantType.MICROORGANISM);
		addEEnumLiteral(contaminantTypeEEnum, ContaminantType.ORGANIC_CHEMICAL);
		addEEnumLiteral(contaminantTypeEEnum, ContaminantType.INORGANIC_CHEMICAL);
		addEEnumLiteral(contaminantTypeEEnum, ContaminantType.RADIO_NUCLIDES);

		initEEnum(pipeStatusEEnum, PipeStatus.class, "PipeStatus");
		addEEnumLiteral(pipeStatusEEnum, PipeStatus.OPEN);
		addEEnumLiteral(pipeStatusEEnum, PipeStatus.CLOSE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.link
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (waterNetworkEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (pipeEClass,
		   source,
		   new String[] {
			   "label", "id",
			   "source", "source",
			   "target", "destination",
			   "target.decoration", "arrow",
			   "color", "128,128,128",
			   "width", "2"
		   });
		addAnnotation
		  (getContaminant_Attacks(),
		   source,
		   new String[] {
			   "label", "ID",
			   "target", "destination",
			   "target.decoration", "arrow",
			   "style", "dot",
			   "color", "255,0,0",
			   "width", "2"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (contaminantEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "figure", "figures.HazardFigure",
			   "border.color", "0,0,0",
			   "size", "80,80"
		   });
		addAnnotation
		  (waterPumpEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "figure", "figures.WaterPumpFigure"
		   });
		addAnnotation
		  (valveEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "figure", "figures.ValveFigure"
		   });
		addAnnotation
		  (reservoirEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "figure", "figures.ReservoirFigure"
		   });
		addAnnotation
		  (tankEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "figure", "figures.TankFigure"
		   });
		addAnnotation
		  (conjuctionEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "figure", "ellipse",
			   "color", "0,0,0",
			   "border.color", "0,0,0",
			   "size", "30,30"
		   });
	}

} //WNLMLPackageImpl
