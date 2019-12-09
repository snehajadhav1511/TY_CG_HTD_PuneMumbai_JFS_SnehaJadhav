package com.capgemini.stream.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class TestK {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "Sneha", 5.8));
		al.add(new Employee(2, "Saumya", 5.6));
		al.add(new Employee(3, "Shubham", 6.3));
		al.add(new Employee(4, "Varsha", 5.4));

		Comparator<Employee> comp = (e1,e2)->e1.name.compareTo(e2.name);



		List<Employee> li =al.stream().sorted(comp).collect(Collectors.toList());
		
		for (Employee e : li) {
			System.out.println("id: "+e.id);
			System.out.println("name: "+e.name);
			System.out.println("height: "+e.height);
			System.out.println("******************");

		}
	}

}
