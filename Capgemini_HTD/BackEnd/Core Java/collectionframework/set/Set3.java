package com.capgemini.collectionframework.set;

import java.util.LinkedHashSet;
import java.util.Iterator;

/**
 * @author Sneha
 *This is code for Generic LinkHashcode
 */
public class Set3 {
	public static void main(String[] args) {
		LinkedHashSet  lhs = new LinkedHashSet();

		lhs.add(2.4);
		lhs.add('A');
		lhs.add("Deepa");
		lhs.add(15);
		lhs.add(null);
		
		
		System.out.println("*******for each loop**********");
		
		for (Object r : lhs) {
			System.out.println(r);
		}
		
		System.out.println("*********Iterator***********");

		Iterator it = lhs.iterator();
		while(it.hasNext())
		{
			Object r = it.next();
			System.out.println(r);
		}


	}

}
