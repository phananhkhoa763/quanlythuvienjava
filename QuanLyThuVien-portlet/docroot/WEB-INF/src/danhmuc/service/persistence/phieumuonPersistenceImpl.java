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

import danhmuc.NoSuchphieumuonException;

import danhmuc.model.impl.phieumuonImpl;
import danhmuc.model.impl.phieumuonModelImpl;

import danhmuc.model.phieumuon;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the phieumuon service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LAPTOP
 * @see phieumuonPersistence
 * @see phieumuonUtil
 * @generated
 */
public class phieumuonPersistenceImpl extends BasePersistenceImpl<phieumuon>
	implements phieumuonPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link phieumuonUtil} to access the phieumuon persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = phieumuonImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
			phieumuonModelImpl.FINDER_CACHE_ENABLED, phieumuonImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
			phieumuonModelImpl.FINDER_CACHE_ENABLED, phieumuonImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
			phieumuonModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public phieumuonPersistenceImpl() {
		setModelClass(phieumuon.class);
	}

	/**
	 * Caches the phieumuon in the entity cache if it is enabled.
	 *
	 * @param phieumuon the phieumuon
	 */
	@Override
	public void cacheResult(phieumuon phieumuon) {
		EntityCacheUtil.putResult(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
			phieumuonImpl.class, phieumuon.getPrimaryKey(), phieumuon);

		phieumuon.resetOriginalValues();
	}

	/**
	 * Caches the phieumuons in the entity cache if it is enabled.
	 *
	 * @param phieumuons the phieumuons
	 */
	@Override
	public void cacheResult(List<phieumuon> phieumuons) {
		for (phieumuon phieumuon : phieumuons) {
			if (EntityCacheUtil.getResult(
						phieumuonModelImpl.ENTITY_CACHE_ENABLED,
						phieumuonImpl.class, phieumuon.getPrimaryKey()) == null) {
				cacheResult(phieumuon);
			}
			else {
				phieumuon.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all phieumuons.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(phieumuonImpl.class.getName());
		}

		EntityCacheUtil.clearCache(phieumuonImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the phieumuon.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(phieumuon phieumuon) {
		EntityCacheUtil.removeResult(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
			phieumuonImpl.class, phieumuon.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<phieumuon> phieumuons) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (phieumuon phieumuon : phieumuons) {
			EntityCacheUtil.removeResult(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
				phieumuonImpl.class, phieumuon.getPrimaryKey());
		}
	}

	/**
	 * Creates a new phieumuon with the primary key. Does not add the phieumuon to the database.
	 *
	 * @param id the primary key for the new phieumuon
	 * @return the new phieumuon
	 */
	@Override
	public phieumuon create(long id) {
		phieumuon phieumuon = new phieumuonImpl();

		phieumuon.setNew(true);
		phieumuon.setPrimaryKey(id);

		return phieumuon;
	}

	/**
	 * Removes the phieumuon with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the phieumuon
	 * @return the phieumuon that was removed
	 * @throws danhmuc.NoSuchphieumuonException if a phieumuon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieumuon remove(long id)
		throws NoSuchphieumuonException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the phieumuon with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the phieumuon
	 * @return the phieumuon that was removed
	 * @throws danhmuc.NoSuchphieumuonException if a phieumuon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieumuon remove(Serializable primaryKey)
		throws NoSuchphieumuonException, SystemException {
		Session session = null;

		try {
			session = openSession();

			phieumuon phieumuon = (phieumuon)session.get(phieumuonImpl.class,
					primaryKey);

			if (phieumuon == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchphieumuonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(phieumuon);
		}
		catch (NoSuchphieumuonException nsee) {
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
	protected phieumuon removeImpl(phieumuon phieumuon)
		throws SystemException {
		phieumuon = toUnwrappedModel(phieumuon);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(phieumuon)) {
				phieumuon = (phieumuon)session.get(phieumuonImpl.class,
						phieumuon.getPrimaryKeyObj());
			}

			if (phieumuon != null) {
				session.delete(phieumuon);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (phieumuon != null) {
			clearCache(phieumuon);
		}

		return phieumuon;
	}

	@Override
	public phieumuon updateImpl(danhmuc.model.phieumuon phieumuon)
		throws SystemException {
		phieumuon = toUnwrappedModel(phieumuon);

		boolean isNew = phieumuon.isNew();

		Session session = null;

		try {
			session = openSession();

			if (phieumuon.isNew()) {
				session.save(phieumuon);

				phieumuon.setNew(false);
			}
			else {
				session.merge(phieumuon);
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

		EntityCacheUtil.putResult(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
			phieumuonImpl.class, phieumuon.getPrimaryKey(), phieumuon);

		return phieumuon;
	}

	protected phieumuon toUnwrappedModel(phieumuon phieumuon) {
		if (phieumuon instanceof phieumuonImpl) {
			return phieumuon;
		}

		phieumuonImpl phieumuonImpl = new phieumuonImpl();

		phieumuonImpl.setNew(phieumuon.isNew());
		phieumuonImpl.setPrimaryKey(phieumuon.getPrimaryKey());

		phieumuonImpl.setId(phieumuon.getId());
		phieumuonImpl.setUserId(phieumuon.getUserId());
		phieumuonImpl.setSachId(phieumuon.getSachId());
		phieumuonImpl.setNgaymuon(phieumuon.getNgaymuon());
		phieumuonImpl.setNgaytra(phieumuon.getNgaytra());
		phieumuonImpl.setXacnhan(phieumuon.getXacnhan());
		phieumuonImpl.setTrangthai(phieumuon.getTrangthai());
		phieumuonImpl.setSoluong(phieumuon.getSoluong());
		phieumuonImpl.setGiahan(phieumuon.getGiahan());
		phieumuonImpl.setLydo(phieumuon.getLydo());

		return phieumuonImpl;
	}

	/**
	 * Returns the phieumuon with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieumuon
	 * @return the phieumuon
	 * @throws danhmuc.NoSuchphieumuonException if a phieumuon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieumuon findByPrimaryKey(Serializable primaryKey)
		throws NoSuchphieumuonException, SystemException {
		phieumuon phieumuon = fetchByPrimaryKey(primaryKey);

		if (phieumuon == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchphieumuonException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return phieumuon;
	}

	/**
	 * Returns the phieumuon with the primary key or throws a {@link danhmuc.NoSuchphieumuonException} if it could not be found.
	 *
	 * @param id the primary key of the phieumuon
	 * @return the phieumuon
	 * @throws danhmuc.NoSuchphieumuonException if a phieumuon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieumuon findByPrimaryKey(long id)
		throws NoSuchphieumuonException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the phieumuon with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the phieumuon
	 * @return the phieumuon, or <code>null</code> if a phieumuon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieumuon fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		phieumuon phieumuon = (phieumuon)EntityCacheUtil.getResult(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
				phieumuonImpl.class, primaryKey);

		if (phieumuon == _nullphieumuon) {
			return null;
		}

		if (phieumuon == null) {
			Session session = null;

			try {
				session = openSession();

				phieumuon = (phieumuon)session.get(phieumuonImpl.class,
						primaryKey);

				if (phieumuon != null) {
					cacheResult(phieumuon);
				}
				else {
					EntityCacheUtil.putResult(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
						phieumuonImpl.class, primaryKey, _nullphieumuon);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(phieumuonModelImpl.ENTITY_CACHE_ENABLED,
					phieumuonImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return phieumuon;
	}

	/**
	 * Returns the phieumuon with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the phieumuon
	 * @return the phieumuon, or <code>null</code> if a phieumuon with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public phieumuon fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the phieumuons.
	 *
	 * @return the phieumuons
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<phieumuon> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<phieumuon> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<phieumuon> findAll(int start, int end,
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

		List<phieumuon> list = (List<phieumuon>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_PHIEUMUON);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PHIEUMUON;

				if (pagination) {
					sql = sql.concat(phieumuonModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<phieumuon>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<phieumuon>(list);
				}
				else {
					list = (List<phieumuon>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the phieumuons from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (phieumuon phieumuon : findAll()) {
			remove(phieumuon);
		}
	}

	/**
	 * Returns the number of phieumuons.
	 *
	 * @return the number of phieumuons
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

				Query q = session.createQuery(_SQL_COUNT_PHIEUMUON);

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
	 * Initializes the phieumuon persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.danhmuc.model.phieumuon")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<phieumuon>> listenersList = new ArrayList<ModelListener<phieumuon>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<phieumuon>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(phieumuonImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_PHIEUMUON = "SELECT phieumuon FROM phieumuon phieumuon";
	private static final String _SQL_COUNT_PHIEUMUON = "SELECT COUNT(phieumuon) FROM phieumuon phieumuon";
	private static final String _ORDER_BY_ENTITY_ALIAS = "phieumuon.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No phieumuon exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(phieumuonPersistenceImpl.class);
	private static phieumuon _nullphieumuon = new phieumuonImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<phieumuon> toCacheModel() {
				return _nullphieumuonCacheModel;
			}
		};

	private static CacheModel<phieumuon> _nullphieumuonCacheModel = new CacheModel<phieumuon>() {
			@Override
			public phieumuon toEntityModel() {
				return _nullphieumuon;
			}
		};
}