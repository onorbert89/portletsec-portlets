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

package hu.bp.portletsec.sqlinjection.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import hu.bp.portletsec.sqlinjection.model.Color;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the color service. This utility wraps {@link hu.bp.portletsec.sqlinjection.service.persistence.impl.ColorPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ColorPersistence
 * @see hu.bp.portletsec.sqlinjection.service.persistence.impl.ColorPersistenceImpl
 * @generated
 */
@ProviderType
public class ColorUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Color color) {
		getPersistence().clearCache(color);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Color> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Color> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Color> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Color> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Color update(Color color) {
		return getPersistence().update(color);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Color update(Color color, ServiceContext serviceContext) {
		return getPersistence().update(color, serviceContext);
	}

	/**
	* Returns all the colors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching colors
	*/
	public static List<Color> findByUuid(java.lang.String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the colors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @return the range of matching colors
	*/
	public static List<Color> findByUuid(java.lang.String uuid, int start,
		int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the colors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching colors
	*/
	public static List<Color> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Color> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the colors where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching colors
	*/
	public static List<Color> findByUuid(java.lang.String uuid, int start,
		int end, OrderByComparator<Color> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first color in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public static Color findByUuid_First(java.lang.String uuid,
		OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first color in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color, or <code>null</code> if a matching color could not be found
	*/
	public static Color fetchByUuid_First(java.lang.String uuid,
		OrderByComparator<Color> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last color in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public static Color findByUuid_Last(java.lang.String uuid,
		OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last color in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color, or <code>null</code> if a matching color could not be found
	*/
	public static Color fetchByUuid_Last(java.lang.String uuid,
		OrderByComparator<Color> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the colors before and after the current color in the ordered set where uuid = &#63;.
	*
	* @param colorid the primary key of the current color
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next color
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public static Color[] findByUuid_PrevAndNext(long colorid,
		java.lang.String uuid, OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence()
				   .findByUuid_PrevAndNext(colorid, uuid, orderByComparator);
	}

	/**
	* Removes all the colors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(java.lang.String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of colors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching colors
	*/
	public static int countByUuid(java.lang.String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the color where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchColorException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public static Color findByUUID_G(java.lang.String uuid, long groupId)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the color where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching color, or <code>null</code> if a matching color could not be found
	*/
	public static Color fetchByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the color where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching color, or <code>null</code> if a matching color could not be found
	*/
	public static Color fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the color where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the color that was removed
	*/
	public static Color removeByUUID_G(java.lang.String uuid, long groupId)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of colors where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching colors
	*/
	public static int countByUUID_G(java.lang.String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the colors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching colors
	*/
	public static List<Color> findByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the colors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @return the range of matching colors
	*/
	public static List<Color> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the colors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching colors
	*/
	public static List<Color> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Color> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the colors where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching colors
	*/
	public static List<Color> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		OrderByComparator<Color> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public static Color findByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color, or <code>null</code> if a matching color could not be found
	*/
	public static Color fetchByUuid_C_First(java.lang.String uuid,
		long companyId, OrderByComparator<Color> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public static Color findByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color, or <code>null</code> if a matching color could not be found
	*/
	public static Color fetchByUuid_C_Last(java.lang.String uuid,
		long companyId, OrderByComparator<Color> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the colors before and after the current color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param colorid the primary key of the current color
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next color
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public static Color[] findByUuid_C_PrevAndNext(long colorid,
		java.lang.String uuid, long companyId,
		OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(colorid, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the colors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(java.lang.String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of colors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching colors
	*/
	public static int countByUuid_C(java.lang.String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the colors where colorName = &#63;.
	*
	* @param colorName the color name
	* @return the matching colors
	*/
	public static List<Color> findBycolorName(java.lang.String colorName) {
		return getPersistence().findBycolorName(colorName);
	}

	/**
	* Returns a range of all the colors where colorName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param colorName the color name
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @return the range of matching colors
	*/
	public static List<Color> findBycolorName(java.lang.String colorName,
		int start, int end) {
		return getPersistence().findBycolorName(colorName, start, end);
	}

	/**
	* Returns an ordered range of all the colors where colorName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param colorName the color name
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching colors
	*/
	public static List<Color> findBycolorName(java.lang.String colorName,
		int start, int end, OrderByComparator<Color> orderByComparator) {
		return getPersistence()
				   .findBycolorName(colorName, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the colors where colorName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param colorName the color name
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching colors
	*/
	public static List<Color> findBycolorName(java.lang.String colorName,
		int start, int end, OrderByComparator<Color> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBycolorName(colorName, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first color in the ordered set where colorName = &#63;.
	*
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public static Color findBycolorName_First(java.lang.String colorName,
		OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence()
				   .findBycolorName_First(colorName, orderByComparator);
	}

	/**
	* Returns the first color in the ordered set where colorName = &#63;.
	*
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color, or <code>null</code> if a matching color could not be found
	*/
	public static Color fetchBycolorName_First(java.lang.String colorName,
		OrderByComparator<Color> orderByComparator) {
		return getPersistence()
				   .fetchBycolorName_First(colorName, orderByComparator);
	}

	/**
	* Returns the last color in the ordered set where colorName = &#63;.
	*
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public static Color findBycolorName_Last(java.lang.String colorName,
		OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence()
				   .findBycolorName_Last(colorName, orderByComparator);
	}

	/**
	* Returns the last color in the ordered set where colorName = &#63;.
	*
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color, or <code>null</code> if a matching color could not be found
	*/
	public static Color fetchBycolorName_Last(java.lang.String colorName,
		OrderByComparator<Color> orderByComparator) {
		return getPersistence()
				   .fetchBycolorName_Last(colorName, orderByComparator);
	}

	/**
	* Returns the colors before and after the current color in the ordered set where colorName = &#63;.
	*
	* @param colorid the primary key of the current color
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next color
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public static Color[] findBycolorName_PrevAndNext(long colorid,
		java.lang.String colorName, OrderByComparator<Color> orderByComparator)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence()
				   .findBycolorName_PrevAndNext(colorid, colorName,
			orderByComparator);
	}

	/**
	* Removes all the colors where colorName = &#63; from the database.
	*
	* @param colorName the color name
	*/
	public static void removeBycolorName(java.lang.String colorName) {
		getPersistence().removeBycolorName(colorName);
	}

	/**
	* Returns the number of colors where colorName = &#63;.
	*
	* @param colorName the color name
	* @return the number of matching colors
	*/
	public static int countBycolorName(java.lang.String colorName) {
		return getPersistence().countBycolorName(colorName);
	}

	/**
	* Caches the color in the entity cache if it is enabled.
	*
	* @param color the color
	*/
	public static void cacheResult(Color color) {
		getPersistence().cacheResult(color);
	}

	/**
	* Caches the colors in the entity cache if it is enabled.
	*
	* @param colors the colors
	*/
	public static void cacheResult(List<Color> colors) {
		getPersistence().cacheResult(colors);
	}

	/**
	* Creates a new color with the primary key. Does not add the color to the database.
	*
	* @param colorid the primary key for the new color
	* @return the new color
	*/
	public static Color create(long colorid) {
		return getPersistence().create(colorid);
	}

	/**
	* Removes the color with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param colorid the primary key of the color
	* @return the color that was removed
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public static Color remove(long colorid)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence().remove(colorid);
	}

	public static Color updateImpl(Color color) {
		return getPersistence().updateImpl(color);
	}

	/**
	* Returns the color with the primary key or throws a {@link NoSuchColorException} if it could not be found.
	*
	* @param colorid the primary key of the color
	* @return the color
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public static Color findByPrimaryKey(long colorid)
		throws hu.bp.portletsec.sqlinjection.exception.NoSuchColorException {
		return getPersistence().findByPrimaryKey(colorid);
	}

	/**
	* Returns the color with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param colorid the primary key of the color
	* @return the color, or <code>null</code> if a color with the primary key could not be found
	*/
	public static Color fetchByPrimaryKey(long colorid) {
		return getPersistence().fetchByPrimaryKey(colorid);
	}

	public static java.util.Map<java.io.Serializable, Color> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the colors.
	*
	* @return the colors
	*/
	public static List<Color> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the colors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @return the range of colors
	*/
	public static List<Color> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the colors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of colors
	*/
	public static List<Color> findAll(int start, int end,
		OrderByComparator<Color> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the colors.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ColorModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of colors
	* @param end the upper bound of the range of colors (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of colors
	*/
	public static List<Color> findAll(int start, int end,
		OrderByComparator<Color> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the colors from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of colors.
	*
	* @return the number of colors
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ColorPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ColorPersistence, ColorPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ColorPersistence.class);
}