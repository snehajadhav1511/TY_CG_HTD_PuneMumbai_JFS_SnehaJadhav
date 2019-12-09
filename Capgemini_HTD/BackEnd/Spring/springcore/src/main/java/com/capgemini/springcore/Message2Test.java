package com.capgemini.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.beans.MessageBean2;

public class Message2Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageBean2 messageBean2 = context.getBean("messageBean2", MessageBean2.class);

		
		System.out.println("Message: " + messageBean2.getMessage());
		MessageBean2 Bean2 = context.getBean("messageBean2", MessageBean2.class);

		System.out.println("Message: " + messageBean2.getMessage());
		((AbstractApplicationContext) context).close();
	}
}// end of class
