package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		a1.add(24);
		a1.add("chinnu");
		a1.add(2.9);
		a1.add('F');
		
		for(int i=0;i<4;i++) {
			Object r = a1.get(i);
			System.out.println(r);
		}
		
	}

}
