package com.capgemini.stream.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Integer> al =  new ArrayList<Integer>();
		al.add(5);
		al.add(10);
		al.add(6);
		al.add(3);
		al.add(4);

		List<Integer> li = al.stream().filter(i->i%3==0).collect(Collectors.toList());		
		Iterator<Integer> it =  li.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);

		}

	}
}
