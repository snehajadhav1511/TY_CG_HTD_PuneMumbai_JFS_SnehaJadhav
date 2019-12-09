package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class JPQLRetrieve {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jdbc = "from Movie";
		Query query = entityManager.createQuery(jdbc);
		List<Movie> list = query.getResultList();
		for (Movie movie : list) {
			System.out.println("id:" + movie.getId());
			System.out.println("name:" + movie.getMname());
			System.out.println("rating:" + movie.getRating());
			System.out.println("*******************************");
		}
		entityManager.close();
	}

}
