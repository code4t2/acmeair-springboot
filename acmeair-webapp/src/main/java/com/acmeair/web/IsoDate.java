package com.acmeair.web;

import java.text.ParseException;
import java.util.Date;

import javax.ws.rs.WebApplicationException;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

public class IsoDate {

	private ISO8601DateFormat df = new ISO8601DateFormat();
	
	private Date date;

	public IsoDate(String dateStr) throws WebApplicationException {
		try {
			date = df.parse(dateStr);
		} catch (final ParseException ex) {
			// Wrap up any expection as javax.ws.rs.WebApplicationException
			throw new WebApplicationException(ex);
		}
	}

	public Date getDate() {
		return date;
	}
}
