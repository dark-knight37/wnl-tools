/*
 * 
 */
package WNLML.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import WNLML.diagram.edit.parts.WNLMLEditPartFactory;
import WNLML.diagram.edit.parts.WaterNetworkEditPart;
import WNLML.diagram.part.WNLMLVisualIDRegistry;

/**
 * @generated
 */
public class WNLMLEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public WNLMLEditPartProvider() {
		super(new WNLMLEditPartFactory(), WNLMLVisualIDRegistry.TYPED_INSTANCE, WaterNetworkEditPart.MODEL_ID);
	}

}
