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

package hu.bp.portletsec.sqlinjection.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Color}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Color
 * @generated
 */
@ProviderType
public class ColorWrapper implements Color, ModelWrapper<Color> {
	public ColorWrapper(Color color) {
		_color = color;
	}

	@Override
	public Class<?> getModelClass() {
		return Color.class;
	}

	@Override
	public String getModelClassName() {
		return Color.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("colorid", getColorid());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("colorName", getColorName());
		attributes.put("colorCode", getColorCode());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long colorid = (Long)attributes.get("colorid");

		if (colorid != null) {
			setColorid(colorid);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String colorName = (String)attributes.get("colorName");

		if (colorName != null) {
			setColorName(colorName);
		}

		String colorCode = (String)attributes.get("colorCode");

		if (colorCode != null) {
			setColorCode(colorCode);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _color.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _color.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _color.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _color.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<hu.bp.portletsec.sqlinjection.model.Color> toCacheModel() {
		return _color.toCacheModel();
	}

	@Override
	public hu.bp.portletsec.sqlinjection.model.Color toEscapedModel() {
		return new ColorWrapper(_color.toEscapedModel());
	}

	@Override
	public hu.bp.portletsec.sqlinjection.model.Color toUnescapedModel() {
		return new ColorWrapper(_color.toUnescapedModel());
	}

	@Override
	public int compareTo(hu.bp.portletsec.sqlinjection.model.Color color) {
		return _color.compareTo(color);
	}

	@Override
	public int hashCode() {
		return _color.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _color.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ColorWrapper((Color)_color.clone());
	}

	/**
	* Returns the color code of this color.
	*
	* @return the color code of this color
	*/
	@Override
	public java.lang.String getColorCode() {
		return _color.getColorCode();
	}

	/**
	* Returns the color name of this color.
	*
	* @return the color name of this color
	*/
	@Override
	public java.lang.String getColorName() {
		return _color.getColorName();
	}

	/**
	* Returns the user name of this color.
	*
	* @return the user name of this color
	*/
	@Override
	public java.lang.String getUserName() {
		return _color.getUserName();
	}

	/**
	* Returns the user uuid of this color.
	*
	* @return the user uuid of this color
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _color.getUserUuid();
	}

	/**
	* Returns the uuid of this color.
	*
	* @return the uuid of this color
	*/
	@Override
	public java.lang.String getUuid() {
		return _color.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _color.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _color.toXmlString();
	}

	/**
	* Returns the create date of this color.
	*
	* @return the create date of this color
	*/
	@Override
	public Date getCreateDate() {
		return _color.getCreateDate();
	}

	/**
	* Returns the modified date of this color.
	*
	* @return the modified date of this color
	*/
	@Override
	public Date getModifiedDate() {
		return _color.getModifiedDate();
	}

	/**
	* Returns the colorid of this color.
	*
	* @return the colorid of this color
	*/
	@Override
	public long getColorid() {
		return _color.getColorid();
	}

	/**
	* Returns the company ID of this color.
	*
	* @return the company ID of this color
	*/
	@Override
	public long getCompanyId() {
		return _color.getCompanyId();
	}

	/**
	* Returns the group ID of this color.
	*
	* @return the group ID of this color
	*/
	@Override
	public long getGroupId() {
		return _color.getGroupId();
	}

	/**
	* Returns the primary key of this color.
	*
	* @return the primary key of this color
	*/
	@Override
	public long getPrimaryKey() {
		return _color.getPrimaryKey();
	}

	/**
	* Returns the user ID of this color.
	*
	* @return the user ID of this color
	*/
	@Override
	public long getUserId() {
		return _color.getUserId();
	}

	@Override
	public void persist() {
		_color.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_color.setCachedModel(cachedModel);
	}

	/**
	* Sets the color code of this color.
	*
	* @param colorCode the color code of this color
	*/
	@Override
	public void setColorCode(java.lang.String colorCode) {
		_color.setColorCode(colorCode);
	}

	/**
	* Sets the color name of this color.
	*
	* @param colorName the color name of this color
	*/
	@Override
	public void setColorName(java.lang.String colorName) {
		_color.setColorName(colorName);
	}

	/**
	* Sets the colorid of this color.
	*
	* @param colorid the colorid of this color
	*/
	@Override
	public void setColorid(long colorid) {
		_color.setColorid(colorid);
	}

	/**
	* Sets the company ID of this color.
	*
	* @param companyId the company ID of this color
	*/
	@Override
	public void setCompanyId(long companyId) {
		_color.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this color.
	*
	* @param createDate the create date of this color
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_color.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_color.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_color.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_color.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this color.
	*
	* @param groupId the group ID of this color
	*/
	@Override
	public void setGroupId(long groupId) {
		_color.setGroupId(groupId);
	}

	/**
	* Sets the modified date of this color.
	*
	* @param modifiedDate the modified date of this color
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_color.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_color.setNew(n);
	}

	/**
	* Sets the primary key of this color.
	*
	* @param primaryKey the primary key of this color
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_color.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_color.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this color.
	*
	* @param userId the user ID of this color
	*/
	@Override
	public void setUserId(long userId) {
		_color.setUserId(userId);
	}

	/**
	* Sets the user name of this color.
	*
	* @param userName the user name of this color
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_color.setUserName(userName);
	}

	/**
	* Sets the user uuid of this color.
	*
	* @param userUuid the user uuid of this color
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_color.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this color.
	*
	* @param uuid the uuid of this color
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_color.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ColorWrapper)) {
			return false;
		}

		ColorWrapper colorWrapper = (ColorWrapper)obj;

		if (Objects.equals(_color, colorWrapper._color)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _color.getStagedModelType();
	}

	@Override
	public Color getWrappedModel() {
		return _color;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _color.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _color.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_color.resetOriginalValues();
	}

	private final Color _color;
}