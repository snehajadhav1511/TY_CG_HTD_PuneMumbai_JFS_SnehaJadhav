package com.capgemini.collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestB {
	public static void main(String[] args) {
		ByID comp = new ByID();
		ByName comp1 = new ByName();
		ByMicr comp2 = new ByMicr();
		TreeSet<Bank> ts = new TreeSet<Bank>(comp);

		Bank b1 = new Bank(567677, "SBI", 223344l);
		Bank b2 = new Bank(453267,"HDFC",445566l);
		Bank b3 = new Bank(123456,"Axis",112233l);
		Bank b4 = new Bank(657432,"ICICI",332211l);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		

		Iterator<Bank> it = ts.iterator();
		while(it.hasNext())
		{
			Bank b = it.next();
			System.out.println("pin:"+b.pin);
			System.out.println("name:"+b.name);
			System.out.println("micr:"+b.micr);
			System.out.println("*********************");
		}
	}

}
