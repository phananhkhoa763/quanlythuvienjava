/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package danhmuc.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import danhmuc.model.phieugiahan;

import java.util.List;

/**
 * The persistence utility for the phieugiahan service. This utility wraps {@link phieugiahanPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LAPTOP
 * @see phieugiahanPersistence
 * @see phieugiahanPersistenceImpl
 * @generated
 */
public class phieugiahanUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(phieugiahan phieugiahan) {
		getPersistence().clearCache(phieugiahan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<phieugiahan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<phieugiahan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<phieugiahan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static phieugiahan update(phieugiahan phieugiahan)
		throws SystemException {
		return getPersistence().update(phieugiahan);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static phieugiahan update(phieugiahan phieugiahan,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(phieugiahan, serviceContext);
	}

	/**
	* Caches the phieugiahan in the entity cache if it is enabled.
	*
	* @param phieugiahan the phieugiahan
	*/
	public static void cacheResult(danhmuc.model.phieugiahan phieugiahan) {
		getPersistence().cacheResult(phieugiahan);
	}

	/**
	* Caches the phieugiahans in the entity cache if it is enabled.
	*
	* @param phieugiahans the phieugiahans
	*/
	public static void cacheResult(
		java.util.List<danhmuc.model.phieugiahan> phieugiahans) {
		getPersistence().cacheResult(phieugiahans);
	}

	/**
	* Creates a new phieugiahan with the primary key. Does not add the phieugiahan to the database.
	*
	* @param id the primary key for the new phieugiahan
	* @return the new phieugiahan
	*/
	public static danhmuc.model.phieugiahan create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the phieugiahan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phieugiahan
	* @return the phieugiahan that was removed
	* @throws danhmuc.NoSuchphieugiahanException if a phieugiahan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.phieugiahan remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			danhmuc.NoSuchphieugiahanException {
		return getPersistence().remove(id);
	}

	public static danhmuc.model.phieugiahan updateImpl(
		danhmuc.model.phieugiahan phieugiahan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(phieugiahan);
	}

	/**
	* Returns the phieugiahan with the primary key or throws a {@link danhmuc.NoSuchphieugiahanException} if it could not be found.
	*
	* @param id the primary key of the phieugiahan
	* @return the phieugiahan
	* @throws danhmuc.NoSuchphieugiahanException if a phieugiahan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.phieugiahan findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			danhmuc.NoSuchphieugiahanException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the phieugiahan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the phieugiahan
	* @return the phieugiahan, or <code>null</code> if a phieugiahan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.phieugiahan fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the phieugiahans.
	*
	* @return the phieugiahans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.phieugiahan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the phieugiahans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link danhmuc.model.impl.phieugiahanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieugiahans
	* @param end the upper bound of the range of phieugiahans (not inclusive)
	* @return the range of phieugiahans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.phieugiahan> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the phieugiahans.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link danhmuc.model.impl.phieugiahanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieugiahans
	* @param end the upper bound of the range of phieugiahans (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phieugiahans
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.phieugiahan> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the phieugiahans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of phieugiahans.
	*
	* @return the number of phieugiahans
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static phieugiahanPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (phieugiahanPersistence)PortletBeanLocatorUtil.locate(danhmuc.service.ClpSerializer.getServletContextName(),
					phieugiahanPersistence.class.getName());

			ReferenceRegistry.registerReference(phieugiahanUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(phieugiahanPersistence persistence) {
	}

	private static phieugiahanPersistence _persistence;
}