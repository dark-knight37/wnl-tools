/*
* 
*/
package WNLML.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import WNLML.diagram.providers.WNLMLElementTypes;

/**
 * @generated
 */
public class PipeItemSemanticEditPolicy extends WNLMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public PipeItemSemanticEditPolicy() {
		super(WNLMLElementTypes.Pipe_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
