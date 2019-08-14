/*
* 
*/
package WNLML.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import WNLML.diagram.edit.commands.ConjuctionCreateCommand;
import WNLML.diagram.edit.commands.ContaminantCreateCommand;
import WNLML.diagram.edit.commands.ReservoirCreateCommand;
import WNLML.diagram.edit.commands.TankCreateCommand;
import WNLML.diagram.edit.commands.ValveCreateCommand;
import WNLML.diagram.edit.commands.WaterPumpCreateCommand;
import WNLML.diagram.providers.WNLMLElementTypes;

/**
 * @generated
 */
public class WaterNetworkItemSemanticEditPolicy extends WNLMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WaterNetworkItemSemanticEditPolicy() {
		super(WNLMLElementTypes.WaterNetwork_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (WNLMLElementTypes.WaterPump_2001 == req.getElementType()) {
			return getGEFWrapper(new WaterPumpCreateCommand(req));
		}
		if (WNLMLElementTypes.Valve_2002 == req.getElementType()) {
			return getGEFWrapper(new ValveCreateCommand(req));
		}
		if (WNLMLElementTypes.Reservoir_2003 == req.getElementType()) {
			return getGEFWrapper(new ReservoirCreateCommand(req));
		}
		if (WNLMLElementTypes.Tank_2004 == req.getElementType()) {
			return getGEFWrapper(new TankCreateCommand(req));
		}
		if (WNLMLElementTypes.Conjuction_2005 == req.getElementType()) {
			return getGEFWrapper(new ConjuctionCreateCommand(req));
		}
		if (WNLMLElementTypes.Contaminant_2006 == req.getElementType()) {
			return getGEFWrapper(new ContaminantCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
