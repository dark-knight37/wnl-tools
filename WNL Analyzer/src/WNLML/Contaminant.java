/**
 */
package WNLML;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contaminant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WNLML.Contaminant#getConcentration <em>Concentration</em>}</li>
 *   <li>{@link WNLML.Contaminant#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link WNLML.Contaminant#getName <em>Name</em>}</li>
 *   <li>{@link WNLML.Contaminant#getDescription <em>Description</em>}</li>
 *   <li>{@link WNLML.Contaminant#getSuccessProb <em>Success Prob</em>}</li>
 * </ul>
 *
 * @see WNLML.WNLMLPackage#getContaminant()
 * @model annotation="gmf.node label='name' label.icon='false' label.placement='external' figure='figures.HazardFigure' border.color='0,0,0' size='80,80'"
 * @generated
 */
public interface Contaminant extends EObject {
	/**
	 * Returns the value of the '<em><b>Concentration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concentration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concentration</em>' attribute.
	 * @see #setConcentration(float)
	 * @see WNLML.WNLMLPackage#getContaminant_Concentration()
	 * @model
	 * @generated
	 */
	float getConcentration();

	/**
	 * Sets the value of the '{@link WNLML.Contaminant#getConcentration <em>Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concentration</em>' attribute.
	 * @see #getConcentration()
	 * @generated
	 */
	void setConcentration(float value);

	/**
	 * Returns the value of the '<em><b>Attacks</b></em>' reference list.
	 * The list contents are of type {@link WNLML.WNNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attacks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attacks</em>' reference list.
	 * @see WNLML.WNLMLPackage#getContaminant_Attacks()
	 * @model required="true"
	 *        annotation="gmf.link label='ID' target='destination' target.decoration='arrow' style='dot' color='255,0,0' width='2'"
	 * @generated
	 */
	EList<WNNode> getAttacks();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see WNLML.WNLMLPackage#getContaminant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link WNLML.Contaminant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see WNLML.WNLMLPackage#getContaminant_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link WNLML.Contaminant#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Success Prob</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Prob</em>' attribute.
	 * @see #setSuccessProb(float)
	 * @see WNLML.WNLMLPackage#getContaminant_SuccessProb()
	 * @model
	 * @generated
	 */
	float getSuccessProb();

	/**
	 * Sets the value of the '{@link WNLML.Contaminant#getSuccessProb <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Prob</em>' attribute.
	 * @see #getSuccessProb()
	 * @generated
	 */
	void setSuccessProb(float value);

} // Contaminant
