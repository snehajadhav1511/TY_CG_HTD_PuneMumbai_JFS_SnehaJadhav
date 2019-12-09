package com.capgemini.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernate.manytomany.Course;
import com.capgemini.jpawithhibernate.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		
		/*Course course = new Course();
		course.setCid(1001);
		course.setCname("Java");
		
		Course course1 = new Course();
		course1.setCid(1002);
		course1.setCname("SQL");
		
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(course);
		al.add(course1);*/
		
		/*Student student = new Student();
		student.setSid(1);
		student.setSname("Sneha");
		student.setCourse(al);
		
		*/
		/*Student  student2 = new Student();
		student.setSid(2);
		student.setSname("Saumya");
		
*/		
		EntityManagerFactory entityManagerFactory =null;
		EntityManager entityManager =null;
		EntityTransaction transaction = null;
		
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			
			transaction.begin();
			
			//entityManager.persist(student);
			
			Course course = entityManager.find(Course.class, 1001);
			System.out.println(course.getStudent().get(0).getSname());
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}

}
