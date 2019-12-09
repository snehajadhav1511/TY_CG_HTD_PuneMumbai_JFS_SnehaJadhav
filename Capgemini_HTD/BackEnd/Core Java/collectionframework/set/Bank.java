package com.capgemini.collectionframework.set;

import java.util.Comparator;

public class Bank implements Comparable<Bank> {
	int pin;
	String name;
	long micr;
	public Bank(int pin, String name, long micr) {
		this.pin = pin;
		this.name = name;
		this.micr = micr;
	}
	@Override
	public int compareTo(Bank o) {
		Integer k = this.pin;
		Integer p = o.pin;
		return k.compareTo(p);

	}
}
