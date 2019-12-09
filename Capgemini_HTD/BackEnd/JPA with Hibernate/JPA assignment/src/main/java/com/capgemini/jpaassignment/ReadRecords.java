package com.capgemini.jpaassignment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpaassignment.dto.LaptopInfo;

public class ReadRecords {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		LaptopInfo laptop =entityManager.find(LaptopInfo.class, 5001);
		System.out.println("Id is   : "+laptop.getId());
		System.out.println("Name is : "+laptop.getName());
		System.out.println("Price is: "+laptop.getPrice());
		
		entityManager.close();
	}

}
