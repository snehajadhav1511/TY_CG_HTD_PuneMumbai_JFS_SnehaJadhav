package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean;

public class MessageTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		// First way 
		//((AbstractApplicationContext)context).registerShutdownHook();
		MessageBean messageBean = (MessageBean) context.getBean("messageBean");
		System.out.println(messageBean.getMessage());
		
		
		// Second way for destroy bean and closing the container
		((AbstractApplicationContext)context).close();
	}

}
