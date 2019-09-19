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

package danhmuc.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link phieugiahanLocalService}.
 *
 * @author LAPTOP
 * @see phieugiahanLocalService
 * @generated
 */
public class phieugiahanLocalServiceWrapper implements phieugiahanLocalService,
	ServiceWrapper<phieugiahanLocalService> {
	public phieugiahanLocalServiceWrapper(
		phieugiahanLocalService phieugiahanLocalService) {
		_phieugiahanLocalService = phieugiahanLocalService;
	}

	/**
	* Adds the phieugiahan to the database. Also notifies the appropriate model listeners.
	*
	* @param phieugiahan the phieugiahan
	* @return the phieugiahan that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public danhmuc.model.phieugiahan addphieugiahan(
		danhmuc.model.phieugiahan phieugiahan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.addphieugiahan(phieugiahan);
	}

	/**
	* Creates a new phieugiahan with the primary key. Does not add the phieugiahan to the database.
	*
	* @param id the primary key for the new phieugiahan
	* @return the new phieugiahan
	*/
	@Override
	public danhmuc.model.phieugiahan createphieugiahan(long id) {
		return _phieugiahanLocalService.createphieugiahan(id);
	}

	/**
	* Deletes the phieugiahan with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the phieugiahan
	* @return the phieugiahan that was removed
	* @throws PortalException if a phieugiahan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public danhmuc.model.phieugiahan deletephieugiahan(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.deletephieugiahan(id);
	}

	/**
	* Deletes the phieugiahan from the database. Also notifies the appropriate model listeners.
	*
	* @param phieugiahan the phieugiahan
	* @return the phieugiahan that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public danhmuc.model.phieugiahan deletephieugiahan(
		danhmuc.model.phieugiahan phieugiahan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.deletephieugiahan(phieugiahan);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _phieugiahanLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link danhmuc.model.impl.phieugiahanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link danhmuc.model.impl.phieugiahanModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public danhmuc.model.phieugiahan fetchphieugiahan(long id)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.fetchphieugiahan(id);
	}

	/**
	* Returns the phieugiahan with the primary key.
	*
	* @param id the primary key of the phieugiahan
	* @return the phieugiahan
	* @throws PortalException if a phieugiahan with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public danhmuc.model.phieugiahan getphieugiahan(long id)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.getphieugiahan(id);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public java.util.List<danhmuc.model.phieugiahan> getphieugiahans(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.getphieugiahans(start, end);
	}

	/**
	* Returns the number of phieugiahans.
	*
	* @return the number of phieugiahans
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getphieugiahansCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.getphieugiahansCount();
	}

	/**
	* Updates the phieugiahan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param phieugiahan the phieugiahan
	* @return the phieugiahan that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public danhmuc.model.phieugiahan updatephieugiahan(
		danhmuc.model.phieugiahan phieugiahan)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieugiahanLocalService.updatephieugiahan(phieugiahan);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _phieugiahanLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_phieugiahanLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _phieugiahanLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public phieugiahanLocalService getWrappedphieugiahanLocalService() {
		return _phieugiahanLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedphieugiahanLocalService(
		phieugiahanLocalService phieugiahanLocalService) {
		_phieugiahanLocalService = phieugiahanLocalService;
	}

	@Override
	public phieugiahanLocalService getWrappedService() {
		return _phieugiahanLocalService;
	}

	@Override
	public void setWrappedService(
		phieugiahanLocalService phieugiahanLocalService) {
		_phieugiahanLocalService = phieugiahanLocalService;
	}

	private phieugiahanLocalService _phieugiahanLocalService;
}