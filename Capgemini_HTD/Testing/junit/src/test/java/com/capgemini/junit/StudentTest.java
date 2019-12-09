package com.capgemini.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;

public class StudentTest {
	private School school;
	
	public void createObject() {
		school = new School();
	}
	
	@BeforeEach
	public void testRegisterStudent() {
		Student student = new Student("Dimple",88.9,'F');
		Student stu = school.registerStudent(student);
		assertEquals(1, stu.getId());
	}

	public void testRegisterStudentForNull() {
		assertThrows(NullPointerException.class, ()->school.registerStudent(null));
	}
}
