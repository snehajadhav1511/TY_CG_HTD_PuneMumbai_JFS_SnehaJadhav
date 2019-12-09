package com.capgemini.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class Set1 {
	public static void main(String[] args) {
		HashSet  hs = new HashSet();

		hs.add(2.4);
		hs.add('A');
		hs.add("Deepa");
		hs.add(15);
		hs.add(null);
		
		
		System.out.println("*******for each loop**********");
		
		for (Object r : hs) {
			System.out.println(r);
		}
		
		System.out.println("*********Iterator***********");

		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			Object r = it.next();
			System.out.println(r);
		}
	}
}
