package com.capgemini.exception.custom;

public class TestB {
	public static void main(String[] args) {

		Amount a = new Amount();

		try {
			a.check(50000);
			System.out.println("Collect cash");
		} catch (InvalidLemitException e) {
			e.printStackTrace();

		}
	}
}
