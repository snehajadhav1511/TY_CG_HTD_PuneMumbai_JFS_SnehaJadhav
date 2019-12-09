package com.capgemini.springcore.beans;

public class MessageBean2 {
	public MessageBean2() {
		System.out.println("Inside Constructor");
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("It's init phase");
	}

	public void destroy() {
		System.out.println("It's destroy phase");
	}

}
