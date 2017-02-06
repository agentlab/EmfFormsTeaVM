/**
 */
package cat;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see cat.CatFactory
 * @model kind="package"
 * @generated
 */
public interface CatPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cat";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://eclipse/org/emf/ecp/makeithappen/model/cat";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.ecp.makeithappen.model.cat";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CatPackage eINSTANCE = cat.impl.CatPackageImpl.init();

	/**
	 * The meta object id for the '{@link cat.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cat.impl.ActionImpl
	 * @see cat.impl.CatPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 0;

	/**
	 * The feature id for the '<em><b>Sleep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SLEEP = 0;

	/**
	 * The feature id for the '<em><b>Eat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EAT = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link cat.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cat.impl.InfoImpl
	 * @see cat.impl.CatPackageImpl#getInfo()
	 * @generated
	 */
	int INFO = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__OWNER = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__AGE = 2;

	/**
	 * The feature id for the '<em><b>Catbreed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO__CATBREED = 3;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link cat.Breeds <em>Breeds</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cat.Breeds
	 * @see cat.impl.CatPackageImpl#getBreeds()
	 * @generated
	 */
	int BREEDS = 2;

	/**
	 * The meta object id for the '{@link cat.Eat <em>Eat</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see cat.Eat
	 * @see cat.impl.CatPackageImpl#getEat()
	 * @generated
	 */
	int EAT = 3;


	/**
	 * Returns the meta object for class '{@link cat.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see cat.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link cat.Action#getSleep <em>Sleep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sleep</em>'.
	 * @see cat.Action#getSleep()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Sleep();

	/**
	 * Returns the meta object for the attribute '{@link cat.Action#getEat <em>Eat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Eat</em>'.
	 * @see cat.Action#getEat()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Eat();

	/**
	 * Returns the meta object for class '{@link cat.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see cat.Info
	 * @generated
	 */
	EClass getInfo();

	/**
	 * Returns the meta object for the attribute '{@link cat.Info#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see cat.Info#getName()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Name();

	/**
	 * Returns the meta object for the attribute '{@link cat.Info#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see cat.Info#getOwner()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Owner();

	/**
	 * Returns the meta object for the attribute '{@link cat.Info#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see cat.Info#getAge()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Age();

	/**
	 * Returns the meta object for the attribute '{@link cat.Info#getCatbreed <em>Catbreed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Catbreed</em>'.
	 * @see cat.Info#getCatbreed()
	 * @see #getInfo()
	 * @generated
	 */
	EAttribute getInfo_Catbreed();

	/**
	 * Returns the meta object for enum '{@link cat.Breeds <em>Breeds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Breeds</em>'.
	 * @see cat.Breeds
	 * @generated
	 */
	EEnum getBreeds();

	/**
	 * Returns the meta object for enum '{@link cat.Eat <em>Eat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Eat</em>'.
	 * @see cat.Eat
	 * @generated
	 */
	EEnum getEat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CatFactory getCatFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link cat.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cat.impl.ActionImpl
		 * @see cat.impl.CatPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Sleep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__SLEEP = eINSTANCE.getAction_Sleep();

		/**
		 * The meta object literal for the '<em><b>Eat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__EAT = eINSTANCE.getAction_Eat();

		/**
		 * The meta object literal for the '{@link cat.impl.InfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cat.impl.InfoImpl
		 * @see cat.impl.CatPackageImpl#getInfo()
		 * @generated
		 */
		EClass INFO = eINSTANCE.getInfo();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__NAME = eINSTANCE.getInfo_Name();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__OWNER = eINSTANCE.getInfo_Owner();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__AGE = eINSTANCE.getInfo_Age();

		/**
		 * The meta object literal for the '<em><b>Catbreed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO__CATBREED = eINSTANCE.getInfo_Catbreed();

		/**
		 * The meta object literal for the '{@link cat.Breeds <em>Breeds</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cat.Breeds
		 * @see cat.impl.CatPackageImpl#getBreeds()
		 * @generated
		 */
		EEnum BREEDS = eINSTANCE.getBreeds();

		/**
		 * The meta object literal for the '{@link cat.Eat <em>Eat</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see cat.Eat
		 * @see cat.impl.CatPackageImpl#getEat()
		 * @generated
		 */
		EEnum EAT = eINSTANCE.getEat();

	}

} //CatPackage
