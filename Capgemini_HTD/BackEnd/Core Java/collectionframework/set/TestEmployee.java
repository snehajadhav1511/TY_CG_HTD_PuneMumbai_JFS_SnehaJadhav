package com.capgemini.collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;


public class TestEmployee {
	public static void main(String[] args) {

		HashSet<Employee> hs = new HashSet<Employee>();
		Employee e1 = new Employee(1, "Sneha", 35456.54);
		Employee e2 = new Employee(2, "Saumya", 40980.56);
		Employee e3 = new Employee(3, "Shubham", 49990.34);
		Employee e4 = new Employee(4, "Nisha", 50980.79);
		Employee e5 = new Employee(2, "Saumya", 40980.56);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);

		Iterator<Employee> it = hs.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();

			System.out.println("Employee id is:"+e.id);
			System.out.println("Employee name is:"+e.name);
			System.out.println("Employee salary:"+e.salary);
			System.out.println("*********************");

		}
	}
}
