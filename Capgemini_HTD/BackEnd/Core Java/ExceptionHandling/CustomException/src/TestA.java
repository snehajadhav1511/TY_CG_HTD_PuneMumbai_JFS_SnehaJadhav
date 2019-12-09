package com.capgemini.exception.custom;

public class TestA {
	public static void main(String[] args) {
		Validator v = new Validator();

		try
		{
			v.verify(6);
			System.out.println("Welcome to pub");
			
		} 
		catch (InvalidAge e) 
		{
			
		String msg=e.getMessage();
		System.out.println(msg);
		e.printStackTrace();
		}
	}
}
