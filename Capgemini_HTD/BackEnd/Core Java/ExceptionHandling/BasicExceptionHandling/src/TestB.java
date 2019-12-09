package com.capgemini.CoreJava.ExceptionHandling;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main Started");

		String s = "priya";

		int[] a = new int[3];
		try {

			System.out.println(s.toUpperCase());

			System.out.println(a[5]);

			System.out.println(10 / 0);

		} catch (ArrayIndexOutOfBoundsException b) {

			System.out.println("Don't cross array boundry");
		} catch (ArithmeticException c) {

			System.out.println("Don't divide by zero");

		} catch (NullPointerException i) {

			System.out.println("Don't deal with null");
		} catch (Exception e) { // Always kept as a last catch block because it is general exception catch block

			System.out.println("Something went Wrong");

		}

		System.out.println("Main Ended");

	}

}
