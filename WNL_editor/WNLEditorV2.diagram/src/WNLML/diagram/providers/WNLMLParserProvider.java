/*
 * 
 */
package WNLML.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import WNLML.WNLMLPackage;
import WNLML.diagram.edit.parts.ConjuctionNameEditPart;
import WNLML.diagram.edit.parts.ContaminantNameEditPart;
import WNLML.diagram.edit.parts.PipeIdEditPart;
import WNLML.diagram.edit.parts.ReservoirNameEditPart;
import WNLML.diagram.edit.parts.TankNameEditPart;
import WNLML.diagram.edit.parts.ValveNameEditPart;
import WNLML.diagram.edit.parts.WaterPumpNameEditPart;
import WNLML.diagram.parsers.MessageFormatParser;
import WNLML.diagram.part.WNLMLVisualIDRegistry;

/**
 * @generated
 */
public class WNLMLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser waterPumpName_5001Parser;

	/**
	* @generated
	*/
	private IParser getWaterPumpName_5001Parser() {
		if (waterPumpName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { WNLMLPackage.eINSTANCE.getWNNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			waterPumpName_5001Parser = parser;
		}
		return waterPumpName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser valveName_5002Parser;

	/**
	* @generated
	*/
	private IParser getValveName_5002Parser() {
		if (valveName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { WNLMLPackage.eINSTANCE.getWNNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			valveName_5002Parser = parser;
		}
		return valveName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser reservoirName_5003Parser;

	/**
	* @generated
	*/
	private IParser getReservoirName_5003Parser() {
		if (reservoirName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { WNLMLPackage.eINSTANCE.getWNNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			reservoirName_5003Parser = parser;
		}
		return reservoirName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser tankName_5004Parser;

	/**
	* @generated
	*/
	private IParser getTankName_5004Parser() {
		if (tankName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { WNLMLPackage.eINSTANCE.getWNNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tankName_5004Parser = parser;
		}
		return tankName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser conjuctionName_5005Parser;

	/**
	* @generated
	*/
	private IParser getConjuctionName_5005Parser() {
		if (conjuctionName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { WNLMLPackage.eINSTANCE.getWNNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			conjuctionName_5005Parser = parser;
		}
		return conjuctionName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser contaminantName_5006Parser;

	/**
	* @generated
	*/
	private IParser getContaminantName_5006Parser() {
		if (contaminantName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { WNLMLPackage.eINSTANCE.getContaminant_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			contaminantName_5006Parser = parser;
		}
		return contaminantName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser pipeId_6001Parser;

	/**
	* @generated
	*/
	private IParser getPipeId_6001Parser() {
		if (pipeId_6001Parser == null) {
			EAttribute[] features = new EAttribute[] { WNLMLPackage.eINSTANCE.getPipe_Id() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pipeId_6001Parser = parser;
		}
		return pipeId_6001Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case WaterPumpNameEditPart.VISUAL_ID:
			return getWaterPumpName_5001Parser();
		case ValveNameEditPart.VISUAL_ID:
			return getValveName_5002Parser();
		case ReservoirNameEditPart.VISUAL_ID:
			return getReservoirName_5003Parser();
		case TankNameEditPart.VISUAL_ID:
			return getTankName_5004Parser();
		case ConjuctionNameEditPart.VISUAL_ID:
			return getConjuctionName_5005Parser();
		case ContaminantNameEditPart.VISUAL_ID:
			return getContaminantName_5006Parser();
		case PipeIdEditPart.VISUAL_ID:
			return getPipeId_6001Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(WNLMLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(WNLMLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (WNLMLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
