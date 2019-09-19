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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import danhmuc.NoSuchphieugiahanException;

import danhmuc.model.impl.phieugiahanImpl;
import danhmuc.model.impl.phieugiahanModelImpl;

import danhmuc.model.phieugiahan;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the phieugiahan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LAPTOP
 * @see phieugiahanPersistence
 * @see phieugiahanUtil
 * @generated
 */
public class phieugiahanPersistenceImpl extends BasePersistenceImpl<phieugiahan>
	implements phieugiahanPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link phieugiahanUtil} to access the phieugiahan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = phieugiahanImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
			phieugiahanModelImpl.FINDER_CACHE_ENABLED, phieugiahanImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
			phieugiahanModelImpl.FINDER_CACHE_ENABLED, phieugiahanImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
			phieugiahanModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public phieugiahanPersistenceImpl() {
		setModelClass(phieugiahan.class);
	}

	/**
	 * Caches the phieugiahan in the entity cache if it is enabled.
	 *
	 * @param phieugiahan the phieugiahan
	 */
	@Override
	public void cacheResult(phieugiahan phieugiahan) {
		EntityCacheUtil.putResult(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
			phieugiahanImpl.class, phieugiahan.getPrimaryKey(), phieugiahan);

		phieugiahan.resetOriginalValues();
	}

	/**
	 * Caches the phieugiahans in the entity cache if it is enabled.
	 *
	 * @param phieugiahans the phieugiahans
	 */
	@Override
	public void cacheResult(List<phieugiahan> phieugiahans) {
		for (phieugiahan phieugiahan : phieugiahans) {
			if (EntityCacheUtil.getResult(
						phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
						phieugiahanImpl.class, phieugiahan.getPrimaryKey()) == null) {
				cacheResult(phieugiahan);
			}
			else {
				phieugiahan.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phieugiahans.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(phieugiahanImpl.class.getName());
		}

		EntityCacheUtil.clearCache(phieugiahanImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phieugiahan.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(phieugiahan phieugiahan) {
		EntityCacheUtil.removeResult(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
			phieugiahanImpl.class, phieugiahan.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<phieugiahan> phieugiahans) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (phieugiahan phieugiahan : phieugiahans) {
			EntityCacheUtil.removeResult(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
				phieugiahanImpl.class, phieugiahan.getPrimaryKey());
		}
	}

	/**
	 * Creates a new phieugiahan with the primary key. Does not add the phieugiahan to the database.
	 *
	 * @param id the primary key for the new phieugiahan
	 * @return the new phieugiahan
	 */
	@Override
	public phieugiahan create(long id) {
		phieugiahan phieugiahan = new phieugiahanImpl();

		phieugiahan.setNew(true);
		phieugiahan.setPrimaryKey(id);

		return phieugiahan;
	}

	/**
	 * Removes the phieugiahan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the phieugiahan
	 * @return the phieugiahan that was removed
	 * @throws danhmuc.NoSuchphieugiahanException if a phieugiahan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieugiahan remove(long id)
		throws NoSuchphieugiahanException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the phieugiahan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phieugiahan
	 * @return the phieugiahan that was removed
	 * @throws danhmuc.NoSuchphieugiahanException if a phieugiahan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieugiahan remove(Serializable primaryKey)
		throws NoSuchphieugiahanException, SystemException {
		Session session = null;

		try {
			session = openSession();

			phieugiahan phieugiahan = (phieugiahan)session.get(phieugiahanImpl.class,
					primaryKey);

			if (phieugiahan == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchphieugiahanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phieugiahan);
		}
		catch (NoSuchphieugiahanException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected phieugiahan removeImpl(phieugiahan phieugiahan)
		throws SystemException {
		phieugiahan = toUnwrappedModel(phieugiahan);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phieugiahan)) {
				phieugiahan = (phieugiahan)session.get(phieugiahanImpl.class,
						phieugiahan.getPrimaryKeyObj());
			}

			if (phieugiahan != null) {
				session.delete(phieugiahan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phieugiahan != null) {
			clearCache(phieugiahan);
		}

		return phieugiahan;
	}

	@Override
	public phieugiahan updateImpl(danhmuc.model.phieugiahan phieugiahan)
		throws SystemException {
		phieugiahan = toUnwrappedModel(phieugiahan);

		boolean isNew = phieugiahan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (phieugiahan.isNew()) {
				session.save(phieugiahan);

				phieugiahan.setNew(false);
			}
			else {
				session.merge(phieugiahan);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
			phieugiahanImpl.class, phieugiahan.getPrimaryKey(), phieugiahan);

		return phieugiahan;
	}

	protected phieugiahan toUnwrappedModel(phieugiahan phieugiahan) {
		if (phieugiahan instanceof phieugiahanImpl) {
			return phieugiahan;
		}

		phieugiahanImpl phieugiahanImpl = new phieugiahanImpl();

		phieugiahanImpl.setNew(phieugiahan.isNew());
		phieugiahanImpl.setPrimaryKey(phieugiahan.getPrimaryKey());

		phieugiahanImpl.setId(phieugiahan.getId());
		phieugiahanImpl.setNgaygiahan(phieugiahan.getNgaygiahan());
		phieugiahanImpl.setPhieumuonId(phieugiahan.getPhieumuonId());
		phieugiahanImpl.setXacnhan(phieugiahan.getXacnhan());

		return phieugiahanImpl;
	}

	/**
	 * Returns the phieugiahan with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieugiahan
	 * @return the phieugiahan
	 * @throws danhmuc.NoSuchphieugiahanException if a phieugiahan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieugiahan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchphieugiahanException, SystemException {
		phieugiahan phieugiahan = fetchByPrimaryKey(primaryKey);

		if (phieugiahan == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchphieugiahanException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phieugiahan;
	}

	/**
	 * Returns the phieugiahan with the primary key or throws a {@link danhmuc.NoSuchphieugiahanException} if it could not be found.
	 *
	 * @param id the primary key of the phieugiahan
	 * @return the phieugiahan
	 * @throws danhmuc.NoSuchphieugiahanException if a phieugiahan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieugiahan findByPrimaryKey(long id)
		throws NoSuchphieugiahanException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the phieugiahan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieugiahan
	 * @return the phieugiahan, or <code>null</code> if a phieugiahan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieugiahan fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		phieugiahan phieugiahan = (phieugiahan)EntityCacheUtil.getResult(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
				phieugiahanImpl.class, primaryKey);

		if (phieugiahan == _nullphieugiahan) {
			return null;
		}

		if (phieugiahan == null) {
			Session session = null;

			try {
				session = openSession();

				phieugiahan = (phieugiahan)session.get(phieugiahanImpl.class,
						primaryKey);

				if (phieugiahan != null) {
					cacheResult(phieugiahan);
				}
				else {
					EntityCacheUtil.putResult(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
						phieugiahanImpl.class, primaryKey, _nullphieugiahan);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(phieugiahanModelImpl.ENTITY_CACHE_ENABLED,
					phieugiahanImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phieugiahan;
	}

	/**
	 * Returns the phieugiahan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the phieugiahan
	 * @return the phieugiahan, or <code>null</code> if a phieugiahan with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieugiahan fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the phieugiahans.
	 *
	 * @return the phieugiahans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<phieugiahan> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<phieugiahan> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<phieugiahan> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<phieugiahan> list = (List<phieugiahan>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHIEUGIAHAN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHIEUGIAHAN;

				if (pagination) {
					sql = sql.concat(phieugiahanModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<phieugiahan>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<phieugiahan>(list);
				}
				else {
					list = (List<phieugiahan>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the phieugiahans from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (phieugiahan phieugiahan : findAll()) {
			remove(phieugiahan);
		}
	}

	/**
	 * Returns the number of phieugiahans.
	 *
	 * @return the number of phieugiahans
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PHIEUGIAHAN);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the phieugiahan persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.danhmuc.model.phieugiahan")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<phieugiahan>> listenersList = new ArrayList<ModelListener<phieugiahan>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<phieugiahan>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(phieugiahanImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHIEUGIAHAN = "SELECT phieugiahan FROM phieugiahan phieugiahan";
	private static final String _SQL_COUNT_PHIEUGIAHAN = "SELECT COUNT(phieugiahan) FROM phieugiahan phieugiahan";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phieugiahan.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No phieugiahan exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(phieugiahanPersistenceImpl.class);
	private static phieugiahan _nullphieugiahan = new phieugiahanImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<phieugiahan> toCacheModel() {
				return _nullphieugiahanCacheModel;
			}
		};

	private static CacheModel<phieugiahan> _nullphieugiahanCacheModel = new CacheModel<phieugiahan>() {
			@Override
			public phieugiahan toEntityModel() {
				return _nullphieugiahan;
			}
		};
}