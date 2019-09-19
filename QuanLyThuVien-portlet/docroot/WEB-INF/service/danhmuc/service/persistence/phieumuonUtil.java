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

import danhmuc.model.phieumuon;

import java.util.List;

/**
 * The persistence utility for the phieumuon service. This utility wraps {@link phieumuonPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LAPTOP
 * @see phieumuonPersistence
 * @see phieumuonPersistenceImpl
 * @generated
 */
public class phieumuonUtil {
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
	public static void clearCache(phieumuon phieumuon) {
		getPersistence().clearCache(phieumuon);
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
	public static List<phieumuon> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<phieumuon> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<phieumuon> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static phieumuon update(phieumuon phieumuon)
		throws SystemException {
		return getPersistence().update(phieumuon);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static phieumuon update(phieumuon phieumuon,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(phieumuon, serviceContext);
	}

	/**
	* Caches the phieumuon in the entity cache if it is enabled.
	*
	* @param phieumuon the phieumuon
	*/
	public static void cacheResult(danhmuc.model.phieumuon phieumuon) {
		getPersistence().cacheResult(phieumuon);
	}

	/**
	* Caches the phieumuons in the entity cache if it is enabled.
	*
	* @param phieumuons the phieumuons
	*/
	public static void cacheResult(
		java.util.List<danhmuc.model.phieumuon> phieumuons) {
		getPersistence().cacheResult(phieumuons);
	}

	/**
	* Creates a new phieumuon with the primary key. Does not add the phieumuon to the database.
	*
	* @param id the primary key for the new phieumuon
	* @return the new phieumuon
	*/
	public static danhmuc.model.phieumuon create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the phieumuon with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phieumuon
	* @return the phieumuon that was removed
	* @throws danhmuc.NoSuchphieumuonException if a phieumuon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.phieumuon remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			danhmuc.NoSuchphieumuonException {
		return getPersistence().remove(id);
	}

	public static danhmuc.model.phieumuon updateImpl(
		danhmuc.model.phieumuon phieumuon)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(phieumuon);
	}

	/**
	* Returns the phieumuon with the primary key or throws a {@link danhmuc.NoSuchphieumuonException} if it could not be found.
	*
	* @param id the primary key of the phieumuon
	* @return the phieumuon
	* @throws danhmuc.NoSuchphieumuonException if a phieumuon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.phieumuon findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			danhmuc.NoSuchphieumuonException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the phieumuon with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the phieumuon
	* @return the phieumuon, or <code>null</code> if a phieumuon with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.phieumuon fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the phieumuons.
	*
	* @return the phieumuons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.phieumuon> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the phieumuons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link danhmuc.model.impl.phieumuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieumuons
	* @param end the upper bound of the range of phieumuons (not inclusive)
	* @return the range of phieumuons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.phieumuon> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the phieumuons.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link danhmuc.model.impl.phieumuonModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of phieumuons
	* @param end the upper bound of the range of phieumuons (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of phieumuons
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.phieumuon> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the phieumuons from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of phieumuons.
	*
	* @return the number of phieumuons
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static phieumuonPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (phieumuonPersistence)PortletBeanLocatorUtil.locate(danhmuc.service.ClpSerializer.getServletContextName(),
					phieumuonPersistence.class.getName());

			ReferenceRegistry.registerReference(phieumuonUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(phieumuonPersistence persistence) {
	}

	private static phieumuonPersistence _persistence;
}