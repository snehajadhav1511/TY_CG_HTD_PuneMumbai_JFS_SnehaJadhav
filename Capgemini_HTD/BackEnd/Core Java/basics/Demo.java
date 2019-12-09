package com.capgemini.CoreJava.basics;


public class Demo extends Variable {
	
	Demo(){
		this(10);
		System.out.println("It is  no para constructor");

		
	}
	Demo( int a){
		super();
		System.out.println("It is para constructor");
		
	}
	public static void main(String[] args) {
		System.out.println("Hello Sneha this is your first program");
		
		Demo d = new Demo();
	}
}

