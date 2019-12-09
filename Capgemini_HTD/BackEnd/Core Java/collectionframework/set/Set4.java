package com.capgemini.collectionframework.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Sneha
 *This code is for Double LinkedHashSet
 */
public class Set4 {

	public static void main(String[] args) {
		LinkedHashSet<Double>  lhs = new LinkedHashSet<Double>();

		lhs.add(2.4);
		lhs.add(1.4);
		lhs.add(6.5);
		lhs.add(8.2);

		System.out.println("*******for each loop**********");
		
		for (Double d : lhs) {
			System.out.println(d);
		}
		
		System.out.println("*********Iterator***********");

		Iterator<Double> it = lhs.iterator();
		while(it.hasNext())
		{
			Double d = it.next();
			System.out.println(d);
		}
	}
}
