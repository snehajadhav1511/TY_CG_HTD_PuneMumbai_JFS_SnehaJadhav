package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		ArrayList a2=new ArrayList();
		a2.add(28);
		a2.add("Sneha");
		a2.add('T');
		a2.add(2.9);

		ListIterator m =a2.listIterator();
		System.out.println("forward----------->");
		while(m.hasNext()) {
			Object r= m.next();
			System.out.println(r);
		}
		System.out.println("<---------Backward");
		while(m.hasPrevious()){
			Object r= m.previous();
			System.out.println(r);
		}

	}

}
