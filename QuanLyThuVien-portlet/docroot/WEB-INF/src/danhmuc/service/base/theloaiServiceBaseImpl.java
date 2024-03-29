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

package danhmuc.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import danhmuc.model.theloai;

import danhmuc.service.persistence.SachPersistence;
import danhmuc.service.persistence.phieugiahanPersistence;
import danhmuc.service.persistence.phieumuonPersistence;
import danhmuc.service.persistence.theloaiPersistence;

import danhmuc.service.theloaiService;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the theloai remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link danhmuc.service.impl.theloaiServiceImpl}.
 * </p>
 *
 * @author LAPTOP
 * @see danhmuc.service.impl.theloaiServiceImpl
 * @see danhmuc.service.theloaiServiceUtil
 * @generated
 */
public abstract class theloaiServiceBaseImpl extends BaseServiceImpl
	implements theloaiService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link danhmuc.service.theloaiServiceUtil} to access the theloai remote service.
	 */

	/**
	 * Returns the phieugiahan local service.
	 *
	 * @return the phieugiahan local service
	 */
	public danhmuc.service.phieugiahanLocalService getphieugiahanLocalService() {
		return phieugiahanLocalService;
	}

	/**
	 * Sets the phieugiahan local service.
	 *
	 * @param phieugiahanLocalService the phieugiahan local service
	 */
	public void setphieugiahanLocalService(
		danhmuc.service.phieugiahanLocalService phieugiahanLocalService) {
		this.phieugiahanLocalService = phieugiahanLocalService;
	}

	/**
	 * Returns the phieugiahan remote service.
	 *
	 * @return the phieugiahan remote service
	 */
	public danhmuc.service.phieugiahanService getphieugiahanService() {
		return phieugiahanService;
	}

	/**
	 * Sets the phieugiahan remote service.
	 *
	 * @param phieugiahanService the phieugiahan remote service
	 */
	public void setphieugiahanService(
		danhmuc.service.phieugiahanService phieugiahanService) {
		this.phieugiahanService = phieugiahanService;
	}

	/**
	 * Returns the phieugiahan persistence.
	 *
	 * @return the phieugiahan persistence
	 */
	public phieugiahanPersistence getphieugiahanPersistence() {
		return phieugiahanPersistence;
	}

	/**
	 * Sets the phieugiahan persistence.
	 *
	 * @param phieugiahanPersistence the phieugiahan persistence
	 */
	public void setphieugiahanPersistence(
		phieugiahanPersistence phieugiahanPersistence) {
		this.phieugiahanPersistence = phieugiahanPersistence;
	}

	/**
	 * Returns the phieumuon local service.
	 *
	 * @return the phieumuon local service
	 */
	public danhmuc.service.phieumuonLocalService getphieumuonLocalService() {
		return phieumuonLocalService;
	}

	/**
	 * Sets the phieumuon local service.
	 *
	 * @param phieumuonLocalService the phieumuon local service
	 */
	public void setphieumuonLocalService(
		danhmuc.service.phieumuonLocalService phieumuonLocalService) {
		this.phieumuonLocalService = phieumuonLocalService;
	}

	/**
	 * Returns the phieumuon remote service.
	 *
	 * @return the phieumuon remote service
	 */
	public danhmuc.service.phieumuonService getphieumuonService() {
		return phieumuonService;
	}

	/**
	 * Sets the phieumuon remote service.
	 *
	 * @param phieumuonService the phieumuon remote service
	 */
	public void setphieumuonService(
		danhmuc.service.phieumuonService phieumuonService) {
		this.phieumuonService = phieumuonService;
	}

	/**
	 * Returns the phieumuon persistence.
	 *
	 * @return the phieumuon persistence
	 */
	public phieumuonPersistence getphieumuonPersistence() {
		return phieumuonPersistence;
	}

	/**
	 * Sets the phieumuon persistence.
	 *
	 * @param phieumuonPersistence the phieumuon persistence
	 */
	public void setphieumuonPersistence(
		phieumuonPersistence phieumuonPersistence) {
		this.phieumuonPersistence = phieumuonPersistence;
	}

	/**
	 * Returns the sach local service.
	 *
	 * @return the sach local service
	 */
	public danhmuc.service.SachLocalService getSachLocalService() {
		return sachLocalService;
	}

	/**
	 * Sets the sach local service.
	 *
	 * @param sachLocalService the sach local service
	 */
	public void setSachLocalService(
		danhmuc.service.SachLocalService sachLocalService) {
		this.sachLocalService = sachLocalService;
	}

	/**
	 * Returns the sach remote service.
	 *
	 * @return the sach remote service
	 */
	public danhmuc.service.SachService getSachService() {
		return sachService;
	}

	/**
	 * Sets the sach remote service.
	 *
	 * @param sachService the sach remote service
	 */
	public void setSachService(danhmuc.service.SachService sachService) {
		this.sachService = sachService;
	}

	/**
	 * Returns the sach persistence.
	 *
	 * @return the sach persistence
	 */
	public SachPersistence getSachPersistence() {
		return sachPersistence;
	}

	/**
	 * Sets the sach persistence.
	 *
	 * @param sachPersistence the sach persistence
	 */
	public void setSachPersistence(SachPersistence sachPersistence) {
		this.sachPersistence = sachPersistence;
	}

	/**
	 * Returns the theloai local service.
	 *
	 * @return the theloai local service
	 */
	public danhmuc.service.theloaiLocalService gettheloaiLocalService() {
		return theloaiLocalService;
	}

	/**
	 * Sets the theloai local service.
	 *
	 * @param theloaiLocalService the theloai local service
	 */
	public void settheloaiLocalService(
		danhmuc.service.theloaiLocalService theloaiLocalService) {
		this.theloaiLocalService = theloaiLocalService;
	}

	/**
	 * Returns the theloai remote service.
	 *
	 * @return the theloai remote service
	 */
	public danhmuc.service.theloaiService gettheloaiService() {
		return theloaiService;
	}

	/**
	 * Sets the theloai remote service.
	 *
	 * @param theloaiService the theloai remote service
	 */
	public void settheloaiService(danhmuc.service.theloaiService theloaiService) {
		this.theloaiService = theloaiService;
	}

	/**
	 * Returns the theloai persistence.
	 *
	 * @return the theloai persistence
	 */
	public theloaiPersistence gettheloaiPersistence() {
		return theloaiPersistence;
	}

	/**
	 * Sets the theloai persistence.
	 *
	 * @param theloaiPersistence the theloai persistence
	 */
	public void settheloaiPersistence(theloaiPersistence theloaiPersistence) {
		this.theloaiPersistence = theloaiPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return theloai.class;
	}

	protected String getModelClassName() {
		return theloai.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = theloaiPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = danhmuc.service.phieugiahanLocalService.class)
	protected danhmuc.service.phieugiahanLocalService phieugiahanLocalService;
	@BeanReference(type = danhmuc.service.phieugiahanService.class)
	protected danhmuc.service.phieugiahanService phieugiahanService;
	@BeanReference(type = phieugiahanPersistence.class)
	protected phieugiahanPersistence phieugiahanPersistence;
	@BeanReference(type = danhmuc.service.phieumuonLocalService.class)
	protected danhmuc.service.phieumuonLocalService phieumuonLocalService;
	@BeanReference(type = danhmuc.service.phieumuonService.class)
	protected danhmuc.service.phieumuonService phieumuonService;
	@BeanReference(type = phieumuonPersistence.class)
	protected phieumuonPersistence phieumuonPersistence;
	@BeanReference(type = danhmuc.service.SachLocalService.class)
	protected danhmuc.service.SachLocalService sachLocalService;
	@BeanReference(type = danhmuc.service.SachService.class)
	protected danhmuc.service.SachService sachService;
	@BeanReference(type = SachPersistence.class)
	protected SachPersistence sachPersistence;
	@BeanReference(type = danhmuc.service.theloaiLocalService.class)
	protected danhmuc.service.theloaiLocalService theloaiLocalService;
	@BeanReference(type = danhmuc.service.theloaiService.class)
	protected danhmuc.service.theloaiService theloaiService;
	@BeanReference(type = theloaiPersistence.class)
	protected theloaiPersistence theloaiPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private theloaiServiceClpInvoker _clpInvoker = new theloaiServiceClpInvoker();
}