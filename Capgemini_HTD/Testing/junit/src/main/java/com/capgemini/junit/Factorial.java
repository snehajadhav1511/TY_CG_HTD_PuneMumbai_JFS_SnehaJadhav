package com.capgemini.junit;

public class Factorial {
	public int factorial(int n) {

		int fact = n;
		for (int i = 1; i < n; i++) {
			fact = fact * i;
		}
		// System.out.println(fact);
		return fact;
	}

}
