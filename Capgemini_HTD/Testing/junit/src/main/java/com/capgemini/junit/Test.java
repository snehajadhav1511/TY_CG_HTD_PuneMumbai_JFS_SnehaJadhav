package com.capgemini.junit;

public class Test {
 public static void main(String[] args) {
	 Student s = new Student("Sneha", 78.8, 'F');
		
		Student s2 = new Student("Saumya", 87.8, 'F');
		School sc = new School();
		
		sc.registerStudent(s);
		sc.registerStudent(s2);

		Student regStu = sc.registerStudent(s);
		Student regStu2 = sc.registerStudent(s2);
		
		System.out.println("ID is = "+regStu.getId());
		System.out.println("Name is = "+regStu.getName());
		
		System.out.println("ID is = "+regStu2.getId());
		System.out.println("Name is = "+regStu2.getName());
}


}
