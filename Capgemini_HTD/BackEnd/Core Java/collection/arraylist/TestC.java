package com.capgemini.corejava.arraylist;

import java.util.Collections;
import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {

		LinkedList<Character> li=new LinkedList<Character>();
		li.add('F');
		li.add('S');
		li.add('B');
		li.add('c');

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		System.out.println("Before-------->"+li);

		Collections.sort(li);
		
		System.out.println("After--------->"+li);

		Collections.shuffle(li);
		System.out.println("AfterShuffling-------->"+li);



	}
}
