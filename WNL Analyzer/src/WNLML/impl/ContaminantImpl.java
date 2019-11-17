/**
 */
package WNLML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import WNLML.Contaminant;
import WNLML.WNLMLPackage;
import WNLML.WNNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contaminant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WNLML.impl.ContaminantImpl#getConcentration <em>Concentration</em>}</li>
 *   <li>{@link WNLML.impl.ContaminantImpl#getAttacks <em>Attacks</em>}</li>
 *   <li>{@link WNLML.impl.ContaminantImpl#getName <em>Name</em>}</li>
 *   <li>{@link WNLML.impl.ContaminantImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WNLML.impl.ContaminantImpl#getSuccessProb <em>Success Prob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContaminantImpl extends EObjectImpl implements Contaminant {
	/**
	 * The default value of the '{@link #getConcentration() <em>Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentration()
	 * @generated
	 * @ordered
	 */
	protected static final float CONCENTRATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getConcentration() <em>Concentration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcentration()
	 * @generated
	 * @ordered
	 */
	protected float concentration = CONCENTRATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttacks() <em>Attacks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacks()
	 * @generated
	 * @ordered
	 */
	protected EList<WNNode> attacks;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSuccessProb() <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessProb()
	 * @generated
	 * @ordered
	 */
	protected static final float SUCCESS_PROB_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSuccessProb() <em>Success Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessProb()
	 * @generated
	 * @ordered
	 */
	protected float successProb = SUCCESS_PROB_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContaminantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WNLMLPackage.Literals.CONTAMINANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getConcentration() {
		return concentration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcentration(float newConcentration) {
		float oldConcentration = concentration;
		concentration = newConcentration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.CONTAMINANT__CONCENTRATION, oldConcentration, concentration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WNNode> getAttacks() {
		if (attacks == null) {
			attacks = new EObjectResolvingEList<WNNode>(WNNode.class, this, WNLMLPackage.CONTAMINANT__ATTACKS);
		}
		return attacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.CONTAMINANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.CONTAMINANT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSuccessProb() {
		return successProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessProb(float newSuccessProb) {
		float oldSuccessProb = successProb;
		successProb = newSuccessProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.CONTAMINANT__SUCCESS_PROB, oldSuccessProb, successProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WNLMLPackage.CONTAMINANT__CONCENTRATION:
				return getConcentration();
			case WNLMLPackage.CONTAMINANT__ATTACKS:
				return getAttacks();
			case WNLMLPackage.CONTAMINANT__NAME:
				return getName();
			case WNLMLPackage.CONTAMINANT__DESCRIPTION:
				return getDescription();
			case WNLMLPackage.CONTAMINANT__SUCCESS_PROB:
				return getSuccessProb();
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
			case WNLMLPackage.CONTAMINANT__CONCENTRATION:
				setConcentration((Float)newValue);
				return;
			case WNLMLPackage.CONTAMINANT__ATTACKS:
				getAttacks().clear();
				getAttacks().addAll((Collection<? extends WNNode>)newValue);
				return;
			case WNLMLPackage.CONTAMINANT__NAME:
				setName((String)newValue);
				return;
			case WNLMLPackage.CONTAMINANT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WNLMLPackage.CONTAMINANT__SUCCESS_PROB:
				setSuccessProb((Float)newValue);
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
			case WNLMLPackage.CONTAMINANT__CONCENTRATION:
				setConcentration(CONCENTRATION_EDEFAULT);
				return;
			case WNLMLPackage.CONTAMINANT__ATTACKS:
				getAttacks().clear();
				return;
			case WNLMLPackage.CONTAMINANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WNLMLPackage.CONTAMINANT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WNLMLPackage.CONTAMINANT__SUCCESS_PROB:
				setSuccessProb(SUCCESS_PROB_EDEFAULT);
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
			case WNLMLPackage.CONTAMINANT__CONCENTRATION:
				return concentration != CONCENTRATION_EDEFAULT;
			case WNLMLPackage.CONTAMINANT__ATTACKS:
				return attacks != null && !attacks.isEmpty();
			case WNLMLPackage.CONTAMINANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WNLMLPackage.CONTAMINANT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WNLMLPackage.CONTAMINANT__SUCCESS_PROB:
				return successProb != SUCCESS_PROB_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (concentration: ");
		result.append(concentration);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", successProb: ");
		result.append(successProb);
		result.append(')');
		return result.toString();
	}

} //ContaminantImpl
