/**
 */
package cat.impl;

import cat.Action;
import cat.CatPackage;

import cat.Eat;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cat.impl.ActionImpl#getSleep <em>Sleep</em>}</li>
 *   <li>{@link cat.impl.ActionImpl#getEat <em>Eat</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleep()
	 * @generated
	 * @ordered
	 */
	protected static final int SLEEP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSleep() <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSleep()
	 * @generated
	 * @ordered
	 */
	protected int sleep = SLEEP_EDEFAULT;

	/**
	 * The default value of the '{@link #getEat() <em>Eat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEat()
	 * @generated
	 * @ordered
	 */
	protected static final Eat EAT_EDEFAULT = Eat.NO;

	/**
	 * The cached value of the '{@link #getEat() <em>Eat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEat()
	 * @generated
	 * @ordered
	 */
	protected Eat eat = EAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CatPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSleep() {
		return sleep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSleep(int newSleep) {
		int oldSleep = sleep;
		sleep = newSleep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatPackage.ACTION__SLEEP, oldSleep, sleep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Eat getEat() {
		return eat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEat(Eat newEat) {
		Eat oldEat = eat;
		eat = newEat == null ? EAT_EDEFAULT : newEat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CatPackage.ACTION__EAT, oldEat, eat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CatPackage.ACTION__SLEEP:
				return getSleep();
			case CatPackage.ACTION__EAT:
				return getEat();
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
			case CatPackage.ACTION__SLEEP:
				setSleep((Integer)newValue);
				return;
			case CatPackage.ACTION__EAT:
				setEat((Eat)newValue);
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
			case CatPackage.ACTION__SLEEP:
				setSleep(SLEEP_EDEFAULT);
				return;
			case CatPackage.ACTION__EAT:
				setEat(EAT_EDEFAULT);
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
			case CatPackage.ACTION__SLEEP:
				return sleep != SLEEP_EDEFAULT;
			case CatPackage.ACTION__EAT:
				return eat != EAT_EDEFAULT;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sleep: ");
		result.append(sleep);
		result.append(", eat: ");
		result.append(eat);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
