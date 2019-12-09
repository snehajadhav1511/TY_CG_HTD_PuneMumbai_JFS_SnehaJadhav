package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ModificationUsingSetParameter {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		String jpql = "update Movie set mname =:nm where id =:mid";
		transaction.begin();
		Query query = entityManager.createQuery(jpql);
		query.setParameter("nm", "ABCD");
		query.setParameter("mid", 1);
		int result = query.executeUpdate();
	
		transaction.commit();
		System.out.println("Result:"+result);
		entityManager.close();
	}

}
