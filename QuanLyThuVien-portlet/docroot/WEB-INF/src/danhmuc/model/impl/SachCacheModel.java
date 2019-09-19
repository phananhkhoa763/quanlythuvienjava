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

import danhmuc.model.Sach;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Sach in entity cache.
 *
 * @author LAPTOP
 * @see Sach
 * @generated
 */
public class SachCacheModel implements CacheModel<Sach>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{id=");
		sb.append(id);
		sb.append(", name=");
		sb.append(name);
		sb.append(", theloaiID=");
		sb.append(theloaiID);
		sb.append(", soluong=");
		sb.append(soluong);
		sb.append(", nxb=");
		sb.append(nxb);
		sb.append(", tacgia=");
		sb.append(tacgia);
		sb.append(", masach=");
		sb.append(masach);
		sb.append(", ke=");
		sb.append(ke);
		sb.append(", tang=");
		sb.append(tang);
		sb.append(", noidung=");
		sb.append(noidung);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sach toEntityModel() {
		SachImpl sachImpl = new SachImpl();

		sachImpl.setId(id);

		if (name == null) {
			sachImpl.setName(StringPool.BLANK);
		}
		else {
			sachImpl.setName(name);
		}

		sachImpl.setTheloaiID(theloaiID);
		sachImpl.setSoluong(soluong);

		if (nxb == null) {
			sachImpl.setNxb(StringPool.BLANK);
		}
		else {
			sachImpl.setNxb(nxb);
		}

		if (tacgia == null) {
			sachImpl.setTacgia(StringPool.BLANK);
		}
		else {
			sachImpl.setTacgia(tacgia);
		}

		if (masach == null) {
			sachImpl.setMasach(StringPool.BLANK);
		}
		else {
			sachImpl.setMasach(masach);
		}

		sachImpl.setKe(ke);
		sachImpl.setTang(tang);

		if (noidung == null) {
			sachImpl.setNoidung(StringPool.BLANK);
		}
		else {
			sachImpl.setNoidung(noidung);
		}

		sachImpl.resetOriginalValues();

		return sachImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		name = objectInput.readUTF();
		theloaiID = objectInput.readLong();
		soluong = objectInput.readLong();
		nxb = objectInput.readUTF();
		tacgia = objectInput.readUTF();
		masach = objectInput.readUTF();
		ke = objectInput.readLong();
		tang = objectInput.readLong();
		noidung = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		objectOutput.writeLong(theloaiID);
		objectOutput.writeLong(soluong);

		if (nxb == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nxb);
		}

		if (tacgia == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(tacgia);
		}

		if (masach == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(masach);
		}

		objectOutput.writeLong(ke);
		objectOutput.writeLong(tang);

		if (noidung == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noidung);
		}
	}

	public long id;
	public String name;
	public long theloaiID;
	public long soluong;
	public String nxb;
	public String tacgia;
	public String masach;
	public long ke;
	public long tang;
	public String noidung;
}