package com.capgemini.seleniumprojectsimple;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.seleniumprojectsimple.webdriver.Calculator;

public class TestCalculator {
	@Test
	public void addTest() {
		Calculator calculator = new Calculator();
		int a = 20;
		int b = 30;
		int result = calculator.add(a, b);
		Assert.assertEquals(50, result);

	}
}
