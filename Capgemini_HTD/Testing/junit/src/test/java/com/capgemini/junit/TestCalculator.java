package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
	
	private Calculator calculator = null;
	
	@BeforeEach
	public void createObject() {
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		Sum sum = new Sum();
		int i = sum.add(10, 5);
		assertEquals(15, i);
	}
	
	@Test
	public void testMultiply() {
		int m= calculator.multiply(10, 5);
		assertEquals(50, m);	
	}
	
	@Test
	public void testDivide() {
		double d = calculator.divide(10, 10);
		assertEquals(1, d);
	}
	@Test
	public void testDivByZero() {
		assertThrows(ArithmeticException.class, ()->calculator.divide(10,0));
	}

	@Test
	public void testSubstract() {
		int i = calculator.substract(10, 5);
		assertEquals(5, i);
	}
}
