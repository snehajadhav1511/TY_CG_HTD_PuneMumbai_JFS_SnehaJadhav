package com.capgemini.corejava.arraylist;

import java.util.Collections;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
	
	LinkedList<Double> li=new LinkedList<Double>();
	li.add(3.6);
	li.add(2.4);
	li.add(4.7);
	li.add(1.6);
	
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
	
	System.out.println("Before-------->"+li);
	
	Collections.sort(li);
	
	System.out.println("After--------->"+li);
	}
}
