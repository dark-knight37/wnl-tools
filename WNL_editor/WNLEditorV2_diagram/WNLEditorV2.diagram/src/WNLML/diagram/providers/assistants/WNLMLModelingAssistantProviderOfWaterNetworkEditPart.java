/*
 * 
 */
package WNLML.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import WNLML.diagram.providers.WNLMLElementTypes;
import WNLML.diagram.providers.WNLMLModelingAssistantProvider;

/**
 * @generated
 */
public class WNLMLModelingAssistantProviderOfWaterNetworkEditPart extends WNLMLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(6);
		types.add(WNLMLElementTypes.WaterPump_2001);
		types.add(WNLMLElementTypes.Valve_2002);
		types.add(WNLMLElementTypes.Reservoir_2003);
		types.add(WNLMLElementTypes.Tank_2004);
		types.add(WNLMLElementTypes.Conjuction_2005);
		types.add(WNLMLElementTypes.Contaminant_2006);
		return types;
	}

}
