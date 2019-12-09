package com.capgemini.CoreJava.ExceptionHandling;

public class BMS {
public static void main(String[] args) {
	System.out.println("Main Started");
	PVR p=new  PVR();
	try {
	p.confirm();
	}
	catch(ArithmeticException a)
	{
		System.out.println("Exception caught at main");
	}
	System.out.println("Main Ended");
}
}
