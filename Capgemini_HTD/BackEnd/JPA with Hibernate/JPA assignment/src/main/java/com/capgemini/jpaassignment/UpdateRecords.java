package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.LaptopInfo;

public class UpdateRecords {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
		entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();

		LaptopInfo laptop =entityManager.find(LaptopInfo.class, 5003);
		laptop.setName("DELL");
		System.out.println("Record updated");
		
		transaction.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
			
		}
		entityManager.close();
	}
}
