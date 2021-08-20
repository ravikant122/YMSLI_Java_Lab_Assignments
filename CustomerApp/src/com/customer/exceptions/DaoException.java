package com.customer.exceptions;

public class DaoException extends RuntimeException{

	private static final long serialVersionUID = 5409908987737049956L;

	public DaoException(String msg) {
		super(msg);
	}
	
}
