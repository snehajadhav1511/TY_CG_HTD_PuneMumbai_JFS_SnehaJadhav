package com.capgemini.CoreJava.ExceptionHandling;

import java.io.File;
import java.io.IOException;



public class TestD {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		File f=new File("C:/Sneha.txt");
		
		try
		{
			f.createNewFile();
			System.out.println("File Created");
		}
		catch(IOException o) 
		{
			System.out.println("Sorry not able to create the file");
		}
		System.out.println("Main Ended");
	}

}
