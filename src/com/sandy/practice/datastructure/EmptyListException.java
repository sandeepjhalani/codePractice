package com.sandy.practice.datastructure;

public class EmptyListException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6875913655136393470L;
	private String message;
	
	public EmptyListException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
