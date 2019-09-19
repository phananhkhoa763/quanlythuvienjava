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
 * This class is used by SOAP remote services, specifically {@link danhmuc.service.http.phieumuonServiceSoap}.
 *
 * @author LAPTOP
 * @see danhmuc.service.http.phieumuonServiceSoap
 * @generated
 */
public class phieumuonSoap implements Serializable {
	public static phieumuonSoap toSoapModel(phieumuon model) {
		phieumuonSoap soapModel = new phieumuonSoap();

		soapModel.setId(model.getId());
		soapModel.setUserId(model.getUserId());
		soapModel.setSachId(model.getSachId());
		soapModel.setNgaymuon(model.getNgaymuon());
		soapModel.setNgaytra(model.getNgaytra());
		soapModel.setXacnhan(model.getXacnhan());
		soapModel.setTrangthai(model.getTrangthai());
		soapModel.setSoluong(model.getSoluong());
		soapModel.setGiahan(model.getGiahan());
		soapModel.setLydo(model.getLydo());

		return soapModel;
	}

	public static phieumuonSoap[] toSoapModels(phieumuon[] models) {
		phieumuonSoap[] soapModels = new phieumuonSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static phieumuonSoap[][] toSoapModels(phieumuon[][] models) {
		phieumuonSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new phieumuonSoap[models.length][models[0].length];
		}
		else {
			soapModels = new phieumuonSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static phieumuonSoap[] toSoapModels(List<phieumuon> models) {
		List<phieumuonSoap> soapModels = new ArrayList<phieumuonSoap>(models.size());

		for (phieumuon model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new phieumuonSoap[soapModels.size()]);
	}

	public phieumuonSoap() {
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

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public long getSachId() {
		return _sachId;
	}

	public void setSachId(long sachId) {
		_sachId = sachId;
	}

	public Date getNgaymuon() {
		return _ngaymuon;
	}

	public void setNgaymuon(Date ngaymuon) {
		_ngaymuon = ngaymuon;
	}

	public Date getNgaytra() {
		return _ngaytra;
	}

	public void setNgaytra(Date ngaytra) {
		_ngaytra = ngaytra;
	}

	public long getXacnhan() {
		return _xacnhan;
	}

	public void setXacnhan(long xacnhan) {
		_xacnhan = xacnhan;
	}

	public long getTrangthai() {
		return _trangthai;
	}

	public void setTrangthai(long trangthai) {
		_trangthai = trangthai;
	}

	public long getSoluong() {
		return _soluong;
	}

	public void setSoluong(long soluong) {
		_soluong = soluong;
	}

	public long getGiahan() {
		return _giahan;
	}

	public void setGiahan(long giahan) {
		_giahan = giahan;
	}

	public String getLydo() {
		return _lydo;
	}

	public void setLydo(String lydo) {
		_lydo = lydo;
	}

	private long _id;
	private long _userId;
	private long _sachId;
	private Date _ngaymuon;
	private Date _ngaytra;
	private long _xacnhan;
	private long _trangthai;
	private long _soluong;
	private long _giahan;
	private String _lydo;
}