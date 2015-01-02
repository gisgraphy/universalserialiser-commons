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

/**
 * All the possible output format, 
 * should be in uppercase
 */
public enum OutputFormat {
	/**
	 * 
	 */
	XML {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "standard";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "application/xml";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitXML(this);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.serializer.OutputFormat#supportRead()
		 */
		@Override
		public boolean supportRead() {
			return true;
		}

	},
	JSON {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "json";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "application/json";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitJSON(this);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.serializer.OutputFormat#supportRead()
		 */
		@Override
		public boolean supportRead() {
			return true;
		}

	},
	PYTHON {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "python";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "text/plain";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitPYTHON(this);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.serializer.OutputFormat#supportRead()
		 */
		@Override
		public boolean supportRead() {
			return false;
		}

	},
	PHP {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "php";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "text/plain";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitPHP(this);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.serializer.OutputFormat#supportRead()
		 */
		@Override
		public boolean supportRead() {
			return false;
		}

	},
	ATOM {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "xslt";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "application/xml";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitATOM(this);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.serializer.OutputFormat#supportRead()
		 */
		@Override
		public boolean supportRead() {
			return false;
		}

	},
	GEORSS {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "xslt";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "application/xml";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitGEORSS(this);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.serializer.OutputFormat#supportRead()
		 */
		@Override
		public boolean supportRead() {
			return false;
		}

	},
	RUBY {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "ruby";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "text/plain";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitRUBY(this);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.serializer.OutputFormat#supportRead()
		 */
		@Override
		public boolean supportRead() {
			return false;
		}

	},
	YAML {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "yaml";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "text/x-yaml";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitYAML(this);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.serializer.OutputFormat#supportRead()
		 */
		@Override
		public boolean supportRead() {
			return true;
		}

	},
	UNSUPPORTED {
		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.geoloc.service.Output.OutputFormat#getParameterValue()
		 */
		@Override
		public String getParameterValue() {
			return "";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#getContentType()
		 */
		@Override
		public String getContentType() {
			return "";
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see com.gisgraphy.domain.valueobject.Output.OutputFormat#accept(com.gisgraphy.domain.geoloc.service.errors.IoutputFormatVisitor)
		 */
		@Override
		public String accept(IoutputFormatVisitor visitor) {
			return visitor.visitUNSUPPORTED(this);
		}
		
		/*
		* (non-Javadoc)
		* 
		* @see com.gisgraphy.serializer.OutputFormat#supportRead()
		*/
			@Override
			public boolean supportRead() {
				return false;
			}

	};

	/**
	 * @return The default format
	 */
	public static OutputFormat getDefault() {
		return OutputFormat.XML;
	}

	/**
	 * @return The value of the parameter (e.g : the query type for fulltext
	 *         query)
	 */
	public abstract String getParameterValue();

	/**
	 * @return The value of the HTTP contenttype associated to the Output
	 *         format
	 */
	public abstract String getContentType();

	/**
	 * @return true if the format support the de-serialisation
	 */
	public abstract boolean supportRead();

	/**
	 * @param format
	 *                the format as String
	 * @return the outputFormat from the String or the default OutputFormat
	 *         if the format can not be determine
	 * @see #getDefault()
	 */
	public static OutputFormat getFromString(String format) {
		OutputFormat outputFormat = OutputFormat.getDefault();
		try {
			outputFormat = OutputFormat.valueOf(format.toUpperCase());
		} catch (RuntimeException e) {
		}
		return outputFormat;

	}

	public static final String RSS_VERSION = "rss_2.0";

	public static final String ATOM_VERSION = "atom_0.3";

	/**
	 * Method to implement the visitor pattern
	 * 
	 * @param visitor
	 *                accept a visitor
	 * @return a string return by the visitor
	 * @see IoutputFormatVisitor
	 * @see GeolocErrorVisitor
	 */
	public abstract String accept(IoutputFormatVisitor visitor);

}
