/*
 * 
 */
package WNLML.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import WNLML.diagram.part.WNLMLVisualIDRegistry;

/**
 * @generated
 */
public class WNLMLEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (WNLMLVisualIDRegistry.getVisualID(view)) {

			case WaterNetworkEditPart.VISUAL_ID:
				return new WaterNetworkEditPart(view);

			case WaterPumpEditPart.VISUAL_ID:
				return new WaterPumpEditPart(view);

			case WaterPumpNameEditPart.VISUAL_ID:
				return new WaterPumpNameEditPart(view);

			case ValveEditPart.VISUAL_ID:
				return new ValveEditPart(view);

			case ValveNameEditPart.VISUAL_ID:
				return new ValveNameEditPart(view);

			case ReservoirEditPart.VISUAL_ID:
				return new ReservoirEditPart(view);

			case ReservoirNameEditPart.VISUAL_ID:
				return new ReservoirNameEditPart(view);

			case TankEditPart.VISUAL_ID:
				return new TankEditPart(view);

			case TankNameEditPart.VISUAL_ID:
				return new TankNameEditPart(view);

			case ConjuctionEditPart.VISUAL_ID:
				return new ConjuctionEditPart(view);

			case ConjuctionNameEditPart.VISUAL_ID:
				return new ConjuctionNameEditPart(view);

			case ContaminantEditPart.VISUAL_ID:
				return new ContaminantEditPart(view);

			case ContaminantNameEditPart.VISUAL_ID:
				return new ContaminantNameEditPart(view);

			case PipeEditPart.VISUAL_ID:
				return new PipeEditPart(view);

			case PipeIdEditPart.VISUAL_ID:
				return new PipeIdEditPart(view);

			case ContaminantAttacksEditPart.VISUAL_ID:
				return new ContaminantAttacksEditPart(view);

			case ContaminantAttacksExternalLabelEditPart.VISUAL_ID:
				return new ContaminantAttacksExternalLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
