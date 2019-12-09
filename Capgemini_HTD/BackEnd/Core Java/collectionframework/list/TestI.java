package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestI {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(8.9);
		al.add(2.3);
		al.add(1.4);
		al.add(5.6);

		Iterator<Double> it= al.iterator();
		while(it.hasNext()) {
			Double r=it.next();
			System.out.println(r);
		}
		
	}
}

