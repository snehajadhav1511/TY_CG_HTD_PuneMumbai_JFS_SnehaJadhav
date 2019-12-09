package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(8.9);
		al.add(2.3);
		al.add(1.4);
		al.add(5.6);
		

		for (Double i:al) {
			System.out.println(i);
		}
	}

}
