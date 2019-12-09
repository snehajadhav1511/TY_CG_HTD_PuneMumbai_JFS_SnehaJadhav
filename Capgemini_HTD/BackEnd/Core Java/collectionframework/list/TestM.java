package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestM {
	public static void main(String[] args) {
		Vector v1 = new Vector();
		v1.add(9.6);
		v1.add('M');
		v1.add("priya");
		v1.add(2);

		System.out.println("*********for loop*********");

		for (int i=0;i<4;i++) {
			Object r= v1.get(i);
			System.out.println(r);
		}

		System.out.println("*********for-each loop*********");

		for(Object r:v1) {
			System.out.println(r);
		}

		System.out.println("*********Iterator*********");

		Iterator it=v1.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}

		System.out.println("*********ListIterator*********");
		ListIterator lit =v1.listIterator();
		System.out.println("forward----------->");
		while(lit.hasNext()) {
			Object r= lit.next();
			System.out.println(r);
		}
		System.out.println("<---------Backward");
		while(lit.hasPrevious()){
			Object r= lit.previous();
			System.out.println(r);
		}


	}

}
