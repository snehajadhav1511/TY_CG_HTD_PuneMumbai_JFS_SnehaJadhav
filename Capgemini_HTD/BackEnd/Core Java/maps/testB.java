package com.capgemini.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class testB {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String,Integer>();
		
		lhm.put("Ondu", 1);
		lhm.put("Idhu", 5);
		lhm.put("Hathu", 10);
		lhm.put("Eredu", 2);
		
		//LinkedHashMap gives ordered output 
		for (Map.Entry<String, Integer> r : lhm.entrySet()) {
			
			String k = r.getKey();
			Integer v = r.getValue();
			
			System.out.println("Key is: "+k);
			System.out.println("Value is: "+v);
			System.out.println("**************");
		}
	}

}
