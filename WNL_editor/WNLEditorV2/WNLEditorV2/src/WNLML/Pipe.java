/**
 */
package WNLML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link WNLML.Pipe#getStatus <em>Status</em>}</li>
 *   <li>{@link WNLML.Pipe#getFlowrate <em>Flowrate</em>}</li>
 *   <li>{@link WNLML.Pipe#getSource <em>Source</em>}</li>
 *   <li>{@link WNLML.Pipe#getDestination <em>Destination</em>}</li>
 *   <li>{@link WNLML.Pipe#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see WNLML.WNLMLPackage#getPipe()
 * @model annotation="gmf.link label='id' source='source' target='destination' target.decoration='arrow' color='128,128,128' width='2'"
 * @generated
 */
public interface Pipe extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link WNLML.PipeStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see WNLML.PipeStatus
	 * @see #setStatus(PipeStatus)
	 * @see WNLML.WNLMLPackage#getPipe_Status()
	 * @model
	 * @generated
	 */
	PipeStatus getStatus();

	/**
	 * Sets the value of the '{@link WNLML.Pipe#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see WNLML.PipeStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(PipeStatus value);

	/**
	 * Returns the value of the '<em><b>Flowrate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flowrate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flowrate</em>' attribute.
	 * @see #setFlowrate(float)
	 * @see WNLML.WNLMLPackage#getPipe_Flowrate()
	 * @model
	 * @generated
	 */
	float getFlowrate();

	/**
	 * Sets the value of the '{@link WNLML.Pipe#getFlowrate <em>Flowrate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flowrate</em>' attribute.
	 * @see #getFlowrate()
	 * @generated
	 */
	void setFlowrate(float value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(WNNode)
	 * @see WNLML.WNLMLPackage#getPipe_Source()
	 * @model required="true"
	 * @generated
	 */
	WNNode getSource();

	/**
	 * Sets the value of the '{@link WNLML.Pipe#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(WNNode value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(WNNode)
	 * @see WNLML.WNLMLPackage#getPipe_Destination()
	 * @model required="true"
	 * @generated
	 */
	WNNode getDestination();

	/**
	 * Sets the value of the '{@link WNLML.Pipe#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(WNNode value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see WNLML.WNLMLPackage#getPipe_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link WNLML.Pipe#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Pipe
