package com.capgemini.CoreJava.ExceptionHandling;


public class TestF {
	public static void main(String[] args) {
		System.out.println("Main Started");

		//String k = null;

		int[] a = new int[3];
		try {
			
					//System.out.println(k.length());

					System.out.println(a[5]);

					System.out.println(10 / 0);


		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException b) {
				
			b.printStackTrace();
		} 

		System.out.println("Main Ended");

	}

}
