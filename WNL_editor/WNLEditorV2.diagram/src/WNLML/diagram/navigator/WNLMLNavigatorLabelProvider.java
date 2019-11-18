/*
* 
*/
package WNLML.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import WNLML.diagram.edit.parts.ConjuctionEditPart;
import WNLML.diagram.edit.parts.ConjuctionNameEditPart;
import WNLML.diagram.edit.parts.ContaminantAttacksEditPart;
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
import WNLML.diagram.part.WNLMLDiagramEditorPlugin;
import WNLML.diagram.part.WNLMLVisualIDRegistry;
import WNLML.diagram.providers.WNLMLElementTypes;
import WNLML.diagram.providers.WNLMLParserProvider;

/**
 * @generated
 */
public class WNLMLNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		WNLMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		WNLMLDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof WNLMLNavigatorItem && !isOwnView(((WNLMLNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof WNLMLNavigatorGroup) {
			WNLMLNavigatorGroup group = (WNLMLNavigatorGroup) element;
			return WNLMLDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof WNLMLNavigatorItem) {
			WNLMLNavigatorItem navigatorItem = (WNLMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (WNLMLVisualIDRegistry.getVisualID(view)) {
		case WaterNetworkEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?WNL?WaterNetwork", WNLMLElementTypes.WaterNetwork_1000); //$NON-NLS-1$
		case WaterPumpEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?WNL?WaterPump", WNLMLElementTypes.WaterPump_2001); //$NON-NLS-1$
		case ValveEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?WNL?Valve", WNLMLElementTypes.Valve_2002); //$NON-NLS-1$
		case ReservoirEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?WNL?Reservoir", WNLMLElementTypes.Reservoir_2003); //$NON-NLS-1$
		case TankEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?WNL?Tank", WNLMLElementTypes.Tank_2004); //$NON-NLS-1$
		case ConjuctionEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?WNL?Conjuction", WNLMLElementTypes.Conjuction_2005); //$NON-NLS-1$
		case ContaminantEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?WNL?Contaminant", WNLMLElementTypes.Contaminant_2006); //$NON-NLS-1$
		case PipeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?WNL?Pipe", WNLMLElementTypes.Pipe_4001); //$NON-NLS-1$
		case ContaminantAttacksEditPart.VISUAL_ID:
			return getImage("Navigator?Link?WNL?Contaminant?attacks", WNLMLElementTypes.ContaminantAttacks_4002); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = WNLMLDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && WNLMLElementTypes.isKnownElementType(elementType)) {
			image = WNLMLElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof WNLMLNavigatorGroup) {
			WNLMLNavigatorGroup group = (WNLMLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof WNLMLNavigatorItem) {
			WNLMLNavigatorItem navigatorItem = (WNLMLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (WNLMLVisualIDRegistry.getVisualID(view)) {
		case WaterNetworkEditPart.VISUAL_ID:
			return getWaterNetwork_1000Text(view);
		case WaterPumpEditPart.VISUAL_ID:
			return getWaterPump_2001Text(view);
		case ValveEditPart.VISUAL_ID:
			return getValve_2002Text(view);
		case ReservoirEditPart.VISUAL_ID:
			return getReservoir_2003Text(view);
		case TankEditPart.VISUAL_ID:
			return getTank_2004Text(view);
		case ConjuctionEditPart.VISUAL_ID:
			return getConjuction_2005Text(view);
		case ContaminantEditPart.VISUAL_ID:
			return getContaminant_2006Text(view);
		case PipeEditPart.VISUAL_ID:
			return getPipe_4001Text(view);
		case ContaminantAttacksEditPart.VISUAL_ID:
			return getContaminantAttacks_4002Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWaterNetwork_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getWaterPump_2001Text(View view) {
		IParser parser = WNLMLParserProvider.getParser(WNLMLElementTypes.WaterPump_2001,
				view.getElement() != null ? view.getElement() : view,
				WNLMLVisualIDRegistry.getType(WaterPumpNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WNLMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getValve_2002Text(View view) {
		IParser parser = WNLMLParserProvider.getParser(WNLMLElementTypes.Valve_2002,
				view.getElement() != null ? view.getElement() : view,
				WNLMLVisualIDRegistry.getType(ValveNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WNLMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getReservoir_2003Text(View view) {
		IParser parser = WNLMLParserProvider.getParser(WNLMLElementTypes.Reservoir_2003,
				view.getElement() != null ? view.getElement() : view,
				WNLMLVisualIDRegistry.getType(ReservoirNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WNLMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTank_2004Text(View view) {
		IParser parser = WNLMLParserProvider.getParser(WNLMLElementTypes.Tank_2004,
				view.getElement() != null ? view.getElement() : view,
				WNLMLVisualIDRegistry.getType(TankNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WNLMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getConjuction_2005Text(View view) {
		IParser parser = WNLMLParserProvider.getParser(WNLMLElementTypes.Conjuction_2005,
				view.getElement() != null ? view.getElement() : view,
				WNLMLVisualIDRegistry.getType(ConjuctionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WNLMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContaminant_2006Text(View view) {
		IParser parser = WNLMLParserProvider.getParser(WNLMLElementTypes.Contaminant_2006,
				view.getElement() != null ? view.getElement() : view,
				WNLMLVisualIDRegistry.getType(ContaminantNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WNLMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPipe_4001Text(View view) {
		IParser parser = WNLMLParserProvider.getParser(WNLMLElementTypes.Pipe_4001,
				view.getElement() != null ? view.getElement() : view,
				WNLMLVisualIDRegistry.getType(PipeIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WNLMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getContaminantAttacks_4002Text(View view) {
		IParser parser = WNLMLParserProvider.getParser(WNLMLElementTypes.ContaminantAttacks_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			WNLMLDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return WaterNetworkEditPart.MODEL_ID.equals(WNLMLVisualIDRegistry.getModelID(view));
	}

}
