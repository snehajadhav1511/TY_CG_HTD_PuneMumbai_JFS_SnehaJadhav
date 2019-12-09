package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.LaptopInfo;

public class DeleteRecords {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactor = null;
		EntityManager entityManager = null;

		EntityTransaction transaction = null;
		try {
			entityManagerFactor = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactor.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			LaptopInfo laptop = entityManager.find(LaptopInfo.class, 5004);
			entityManager.remove(laptop);
			System.out.println("Record Deleted");

			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}

}
