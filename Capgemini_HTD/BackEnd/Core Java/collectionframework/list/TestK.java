package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestK {
	public static void main(String[] args) {
		LinkedList li= new LinkedList();

		li.add(9);
		li.add(2.1);
		li.add("dimple");
		li.add(2.5);

		System.out.println("*********for loop*********");

		for (int i=0;i<4;i++) {
			Object r= li.get(i);
			System.out.println(r);
		}

		System.out.println("*********for-each loop*********");

		for(Object r:li) {
			System.out.println(r);
		}
	
		System.out.println("*********Iterator*********");

		Iterator it=li.iterator();
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}

		System.out.println("*********ListIterator*********");
		ListIterator lit =li.listIterator();
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
