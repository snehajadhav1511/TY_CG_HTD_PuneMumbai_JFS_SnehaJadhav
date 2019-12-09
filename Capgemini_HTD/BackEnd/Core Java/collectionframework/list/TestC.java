package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList a2=new ArrayList();
		a2.add(28);
		a2.add("Sneha");
		a2.add('T');
		a2.add(2.9);
		
		Iterator it =a2.iterator();
		while(it.hasNext()) {
			Object r= it.next();
			System.out.println(r);
			
		}

	}

}
