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

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link theloai}.
 * </p>
 *
 * @author LAPTOP
 * @see theloai
 * @generated
 */
public class theloaiWrapper implements theloai, ModelWrapper<theloai> {
	public theloaiWrapper(theloai theloai) {
		_theloai = theloai;
	}

	@Override
	public Class<?> getModelClass() {
		return theloai.class;
	}

	@Override
	public String getModelClassName() {
		return theloai.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}
	}

	/**
	* Returns the primary key of this theloai.
	*
	* @return the primary key of this theloai
	*/
	@Override
	public long getPrimaryKey() {
		return _theloai.getPrimaryKey();
	}

	/**
	* Sets the primary key of this theloai.
	*
	* @param primaryKey the primary key of this theloai
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_theloai.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this theloai.
	*
	* @return the ID of this theloai
	*/
	@Override
	public long getId() {
		return _theloai.getId();
	}

	/**
	* Sets the ID of this theloai.
	*
	* @param id the ID of this theloai
	*/
	@Override
	public void setId(long id) {
		_theloai.setId(id);
	}

	/**
	* Returns the name of this theloai.
	*
	* @return the name of this theloai
	*/
	@Override
	public java.lang.String getName() {
		return _theloai.getName();
	}

	/**
	* Sets the name of this theloai.
	*
	* @param name the name of this theloai
	*/
	@Override
	public void setName(java.lang.String name) {
		_theloai.setName(name);
	}

	@Override
	public boolean isNew() {
		return _theloai.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_theloai.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _theloai.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_theloai.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _theloai.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _theloai.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_theloai.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _theloai.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_theloai.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_theloai.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_theloai.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new theloaiWrapper((theloai)_theloai.clone());
	}

	@Override
	public int compareTo(danhmuc.model.theloai theloai) {
		return _theloai.compareTo(theloai);
	}

	@Override
	public int hashCode() {
		return _theloai.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<danhmuc.model.theloai> toCacheModel() {
		return _theloai.toCacheModel();
	}

	@Override
	public danhmuc.model.theloai toEscapedModel() {
		return new theloaiWrapper(_theloai.toEscapedModel());
	}

	@Override
	public danhmuc.model.theloai toUnescapedModel() {
		return new theloaiWrapper(_theloai.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _theloai.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _theloai.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_theloai.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof theloaiWrapper)) {
			return false;
		}

		theloaiWrapper theloaiWrapper = (theloaiWrapper)obj;

		if (Validator.equals(_theloai, theloaiWrapper._theloai)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public theloai getWrappedtheloai() {
		return _theloai;
	}

	@Override
	public theloai getWrappedModel() {
		return _theloai;
	}

	@Override
	public void resetOriginalValues() {
		_theloai.resetOriginalValues();
	}

	private theloai _theloai;
}