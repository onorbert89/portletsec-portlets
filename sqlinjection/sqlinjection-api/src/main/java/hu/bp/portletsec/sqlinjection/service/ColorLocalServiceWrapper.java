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

package hu.bp.portletsec.sqlinjection.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ColorLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ColorLocalService
 * @generated
 */
@ProviderType
public class ColorLocalServiceWrapper implements ColorLocalService,
	ServiceWrapper<ColorLocalService> {
	public ColorLocalServiceWrapper(ColorLocalService colorLocalService) {
		_colorLocalService = colorLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _colorLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _colorLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _colorLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _colorLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _colorLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _colorLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the color to the database. Also notifies the appropriate model listeners.
	*
	* @param color the color
	* @return the color that was added
	*/
	@Override
	public hu.bp.portletsec.sqlinjection.model.Color addColor(
		hu.bp.portletsec.sqlinjection.model.Color color) {
		return _colorLocalService.addColor(color);
	}

	/**
	* Creates a new color with the primary key. Does not add the color to the database.
	*
	* @param colorid the primary key for the new color
	* @return the new color
	*/
	@Override
	public hu.bp.portletsec.sqlinjection.model.Color createColor(long colorid) {
		return _colorLocalService.createColor(colorid);
	}

	/**
	* Deletes the color from the database. Also notifies the appropriate model listeners.
	*
	* @param color the color
	* @return the color that was removed
	*/
	@Override
	public hu.bp.portletsec.sqlinjection.model.Color deleteColor(
		hu.bp.portletsec.sqlinjection.model.Color color) {
		return _colorLocalService.deleteColor(color);
	}

	/**
	* Deletes the color with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param colorid the primary key of the color
	* @return the color that was removed
	* @throws PortalException if a color with the primary key could not be found
	*/
	@Override
	public hu.bp.portletsec.sqlinjection.model.Color deleteColor(long colorid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _colorLocalService.deleteColor(colorid);
	}

	@Override
	public hu.bp.portletsec.sqlinjection.model.Color fetchColor(long colorid) {
		return _colorLocalService.fetchColor(colorid);
	}

	/**
	* Returns the color matching the UUID and group.
	*
	* @param uuid the color's UUID
	* @param groupId the primary key of the group
	* @return the matching color, or <code>null</code> if a matching color could not be found
	*/
	@Override
	public hu.bp.portletsec.sqlinjection.model.Color fetchColorByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return _colorLocalService.fetchColorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the color with the primary key.
	*
	* @param colorid the primary key of the color
	* @return the color
	* @throws PortalException if a color with the primary key could not be found
	*/
	@Override
	public hu.bp.portletsec.sqlinjection.model.Color getColor(long colorid)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _colorLocalService.getColor(colorid);
	}

	/**
	* Returns the color matching the UUID and group.
	*
	* @param uuid the color's UUID
	* @param groupId the primary key of the group
	* @return the matching color
	* @throws PortalException if a matching color could not be found
	*/
	@Override
	public hu.bp.portletsec.sqlinjection.model.Color getColorByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _colorLocalService.getColorByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the color in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param color the color
	* @return the color that was updated
	*/
	@Override
	public hu.bp.portletsec.sqlinjection.model.Color updateColor(
		hu.bp.portletsec.sqlinjection.model.Color color) {
		return _colorLocalService.updateColor(color);
	}

	/**
	* Returns the number of colors.
	*
	* @return the number of colors
	*/
	@Override
	public int getColorsCount() {
		return _colorLocalService.getColorsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _colorLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _colorLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hu.bp.portletsec.sqlinjection.model.impl.ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _colorLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hu.bp.portletsec.sqlinjection.model.impl.ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _colorLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<hu.bp.portletsec.sqlinjection.model.Color> getAllColors() {
		return _colorLocalService.getAllColors();
	}

	/**
	* Returns a range of all the colors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link hu.bp.portletsec.sqlinjection.model.impl.ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @return the range of colors
	*/
	@Override
	public java.util.List<hu.bp.portletsec.sqlinjection.model.Color> getColors(
		int start, int end) {
		return _colorLocalService.getColors(start, end);
	}

	/**
	* Returns all the colors matching the UUID and company.
	*
	* @param uuid the UUID of the colors
	* @param companyId the primary key of the company
	* @return the matching colors, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<hu.bp.portletsec.sqlinjection.model.Color> getColorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return _colorLocalService.getColorsByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of colors matching the UUID and company.
	*
	* @param uuid the UUID of the colors
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching colors, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<hu.bp.portletsec.sqlinjection.model.Color> getColorsByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<hu.bp.portletsec.sqlinjection.model.Color> orderByComparator) {
		return _colorLocalService.getColorsByUuidAndCompanyId(uuid, companyId,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _colorLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _colorLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public ColorLocalService getWrappedService() {
		return _colorLocalService;
	}

	@Override
	public void setWrappedService(ColorLocalService colorLocalService) {
		_colorLocalService = colorLocalService;
	}

	private ColorLocalService _colorLocalService;
}