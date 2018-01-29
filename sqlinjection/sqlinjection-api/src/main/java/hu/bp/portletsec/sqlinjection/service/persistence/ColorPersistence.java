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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import hu.bp.portletsec.sqlinjection.exception.NoSuchColorException;
import hu.bp.portletsec.sqlinjection.model.Color;

/**
 * The persistence interface for the color service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see hu.bp.portletsec.sqlinjection.service.persistence.impl.ColorPersistenceImpl
 * @see ColorUtil
 * @generated
 */
@ProviderType
public interface ColorPersistence extends BasePersistence<Color> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ColorUtil} to access the color persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the colors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching colors
	*/
	public java.util.List<Color> findByUuid(java.lang.String uuid);

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
	public java.util.List<Color> findByUuid(java.lang.String uuid, int start,
		int end);

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
	public java.util.List<Color> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

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
	public java.util.List<Color> findByUuid(java.lang.String uuid, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first color in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public Color findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Returns the first color in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color, or <code>null</code> if a matching color could not be found
	*/
	public Color fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

	/**
	* Returns the last color in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public Color findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Returns the last color in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color, or <code>null</code> if a matching color could not be found
	*/
	public Color fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

	/**
	* Returns the colors before and after the current color in the ordered set where uuid = &#63;.
	*
	* @param colorid the primary key of the current color
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next color
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public Color[] findByUuid_PrevAndNext(long colorid, java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Removes all the colors where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of colors where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching colors
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the color where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchColorException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public Color findByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchColorException;

	/**
	* Returns the color where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching color, or <code>null</code> if a matching color could not be found
	*/
	public Color fetchByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns the color where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching color, or <code>null</code> if a matching color could not be found
	*/
	public Color fetchByUUID_G(java.lang.String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the color where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the color that was removed
	*/
	public Color removeByUUID_G(java.lang.String uuid, long groupId)
		throws NoSuchColorException;

	/**
	* Returns the number of colors where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching colors
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the colors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching colors
	*/
	public java.util.List<Color> findByUuid_C(java.lang.String uuid,
		long companyId);

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
	public java.util.List<Color> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end);

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
	public java.util.List<Color> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

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
	public java.util.List<Color> findByUuid_C(java.lang.String uuid,
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public Color findByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Returns the first color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color, or <code>null</code> if a matching color could not be found
	*/
	public Color fetchByUuid_C_First(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

	/**
	* Returns the last color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public Color findByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Returns the last color in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color, or <code>null</code> if a matching color could not be found
	*/
	public Color fetchByUuid_C_Last(java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

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
	public Color[] findByUuid_C_PrevAndNext(long colorid,
		java.lang.String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Removes all the colors where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns the number of colors where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching colors
	*/
	public int countByUuid_C(java.lang.String uuid, long companyId);

	/**
	* Returns all the colors where colorName = &#63;.
	*
	* @param colorName the color name
	* @return the matching colors
	*/
	public java.util.List<Color> findBycolorName(java.lang.String colorName);

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
	public java.util.List<Color> findBycolorName(java.lang.String colorName,
		int start, int end);

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
	public java.util.List<Color> findBycolorName(java.lang.String colorName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

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
	public java.util.List<Color> findBycolorName(java.lang.String colorName,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first color in the ordered set where colorName = &#63;.
	*
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public Color findBycolorName_First(java.lang.String colorName,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Returns the first color in the ordered set where colorName = &#63;.
	*
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching color, or <code>null</code> if a matching color could not be found
	*/
	public Color fetchBycolorName_First(java.lang.String colorName,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

	/**
	* Returns the last color in the ordered set where colorName = &#63;.
	*
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color
	* @throws NoSuchColorException if a matching color could not be found
	*/
	public Color findBycolorName_Last(java.lang.String colorName,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Returns the last color in the ordered set where colorName = &#63;.
	*
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching color, or <code>null</code> if a matching color could not be found
	*/
	public Color fetchBycolorName_Last(java.lang.String colorName,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

	/**
	* Returns the colors before and after the current color in the ordered set where colorName = &#63;.
	*
	* @param colorid the primary key of the current color
	* @param colorName the color name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next color
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public Color[] findBycolorName_PrevAndNext(long colorid,
		java.lang.String colorName,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator)
		throws NoSuchColorException;

	/**
	* Removes all the colors where colorName = &#63; from the database.
	*
	* @param colorName the color name
	*/
	public void removeBycolorName(java.lang.String colorName);

	/**
	* Returns the number of colors where colorName = &#63;.
	*
	* @param colorName the color name
	* @return the number of matching colors
	*/
	public int countBycolorName(java.lang.String colorName);

	/**
	* Caches the color in the entity cache if it is enabled.
	*
	* @param color the color
	*/
	public void cacheResult(Color color);

	/**
	* Caches the colors in the entity cache if it is enabled.
	*
	* @param colors the colors
	*/
	public void cacheResult(java.util.List<Color> colors);

	/**
	* Creates a new color with the primary key. Does not add the color to the database.
	*
	* @param colorid the primary key for the new color
	* @return the new color
	*/
	public Color create(long colorid);

	/**
	* Removes the color with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param colorid the primary key of the color
	* @return the color that was removed
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public Color remove(long colorid) throws NoSuchColorException;

	public Color updateImpl(Color color);

	/**
	* Returns the color with the primary key or throws a {@link NoSuchColorException} if it could not be found.
	*
	* @param colorid the primary key of the color
	* @return the color
	* @throws NoSuchColorException if a color with the primary key could not be found
	*/
	public Color findByPrimaryKey(long colorid) throws NoSuchColorException;

	/**
	* Returns the color with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param colorid the primary key of the color
	* @return the color, or <code>null</code> if a color with the primary key could not be found
	*/
	public Color fetchByPrimaryKey(long colorid);

	@Override
	public java.util.Map<java.io.Serializable, Color> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the colors.
	*
	* @return the colors
	*/
	public java.util.List<Color> findAll();

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
	public java.util.List<Color> findAll(int start, int end);

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
	public java.util.List<Color> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator);

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
	public java.util.List<Color> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Color> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the colors from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of colors.
	*
	* @return the number of colors
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}