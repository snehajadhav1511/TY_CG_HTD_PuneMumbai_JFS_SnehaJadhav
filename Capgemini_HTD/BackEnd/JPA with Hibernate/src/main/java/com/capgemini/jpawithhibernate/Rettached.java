package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Rettached {
	public static void main(String[] args) {

		EntityTransaction transaction = null;
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Movie movie = entityManager.find(Movie.class, 1);
			System.out.println(movie.getId());
			System.out.println(entityManager.contains(movie));
			entityManager.detach(movie);
			System.out.println(entityManager.contains(movie));
			Movie movie1 = entityManager.merge(movie);
			movie1.setMname("sbrmeh");
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
		entityManager.close();
	}// end of main method
}
