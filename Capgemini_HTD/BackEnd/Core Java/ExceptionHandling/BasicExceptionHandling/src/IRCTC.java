package com.capgemini.CoreJava.ExceptionHandling;

public class IRCTC {
	void confirm() {
		System.out.println("confirm Started");

		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Exception caught at cofirm() method");
		}
		System.out.println("Confirm Ended");
	}
}
