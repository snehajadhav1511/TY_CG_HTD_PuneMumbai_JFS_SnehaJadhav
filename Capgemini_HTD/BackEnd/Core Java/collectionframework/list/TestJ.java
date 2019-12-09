package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(8.9);
		al.add(2.3);
		al.add(1.4);
		al.add(5.6);

		ListIterator<Double> it= al.listIterator();
		System.out.println("forward-------------->");
		while(it.hasNext()) {
			Double r=it.next();
			System.out.println(r);
		}
		System.out.println("<----------------Backward");
		while(it.hasPrevious()) {
			Double o=it.previous();
			System.out.println(o);
		}
	}

}
