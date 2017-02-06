/**
 */
package cat;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cat.Action#getSleep <em>Sleep</em>}</li>
 *   <li>{@link cat.Action#getEat <em>Eat</em>}</li>
 * </ul>
 *
 * @see cat.CatPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Sleep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sleep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sleep</em>' attribute.
	 * @see #setSleep(int)
	 * @see cat.CatPackage#getAction_Sleep()
	 * @model
	 * @generated
	 */
	int getSleep();

	/**
	 * Sets the value of the '{@link cat.Action#getSleep <em>Sleep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sleep</em>' attribute.
	 * @see #getSleep()
	 * @generated
	 */
	void setSleep(int value);

	/**
	 * Returns the value of the '<em><b>Eat</b></em>' attribute.
	 * The literals are from the enumeration {@link cat.Eat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eat</em>' attribute.
	 * @see cat.Eat
	 * @see #setEat(Eat)
	 * @see cat.CatPackage#getAction_Eat()
	 * @model
	 * @generated
	 */
	Eat getEat();

	/**
	 * Sets the value of the '{@link cat.Action#getEat <em>Eat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eat</em>' attribute.
	 * @see cat.Eat
	 * @see #getEat()
	 * @generated
	 */
	void setEat(Eat value);

} // Action
