/*
 * 
 */
package WNLML.diagram.providers;

import WNLML.diagram.part.WNLMLDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = WNLMLDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			WNLMLDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
