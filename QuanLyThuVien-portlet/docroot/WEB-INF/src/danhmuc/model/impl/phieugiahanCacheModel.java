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
import com.liferay.portal.model.CacheModel;

import danhmuc.model.phieugiahan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing phieugiahan in entity cache.
 *
 * @author LAPTOP
 * @see phieugiahan
 * @generated
 */
public class phieugiahanCacheModel implements CacheModel<phieugiahan>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", ngaygiahan=");
		sb.append(ngaygiahan);
		sb.append(", phieumuonId=");
		sb.append(phieumuonId);
		sb.append(", xacnhan=");
		sb.append(xacnhan);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public phieugiahan toEntityModel() {
		phieugiahanImpl phieugiahanImpl = new phieugiahanImpl();

		phieugiahanImpl.setId(id);

		if (ngaygiahan == Long.MIN_VALUE) {
			phieugiahanImpl.setNgaygiahan(null);
		}
		else {
			phieugiahanImpl.setNgaygiahan(new Date(ngaygiahan));
		}

		phieugiahanImpl.setPhieumuonId(phieumuonId);
		phieugiahanImpl.setXacnhan(xacnhan);

		phieugiahanImpl.resetOriginalValues();

		return phieugiahanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		ngaygiahan = objectInput.readLong();
		phieumuonId = objectInput.readLong();
		xacnhan = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);
		objectOutput.writeLong(ngaygiahan);
		objectOutput.writeLong(phieumuonId);
		objectOutput.writeLong(xacnhan);
	}

	public long id;
	public long ngaygiahan;
	public long phieumuonId;
	public long xacnhan;
}