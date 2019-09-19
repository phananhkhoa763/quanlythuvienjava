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
import danhmuc.service.phieugiahanLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author LAPTOP
 */
public class phieugiahanClp extends BaseModelImpl<phieugiahan>
	implements phieugiahan {
	public phieugiahanClp() {
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

	@Override
	public long getId() {
		return _id;
	}

	@Override
	public void setId(long id) {
		_id = id;

		if (_phieugiahanRemoteModel != null) {
			try {
				Class<?> clazz = _phieugiahanRemoteModel.getClass();

				Method method = clazz.getMethod("setId", long.class);

				method.invoke(_phieugiahanRemoteModel, id);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getNgaygiahan() {
		return _ngaygiahan;
	}

	@Override
	public void setNgaygiahan(Date ngaygiahan) {
		_ngaygiahan = ngaygiahan;

		if (_phieugiahanRemoteModel != null) {
			try {
				Class<?> clazz = _phieugiahanRemoteModel.getClass();

				Method method = clazz.getMethod("setNgaygiahan", Date.class);

				method.invoke(_phieugiahanRemoteModel, ngaygiahan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getPhieumuonId() {
		return _phieumuonId;
	}

	@Override
	public void setPhieumuonId(long phieumuonId) {
		_phieumuonId = phieumuonId;

		if (_phieugiahanRemoteModel != null) {
			try {
				Class<?> clazz = _phieugiahanRemoteModel.getClass();

				Method method = clazz.getMethod("setPhieumuonId", long.class);

				method.invoke(_phieugiahanRemoteModel, phieumuonId);
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

		if (_phieugiahanRemoteModel != null) {
			try {
				Class<?> clazz = _phieugiahanRemoteModel.getClass();

				Method method = clazz.getMethod("setXacnhan", long.class);

				method.invoke(_phieugiahanRemoteModel, xacnhan);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getphieugiahanRemoteModel() {
		return _phieugiahanRemoteModel;
	}

	public void setphieugiahanRemoteModel(BaseModel<?> phieugiahanRemoteModel) {
		_phieugiahanRemoteModel = phieugiahanRemoteModel;
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

		Class<?> remoteModelClass = _phieugiahanRemoteModel.getClass();

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

		Object returnValue = method.invoke(_phieugiahanRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			phieugiahanLocalServiceUtil.addphieugiahan(this);
		}
		else {
			phieugiahanLocalServiceUtil.updatephieugiahan(this);
		}
	}

	@Override
	public phieugiahan toEscapedModel() {
		return (phieugiahan)ProxyUtil.newProxyInstance(phieugiahan.class.getClassLoader(),
			new Class[] { phieugiahan.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		phieugiahanClp clone = new phieugiahanClp();

		clone.setId(getId());
		clone.setNgaygiahan(getNgaygiahan());
		clone.setPhieumuonId(getPhieumuonId());
		clone.setXacnhan(getXacnhan());

		return clone;
	}

	@Override
	public int compareTo(phieugiahan phieugiahan) {
		long primaryKey = phieugiahan.getPrimaryKey();

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

		if (!(obj instanceof phieugiahanClp)) {
			return false;
		}

		phieugiahanClp phieugiahan = (phieugiahanClp)obj;

		long primaryKey = phieugiahan.getPrimaryKey();

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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(getId());
		sb.append(", ngaygiahan=");
		sb.append(getNgaygiahan());
		sb.append(", phieumuonId=");
		sb.append(getPhieumuonId());
		sb.append(", xacnhan=");
		sb.append(getXacnhan());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("danhmuc.model.phieugiahan");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>id</column-name><column-value><![CDATA[");
		sb.append(getId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ngaygiahan</column-name><column-value><![CDATA[");
		sb.append(getNgaygiahan());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phieumuonId</column-name><column-value><![CDATA[");
		sb.append(getPhieumuonId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>xacnhan</column-name><column-value><![CDATA[");
		sb.append(getXacnhan());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _id;
	private Date _ngaygiahan;
	private long _phieumuonId;
	private long _xacnhan;
	private BaseModel<?> _phieugiahanRemoteModel;
	private Class<?> _clpSerializerClass = danhmuc.service.ClpSerializer.class;
}