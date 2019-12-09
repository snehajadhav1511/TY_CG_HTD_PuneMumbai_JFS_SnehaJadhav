package com.capgemini.CoreJava.ExceptionHandling;


import java.io.IOException;


public class TestE {
	public static void main(String[] args) throws ClassNotFoundException, IOException { //don't throw from main
		
		System.out.println("Main Started");
		
		Bottle b= new Bottle();
		
		b.open();

		System.out.println("Main Ended");
	}

}
