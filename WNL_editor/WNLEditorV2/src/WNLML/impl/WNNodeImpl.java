/**
 */
package WNLML.impl;

import WNLML.WNLMLPackage;
import WNLML.WNNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WN Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WNLML.impl.WNNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link WNLML.impl.WNNodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link WNLML.impl.WNNodeImpl#getMonitoringService <em>Monitoring Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WNNodeImpl extends EObjectImpl implements WNNode {
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
	 * The default value of the '{@link #getMonitoringService() <em>Monitoring Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringService()
	 * @generated
	 * @ordered
	 */
	protected static final String MONITORING_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMonitoringService() <em>Monitoring Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringService()
	 * @generated
	 * @ordered
	 */
	protected String monitoringService = MONITORING_SERVICE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WNNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WNLMLPackage.Literals.WN_NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.WN_NODE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.WN_NODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMonitoringService() {
		return monitoringService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringService(String newMonitoringService) {
		String oldMonitoringService = monitoringService;
		monitoringService = newMonitoringService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.WN_NODE__MONITORING_SERVICE, oldMonitoringService, monitoringService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WNLMLPackage.WN_NODE__NAME:
				return getName();
			case WNLMLPackage.WN_NODE__DESCRIPTION:
				return getDescription();
			case WNLMLPackage.WN_NODE__MONITORING_SERVICE:
				return getMonitoringService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WNLMLPackage.WN_NODE__NAME:
				setName((String)newValue);
				return;
			case WNLMLPackage.WN_NODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case WNLMLPackage.WN_NODE__MONITORING_SERVICE:
				setMonitoringService((String)newValue);
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
			case WNLMLPackage.WN_NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WNLMLPackage.WN_NODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case WNLMLPackage.WN_NODE__MONITORING_SERVICE:
				setMonitoringService(MONITORING_SERVICE_EDEFAULT);
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
			case WNLMLPackage.WN_NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WNLMLPackage.WN_NODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case WNLMLPackage.WN_NODE__MONITORING_SERVICE:
				return MONITORING_SERVICE_EDEFAULT == null ? monitoringService != null : !MONITORING_SERVICE_EDEFAULT.equals(monitoringService);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", monitoringService: ");
		result.append(monitoringService);
		result.append(')');
		return result.toString();
	}

} //WNNodeImpl
