package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {
	public static void main(String[] args) {
		LinkedList<String> li= new LinkedList();

		li.add("Sneha");
		li.add("Saumya");
		li.add("Shubham");
		li.add("Nisha");
		

		System.out.println("*********for loop*********");

		for (int i=0;i<4;i++) {
			String s= li.get(i);
			System.out.println(s);
		}

		System.out.println("*********for-each loop*********");

		for(String s:li) {
			System.out.println(s);
		}

		System.out.println("*********Iterator*********");

		Iterator<String> it=li.iterator();
		while(it.hasNext()) {
			String r=it.next();
			System.out.println(r);
		}

		System.out.println("*********ListIterator*********");
		ListIterator<String> lit =li.listIterator();
		System.out.println("forward----------->");
		while(lit.hasNext()) {
			String r= lit.next();
			System.out.println(r);
		}
		System.out.println("<---------Backward");
		while(lit.hasPrevious()){
			String r= lit.previous();
			System.out.println(r);
		}

	}
}

