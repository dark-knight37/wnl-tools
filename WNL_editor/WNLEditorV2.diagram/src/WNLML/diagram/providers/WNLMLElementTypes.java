/*
 * 
 */
package WNLML.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import WNLML.WNLMLPackage;
import WNLML.diagram.edit.parts.ConjuctionEditPart;
import WNLML.diagram.edit.parts.ContaminantAttacksEditPart;
import WNLML.diagram.edit.parts.ContaminantEditPart;
import WNLML.diagram.edit.parts.PipeEditPart;
import WNLML.diagram.edit.parts.ReservoirEditPart;
import WNLML.diagram.edit.parts.TankEditPart;
import WNLML.diagram.edit.parts.ValveEditPart;
import WNLML.diagram.edit.parts.WaterNetworkEditPart;
import WNLML.diagram.edit.parts.WaterPumpEditPart;
import WNLML.diagram.part.WNLMLDiagramEditorPlugin;

/**
 * @generated
 */
public class WNLMLElementTypes {

	/**
	* @generated
	*/
	private WNLMLElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			WNLMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType WaterNetwork_1000 = getElementType("WNLEditorV2.diagram.WaterNetwork_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType WaterPump_2001 = getElementType("WNLEditorV2.diagram.WaterPump_2001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Valve_2002 = getElementType("WNLEditorV2.diagram.Valve_2002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Reservoir_2003 = getElementType("WNLEditorV2.diagram.Reservoir_2003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Tank_2004 = getElementType("WNLEditorV2.diagram.Tank_2004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Conjuction_2005 = getElementType("WNLEditorV2.diagram.Conjuction_2005"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Contaminant_2006 = getElementType("WNLEditorV2.diagram.Contaminant_2006"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType Pipe_4001 = getElementType("WNLEditorV2.diagram.Pipe_4001"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final IElementType ContaminantAttacks_4002 = getElementType(
			"WNLEditorV2.diagram.ContaminantAttacks_4002"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(WaterNetwork_1000, WNLMLPackage.eINSTANCE.getWaterNetwork());

			elements.put(WaterPump_2001, WNLMLPackage.eINSTANCE.getWaterPump());

			elements.put(Valve_2002, WNLMLPackage.eINSTANCE.getValve());

			elements.put(Reservoir_2003, WNLMLPackage.eINSTANCE.getReservoir());

			elements.put(Tank_2004, WNLMLPackage.eINSTANCE.getTank());

			elements.put(Conjuction_2005, WNLMLPackage.eINSTANCE.getConjuction());

			elements.put(Contaminant_2006, WNLMLPackage.eINSTANCE.getContaminant());

			elements.put(Pipe_4001, WNLMLPackage.eINSTANCE.getPipe());

			elements.put(ContaminantAttacks_4002, WNLMLPackage.eINSTANCE.getContaminant_Attacks());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(WaterNetwork_1000);
			KNOWN_ELEMENT_TYPES.add(WaterPump_2001);
			KNOWN_ELEMENT_TYPES.add(Valve_2002);
			KNOWN_ELEMENT_TYPES.add(Reservoir_2003);
			KNOWN_ELEMENT_TYPES.add(Tank_2004);
			KNOWN_ELEMENT_TYPES.add(Conjuction_2005);
			KNOWN_ELEMENT_TYPES.add(Contaminant_2006);
			KNOWN_ELEMENT_TYPES.add(Pipe_4001);
			KNOWN_ELEMENT_TYPES.add(ContaminantAttacks_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case WaterNetworkEditPart.VISUAL_ID:
			return WaterNetwork_1000;
		case WaterPumpEditPart.VISUAL_ID:
			return WaterPump_2001;
		case ValveEditPart.VISUAL_ID:
			return Valve_2002;
		case ReservoirEditPart.VISUAL_ID:
			return Reservoir_2003;
		case TankEditPart.VISUAL_ID:
			return Tank_2004;
		case ConjuctionEditPart.VISUAL_ID:
			return Conjuction_2005;
		case ContaminantEditPart.VISUAL_ID:
			return Contaminant_2006;
		case PipeEditPart.VISUAL_ID:
			return Pipe_4001;
		case ContaminantAttacksEditPart.VISUAL_ID:
			return ContaminantAttacks_4002;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return WNLML.diagram.providers.WNLMLElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return WNLML.diagram.providers.WNLMLElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return WNLML.diagram.providers.WNLMLElementTypes.getElement(elementTypeAdapter);
		}
	};

}
