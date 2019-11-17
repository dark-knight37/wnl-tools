/**
 */
package WNLML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import WNLML.Contaminant;
import WNLML.Pipe;
import WNLML.WNLMLPackage;
import WNLML.WNNode;
import WNLML.WaterNetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Water Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WNLML.impl.WaterNetworkImpl#getContainsNode <em>Contains Node</em>}</li>
 *   <li>{@link WNLML.impl.WaterNetworkImpl#getContainsLink <em>Contains Link</em>}</li>
 *   <li>{@link WNLML.impl.WaterNetworkImpl#getContainsAttack <em>Contains Attack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WaterNetworkImpl extends EObjectImpl implements WaterNetwork {
	/**
	 * The cached value of the '{@link #getContainsNode() <em>Contains Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsNode()
	 * @generated
	 * @ordered
	 */
	protected EList<WNNode> containsNode;

	/**
	 * The cached value of the '{@link #getContainsLink() <em>Contains Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Pipe> containsLink;

	/**
	 * The cached value of the '{@link #getContainsAttack() <em>Contains Attack</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsAttack()
	 * @generated
	 * @ordered
	 */
	protected EList<Contaminant> containsAttack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaterNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WNLMLPackage.Literals.WATER_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WNNode> getContainsNode() {
		if (containsNode == null) {
			containsNode = new EObjectContainmentEList<WNNode>(WNNode.class, this, WNLMLPackage.WATER_NETWORK__CONTAINS_NODE);
		}
		return containsNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pipe> getContainsLink() {
		if (containsLink == null) {
			containsLink = new EObjectContainmentEList<Pipe>(Pipe.class, this, WNLMLPackage.WATER_NETWORK__CONTAINS_LINK);
		}
		return containsLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contaminant> getContainsAttack() {
		if (containsAttack == null) {
			containsAttack = new EObjectContainmentEList<Contaminant>(Contaminant.class, this, WNLMLPackage.WATER_NETWORK__CONTAINS_ATTACK);
		}
		return containsAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WNLMLPackage.WATER_NETWORK__CONTAINS_NODE:
				return ((InternalEList<?>)getContainsNode()).basicRemove(otherEnd, msgs);
			case WNLMLPackage.WATER_NETWORK__CONTAINS_LINK:
				return ((InternalEList<?>)getContainsLink()).basicRemove(otherEnd, msgs);
			case WNLMLPackage.WATER_NETWORK__CONTAINS_ATTACK:
				return ((InternalEList<?>)getContainsAttack()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WNLMLPackage.WATER_NETWORK__CONTAINS_NODE:
				return getContainsNode();
			case WNLMLPackage.WATER_NETWORK__CONTAINS_LINK:
				return getContainsLink();
			case WNLMLPackage.WATER_NETWORK__CONTAINS_ATTACK:
				return getContainsAttack();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WNLMLPackage.WATER_NETWORK__CONTAINS_NODE:
				getContainsNode().clear();
				getContainsNode().addAll((Collection<? extends WNNode>)newValue);
				return;
			case WNLMLPackage.WATER_NETWORK__CONTAINS_LINK:
				getContainsLink().clear();
				getContainsLink().addAll((Collection<? extends Pipe>)newValue);
				return;
			case WNLMLPackage.WATER_NETWORK__CONTAINS_ATTACK:
				getContainsAttack().clear();
				getContainsAttack().addAll((Collection<? extends Contaminant>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WNLMLPackage.WATER_NETWORK__CONTAINS_NODE:
				getContainsNode().clear();
				return;
			case WNLMLPackage.WATER_NETWORK__CONTAINS_LINK:
				getContainsLink().clear();
				return;
			case WNLMLPackage.WATER_NETWORK__CONTAINS_ATTACK:
				getContainsAttack().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WNLMLPackage.WATER_NETWORK__CONTAINS_NODE:
				return containsNode != null && !containsNode.isEmpty();
			case WNLMLPackage.WATER_NETWORK__CONTAINS_LINK:
				return containsLink != null && !containsLink.isEmpty();
			case WNLMLPackage.WATER_NETWORK__CONTAINS_ATTACK:
				return containsAttack != null && !containsAttack.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WaterNetworkImpl
