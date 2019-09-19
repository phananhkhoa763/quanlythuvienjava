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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link phieumuon}.
 * </p>
 *
 * @author LAPTOP
 * @see phieumuon
 * @generated
 */
public class phieumuonWrapper implements phieumuon, ModelWrapper<phieumuon> {
	public phieumuonWrapper(phieumuon phieumuon) {
		_phieumuon = phieumuon;
	}

	@Override
	public Class<?> getModelClass() {
		return phieumuon.class;
	}

	@Override
	public String getModelClassName() {
		return phieumuon.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("userId", getUserId());
		attributes.put("sachId", getSachId());
		attributes.put("ngaymuon", getNgaymuon());
		attributes.put("ngaytra", getNgaytra());
		attributes.put("xacnhan", getXacnhan());
		attributes.put("trangthai", getTrangthai());
		attributes.put("soluong", getSoluong());
		attributes.put("giahan", getGiahan());
		attributes.put("lydo", getLydo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long sachId = (Long)attributes.get("sachId");

		if (sachId != null) {
			setSachId(sachId);
		}

		Date ngaymuon = (Date)attributes.get("ngaymuon");

		if (ngaymuon != null) {
			setNgaymuon(ngaymuon);
		}

		Date ngaytra = (Date)attributes.get("ngaytra");

		if (ngaytra != null) {
			setNgaytra(ngaytra);
		}

		Long xacnhan = (Long)attributes.get("xacnhan");

		if (xacnhan != null) {
			setXacnhan(xacnhan);
		}

		Long trangthai = (Long)attributes.get("trangthai");

		if (trangthai != null) {
			setTrangthai(trangthai);
		}

		Long soluong = (Long)attributes.get("soluong");

		if (soluong != null) {
			setSoluong(soluong);
		}

		Long giahan = (Long)attributes.get("giahan");

		if (giahan != null) {
			setGiahan(giahan);
		}

		String lydo = (String)attributes.get("lydo");

		if (lydo != null) {
			setLydo(lydo);
		}
	}

	/**
	* Returns the primary key of this phieumuon.
	*
	* @return the primary key of this phieumuon
	*/
	@Override
	public long getPrimaryKey() {
		return _phieumuon.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phieumuon.
	*
	* @param primaryKey the primary key of this phieumuon
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phieumuon.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this phieumuon.
	*
	* @return the ID of this phieumuon
	*/
	@Override
	public long getId() {
		return _phieumuon.getId();
	}

	/**
	* Sets the ID of this phieumuon.
	*
	* @param id the ID of this phieumuon
	*/
	@Override
	public void setId(long id) {
		_phieumuon.setId(id);
	}

	/**
	* Returns the user ID of this phieumuon.
	*
	* @return the user ID of this phieumuon
	*/
	@Override
	public long getUserId() {
		return _phieumuon.getUserId();
	}

	/**
	* Sets the user ID of this phieumuon.
	*
	* @param userId the user ID of this phieumuon
	*/
	@Override
	public void setUserId(long userId) {
		_phieumuon.setUserId(userId);
	}

	/**
	* Returns the user uuid of this phieumuon.
	*
	* @return the user uuid of this phieumuon
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _phieumuon.getUserUuid();
	}

	/**
	* Sets the user uuid of this phieumuon.
	*
	* @param userUuid the user uuid of this phieumuon
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_phieumuon.setUserUuid(userUuid);
	}

	/**
	* Returns the sach ID of this phieumuon.
	*
	* @return the sach ID of this phieumuon
	*/
	@Override
	public long getSachId() {
		return _phieumuon.getSachId();
	}

	/**
	* Sets the sach ID of this phieumuon.
	*
	* @param sachId the sach ID of this phieumuon
	*/
	@Override
	public void setSachId(long sachId) {
		_phieumuon.setSachId(sachId);
	}

	/**
	* Returns the ngaymuon of this phieumuon.
	*
	* @return the ngaymuon of this phieumuon
	*/
	@Override
	public java.util.Date getNgaymuon() {
		return _phieumuon.getNgaymuon();
	}

	/**
	* Sets the ngaymuon of this phieumuon.
	*
	* @param ngaymuon the ngaymuon of this phieumuon
	*/
	@Override
	public void setNgaymuon(java.util.Date ngaymuon) {
		_phieumuon.setNgaymuon(ngaymuon);
	}

	/**
	* Returns the ngaytra of this phieumuon.
	*
	* @return the ngaytra of this phieumuon
	*/
	@Override
	public java.util.Date getNgaytra() {
		return _phieumuon.getNgaytra();
	}

	/**
	* Sets the ngaytra of this phieumuon.
	*
	* @param ngaytra the ngaytra of this phieumuon
	*/
	@Override
	public void setNgaytra(java.util.Date ngaytra) {
		_phieumuon.setNgaytra(ngaytra);
	}

	/**
	* Returns the xacnhan of this phieumuon.
	*
	* @return the xacnhan of this phieumuon
	*/
	@Override
	public long getXacnhan() {
		return _phieumuon.getXacnhan();
	}

	/**
	* Sets the xacnhan of this phieumuon.
	*
	* @param xacnhan the xacnhan of this phieumuon
	*/
	@Override
	public void setXacnhan(long xacnhan) {
		_phieumuon.setXacnhan(xacnhan);
	}

	/**
	* Returns the trangthai of this phieumuon.
	*
	* @return the trangthai of this phieumuon
	*/
	@Override
	public long getTrangthai() {
		return _phieumuon.getTrangthai();
	}

	/**
	* Sets the trangthai of this phieumuon.
	*
	* @param trangthai the trangthai of this phieumuon
	*/
	@Override
	public void setTrangthai(long trangthai) {
		_phieumuon.setTrangthai(trangthai);
	}

	/**
	* Returns the soluong of this phieumuon.
	*
	* @return the soluong of this phieumuon
	*/
	@Override
	public long getSoluong() {
		return _phieumuon.getSoluong();
	}

	/**
	* Sets the soluong of this phieumuon.
	*
	* @param soluong the soluong of this phieumuon
	*/
	@Override
	public void setSoluong(long soluong) {
		_phieumuon.setSoluong(soluong);
	}

	/**
	* Returns the giahan of this phieumuon.
	*
	* @return the giahan of this phieumuon
	*/
	@Override
	public long getGiahan() {
		return _phieumuon.getGiahan();
	}

	/**
	* Sets the giahan of this phieumuon.
	*
	* @param giahan the giahan of this phieumuon
	*/
	@Override
	public void setGiahan(long giahan) {
		_phieumuon.setGiahan(giahan);
	}

	/**
	* Returns the lydo of this phieumuon.
	*
	* @return the lydo of this phieumuon
	*/
	@Override
	public java.lang.String getLydo() {
		return _phieumuon.getLydo();
	}

	/**
	* Sets the lydo of this phieumuon.
	*
	* @param lydo the lydo of this phieumuon
	*/
	@Override
	public void setLydo(java.lang.String lydo) {
		_phieumuon.setLydo(lydo);
	}

	@Override
	public boolean isNew() {
		return _phieumuon.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phieumuon.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phieumuon.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phieumuon.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phieumuon.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phieumuon.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phieumuon.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phieumuon.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phieumuon.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phieumuon.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phieumuon.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new phieumuonWrapper((phieumuon)_phieumuon.clone());
	}

	@Override
	public int compareTo(danhmuc.model.phieumuon phieumuon) {
		return _phieumuon.compareTo(phieumuon);
	}

	@Override
	public int hashCode() {
		return _phieumuon.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<danhmuc.model.phieumuon> toCacheModel() {
		return _phieumuon.toCacheModel();
	}

	@Override
	public danhmuc.model.phieumuon toEscapedModel() {
		return new phieumuonWrapper(_phieumuon.toEscapedModel());
	}

	@Override
	public danhmuc.model.phieumuon toUnescapedModel() {
		return new phieumuonWrapper(_phieumuon.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phieumuon.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phieumuon.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phieumuon.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof phieumuonWrapper)) {
			return false;
		}

		phieumuonWrapper phieumuonWrapper = (phieumuonWrapper)obj;

		if (Validator.equals(_phieumuon, phieumuonWrapper._phieumuon)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public phieumuon getWrappedphieumuon() {
		return _phieumuon;
	}

	@Override
	public phieumuon getWrappedModel() {
		return _phieumuon;
	}

	@Override
	public void resetOriginalValues() {
		_phieumuon.resetOriginalValues();
	}

	private phieumuon _phieumuon;
}