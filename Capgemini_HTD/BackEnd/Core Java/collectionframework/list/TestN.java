package com.capgemini.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestN {

	public static void main(String[] args) {
		Vector<Character> v1 = new Vector();
		v1.add('A');
		v1.add('P');
		v1.add('P');
		v1.add('L');
		v1.add('E');

		System.out.println("*********for loop*********");

		for (int i=0;i<5;i++) {
			Character r= v1.get(i);
			System.out.println(r);
		}

		System.out.println("*********for-each loop*********");

		for(Character r:v1) {
			System.out.println(r);
		}

		System.out.println("*********Iterator*********");

		Iterator<Character> it=v1.iterator();
		while(it.hasNext()) {
			 Character r=it.next();
			System.out.println(r);
		}

		System.out.println("*********ListIterator*********");
		ListIterator<Character> lit =v1.listIterator();
		System.out.println("forward----------->");
		while(lit.hasNext()) {
			Character r= lit.next();
			System.out.println(r);
		}
		System.out.println("<---------Backward");
		while(lit.hasPrevious()){
			Object r= lit.previous();
			System.out.println(r);
		}


	}

}
