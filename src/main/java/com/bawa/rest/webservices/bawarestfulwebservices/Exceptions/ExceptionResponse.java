package com.bawa.rest.webservices.bawarestfulwebservices.Exceptions;

import java.util.Date;

public class ExceptionResponse {
	
	private String message;
	private Date dateTime;
	private String details;
	
	public ExceptionResponse(String message, Date dateTime, String details) {
		super();
		this.message = message;
		this.dateTime = dateTime;
		this.details = details;
	}

	public String getMessage() {
		return message;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public String getDetails() {
		return details;
	}
	
	
 
	
	

}
