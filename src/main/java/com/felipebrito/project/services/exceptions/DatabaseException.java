package com.felipebrito.project.services.exceptions;


public class DatabaseException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DatabaseException(Object id) {
		super("Integrity violation");
	}
}