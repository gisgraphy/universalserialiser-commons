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

public class SerializerException extends RuntimeException {
	/**
	 * 
	 */
	public SerializerException() {
		super();
	}

	/**
	 * @param message
	 * @param cause
	 */
	public SerializerException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 */
	public SerializerException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public SerializerException(Throwable cause) {
		super(cause);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 8513448503811524772L;

	public SerializerException(Exception e) {
		super(e);
	}
}
