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

package hu.bp.portletsec.sqlinjection.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import hu.bp.portletsec.sqlinjection.model.Color;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Color in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Color
 * @generated
 */
@ProviderType
public class ColorCacheModel implements CacheModel<Color>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ColorCacheModel)) {
			return false;
		}

		ColorCacheModel colorCacheModel = (ColorCacheModel)obj;

		if (colorid == colorCacheModel.colorid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, colorid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", colorid=");
		sb.append(colorid);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", colorName=");
		sb.append(colorName);
		sb.append(", colorCode=");
		sb.append(colorCode);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Color toEntityModel() {
		ColorImpl colorImpl = new ColorImpl();

		if (uuid == null) {
			colorImpl.setUuid(StringPool.BLANK);
		}
		else {
			colorImpl.setUuid(uuid);
		}

		colorImpl.setColorid(colorid);
		colorImpl.setGroupId(groupId);
		colorImpl.setCompanyId(companyId);
		colorImpl.setUserId(userId);

		if (userName == null) {
			colorImpl.setUserName(StringPool.BLANK);
		}
		else {
			colorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			colorImpl.setCreateDate(null);
		}
		else {
			colorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			colorImpl.setModifiedDate(null);
		}
		else {
			colorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (colorName == null) {
			colorImpl.setColorName(StringPool.BLANK);
		}
		else {
			colorImpl.setColorName(colorName);
		}

		if (colorCode == null) {
			colorImpl.setColorCode(StringPool.BLANK);
		}
		else {
			colorImpl.setColorCode(colorCode);
		}

		colorImpl.resetOriginalValues();

		return colorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		colorid = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		colorName = objectInput.readUTF();
		colorCode = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(colorid);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (colorName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(colorName);
		}

		if (colorCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(colorCode);
		}
	}

	public String uuid;
	public long colorid;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String colorName;
	public String colorCode;
}