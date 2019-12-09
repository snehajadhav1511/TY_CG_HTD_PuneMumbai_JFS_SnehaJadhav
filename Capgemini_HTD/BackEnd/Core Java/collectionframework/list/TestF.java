package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestF {
	public static void main(String[] args) {
		ArrayList a5= new ArrayList();
		
		a5.add("Raju");
		a5.add(19);
		a5.add('M');
		a5.add(6.14);
		
		for(Object b:a5) {
			System.out.println(b);
		}
		
	}

}
