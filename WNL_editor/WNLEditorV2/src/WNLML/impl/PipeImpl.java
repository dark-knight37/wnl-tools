/**
 */
package WNLML.impl;

import WNLML.Pipe;
import WNLML.PipeStatus;
import WNLML.WNLMLPackage;
import WNLML.WNNode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link WNLML.impl.PipeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link WNLML.impl.PipeImpl#getSource <em>Source</em>}</li>
 *   <li>{@link WNLML.impl.PipeImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link WNLML.impl.PipeImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipeImpl extends EObjectImpl implements Pipe {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final PipeStatus STATUS_EDEFAULT = PipeStatus.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected PipeStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected WNNode source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected WNNode destination;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final float ID_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected float id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WNLMLPackage.Literals.PIPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PipeStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(PipeStatus newStatus) {
		PipeStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.PIPE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNNode getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (WNNode)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WNLMLPackage.PIPE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNNode basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(WNNode newSource) {
		WNNode oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.PIPE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNNode getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (WNNode)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WNLMLPackage.PIPE__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNNode basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(WNNode newDestination) {
		WNNode oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.PIPE__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(float newId) {
		float oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WNLMLPackage.PIPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WNLMLPackage.PIPE__STATUS:
				return getStatus();
			case WNLMLPackage.PIPE__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case WNLMLPackage.PIPE__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case WNLMLPackage.PIPE__ID:
				return getId();
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
			case WNLMLPackage.PIPE__STATUS:
				setStatus((PipeStatus)newValue);
				return;
			case WNLMLPackage.PIPE__SOURCE:
				setSource((WNNode)newValue);
				return;
			case WNLMLPackage.PIPE__DESTINATION:
				setDestination((WNNode)newValue);
				return;
			case WNLMLPackage.PIPE__ID:
				setId((Float)newValue);
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
			case WNLMLPackage.PIPE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case WNLMLPackage.PIPE__SOURCE:
				setSource((WNNode)null);
				return;
			case WNLMLPackage.PIPE__DESTINATION:
				setDestination((WNNode)null);
				return;
			case WNLMLPackage.PIPE__ID:
				setId(ID_EDEFAULT);
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
			case WNLMLPackage.PIPE__STATUS:
				return status != STATUS_EDEFAULT;
			case WNLMLPackage.PIPE__SOURCE:
				return source != null;
			case WNLMLPackage.PIPE__DESTINATION:
				return destination != null;
			case WNLMLPackage.PIPE__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (status: ");
		result.append(status);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PipeImpl
