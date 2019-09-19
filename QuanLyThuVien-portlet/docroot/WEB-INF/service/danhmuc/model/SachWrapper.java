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
 * This class is a wrapper for {@link Sach}.
 * </p>
 *
 * @author LAPTOP
 * @see Sach
 * @generated
 */
public class SachWrapper implements Sach, ModelWrapper<Sach> {
	public SachWrapper(Sach sach) {
		_sach = sach;
	}

	@Override
	public Class<?> getModelClass() {
		return Sach.class;
	}

	@Override
	public String getModelClassName() {
		return Sach.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("name", getName());
		attributes.put("theloaiID", getTheloaiID());
		attributes.put("soluong", getSoluong());
		attributes.put("nxb", getNxb());
		attributes.put("tacgia", getTacgia());
		attributes.put("masach", getMasach());
		attributes.put("ke", getKe());
		attributes.put("tang", getTang());
		attributes.put("noidung", getNoidung());

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

		Long theloaiID = (Long)attributes.get("theloaiID");

		if (theloaiID != null) {
			setTheloaiID(theloaiID);
		}

		Long soluong = (Long)attributes.get("soluong");

		if (soluong != null) {
			setSoluong(soluong);
		}

		String nxb = (String)attributes.get("nxb");

		if (nxb != null) {
			setNxb(nxb);
		}

		String tacgia = (String)attributes.get("tacgia");

		if (tacgia != null) {
			setTacgia(tacgia);
		}

		String masach = (String)attributes.get("masach");

		if (masach != null) {
			setMasach(masach);
		}

		Long ke = (Long)attributes.get("ke");

		if (ke != null) {
			setKe(ke);
		}

		Long tang = (Long)attributes.get("tang");

		if (tang != null) {
			setTang(tang);
		}

		String noidung = (String)attributes.get("noidung");

		if (noidung != null) {
			setNoidung(noidung);
		}
	}

	/**
	* Returns the primary key of this sach.
	*
	* @return the primary key of this sach
	*/
	@Override
	public long getPrimaryKey() {
		return _sach.getPrimaryKey();
	}

	/**
	* Sets the primary key of this sach.
	*
	* @param primaryKey the primary key of this sach
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_sach.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the ID of this sach.
	*
	* @return the ID of this sach
	*/
	@Override
	public long getId() {
		return _sach.getId();
	}

	/**
	* Sets the ID of this sach.
	*
	* @param id the ID of this sach
	*/
	@Override
	public void setId(long id) {
		_sach.setId(id);
	}

	/**
	* Returns the name of this sach.
	*
	* @return the name of this sach
	*/
	@Override
	public java.lang.String getName() {
		return _sach.getName();
	}

	/**
	* Sets the name of this sach.
	*
	* @param name the name of this sach
	*/
	@Override
	public void setName(java.lang.String name) {
		_sach.setName(name);
	}

	/**
	* Returns the theloai i d of this sach.
	*
	* @return the theloai i d of this sach
	*/
	@Override
	public long getTheloaiID() {
		return _sach.getTheloaiID();
	}

	/**
	* Sets the theloai i d of this sach.
	*
	* @param theloaiID the theloai i d of this sach
	*/
	@Override
	public void setTheloaiID(long theloaiID) {
		_sach.setTheloaiID(theloaiID);
	}

	/**
	* Returns the soluong of this sach.
	*
	* @return the soluong of this sach
	*/
	@Override
	public long getSoluong() {
		return _sach.getSoluong();
	}

	/**
	* Sets the soluong of this sach.
	*
	* @param soluong the soluong of this sach
	*/
	@Override
	public void setSoluong(long soluong) {
		_sach.setSoluong(soluong);
	}

	/**
	* Returns the nxb of this sach.
	*
	* @return the nxb of this sach
	*/
	@Override
	public java.lang.String getNxb() {
		return _sach.getNxb();
	}

	/**
	* Sets the nxb of this sach.
	*
	* @param nxb the nxb of this sach
	*/
	@Override
	public void setNxb(java.lang.String nxb) {
		_sach.setNxb(nxb);
	}

	/**
	* Returns the tacgia of this sach.
	*
	* @return the tacgia of this sach
	*/
	@Override
	public java.lang.String getTacgia() {
		return _sach.getTacgia();
	}

	/**
	* Sets the tacgia of this sach.
	*
	* @param tacgia the tacgia of this sach
	*/
	@Override
	public void setTacgia(java.lang.String tacgia) {
		_sach.setTacgia(tacgia);
	}

	/**
	* Returns the masach of this sach.
	*
	* @return the masach of this sach
	*/
	@Override
	public java.lang.String getMasach() {
		return _sach.getMasach();
	}

	/**
	* Sets the masach of this sach.
	*
	* @param masach the masach of this sach
	*/
	@Override
	public void setMasach(java.lang.String masach) {
		_sach.setMasach(masach);
	}

	/**
	* Returns the ke of this sach.
	*
	* @return the ke of this sach
	*/
	@Override
	public long getKe() {
		return _sach.getKe();
	}

	/**
	* Sets the ke of this sach.
	*
	* @param ke the ke of this sach
	*/
	@Override
	public void setKe(long ke) {
		_sach.setKe(ke);
	}

	/**
	* Returns the tang of this sach.
	*
	* @return the tang of this sach
	*/
	@Override
	public long getTang() {
		return _sach.getTang();
	}

	/**
	* Sets the tang of this sach.
	*
	* @param tang the tang of this sach
	*/
	@Override
	public void setTang(long tang) {
		_sach.setTang(tang);
	}

	/**
	* Returns the noidung of this sach.
	*
	* @return the noidung of this sach
	*/
	@Override
	public java.lang.String getNoidung() {
		return _sach.getNoidung();
	}

	/**
	* Sets the noidung of this sach.
	*
	* @param noidung the noidung of this sach
	*/
	@Override
	public void setNoidung(java.lang.String noidung) {
		_sach.setNoidung(noidung);
	}

	@Override
	public boolean isNew() {
		return _sach.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_sach.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _sach.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_sach.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _sach.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _sach.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_sach.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _sach.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_sach.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_sach.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_sach.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new SachWrapper((Sach)_sach.clone());
	}

	@Override
	public int compareTo(danhmuc.model.Sach sach) {
		return _sach.compareTo(sach);
	}

	@Override
	public int hashCode() {
		return _sach.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<danhmuc.model.Sach> toCacheModel() {
		return _sach.toCacheModel();
	}

	@Override
	public danhmuc.model.Sach toEscapedModel() {
		return new SachWrapper(_sach.toEscapedModel());
	}

	@Override
	public danhmuc.model.Sach toUnescapedModel() {
		return new SachWrapper(_sach.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _sach.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _sach.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_sach.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SachWrapper)) {
			return false;
		}

		SachWrapper sachWrapper = (SachWrapper)obj;

		if (Validator.equals(_sach, sachWrapper._sach)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Sach getWrappedSach() {
		return _sach;
	}

	@Override
	public Sach getWrappedModel() {
		return _sach;
	}

	@Override
	public void resetOriginalValues() {
		_sach.resetOriginalValues();
	}

	private Sach _sach;
}