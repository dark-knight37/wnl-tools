/*
* 
*/
package WNLML.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import WNLML.WNLMLPackage;
import WNLML.WaterNetwork;
import WNLML.diagram.edit.parts.ConjuctionEditPart;
import WNLML.diagram.edit.parts.ConjuctionNameEditPart;
import WNLML.diagram.edit.parts.ContaminantAttacksEditPart;
import WNLML.diagram.edit.parts.ContaminantAttacksExternalLabelEditPart;
import WNLML.diagram.edit.parts.ContaminantEditPart;
import WNLML.diagram.edit.parts.ContaminantNameEditPart;
import WNLML.diagram.edit.parts.PipeEditPart;
import WNLML.diagram.edit.parts.PipeIdEditPart;
import WNLML.diagram.edit.parts.ReservoirEditPart;
import WNLML.diagram.edit.parts.ReservoirNameEditPart;
import WNLML.diagram.edit.parts.TankEditPart;
import WNLML.diagram.edit.parts.TankNameEditPart;
import WNLML.diagram.edit.parts.ValveEditPart;
import WNLML.diagram.edit.parts.ValveNameEditPart;
import WNLML.diagram.edit.parts.WaterNetworkEditPart;
import WNLML.diagram.edit.parts.WaterPumpEditPart;
import WNLML.diagram.edit.parts.WaterPumpNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class WNLMLVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "WNLEditorV2.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WaterNetworkEditPart.MODEL_ID.equals(view.getType())) {
				return WaterNetworkEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return WNLML.diagram.part.WNLMLVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				WNLMLDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WNLMLPackage.eINSTANCE.getWaterNetwork().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((WaterNetwork) domainElement)) {
			return WaterNetworkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = WNLML.diagram.part.WNLMLVisualIDRegistry.getModelID(containerView);
		if (!WaterNetworkEditPart.MODEL_ID.equals(containerModelID) && !"WNLML".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (WaterNetworkEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = WNLML.diagram.part.WNLMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WaterNetworkEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WaterNetworkEditPart.VISUAL_ID:
			if (WNLMLPackage.eINSTANCE.getWaterPump().isSuperTypeOf(domainElement.eClass())) {
				return WaterPumpEditPart.VISUAL_ID;
			}
			if (WNLMLPackage.eINSTANCE.getValve().isSuperTypeOf(domainElement.eClass())) {
				return ValveEditPart.VISUAL_ID;
			}
			if (WNLMLPackage.eINSTANCE.getReservoir().isSuperTypeOf(domainElement.eClass())) {
				return ReservoirEditPart.VISUAL_ID;
			}
			if (WNLMLPackage.eINSTANCE.getTank().isSuperTypeOf(domainElement.eClass())) {
				return TankEditPart.VISUAL_ID;
			}
			if (WNLMLPackage.eINSTANCE.getConjuction().isSuperTypeOf(domainElement.eClass())) {
				return ConjuctionEditPart.VISUAL_ID;
			}
			if (WNLMLPackage.eINSTANCE.getContaminant().isSuperTypeOf(domainElement.eClass())) {
				return ContaminantEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = WNLML.diagram.part.WNLMLVisualIDRegistry.getModelID(containerView);
		if (!WaterNetworkEditPart.MODEL_ID.equals(containerModelID) && !"WNLML".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (WaterNetworkEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = WNLML.diagram.part.WNLMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WaterNetworkEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WaterNetworkEditPart.VISUAL_ID:
			if (WaterPumpEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ValveEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ReservoirEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TankEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConjuctionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ContaminantEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WaterPumpEditPart.VISUAL_ID:
			if (WaterPumpNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ValveEditPart.VISUAL_ID:
			if (ValveNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ReservoirEditPart.VISUAL_ID:
			if (ReservoirNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TankEditPart.VISUAL_ID:
			if (TankNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConjuctionEditPart.VISUAL_ID:
			if (ConjuctionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContaminantEditPart.VISUAL_ID:
			if (ContaminantNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PipeEditPart.VISUAL_ID:
			if (PipeIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ContaminantAttacksEditPart.VISUAL_ID:
			if (ContaminantAttacksExternalLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (WNLMLPackage.eINSTANCE.getPipe().isSuperTypeOf(domainElement.eClass())) {
			return PipeEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(WaterNetwork element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WaterNetworkEditPart.VISUAL_ID:
			return false;
		case WaterPumpEditPart.VISUAL_ID:
		case ValveEditPart.VISUAL_ID:
		case ReservoirEditPart.VISUAL_ID:
		case TankEditPart.VISUAL_ID:
		case ConjuctionEditPart.VISUAL_ID:
		case ContaminantEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return WNLML.diagram.part.WNLMLVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return WNLML.diagram.part.WNLMLVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return WNLML.diagram.part.WNLMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return WNLML.diagram.part.WNLMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return WNLML.diagram.part.WNLMLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return WNLML.diagram.part.WNLMLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
