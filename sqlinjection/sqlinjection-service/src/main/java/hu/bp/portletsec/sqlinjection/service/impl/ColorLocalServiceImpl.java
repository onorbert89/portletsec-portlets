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

package hu.bp.portletsec.sqlinjection.service.impl;

import java.util.List;

import hu.bp.portletsec.sqlinjection.model.Color;
import hu.bp.portletsec.sqlinjection.service.base.ColorLocalServiceBaseImpl;

/**
 * The implementation of the color local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link hu.bp.portletsec.sqlinjection.service.ColorLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ColorLocalServiceBaseImpl
 * @see hu.bp.portletsec.sqlinjection.service.ColorLocalServiceUtil
 */
public class ColorLocalServiceImpl extends ColorLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link hu.bp.portletsec.sqlinjection.service.ColorLocalServiceUtil} to access the color local service.
	 */
	
	private final static String COLORS = "RED=ff0000,GREEN=00ff00,BLUE=0000ff,BLACK=000000,WHITE=ffffff,YELLOW=ffff00";
	
	private void createColor(String name, String code) {
		List<Color> colors = colorPersistence.findBycolorName(name);
		if (colors.isEmpty()) {
			Color c = colorPersistence.create(counterLocalService.increment());
			c.setColorName(name);
			c.setColorCode(code);
			
			colorLocalService.addColor(c);
		}
	}

	private void initColors() {
		colorPersistence.removeAll();

		for (String colorTouple: COLORS.split(",")) {
			String[] color = colorTouple.split("=");
			createColor(color[0], color[1]);
		}
	}
	
	public List<Color> getAllColors() {
		List<Color> colors = colorLocalService.getColors(-1, -1);
		
		if (colors.size() != COLORS.split(",").length) {
			initColors();
			colors = colorLocalService.getColors(-1, -1);
		}
		
		return colors;
	}
	
}