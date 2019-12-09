package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.LaptopInfo;

public class InsertRecords {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		LaptopInfo laptop = new LaptopInfo();
		laptop.setId(5004);
		laptop.setName("Samsung");
		laptop.setPrice(33200.00);

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			transaction.begin();

			entityManager.persist(laptop);

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		entityManager.close();
	}

}
