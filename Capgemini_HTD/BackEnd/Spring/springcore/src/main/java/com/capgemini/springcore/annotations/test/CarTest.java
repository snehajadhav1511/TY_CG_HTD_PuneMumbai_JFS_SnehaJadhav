package com.capgemini.springcore.annotations.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.springcore.annotations.beans.Car;

public class CarTest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("carConfig.xml");
		Car myCar = context.getBean("myCar" , Car.class);
		
		System.out.println("Model Name = "+myCar.getModelName());
		System.out.println("No"+myCar.getModelNo());
		System.out.println("ENgine details");
		System.out.println("Engine CC"+myCar.getEngine().getCC());
		System.out.println("Engine Type"+myCar.getEngine().getType());
				
	}
}
