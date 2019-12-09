package com.capgemini.exception.custom;

public class InvalidAge extends RuntimeException {

	private String message ="Invalid age to process";
	
	@Override
	public String getMessage() {
		return message;
	}
		

}
