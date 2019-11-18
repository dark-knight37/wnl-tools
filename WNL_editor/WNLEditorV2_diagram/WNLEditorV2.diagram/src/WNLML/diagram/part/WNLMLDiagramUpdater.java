/*
* 
*/
package WNLML.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import WNLML.Conjuction;
import WNLML.Contaminant;
import WNLML.Pipe;
import WNLML.Reservoir;
import WNLML.Tank;
import WNLML.Valve;
import WNLML.WNLMLPackage;
import WNLML.WNNode;
import WNLML.WaterNetwork;
import WNLML.WaterPump;
import WNLML.diagram.edit.parts.ConjuctionEditPart;
import WNLML.diagram.edit.parts.ContaminantAttacksEditPart;
import WNLML.diagram.edit.parts.ContaminantEditPart;
import WNLML.diagram.edit.parts.PipeEditPart;
import WNLML.diagram.edit.parts.ReservoirEditPart;
import WNLML.diagram.edit.parts.TankEditPart;
import WNLML.diagram.edit.parts.ValveEditPart;
import WNLML.diagram.edit.parts.WaterNetworkEditPart;
import WNLML.diagram.edit.parts.WaterPumpEditPart;
import WNLML.diagram.providers.WNLMLElementTypes;

/**
 * @generated
 */
public class WNLMLDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<WNLMLNodeDescriptor> getSemanticChildren(View view) {
		switch (WNLMLVisualIDRegistry.getVisualID(view)) {
		case WaterNetworkEditPart.VISUAL_ID:
			return getWaterNetwork_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WNLMLNodeDescriptor> getWaterNetwork_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WaterNetwork modelElement = (WaterNetwork) view.getElement();
		LinkedList<WNLMLNodeDescriptor> result = new LinkedList<WNLMLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getContainsNode().iterator(); it.hasNext();) {
			WNNode childElement = (WNNode) it.next();
			int visualID = WNLMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == WaterPumpEditPart.VISUAL_ID) {
				result.add(new WNLMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ValveEditPart.VISUAL_ID) {
				result.add(new WNLMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ReservoirEditPart.VISUAL_ID) {
				result.add(new WNLMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TankEditPart.VISUAL_ID) {
				result.add(new WNLMLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConjuctionEditPart.VISUAL_ID) {
				result.add(new WNLMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getContainsAttack().iterator(); it.hasNext();) {
			Contaminant childElement = (Contaminant) it.next();
			int visualID = WNLMLVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ContaminantEditPart.VISUAL_ID) {
				result.add(new WNLMLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<WNLMLLinkDescriptor> getContainedLinks(View view) {
		switch (WNLMLVisualIDRegistry.getVisualID(view)) {
		case WaterNetworkEditPart.VISUAL_ID:
			return getWaterNetwork_1000ContainedLinks(view);
		case WaterPumpEditPart.VISUAL_ID:
			return getWaterPump_2001ContainedLinks(view);
		case ValveEditPart.VISUAL_ID:
			return getValve_2002ContainedLinks(view);
		case ReservoirEditPart.VISUAL_ID:
			return getReservoir_2003ContainedLinks(view);
		case TankEditPart.VISUAL_ID:
			return getTank_2004ContainedLinks(view);
		case ConjuctionEditPart.VISUAL_ID:
			return getConjuction_2005ContainedLinks(view);
		case ContaminantEditPart.VISUAL_ID:
			return getContaminant_2006ContainedLinks(view);
		case PipeEditPart.VISUAL_ID:
			return getPipe_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WNLMLLinkDescriptor> getIncomingLinks(View view) {
		switch (WNLMLVisualIDRegistry.getVisualID(view)) {
		case WaterPumpEditPart.VISUAL_ID:
			return getWaterPump_2001IncomingLinks(view);
		case ValveEditPart.VISUAL_ID:
			return getValve_2002IncomingLinks(view);
		case ReservoirEditPart.VISUAL_ID:
			return getReservoir_2003IncomingLinks(view);
		case TankEditPart.VISUAL_ID:
			return getTank_2004IncomingLinks(view);
		case ConjuctionEditPart.VISUAL_ID:
			return getConjuction_2005IncomingLinks(view);
		case ContaminantEditPart.VISUAL_ID:
			return getContaminant_2006IncomingLinks(view);
		case PipeEditPart.VISUAL_ID:
			return getPipe_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<WNLMLLinkDescriptor> getOutgoingLinks(View view) {
		switch (WNLMLVisualIDRegistry.getVisualID(view)) {
		case WaterPumpEditPart.VISUAL_ID:
			return getWaterPump_2001OutgoingLinks(view);
		case ValveEditPart.VISUAL_ID:
			return getValve_2002OutgoingLinks(view);
		case ReservoirEditPart.VISUAL_ID:
			return getReservoir_2003OutgoingLinks(view);
		case TankEditPart.VISUAL_ID:
			return getTank_2004OutgoingLinks(view);
		case ConjuctionEditPart.VISUAL_ID:
			return getConjuction_2005OutgoingLinks(view);
		case ContaminantEditPart.VISUAL_ID:
			return getContaminant_2006OutgoingLinks(view);
		case PipeEditPart.VISUAL_ID:
			return getPipe_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getWaterNetwork_1000ContainedLinks(View view) {
		WaterNetwork modelElement = (WaterNetwork) view.getElement();
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Pipe_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getWaterPump_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getValve_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getReservoir_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getTank_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getConjuction_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getContaminant_2006ContainedLinks(View view) {
		Contaminant modelElement = (Contaminant) view.getElement();
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Contaminant_Attacks_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getPipe_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getWaterPump_2001IncomingLinks(View view) {
		WaterPump modelElement = (WaterPump) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Pipe_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Contaminant_Attacks_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getValve_2002IncomingLinks(View view) {
		Valve modelElement = (Valve) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Pipe_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Contaminant_Attacks_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getReservoir_2003IncomingLinks(View view) {
		Reservoir modelElement = (Reservoir) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Pipe_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Contaminant_Attacks_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getTank_2004IncomingLinks(View view) {
		Tank modelElement = (Tank) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Pipe_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Contaminant_Attacks_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getConjuction_2005IncomingLinks(View view) {
		Conjuction modelElement = (Conjuction) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Pipe_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Contaminant_Attacks_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getContaminant_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getPipe_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getWaterPump_2001OutgoingLinks(View view) {
		WaterPump modelElement = (WaterPump) view.getElement();
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Pipe_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getValve_2002OutgoingLinks(View view) {
		Valve modelElement = (Valve) view.getElement();
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Pipe_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getReservoir_2003OutgoingLinks(View view) {
		Reservoir modelElement = (Reservoir) view.getElement();
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Pipe_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getTank_2004OutgoingLinks(View view) {
		Tank modelElement = (Tank) view.getElement();
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Pipe_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getConjuction_2005OutgoingLinks(View view) {
		Conjuction modelElement = (Conjuction) view.getElement();
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Pipe_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getContaminant_2006OutgoingLinks(View view) {
		Contaminant modelElement = (Contaminant) view.getElement();
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Contaminant_Attacks_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<WNLMLLinkDescriptor> getPipe_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<WNLMLLinkDescriptor> getContainedTypeModelFacetLinks_Pipe_4001(WaterNetwork container) {
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		for (Iterator<?> links = container.getContainsLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Pipe) {
				continue;
			}
			Pipe link = (Pipe) linkObject;
			if (PipeEditPart.VISUAL_ID != WNLMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			WNNode dst = link.getDestination();
			WNNode src = link.getSource();
			result.add(new WNLMLLinkDescriptor(src, dst, link, WNLMLElementTypes.Pipe_4001, PipeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WNLMLLinkDescriptor> getIncomingTypeModelFacetLinks_Pipe_4001(WNNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != WNLMLPackage.eINSTANCE.getPipe_Destination()
					|| false == setting.getEObject() instanceof Pipe) {
				continue;
			}
			Pipe link = (Pipe) setting.getEObject();
			if (PipeEditPart.VISUAL_ID != WNLMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			WNNode src = link.getSource();
			result.add(new WNLMLLinkDescriptor(src, target, link, WNLMLElementTypes.Pipe_4001, PipeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<WNLMLLinkDescriptor> getIncomingFeatureModelFacetLinks_Contaminant_Attacks_4002(
			WNNode target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == WNLMLPackage.eINSTANCE.getContaminant_Attacks()) {
				result.add(new WNLMLLinkDescriptor(setting.getEObject(), target,
						WNLMLElementTypes.ContaminantAttacks_4002, ContaminantAttacksEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WNLMLLinkDescriptor> getOutgoingTypeModelFacetLinks_Pipe_4001(WNNode source) {
		WaterNetwork container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof WaterNetwork) {
				container = (WaterNetwork) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		for (Iterator<?> links = container.getContainsLink().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Pipe) {
				continue;
			}
			Pipe link = (Pipe) linkObject;
			if (PipeEditPart.VISUAL_ID != WNLMLVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			WNNode dst = link.getDestination();
			WNNode src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new WNLMLLinkDescriptor(src, dst, link, WNLMLElementTypes.Pipe_4001, PipeEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<WNLMLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Contaminant_Attacks_4002(
			Contaminant source) {
		LinkedList<WNLMLLinkDescriptor> result = new LinkedList<WNLMLLinkDescriptor>();
		for (Iterator<?> destinations = source.getAttacks().iterator(); destinations.hasNext();) {
			WNNode destination = (WNNode) destinations.next();
			result.add(new WNLMLLinkDescriptor(source, destination, WNLMLElementTypes.ContaminantAttacks_4002,
					ContaminantAttacksEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<WNLMLNodeDescriptor> getSemanticChildren(View view) {
			return WNLMLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WNLMLLinkDescriptor> getContainedLinks(View view) {
			return WNLMLDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WNLMLLinkDescriptor> getIncomingLinks(View view) {
			return WNLMLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<WNLMLLinkDescriptor> getOutgoingLinks(View view) {
			return WNLMLDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
