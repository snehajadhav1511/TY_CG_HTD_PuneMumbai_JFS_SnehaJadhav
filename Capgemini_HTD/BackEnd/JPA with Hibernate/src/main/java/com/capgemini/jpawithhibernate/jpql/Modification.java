package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Modification {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		String jpql = "update Movie set mname = 'KGF' where id = 1";
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		int count = query.executeUpdate();
		if(count>0) {
			System.out.println("Record Modified...");
		}
		transaction.commit();
		entityManager.close();
	}
}
