package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReadDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Movie  data = entityManager.find(Movie.class, 1);
		System.out.println("Id--"+data.getId());
		System.out.println("Name--"+data.getMname());
		System.out.println("Rating"+data.getRating());
		
	}

}
