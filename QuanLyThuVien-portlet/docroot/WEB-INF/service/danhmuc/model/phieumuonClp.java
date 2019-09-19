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
import com.liferay.portal.util.PortalUtil;

import danhmuc.service.ClpSerializer;
import danhmuc.service.phieumuonLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LAPTOP
 */
public class phieumuonClp extends BaseModelImpl<phieumuon> implements phieumuon {
	public phieumuonClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_phieumuonRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_phieumuonRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public long getSachId() {
		return _sachId;
	}

	@Override
	public void setSachId(long sachId) {
		_sachId = sachId;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setSachId", long.class);

				method.invoke(_phieumuonRemoteModel, sachId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaymuon() {
		return _ngaymuon;
	}

	@Override
	public void setNgaymuon(Date ngaymuon) {
		_ngaymuon = ngaymuon;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaymuon", Date.class);

				method.invoke(_phieumuonRemoteModel, ngaymuon);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaytra() {
		return _ngaytra;
	}

	@Override
	public void setNgaytra(Date ngaytra) {
		_ngaytra = ngaytra;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaytra", Date.class);

				method.invoke(_phieumuonRemoteModel, ngaytra);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getXacnhan() {
		return _xacnhan;
	}

	@Override
	public void setXacnhan(long xacnhan) {
		_xacnhan = xacnhan;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setXacnhan", long.class);

				method.invoke(_phieumuonRemoteModel, xacnhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getTrangthai() {
		return _trangthai;
	}

	@Override
	public void setTrangthai(long trangthai) {
		_trangthai = trangthai;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setTrangthai", long.class);

				method.invoke(_phieumuonRemoteModel, trangthai);
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

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setSoluong", long.class);

				method.invoke(_phieumuonRemoteModel, soluong);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGiahan() {
		return _giahan;
	}

	@Override
	public void setGiahan(long giahan) {
		_giahan = giahan;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setGiahan", long.class);

				method.invoke(_phieumuonRemoteModel, giahan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getLydo() {
		return _lydo;
	}

	@Override
	public void setLydo(String lydo) {
		_lydo = lydo;

		if (_phieumuonRemoteModel != null) {
			try {
				Class<?> clazz = _phieumuonRemoteModel.getClass();

				Method method = clazz.getMethod("setLydo", String.class);

				method.invoke(_phieumuonRemoteModel, lydo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getphieumuonRemoteModel() {
		return _phieumuonRemoteModel;
	}

	public void setphieumuonRemoteModel(BaseModel<?> phieumuonRemoteModel) {
		_phieumuonRemoteModel = phieumuonRemoteModel;
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

		Class<?> remoteModelClass = _phieumuonRemoteModel.getClass();

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

		Object returnValue = method.invoke(_phieumuonRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			phieumuonLocalServiceUtil.addphieumuon(this);
		}
		else {
			phieumuonLocalServiceUtil.updatephieumuon(this);
		}
	}

	@Override
	public phieumuon toEscapedModel() {
		return (phieumuon)ProxyUtil.newProxyInstance(phieumuon.class.getClassLoader(),
			new Class[] { phieumuon.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		phieumuonClp clone = new phieumuonClp();

		clone.setId(getId());
		clone.setUserId(getUserId());
		clone.setSachId(getSachId());
		clone.setNgaymuon(getNgaymuon());
		clone.setNgaytra(getNgaytra());
		clone.setXacnhan(getXacnhan());
		clone.setTrangthai(getTrangthai());
		clone.setSoluong(getSoluong());
		clone.setGiahan(getGiahan());
		clone.setLydo(getLydo());

		return clone;
	}

	@Override
	public int compareTo(phieumuon phieumuon) {
		long primaryKey = phieumuon.getPrimaryKey();

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

		if (!(obj instanceof phieumuonClp)) {
			return false;
		}

		phieumuonClp phieumuon = (phieumuonClp)obj;

		long primaryKey = phieumuon.getPrimaryKey();

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
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", sachId=");
		sb.append(getSachId());
		sb.append(", ngaymuon=");
		sb.append(getNgaymuon());
		sb.append(", ngaytra=");
		sb.append(getNgaytra());
		sb.append(", xacnhan=");
		sb.append(getXacnhan());
		sb.append(", trangthai=");
		sb.append(getTrangthai());
		sb.append(", soluong=");
		sb.append(getSoluong());
		sb.append(", giahan=");
		sb.append(getGiahan());
		sb.append(", lydo=");
		sb.append(getLydo());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("danhmuc.model.phieumuon");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sachId</column-name><column-value><![CDATA[");
		sb.append(getSachId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaymuon</column-name><column-value><![CDATA[");
		sb.append(getNgaymuon());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaytra</column-name><column-value><![CDATA[");
		sb.append(getNgaytra());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xacnhan</column-name><column-value><![CDATA[");
		sb.append(getXacnhan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trangthai</column-name><column-value><![CDATA[");
		sb.append(getTrangthai());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>soluong</column-name><column-value><![CDATA[");
		sb.append(getSoluong());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>giahan</column-name><column-value><![CDATA[");
		sb.append(getGiahan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lydo</column-name><column-value><![CDATA[");
		sb.append(getLydo());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private long _userId;
	private String _userUuid;
	private long _sachId;
	private Date _ngaymuon;
	private Date _ngaytra;
	private long _xacnhan;
	private long _trangthai;
	private long _soluong;
	private long _giahan;
	private String _lydo;
	private BaseModel<?> _phieumuonRemoteModel;
	private Class<?> _clpSerializerClass = danhmuc.service.ClpSerializer.class;
}