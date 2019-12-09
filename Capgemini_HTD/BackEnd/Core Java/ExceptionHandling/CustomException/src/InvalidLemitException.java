package com.capgemini.exception.custom;

public class InvalidLemitException extends RuntimeException {
	
	private String message ="Invalid amount";
	
	@Override
	public String getMessage() {
		return message;
	}
		

}
