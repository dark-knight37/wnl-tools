/*
 * 
 */
package WNLML.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import WNLML.diagram.edit.parts.ConjuctionEditPart;
import WNLML.diagram.edit.parts.ReservoirEditPart;
import WNLML.diagram.edit.parts.TankEditPart;
import WNLML.diagram.edit.parts.ValveEditPart;
import WNLML.diagram.edit.parts.WaterPumpEditPart;
import WNLML.diagram.providers.WNLMLElementTypes;
import WNLML.diagram.providers.WNLMLModelingAssistantProvider;

/**
 * @generated
 */
public class WNLMLModelingAssistantProviderOfTankEditPart extends WNLMLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((TankEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(TankEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(WNLMLElementTypes.Pipe_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((TankEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(TankEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof WaterPumpEditPart) {
			types.add(WNLMLElementTypes.Pipe_4001);
		}
		if (targetEditPart instanceof ValveEditPart) {
			types.add(WNLMLElementTypes.Pipe_4001);
		}
		if (targetEditPart instanceof ReservoirEditPart) {
			types.add(WNLMLElementTypes.Pipe_4001);
		}
		if (targetEditPart instanceof TankEditPart) {
			types.add(WNLMLElementTypes.Pipe_4001);
		}
		if (targetEditPart instanceof ConjuctionEditPart) {
			types.add(WNLMLElementTypes.Pipe_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((TankEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(TankEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WNLMLElementTypes.Pipe_4001) {
			types.add(WNLMLElementTypes.WaterPump_2001);
			types.add(WNLMLElementTypes.Valve_2002);
			types.add(WNLMLElementTypes.Reservoir_2003);
			types.add(WNLMLElementTypes.Tank_2004);
			types.add(WNLMLElementTypes.Conjuction_2005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((TankEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(TankEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(WNLMLElementTypes.Pipe_4001);
		types.add(WNLMLElementTypes.ContaminantAttacks_4002);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((TankEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(TankEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == WNLMLElementTypes.Pipe_4001) {
			types.add(WNLMLElementTypes.WaterPump_2001);
			types.add(WNLMLElementTypes.Valve_2002);
			types.add(WNLMLElementTypes.Reservoir_2003);
			types.add(WNLMLElementTypes.Tank_2004);
			types.add(WNLMLElementTypes.Conjuction_2005);
		} else if (relationshipType == WNLMLElementTypes.ContaminantAttacks_4002) {
			types.add(WNLMLElementTypes.Contaminant_2006);
		}
		return types;
	}

}
