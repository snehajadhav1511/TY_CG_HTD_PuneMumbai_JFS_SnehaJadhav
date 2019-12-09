package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.Person;
import com.capgemini.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {
	public static void main(String[] args) {

		Person p = new Person();
		p.setPid(2);
		p.setName("Snehal");
		VoterCard vc = new VoterCard();

		vc.setVid(1234);
		vc.setAddress("Panvel");

		p.setVoterCard(vc);

		EntityTransaction transaction = null;
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			//transaction.begin();
			//entityManager.persist(p);
			
			VoterCard v = entityManager.find(VoterCard.class, 10);
			v.getVid();
			v.getAddress();
			v.getPerson().getPid();
			v.getPerson().getName();
			
			
			//transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}
	}

}
