package com.capgemini.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestD {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String,Integer>();

		lhm.put("Ondu", 1);
		lhm.put("Idhu", 5);
		lhm.put("Hathu", 10);
		lhm.put("Eredu", 2);

		System.out.println("*********keys**********");
		Set<String> s=lhm.keySet();

		for (String r: s) {
			System.out.println(r);
		}

		System.out.println("*********Values************");
		Collection<Integer>  i=  lhm.values();

		for (Integer r : i) {
			System.out.println(r);
		}

	}

}
