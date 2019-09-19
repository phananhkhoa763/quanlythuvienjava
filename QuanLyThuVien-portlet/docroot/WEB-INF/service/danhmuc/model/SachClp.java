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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import danhmuc.service.ClpSerializer;
import danhmuc.service.SachLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LAPTOP
 */
public class SachClp extends BaseModelImpl<Sach> implements Sach {
	public SachClp() {
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
	public long getPrimaryKey() {
		return _id;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _id;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_sachRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public void setName(String name) {
		_name = name;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_sachRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTheloaiID() {
		return _theloaiID;
	}

	@Override
	public void setTheloaiID(long theloaiID) {
		_theloaiID = theloaiID;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTheloaiID", long.class);

				method.invoke(_sachRemoteModel, theloaiID);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getSoluong() {
		return _soluong;
	}

	@Override
	public void setSoluong(long soluong) {
		_soluong = soluong;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setSoluong", long.class);

				method.invoke(_sachRemoteModel, soluong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNxb() {
		return _nxb;
	}

	@Override
	public void setNxb(String nxb) {
		_nxb = nxb;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setNxb", String.class);

				method.invoke(_sachRemoteModel, nxb);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getTacgia() {
		return _tacgia;
	}

	@Override
	public void setTacgia(String tacgia) {
		_tacgia = tacgia;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTacgia", String.class);

				method.invoke(_sachRemoteModel, tacgia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMasach() {
		return _masach;
	}

	@Override
	public void setMasach(String masach) {
		_masach = masach;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setMasach", String.class);

				method.invoke(_sachRemoteModel, masach);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getKe() {
		return _ke;
	}

	@Override
	public void setKe(long ke) {
		_ke = ke;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setKe", long.class);

				method.invoke(_sachRemoteModel, ke);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTang() {
		return _tang;
	}

	@Override
	public void setTang(long tang) {
		_tang = tang;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setTang", long.class);

				method.invoke(_sachRemoteModel, tang);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNoidung() {
		return _noidung;
	}

	@Override
	public void setNoidung(String noidung) {
		_noidung = noidung;

		if (_sachRemoteModel != null) {
			try {
				Class<?> clazz = _sachRemoteModel.getClass();

				Method method = clazz.getMethod("setNoidung", String.class);

				method.invoke(_sachRemoteModel, noidung);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getSachRemoteModel() {
		return _sachRemoteModel;
	}

	public void setSachRemoteModel(BaseModel<?> sachRemoteModel) {
		_sachRemoteModel = sachRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _sachRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_sachRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			SachLocalServiceUtil.addSach(this);
		}
		else {
			SachLocalServiceUtil.updateSach(this);
		}
	}

	@Override
	public Sach toEscapedModel() {
		return (Sach)ProxyUtil.newProxyInstance(Sach.class.getClassLoader(),
			new Class[] { Sach.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		SachClp clone = new SachClp();

		clone.setId(getId());
		clone.setName(getName());
		clone.setTheloaiID(getTheloaiID());
		clone.setSoluong(getSoluong());
		clone.setNxb(getNxb());
		clone.setTacgia(getTacgia());
		clone.setMasach(getMasach());
		clone.setKe(getKe());
		clone.setTang(getTang());
		clone.setNoidung(getNoidung());

		return clone;
	}

	@Override
	public int compareTo(Sach sach) {
		long primaryKey = sach.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof SachClp)) {
			return false;
		}

		SachClp sach = (SachClp)obj;

		long primaryKey = sach.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", theloaiID=");
		sb.append(getTheloaiID());
		sb.append(", soluong=");
		sb.append(getSoluong());
		sb.append(", nxb=");
		sb.append(getNxb());
		sb.append(", tacgia=");
		sb.append(getTacgia());
		sb.append(", masach=");
		sb.append(getMasach());
		sb.append(", ke=");
		sb.append(getKe());
		sb.append(", tang=");
		sb.append(getTang());
		sb.append(", noidung=");
		sb.append(getNoidung());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("danhmuc.model.Sach");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>theloaiID</column-name><column-value><![CDATA[");
		sb.append(getTheloaiID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soluong</column-name><column-value><![CDATA[");
		sb.append(getSoluong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nxb</column-name><column-value><![CDATA[");
		sb.append(getNxb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tacgia</column-name><column-value><![CDATA[");
		sb.append(getTacgia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>masach</column-name><column-value><![CDATA[");
		sb.append(getMasach());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ke</column-name><column-value><![CDATA[");
		sb.append(getKe());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>tang</column-name><column-value><![CDATA[");
		sb.append(getTang());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>noidung</column-name><column-value><![CDATA[");
		sb.append(getNoidung());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private String _name;
	private long _theloaiID;
	private long _soluong;
	private String _nxb;
	private String _tacgia;
	private String _masach;
	private long _ke;
	private long _tang;
	private String _noidung;
	private BaseModel<?> _sachRemoteModel;
	private Class<?> _clpSerializerClass = danhmuc.service.ClpSerializer.class;
}