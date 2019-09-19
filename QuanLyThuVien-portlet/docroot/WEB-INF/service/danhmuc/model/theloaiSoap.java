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
 * This class is used by SOAP remote services, specifically {@link danhmuc.service.http.theloaiServiceSoap}.
 *
 * @author LAPTOP
 * @see danhmuc.service.http.theloaiServiceSoap
 * @generated
 */
public class theloaiSoap implements Serializable {
	public static theloaiSoap toSoapModel(theloai model) {
		theloaiSoap soapModel = new theloaiSoap();

		soapModel.setId(model.getId());
		soapModel.setName(model.getName());

		return soapModel;
	}

	public static theloaiSoap[] toSoapModels(theloai[] models) {
		theloaiSoap[] soapModels = new theloaiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static theloaiSoap[][] toSoapModels(theloai[][] models) {
		theloaiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new theloaiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new theloaiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static theloaiSoap[] toSoapModels(List<theloai> models) {
		List<theloaiSoap> soapModels = new ArrayList<theloaiSoap>(models.size());

		for (theloai model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new theloaiSoap[soapModels.size()]);
	}

	public theloaiSoap() {
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

	private long _id;
	private String _name;
}