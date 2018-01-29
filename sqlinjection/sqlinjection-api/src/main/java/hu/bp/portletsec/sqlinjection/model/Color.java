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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Color service. Represents a row in the &quot;COLOR_Color&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ColorModel
 * @see hu.bp.portletsec.sqlinjection.model.impl.ColorImpl
 * @see hu.bp.portletsec.sqlinjection.model.impl.ColorModelImpl
 * @generated
 */
@ImplementationClassName("hu.bp.portletsec.sqlinjection.model.impl.ColorImpl")
@ProviderType
public interface Color extends ColorModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link hu.bp.portletsec.sqlinjection.model.impl.ColorImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Color, Long> COLORID_ACCESSOR = new Accessor<Color, Long>() {
			@Override
			public Long get(Color color) {
				return color.getColorid();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Color> getTypeClass() {
				return Color.class;
			}
		};
}