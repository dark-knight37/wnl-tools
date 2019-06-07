/*
* 
*/
package WNLML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import WNLML.diagram.providers.WNLMLElementTypes;

/**
 * @generated
 */
public class ContaminantAttacksItemSemanticEditPolicy extends WNLMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ContaminantAttacksItemSemanticEditPolicy() {
		super(WNLMLElementTypes.ContaminantAttacks_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
