package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.LaptopInfo;

public class RettachedRecords {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			transaction.begin();

			LaptopInfo laptop = entityManager.find(LaptopInfo.class, 5001);

			System.out.println("Before detach----" + entityManager.contains(laptop));

			entityManager.detach(laptop);
			System.out.println("After detach----" + entityManager.contains(laptop));
			LaptopInfo laptop1 = entityManager.merge(laptop);
			laptop1.setName("ACER");

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

	}

}
