package com.customer.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 2368985945632729283L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
}