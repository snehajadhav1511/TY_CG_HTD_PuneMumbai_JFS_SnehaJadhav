package com.capgemini.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.Synthesizer;

public class TestE {
	public static void main(String[] args) {
		ArrayList a4=new ArrayList();
		a4.add("priya");
		a4.add(2);
		a4.add('F');
		a4.add(5.6);
		
		Iterator it=a4.iterator();
		while(it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
		}
		
	}

}
