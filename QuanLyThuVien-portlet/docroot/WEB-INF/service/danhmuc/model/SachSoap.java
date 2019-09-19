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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link danhmuc.service.http.SachServiceSoap}.
 *
 * @author LAPTOP
 * @see danhmuc.service.http.SachServiceSoap
 * @generated
 */
public class SachSoap implements Serializable {
	public static SachSoap toSoapModel(Sach model) {
		SachSoap soapModel = new SachSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());
		soapModel.setTheloaiID(model.getTheloaiID());
		soapModel.setSoluong(model.getSoluong());
		soapModel.setNxb(model.getNxb());
		soapModel.setTacgia(model.getTacgia());
		soapModel.setMasach(model.getMasach());
		soapModel.setKe(model.getKe());
		soapModel.setTang(model.getTang());
		soapModel.setNoidung(model.getNoidung());

		return soapModel;
	}

	public static SachSoap[] toSoapModels(Sach[] models) {
		SachSoap[] soapModels = new SachSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SachSoap[][] toSoapModels(Sach[][] models) {
		SachSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SachSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SachSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SachSoap[] toSoapModels(List<Sach> models) {
		List<SachSoap> soapModels = new ArrayList<SachSoap>(models.size());

		for (Sach model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SachSoap[soapModels.size()]);
	}

	public SachSoap() {
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

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public long getTheloaiID() {
		return _theloaiID;
	}

	public void setTheloaiID(long theloaiID) {
		_theloaiID = theloaiID;
	}

	public long getSoluong() {
		return _soluong;
	}

	public void setSoluong(long soluong) {
		_soluong = soluong;
	}

	public String getNxb() {
		return _nxb;
	}

	public void setNxb(String nxb) {
		_nxb = nxb;
	}

	public String getTacgia() {
		return _tacgia;
	}

	public void setTacgia(String tacgia) {
		_tacgia = tacgia;
	}

	public String getMasach() {
		return _masach;
	}

	public void setMasach(String masach) {
		_masach = masach;
	}

	public long getKe() {
		return _ke;
	}

	public void setKe(long ke) {
		_ke = ke;
	}

	public long getTang() {
		return _tang;
	}

	public void setTang(long tang) {
		_tang = tang;
	}

	public String getNoidung() {
		return _noidung;
	}

	public void setNoidung(String noidung) {
		_noidung = noidung;
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
}