package com.capgemini.collectionframework.list;

import java.util.ArrayList;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(8.9);
		al.add(2.3);
		al.add(1.4);
		al.add(5.6);
		

		for (int i=0;i<4;i++) {
			Double r= al.get(i);
			System.out.println(r);
		}
	}

}
