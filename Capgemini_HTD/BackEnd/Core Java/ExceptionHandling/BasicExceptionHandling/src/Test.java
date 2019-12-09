package com.capgemini.CoreJava.ExceptionHandling;

public class Test {
	public static void main(String[] args) {
		System.out.println("main Started");
		Paytm b = new Paytm();
		try {
			b.book();
		} catch (ArithmeticException a) {
			System.out.println("Exception caught by main");
			
		}
		System.out.println("main Ended");
	}

}
