/*******************************************************************************
 * Gisgraphy Project 
 *  
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation; either
 *    version 2.1 of the License, or (at your option) any later version.
 *  
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *    Lesser General Public License for more details.
 *  
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA
 *  
 *   Copyright 2008  Gisgraphy project 
 * 
 *   David Masclet <davidmasclet@gisgraphy.com>
 ******************************************************************************/
package com.gisgraphy.serializer.common;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

/**
 * @author <a href="mailto:david.masclet@gisgraphy.com">David Masclet</a>
 *
 */
public abstract class AbstractSerializer {

	public static final String CHARSET = "UTF-8";

	private boolean default_indentation = false;

	public boolean isDefault_indentation() {
		return default_indentation;
	}

	public void setDefault_indentation(boolean defaultIndentation) {
		default_indentation = defaultIndentation;
	}

	public void write(OutputStream outputStream, Object object) throws SerializerException {
		write(outputStream, object, default_indentation, null);
	}

	public void write(OutputStream outputStream, Object object, boolean indent) throws SerializerException {
		write(outputStream, object, indent, null);
	}

	public String writeToString(Object object) throws SerializerException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		write(outputStream, object);
		return new String(outputStream.toByteArray());
	}

	public String writeToString(Object object, boolean indent) throws SerializerException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		write(outputStream, object, indent, null);
		return new String(outputStream.toByteArray());

	}

	public abstract <T> T read(InputStream inputStream, Class<T> classToBeBound) throws SerializerException;

	public abstract void write(OutputStream outputStream, Object object, boolean indent, Map<String, Object> extraParameter) throws SerializerException;

}
