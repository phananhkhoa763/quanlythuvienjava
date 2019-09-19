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
 * This class is a wrapper for {@link phieugiahan}.
 * </p>
 *
 * @author LAPTOP
 * @see phieugiahan
 * @generated
 */
public class phieugiahanWrapper implements phieugiahan,
	ModelWrapper<phieugiahan> {
	public phieugiahanWrapper(phieugiahan phieugiahan) {
		_phieugiahan = phieugiahan;
	}

	@Override
	public Class<?> getModelClass() {
		return phieugiahan.class;
	}

	@Override
	public String getModelClassName() {
		return phieugiahan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("ngaygiahan", getNgaygiahan());
		attributes.put("phieumuonId", getPhieumuonId());
		attributes.put("xacnhan", getXacnhan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Date ngaygiahan = (Date)attributes.get("ngaygiahan");

		if (ngaygiahan != null) {
			setNgaygiahan(ngaygiahan);
		}

		Long phieumuonId = (Long)attributes.get("phieumuonId");

		if (phieumuonId != null) {
			setPhieumuonId(phieumuonId);
		}

		Long xacnhan = (Long)attributes.get("xacnhan");

		if (xacnhan != null) {
			setXacnhan(xacnhan);
		}
	}

	/**
	* Returns the primary key of this phieugiahan.
	*
	* @return the primary key of this phieugiahan
	*/
	@Override
	public long getPrimaryKey() {
		return _phieugiahan.getPrimaryKey();
	}

	/**
	* Sets the primary key of this phieugiahan.
	*
	* @param primaryKey the primary key of this phieugiahan
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_phieugiahan.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this phieugiahan.
	*
	* @return the ID of this phieugiahan
	*/
	@Override
	public long getId() {
		return _phieugiahan.getId();
	}

	/**
	* Sets the ID of this phieugiahan.
	*
	* @param id the ID of this phieugiahan
	*/
	@Override
	public void setId(long id) {
		_phieugiahan.setId(id);
	}

	/**
	* Returns the ngaygiahan of this phieugiahan.
	*
	* @return the ngaygiahan of this phieugiahan
	*/
	@Override
	public java.util.Date getNgaygiahan() {
		return _phieugiahan.getNgaygiahan();
	}

	/**
	* Sets the ngaygiahan of this phieugiahan.
	*
	* @param ngaygiahan the ngaygiahan of this phieugiahan
	*/
	@Override
	public void setNgaygiahan(java.util.Date ngaygiahan) {
		_phieugiahan.setNgaygiahan(ngaygiahan);
	}

	/**
	* Returns the phieumuon ID of this phieugiahan.
	*
	* @return the phieumuon ID of this phieugiahan
	*/
	@Override
	public long getPhieumuonId() {
		return _phieugiahan.getPhieumuonId();
	}

	/**
	* Sets the phieumuon ID of this phieugiahan.
	*
	* @param phieumuonId the phieumuon ID of this phieugiahan
	*/
	@Override
	public void setPhieumuonId(long phieumuonId) {
		_phieugiahan.setPhieumuonId(phieumuonId);
	}

	/**
	* Returns the xacnhan of this phieugiahan.
	*
	* @return the xacnhan of this phieugiahan
	*/
	@Override
	public long getXacnhan() {
		return _phieugiahan.getXacnhan();
	}

	/**
	* Sets the xacnhan of this phieugiahan.
	*
	* @param xacnhan the xacnhan of this phieugiahan
	*/
	@Override
	public void setXacnhan(long xacnhan) {
		_phieugiahan.setXacnhan(xacnhan);
	}

	@Override
	public boolean isNew() {
		return _phieugiahan.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_phieugiahan.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _phieugiahan.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_phieugiahan.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _phieugiahan.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _phieugiahan.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_phieugiahan.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _phieugiahan.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_phieugiahan.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_phieugiahan.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_phieugiahan.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new phieugiahanWrapper((phieugiahan)_phieugiahan.clone());
	}

	@Override
	public int compareTo(danhmuc.model.phieugiahan phieugiahan) {
		return _phieugiahan.compareTo(phieugiahan);
	}

	@Override
	public int hashCode() {
		return _phieugiahan.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<danhmuc.model.phieugiahan> toCacheModel() {
		return _phieugiahan.toCacheModel();
	}

	@Override
	public danhmuc.model.phieugiahan toEscapedModel() {
		return new phieugiahanWrapper(_phieugiahan.toEscapedModel());
	}

	@Override
	public danhmuc.model.phieugiahan toUnescapedModel() {
		return new phieugiahanWrapper(_phieugiahan.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _phieugiahan.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _phieugiahan.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_phieugiahan.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof phieugiahanWrapper)) {
			return false;
		}

		phieugiahanWrapper phieugiahanWrapper = (phieugiahanWrapper)obj;

		if (Validator.equals(_phieugiahan, phieugiahanWrapper._phieugiahan)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public phieugiahan getWrappedphieugiahan() {
		return _phieugiahan;
	}

	@Override
	public phieugiahan getWrappedModel() {
		return _phieugiahan;
	}

	@Override
	public void resetOriginalValues() {
		_phieugiahan.resetOriginalValues();
	}

	private phieugiahan _phieugiahan;
}