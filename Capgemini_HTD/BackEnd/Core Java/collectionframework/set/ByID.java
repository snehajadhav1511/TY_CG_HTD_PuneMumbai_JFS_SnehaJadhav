package com.capgemini.collectionframework.set;

import java.util.Comparator;

public class ByID implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
		Integer k=o1.pin;
		Integer p=o2.pin;
		return k.compareTo(p);
	}
	

}
