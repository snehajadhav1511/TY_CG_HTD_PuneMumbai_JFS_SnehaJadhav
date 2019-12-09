package com.capgemini.CoreJava.ExceptionHandling;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Main Started");

		try {
			System.out.println("Hello");
			System.out.println(10 / 0);    //Exception
			System.out.println("Hii");  //Statement below Exceptions are not executed
			System.out.println("Keeep Smiling");
			
		} catch (ArithmeticException e) {
			System.out.println("divide by zero");
		}
		System.out.println("Main Ended");
	}

}
