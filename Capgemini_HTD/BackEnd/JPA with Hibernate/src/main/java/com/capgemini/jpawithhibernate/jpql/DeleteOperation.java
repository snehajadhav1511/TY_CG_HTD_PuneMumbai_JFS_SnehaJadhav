package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteOperation {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		String jpql = "delete from Movie where id = 2";
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		
		transaction.commit();
		System.out.println("Result:"+result);
		entityManager.close();
		
	}
}
