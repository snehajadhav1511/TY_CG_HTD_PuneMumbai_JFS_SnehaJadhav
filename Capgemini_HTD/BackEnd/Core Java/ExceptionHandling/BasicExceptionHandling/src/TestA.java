package com.capgemini.CoreJava.ExceptionHandling;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");

		int[] a = new int[3];

		try {
			System.out.println(a[7]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Don't cross array boundry");
		}
		System.out.println("main Ended");

	}
}
