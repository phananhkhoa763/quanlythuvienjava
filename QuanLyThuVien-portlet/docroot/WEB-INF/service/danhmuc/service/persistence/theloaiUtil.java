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

import danhmuc.model.theloai;

import java.util.List;

/**
 * The persistence utility for the theloai service. This utility wraps {@link theloaiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LAPTOP
 * @see theloaiPersistence
 * @see theloaiPersistenceImpl
 * @generated
 */
public class theloaiUtil {
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
	public static void clearCache(theloai theloai) {
		getPersistence().clearCache(theloai);
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
	public static List<theloai> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<theloai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<theloai> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static theloai update(theloai theloai) throws SystemException {
		return getPersistence().update(theloai);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static theloai update(theloai theloai, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(theloai, serviceContext);
	}

	/**
	* Caches the theloai in the entity cache if it is enabled.
	*
	* @param theloai the theloai
	*/
	public static void cacheResult(danhmuc.model.theloai theloai) {
		getPersistence().cacheResult(theloai);
	}

	/**
	* Caches the theloais in the entity cache if it is enabled.
	*
	* @param theloais the theloais
	*/
	public static void cacheResult(
		java.util.List<danhmuc.model.theloai> theloais) {
		getPersistence().cacheResult(theloais);
	}

	/**
	* Creates a new theloai with the primary key. Does not add the theloai to the database.
	*
	* @param id the primary key for the new theloai
	* @return the new theloai
	*/
	public static danhmuc.model.theloai create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the theloai with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the theloai
	* @return the theloai that was removed
	* @throws danhmuc.NoSuchtheloaiException if a theloai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.theloai remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			danhmuc.NoSuchtheloaiException {
		return getPersistence().remove(id);
	}

	public static danhmuc.model.theloai updateImpl(
		danhmuc.model.theloai theloai)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(theloai);
	}

	/**
	* Returns the theloai with the primary key or throws a {@link danhmuc.NoSuchtheloaiException} if it could not be found.
	*
	* @param id the primary key of the theloai
	* @return the theloai
	* @throws danhmuc.NoSuchtheloaiException if a theloai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.theloai findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			danhmuc.NoSuchtheloaiException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the theloai with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the theloai
	* @return the theloai, or <code>null</code> if a theloai with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static danhmuc.model.theloai fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	* Returns all the theloais.
	*
	* @return the theloais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.theloai> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the theloais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link danhmuc.model.impl.theloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of theloais
	* @param end the upper bound of the range of theloais (not inclusive)
	* @return the range of theloais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.theloai> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the theloais.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link danhmuc.model.impl.theloaiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of theloais
	* @param end the upper bound of the range of theloais (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of theloais
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<danhmuc.model.theloai> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the theloais from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of theloais.
	*
	* @return the number of theloais
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static theloaiPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (theloaiPersistence)PortletBeanLocatorUtil.locate(danhmuc.service.ClpSerializer.getServletContextName(),
					theloaiPersistence.class.getName());

			ReferenceRegistry.registerReference(theloaiUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(theloaiPersistence persistence) {
	}

	private static theloaiPersistence _persistence;
}