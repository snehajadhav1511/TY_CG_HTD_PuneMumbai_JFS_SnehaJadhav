package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestB {
	public static void main(String[] args) {
		ArrayList a2=new ArrayList();
		a2.add(28);
		a2.add("Sneha");
		a2.add('T');
		a2.add(2.9);

		for(Object r:a2) {
			System.out.println(r);

		}
	}

}
