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

package danhmuc.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import danhmuc.model.phieumuon;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing phieumuon in entity cache.
 *
 * @author LAPTOP
 * @see phieumuon
 * @generated
 */
public class phieumuonCacheModel implements CacheModel<phieumuon>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", sachId=");
		sb.append(sachId);
		sb.append(", ngaymuon=");
		sb.append(ngaymuon);
		sb.append(", ngaytra=");
		sb.append(ngaytra);
		sb.append(", xacnhan=");
		sb.append(xacnhan);
		sb.append(", trangthai=");
		sb.append(trangthai);
		sb.append(", soluong=");
		sb.append(soluong);
		sb.append(", giahan=");
		sb.append(giahan);
		sb.append(", lydo=");
		sb.append(lydo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public phieumuon toEntityModel() {
		phieumuonImpl phieumuonImpl = new phieumuonImpl();

		phieumuonImpl.setId(id);
		phieumuonImpl.setUserId(userId);
		phieumuonImpl.setSachId(sachId);

		if (ngaymuon == Long.MIN_VALUE) {
			phieumuonImpl.setNgaymuon(null);
		}
		else {
			phieumuonImpl.setNgaymuon(new Date(ngaymuon));
		}

		if (ngaytra == Long.MIN_VALUE) {
			phieumuonImpl.setNgaytra(null);
		}
		else {
			phieumuonImpl.setNgaytra(new Date(ngaytra));
		}

		phieumuonImpl.setXacnhan(xacnhan);
		phieumuonImpl.setTrangthai(trangthai);
		phieumuonImpl.setSoluong(soluong);
		phieumuonImpl.setGiahan(giahan);

		if (lydo == null) {
			phieumuonImpl.setLydo(StringPool.BLANK);
		}
		else {
			phieumuonImpl.setLydo(lydo);
		}

		phieumuonImpl.resetOriginalValues();

		return phieumuonImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		userId = objectInput.readLong();
		sachId = objectInput.readLong();
		ngaymuon = objectInput.readLong();
		ngaytra = objectInput.readLong();
		xacnhan = objectInput.readLong();
		trangthai = objectInput.readLong();
		soluong = objectInput.readLong();
		giahan = objectInput.readLong();
		lydo = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(sachId);
		objectOutput.writeLong(ngaymuon);
		objectOutput.writeLong(ngaytra);
		objectOutput.writeLong(xacnhan);
		objectOutput.writeLong(trangthai);
		objectOutput.writeLong(soluong);
		objectOutput.writeLong(giahan);

		if (lydo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(lydo);
		}
	}

	public long id;
	public long userId;
	public long sachId;
	public long ngaymuon;
	public long ngaytra;
	public long xacnhan;
	public long trangthai;
	public long soluong;
	public long giahan;
	public String lydo;
}