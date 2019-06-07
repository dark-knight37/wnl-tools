/*
* 
*/
package WNLML.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import WNLML.diagram.edit.commands.ContaminantAttacksCreateCommand;
import WNLML.diagram.edit.commands.ContaminantAttacksReorientCommand;
import WNLML.diagram.edit.commands.PipeCreateCommand;
import WNLML.diagram.edit.commands.PipeReorientCommand;
import WNLML.diagram.edit.parts.ContaminantAttacksEditPart;
import WNLML.diagram.edit.parts.PipeEditPart;
import WNLML.diagram.part.WNLMLVisualIDRegistry;
import WNLML.diagram.providers.WNLMLElementTypes;

/**
 * @generated
 */
public class WaterPumpItemSemanticEditPolicy extends WNLMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WaterPumpItemSemanticEditPolicy() {
		super(WNLMLElementTypes.WaterPump_2001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (WNLMLVisualIDRegistry.getVisualID(incomingLink) == PipeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (WNLMLVisualIDRegistry.getVisualID(incomingLink) == ContaminantAttacksEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (WNLMLVisualIDRegistry.getVisualID(outgoingLink) == PipeEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (WNLMLElementTypes.Pipe_4001 == req.getElementType()) {
			return getGEFWrapper(new PipeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (WNLMLElementTypes.ContaminantAttacks_4002 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (WNLMLElementTypes.Pipe_4001 == req.getElementType()) {
			return getGEFWrapper(new PipeCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (WNLMLElementTypes.ContaminantAttacks_4002 == req.getElementType()) {
			return getGEFWrapper(new ContaminantAttacksCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case PipeEditPart.VISUAL_ID:
			return getGEFWrapper(new PipeReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ContaminantAttacksEditPart.VISUAL_ID:
			return getGEFWrapper(new ContaminantAttacksReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
