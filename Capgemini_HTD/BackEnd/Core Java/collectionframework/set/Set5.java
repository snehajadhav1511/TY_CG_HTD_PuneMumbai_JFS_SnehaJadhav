package com.capgemini.collectionframework.set;

import java.util.TreeSet;
import java.util.Iterator;

/**
 * @author Sneha
 *This code is for Generic type TreeSet
 */
public class Set5 {
	
	public static void main(String[] args) {

		TreeSet  ts = new TreeSet();

		ts.add(4);
		ts.add(5);
		ts.add(15);
		ts.add(18);
		ts.add(null);  //treeset will not take null value
		

		System.out.println("*******for each loop**********");

		for (Object r : ts) {
			System.out.println(r);
		}

		System.out.println("*********Iterator***********");

		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Object r = it.next();
			System.out.println(r);
		}
	}

}
