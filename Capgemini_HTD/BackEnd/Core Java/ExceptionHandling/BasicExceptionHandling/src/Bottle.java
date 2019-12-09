package com.capgemini.CoreJava.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class Bottle {
	public void open() throws IOException, ClassNotFoundException{

		File f = new File("Sneha.txt");

		f.createNewFile();
		
		Class.forName("com.capgemini.CoreJava.ExceptionHandling.Bottle");

	}

}
