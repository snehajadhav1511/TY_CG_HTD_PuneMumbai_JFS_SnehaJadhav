package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFactorial {
	
	@Test
	public void testFactForNumber() {
		Factorial factorial = new Factorial();
		int res = factorial.factorial(5);
		assertEquals(120, res);
	}
	/*@Test
	public void testFactNumberForZero() {
		Factorial factorial = new Factorial();
		int res = factorial.factorial(0);
		assertEquals(1, res);
	}*/
	
	/*@Test
	public void testFactForNegative() {
		Factorial factorial = new Factorial();
		int res = factorial.factorial(0);
		assertEquals(1, res);
	}*/

}
