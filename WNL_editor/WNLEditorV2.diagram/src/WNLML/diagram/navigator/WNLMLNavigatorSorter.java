/*
* 
*/
package WNLML.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import WNLML.diagram.part.WNLMLVisualIDRegistry;

/**
 * @generated
 */
public class WNLMLNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 4004;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 4003;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof WNLMLNavigatorItem) {
			WNLMLNavigatorItem item = (WNLMLNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return WNLMLVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
