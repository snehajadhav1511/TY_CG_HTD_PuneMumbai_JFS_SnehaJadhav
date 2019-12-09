package com.capgemini.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set2 {

	public static void main(String[] args) {
		HashSet<String>  hs = new HashSet<String>();

		hs.add("Sneha");
		hs.add("Saumya");
		hs.add("Shubham");
		hs.add("Nisha");
		System.out.println("*******for each loop**********");
		for (Object r : hs) {
			System.out.println(r);
		}
		System.out.println("*********Iterator***********");

		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			Object r = it.next();
			System.out.println(r);
		}
	}
}
