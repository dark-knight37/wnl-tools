/**
 */
package WNLML;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Water Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WNLML.WaterNetwork#getContainsNode <em>Contains Node</em>}</li>
 *   <li>{@link WNLML.WaterNetwork#getContainsLink <em>Contains Link</em>}</li>
 *   <li>{@link WNLML.WaterNetwork#getContainsAttack <em>Contains Attack</em>}</li>
 * </ul>
 *
 * @see WNLML.WNLMLPackage#getWaterNetwork()
 * @model
 * @generated
 */
public interface WaterNetwork extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains Node</b></em>' containment reference list.
	 * The list contents are of type {@link WNLML.WNNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Node</em>' containment reference list.
	 * @see WNLML.WNLMLPackage#getWaterNetwork_ContainsNode()
	 * @model containment="true"
	 * @generated
	 */
	EList<WNNode> getContainsNode();

	/**
	 * Returns the value of the '<em><b>Contains Link</b></em>' containment reference list.
	 * The list contents are of type {@link WNLML.Pipe}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Link</em>' containment reference list.
	 * @see WNLML.WNLMLPackage#getWaterNetwork_ContainsLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pipe> getContainsLink();

	/**
	 * Returns the value of the '<em><b>Contains Attack</b></em>' containment reference list.
	 * The list contents are of type {@link WNLML.Contaminant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Attack</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Attack</em>' containment reference list.
	 * @see WNLML.WNLMLPackage#getWaterNetwork_ContainsAttack()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contaminant> getContainsAttack();

} // WaterNetwork
