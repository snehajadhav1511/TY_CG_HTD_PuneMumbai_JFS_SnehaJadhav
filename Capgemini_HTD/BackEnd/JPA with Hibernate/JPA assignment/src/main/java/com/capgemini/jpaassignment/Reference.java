package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.LaptopInfo;

public class Reference {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		// Movie data = entityManager.find(Movie.class,01);

		LaptopInfo laptop = entityManager.getReference(LaptopInfo.class, 5001);
		System.out.println(laptop);
		entityManager.close();
	}

}
