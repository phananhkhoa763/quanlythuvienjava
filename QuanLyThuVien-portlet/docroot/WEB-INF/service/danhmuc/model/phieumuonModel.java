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

package danhmuc.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the phieumuon service. Represents a row in the &quot;phieumuon&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link danhmuc.model.impl.phieumuonModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link danhmuc.model.impl.phieumuonImpl}.
 * </p>
 *
 * @author LAPTOP
 * @see phieumuon
 * @see danhmuc.model.impl.phieumuonImpl
 * @see danhmuc.model.impl.phieumuonModelImpl
 * @generated
 */
public interface phieumuonModel extends BaseModel<phieumuon> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a phieumuon model instance should use the {@link phieumuon} interface instead.
	 */

	/**
	 * Returns the primary key of this phieumuon.
	 *
	 * @return the primary key of this phieumuon
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this phieumuon.
	 *
	 * @param primaryKey the primary key of this phieumuon
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this phieumuon.
	 *
	 * @return the ID of this phieumuon
	 */
	public long getId();

	/**
	 * Sets the ID of this phieumuon.
	 *
	 * @param id the ID of this phieumuon
	 */
	public void setId(long id);

	/**
	 * Returns the user ID of this phieumuon.
	 *
	 * @return the user ID of this phieumuon
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this phieumuon.
	 *
	 * @param userId the user ID of this phieumuon
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this phieumuon.
	 *
	 * @return the user uuid of this phieumuon
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this phieumuon.
	 *
	 * @param userUuid the user uuid of this phieumuon
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the sach ID of this phieumuon.
	 *
	 * @return the sach ID of this phieumuon
	 */
	public long getSachId();

	/**
	 * Sets the sach ID of this phieumuon.
	 *
	 * @param sachId the sach ID of this phieumuon
	 */
	public void setSachId(long sachId);

	/**
	 * Returns the ngaymuon of this phieumuon.
	 *
	 * @return the ngaymuon of this phieumuon
	 */
	public Date getNgaymuon();

	/**
	 * Sets the ngaymuon of this phieumuon.
	 *
	 * @param ngaymuon the ngaymuon of this phieumuon
	 */
	public void setNgaymuon(Date ngaymuon);

	/**
	 * Returns the ngaytra of this phieumuon.
	 *
	 * @return the ngaytra of this phieumuon
	 */
	public Date getNgaytra();

	/**
	 * Sets the ngaytra of this phieumuon.
	 *
	 * @param ngaytra the ngaytra of this phieumuon
	 */
	public void setNgaytra(Date ngaytra);

	/**
	 * Returns the xacnhan of this phieumuon.
	 *
	 * @return the xacnhan of this phieumuon
	 */
	public long getXacnhan();

	/**
	 * Sets the xacnhan of this phieumuon.
	 *
	 * @param xacnhan the xacnhan of this phieumuon
	 */
	public void setXacnhan(long xacnhan);

	/**
	 * Returns the trangthai of this phieumuon.
	 *
	 * @return the trangthai of this phieumuon
	 */
	public long getTrangthai();

	/**
	 * Sets the trangthai of this phieumuon.
	 *
	 * @param trangthai the trangthai of this phieumuon
	 */
	public void setTrangthai(long trangthai);

	/**
	 * Returns the soluong of this phieumuon.
	 *
	 * @return the soluong of this phieumuon
	 */
	public long getSoluong();

	/**
	 * Sets the soluong of this phieumuon.
	 *
	 * @param soluong the soluong of this phieumuon
	 */
	public void setSoluong(long soluong);

	/**
	 * Returns the giahan of this phieumuon.
	 *
	 * @return the giahan of this phieumuon
	 */
	public long getGiahan();

	/**
	 * Sets the giahan of this phieumuon.
	 *
	 * @param giahan the giahan of this phieumuon
	 */
	public void setGiahan(long giahan);

	/**
	 * Returns the lydo of this phieumuon.
	 *
	 * @return the lydo of this phieumuon
	 */
	@AutoEscape
	public String getLydo();

	/**
	 * Sets the lydo of this phieumuon.
	 *
	 * @param lydo the lydo of this phieumuon
	 */
	public void setLydo(String lydo);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(danhmuc.model.phieumuon phieumuon);

	@Override
	public int hashCode();

	@Override
	public CacheModel<danhmuc.model.phieumuon> toCacheModel();

	@Override
	public danhmuc.model.phieumuon toEscapedModel();

	@Override
	public danhmuc.model.phieumuon toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}