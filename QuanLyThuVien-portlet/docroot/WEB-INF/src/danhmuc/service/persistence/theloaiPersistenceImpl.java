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

import danhmuc.NoSuchtheloaiException;

import danhmuc.model.impl.theloaiImpl;
import danhmuc.model.impl.theloaiModelImpl;

import danhmuc.model.theloai;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the theloai service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author LAPTOP
 * @see theloaiPersistence
 * @see theloaiUtil
 * @generated
 */
public class theloaiPersistenceImpl extends BasePersistenceImpl<theloai>
	implements theloaiPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link theloaiUtil} to access the theloai persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = theloaiImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(theloaiModelImpl.ENTITY_CACHE_ENABLED,
			theloaiModelImpl.FINDER_CACHE_ENABLED, theloaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(theloaiModelImpl.ENTITY_CACHE_ENABLED,
			theloaiModelImpl.FINDER_CACHE_ENABLED, theloaiImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(theloaiModelImpl.ENTITY_CACHE_ENABLED,
			theloaiModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public theloaiPersistenceImpl() {
		setModelClass(theloai.class);
	}

	/**
	 * Caches the theloai in the entity cache if it is enabled.
	 *
	 * @param theloai the theloai
	 */
	@Override
	public void cacheResult(theloai theloai) {
		EntityCacheUtil.putResult(theloaiModelImpl.ENTITY_CACHE_ENABLED,
			theloaiImpl.class, theloai.getPrimaryKey(), theloai);

		theloai.resetOriginalValues();
	}

	/**
	 * Caches the theloais in the entity cache if it is enabled.
	 *
	 * @param theloais the theloais
	 */
	@Override
	public void cacheResult(List<theloai> theloais) {
		for (theloai theloai : theloais) {
			if (EntityCacheUtil.getResult(
						theloaiModelImpl.ENTITY_CACHE_ENABLED,
						theloaiImpl.class, theloai.getPrimaryKey()) == null) {
				cacheResult(theloai);
			}
			else {
				theloai.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all theloais.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(theloaiImpl.class.getName());
		}

		EntityCacheUtil.clearCache(theloaiImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the theloai.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(theloai theloai) {
		EntityCacheUtil.removeResult(theloaiModelImpl.ENTITY_CACHE_ENABLED,
			theloaiImpl.class, theloai.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<theloai> theloais) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (theloai theloai : theloais) {
			EntityCacheUtil.removeResult(theloaiModelImpl.ENTITY_CACHE_ENABLED,
				theloaiImpl.class, theloai.getPrimaryKey());
		}
	}

	/**
	 * Creates a new theloai with the primary key. Does not add the theloai to the database.
	 *
	 * @param id the primary key for the new theloai
	 * @return the new theloai
	 */
	@Override
	public theloai create(long id) {
		theloai theloai = new theloaiImpl();

		theloai.setNew(true);
		theloai.setPrimaryKey(id);

		return theloai;
	}

	/**
	 * Removes the theloai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the theloai
	 * @return the theloai that was removed
	 * @throws danhmuc.NoSuchtheloaiException if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public theloai remove(long id)
		throws NoSuchtheloaiException, SystemException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the theloai with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the theloai
	 * @return the theloai that was removed
	 * @throws danhmuc.NoSuchtheloaiException if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public theloai remove(Serializable primaryKey)
		throws NoSuchtheloaiException, SystemException {
		Session session = null;

		try {
			session = openSession();

			theloai theloai = (theloai)session.get(theloaiImpl.class, primaryKey);

			if (theloai == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchtheloaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(theloai);
		}
		catch (NoSuchtheloaiException nsee) {
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
	protected theloai removeImpl(theloai theloai) throws SystemException {
		theloai = toUnwrappedModel(theloai);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(theloai)) {
				theloai = (theloai)session.get(theloaiImpl.class,
						theloai.getPrimaryKeyObj());
			}

			if (theloai != null) {
				session.delete(theloai);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (theloai != null) {
			clearCache(theloai);
		}

		return theloai;
	}

	@Override
	public theloai updateImpl(danhmuc.model.theloai theloai)
		throws SystemException {
		theloai = toUnwrappedModel(theloai);

		boolean isNew = theloai.isNew();

		Session session = null;

		try {
			session = openSession();

			if (theloai.isNew()) {
				session.save(theloai);

				theloai.setNew(false);
			}
			else {
				session.merge(theloai);
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

		EntityCacheUtil.putResult(theloaiModelImpl.ENTITY_CACHE_ENABLED,
			theloaiImpl.class, theloai.getPrimaryKey(), theloai);

		return theloai;
	}

	protected theloai toUnwrappedModel(theloai theloai) {
		if (theloai instanceof theloaiImpl) {
			return theloai;
		}

		theloaiImpl theloaiImpl = new theloaiImpl();

		theloaiImpl.setNew(theloai.isNew());
		theloaiImpl.setPrimaryKey(theloai.getPrimaryKey());

		theloaiImpl.setId(theloai.getId());
		theloaiImpl.setName(theloai.getName());

		return theloaiImpl;
	}

	/**
	 * Returns the theloai with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the theloai
	 * @return the theloai
	 * @throws danhmuc.NoSuchtheloaiException if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public theloai findByPrimaryKey(Serializable primaryKey)
		throws NoSuchtheloaiException, SystemException {
		theloai theloai = fetchByPrimaryKey(primaryKey);

		if (theloai == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchtheloaiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return theloai;
	}

	/**
	 * Returns the theloai with the primary key or throws a {@link danhmuc.NoSuchtheloaiException} if it could not be found.
	 *
	 * @param id the primary key of the theloai
	 * @return the theloai
	 * @throws danhmuc.NoSuchtheloaiException if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public theloai findByPrimaryKey(long id)
		throws NoSuchtheloaiException, SystemException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the theloai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the theloai
	 * @return the theloai, or <code>null</code> if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public theloai fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		theloai theloai = (theloai)EntityCacheUtil.getResult(theloaiModelImpl.ENTITY_CACHE_ENABLED,
				theloaiImpl.class, primaryKey);

		if (theloai == _nulltheloai) {
			return null;
		}

		if (theloai == null) {
			Session session = null;

			try {
				session = openSession();

				theloai = (theloai)session.get(theloaiImpl.class, primaryKey);

				if (theloai != null) {
					cacheResult(theloai);
				}
				else {
					EntityCacheUtil.putResult(theloaiModelImpl.ENTITY_CACHE_ENABLED,
						theloaiImpl.class, primaryKey, _nulltheloai);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(theloaiModelImpl.ENTITY_CACHE_ENABLED,
					theloaiImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return theloai;
	}

	/**
	 * Returns the theloai with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the theloai
	 * @return the theloai, or <code>null</code> if a theloai with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public theloai fetchByPrimaryKey(long id) throws SystemException {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the theloais.
	 *
	 * @return the theloais
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<theloai> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<theloai> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<theloai> findAll(int start, int end,
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

		List<theloai> list = (List<theloai>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_THELOAI);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_THELOAI;

				if (pagination) {
					sql = sql.concat(theloaiModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<theloai>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<theloai>(list);
				}
				else {
					list = (List<theloai>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the theloais from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (theloai theloai : findAll()) {
			remove(theloai);
		}
	}

	/**
	 * Returns the number of theloais.
	 *
	 * @return the number of theloais
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

				Query q = session.createQuery(_SQL_COUNT_THELOAI);

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
	 * Initializes the theloai persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.danhmuc.model.theloai")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<theloai>> listenersList = new ArrayList<ModelListener<theloai>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<theloai>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(theloaiImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_THELOAI = "SELECT theloai FROM theloai theloai";
	private static final String _SQL_COUNT_THELOAI = "SELECT COUNT(theloai) FROM theloai theloai";
	private static final String _ORDER_BY_ENTITY_ALIAS = "theloai.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No theloai exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(theloaiPersistenceImpl.class);
	private static theloai _nulltheloai = new theloaiImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<theloai> toCacheModel() {
				return _nulltheloaiCacheModel;
			}
		};

	private static CacheModel<theloai> _nulltheloaiCacheModel = new CacheModel<theloai>() {
			@Override
			public theloai toEntityModel() {
				return _nulltheloai;
			}
		};
}