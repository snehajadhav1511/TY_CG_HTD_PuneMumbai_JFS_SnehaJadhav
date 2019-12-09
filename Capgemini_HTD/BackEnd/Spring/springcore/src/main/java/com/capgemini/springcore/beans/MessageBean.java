package com.capgemini.springcore.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageBean implements DisposableBean,InitializingBean{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("It's init phase");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("It's destroy phase");
	}

	
}
