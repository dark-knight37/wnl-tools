package figures;

import org.eclipse.draw2d.ImageFigure;
import activator.PluginActivator;

/**
 * @generated
 */
public class TankFigure extends ImageFigure {

    public TankFigure() {
        super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID, "images/tank.png").createImage(), 0);
    }

}