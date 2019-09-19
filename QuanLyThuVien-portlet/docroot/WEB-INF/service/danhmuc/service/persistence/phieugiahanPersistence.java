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

import com.liferay.portal.service.persistence.BasePersistence;

import danhmuc.model.phieugiahan;

/**
 * The persistence interface for the phieugiahan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LAPTOP
 * @see phieugiahanPersistenceImpl
 * @see phieugiahanUtil
 * @generated
 */
public interface phieugiahanPersistence extends BasePersistence<phieugiahan> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link phieugiahanUtil} to access the phieugiahan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the phieugiahan in the entity cache if it is enabled.
	*
	* @param phieugiahan the phieugiahan
	*/
	public void cacheResult(danhmuc.model.phieugiahan phieugiahan);

	/**
	* Caches the phieugiahans in the entity cache if it is enabled.
	*
	* @param phieugiahans the phieugiahans
	*/
	public void cacheResult(
		java.util.List<danhmuc.model.phieugiahan> phieugiahans);

	/**
	* Creates a new phieugiahan with the primary key. Does not add the phieugiahan to the database.
	*
	* @param id the primary key for the new phieugiahan
	* @return the new phieugiahan
	*/
	public danhmuc.model.phieugiahan create(long id);

	/**
	* Removes the phieugiahan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phieugiahan
	* @return the phieugiahan that was removed
	* @throws danhmuc.NoSuchphieugiahanException if a phieugiahan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public danhmuc.model.phieugiahan remove(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			danhmuc.NoSuchphieugiahanException;

	public danhmuc.model.phieugiahan updateImpl(
		danhmuc.model.phieugiahan phieugiahan)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the phieugiahan with the primary key or throws a {@link danhmuc.NoSuchphieugiahanException} if it could not be found.
	*
	* @param id the primary key of the phieugiahan
	* @return the phieugiahan
	* @throws danhmuc.NoSuchphieugiahanException if a phieugiahan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public danhmuc.model.phieugiahan findByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			danhmuc.NoSuchphieugiahanException;

	/**
	* Returns the phieugiahan with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the phieugiahan
	* @return the phieugiahan, or <code>null</code> if a phieugiahan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public danhmuc.model.phieugiahan fetchByPrimaryKey(long id)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the phieugiahans.
	*
	* @return the phieugiahans
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<danhmuc.model.phieugiahan> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<danhmuc.model.phieugiahan> findAll(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<danhmuc.model.phieugiahan> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the phieugiahans from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of phieugiahans.
	*
	* @return the number of phieugiahans
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}