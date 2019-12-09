package com.capgemini.exception.custom;

import java.util.Scanner;

public abstract class Scan {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in)){
	System.out.println("Enter the age");
	int i=sc.nextInt();
	Validator v = new Validator();

	try
	{
		v.verify(i);
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
}
