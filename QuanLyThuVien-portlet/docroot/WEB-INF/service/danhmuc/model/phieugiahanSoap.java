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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link danhmuc.service.http.phieugiahanServiceSoap}.
 *
 * @author LAPTOP
 * @see danhmuc.service.http.phieugiahanServiceSoap
 * @generated
 */
public class phieugiahanSoap implements Serializable {
	public static phieugiahanSoap toSoapModel(phieugiahan model) {
		phieugiahanSoap soapModel = new phieugiahanSoap();

		soapModel.setId(model.getId());
		soapModel.setNgaygiahan(model.getNgaygiahan());
		soapModel.setPhieumuonId(model.getPhieumuonId());
		soapModel.setXacnhan(model.getXacnhan());

		return soapModel;
	}

	public static phieugiahanSoap[] toSoapModels(phieugiahan[] models) {
		phieugiahanSoap[] soapModels = new phieugiahanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static phieugiahanSoap[][] toSoapModels(phieugiahan[][] models) {
		phieugiahanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new phieugiahanSoap[models.length][models[0].length];
		}
		else {
			soapModels = new phieugiahanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static phieugiahanSoap[] toSoapModels(List<phieugiahan> models) {
		List<phieugiahanSoap> soapModels = new ArrayList<phieugiahanSoap>(models.size());

		for (phieugiahan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new phieugiahanSoap[soapModels.size()]);
	}

	public phieugiahanSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public Date getNgaygiahan() {
		return _ngaygiahan;
	}

	public void setNgaygiahan(Date ngaygiahan) {
		_ngaygiahan = ngaygiahan;
	}

	public long getPhieumuonId() {
		return _phieumuonId;
	}

	public void setPhieumuonId(long phieumuonId) {
		_phieumuonId = phieumuonId;
	}

	public long getXacnhan() {
		return _xacnhan;
	}

	public void setXacnhan(long xacnhan) {
		_xacnhan = xacnhan;
	}

	private long _id;
	private Date _ngaygiahan;
	private long _phieumuonId;
	private long _xacnhan;
}