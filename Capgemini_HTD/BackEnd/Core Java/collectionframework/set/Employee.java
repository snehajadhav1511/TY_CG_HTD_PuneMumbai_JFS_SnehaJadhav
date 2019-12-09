package com.capgemini.collectionframework.set;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee s) {
		Integer k=s.id;
		Integer p=this.id;
		return p.compareTo(k);
		
	}

}
