
/*
 * 
 */
package WNLML.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import WNLML.diagram.providers.WNLMLElementTypes;

/**
 * @generated
 */
public class WNLMLPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createConjuction1CreationTool());
		paletteContainer.add(createContaminant2CreationTool());
		paletteContainer.add(createReservoir3CreationTool());
		paletteContainer.add(createTank4CreationTool());
		paletteContainer.add(createValve5CreationTool());
		paletteContainer.add(createWaterPump6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAttacks1CreationTool());
		paletteContainer.add(createPipe2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createConjuction1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Conjuction1CreationTool_title,
				Messages.Conjuction1CreationTool_desc, Collections.singletonList(WNLMLElementTypes.Conjuction_2005));
		entry.setId("createConjuction1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WNLMLElementTypes.getImageDescriptor(WNLMLElementTypes.Conjuction_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createContaminant2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Contaminant2CreationTool_title,
				Messages.Contaminant2CreationTool_desc, Collections.singletonList(WNLMLElementTypes.Contaminant_2006));
		entry.setId("createContaminant2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WNLMLElementTypes.getImageDescriptor(WNLMLElementTypes.Contaminant_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createReservoir3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Reservoir3CreationTool_title,
				Messages.Reservoir3CreationTool_desc, Collections.singletonList(WNLMLElementTypes.Reservoir_2003));
		entry.setId("createReservoir3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WNLMLElementTypes.getImageDescriptor(WNLMLElementTypes.Reservoir_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTank4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Tank4CreationTool_title,
				Messages.Tank4CreationTool_desc, Collections.singletonList(WNLMLElementTypes.Tank_2004));
		entry.setId("createTank4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WNLMLElementTypes.getImageDescriptor(WNLMLElementTypes.Tank_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createValve5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Valve5CreationTool_title,
				Messages.Valve5CreationTool_desc, Collections.singletonList(WNLMLElementTypes.Valve_2002));
		entry.setId("createValve5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WNLMLElementTypes.getImageDescriptor(WNLMLElementTypes.Valve_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWaterPump6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.WaterPump6CreationTool_title,
				Messages.WaterPump6CreationTool_desc, Collections.singletonList(WNLMLElementTypes.WaterPump_2001));
		entry.setId("createWaterPump6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WNLMLElementTypes.getImageDescriptor(WNLMLElementTypes.WaterPump_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttacks1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Attacks1CreationTool_title,
				Messages.Attacks1CreationTool_desc,
				Collections.singletonList(WNLMLElementTypes.ContaminantAttacks_4002));
		entry.setId("createAttacks1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WNLMLElementTypes.getImageDescriptor(WNLMLElementTypes.ContaminantAttacks_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPipe2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Pipe2CreationTool_title,
				Messages.Pipe2CreationTool_desc, Collections.singletonList(WNLMLElementTypes.Pipe_4001));
		entry.setId("createPipe2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(WNLMLElementTypes.getImageDescriptor(WNLMLElementTypes.Pipe_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
