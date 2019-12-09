package com.capgemini.CoreJava.ExceptionHandling;

public class Paytm {

	void book() {
		System.out.println("Book Startted");

		IRCTC i = new IRCTC();
		try {
			i.confirm();
		} catch (ArithmeticException a) {
			System.out.println("Exception caught at Book() method");
		}
		System.out.println("Book Ended");
	}
}
