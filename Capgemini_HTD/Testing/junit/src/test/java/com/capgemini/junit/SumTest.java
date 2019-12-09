package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	public void testAdd() {
		Sum sum = new Sum();
		int i = sum.add(10, 5);
		assertEquals(15, i);
	}
	@Test
	private void testAdd2() {
		Sum sum =  new Sum();
		int i = sum.add(10, 5, 5);
		assertEquals(20, i);

	}

}
