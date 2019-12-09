package com.capgemini.maps;

import java.util.TreeMap;
import java.util.Map;

public class TestC {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String,Integer>();
		
		tm.put("Ondu", 1);
		tm.put("Idhu", 5);
		tm.put("Hathu", 10);
		tm.put("Eredu", 2);
		
		for (Map.Entry<String, Integer> r : tm.entrySet()) {
			
			String k = r.getKey();
			Integer v = r.getValue();
			
			System.out.println("Key is: "+k);
			System.out.println("Value is: "+v);
			System.out.println("**************");
		}
	}

}
