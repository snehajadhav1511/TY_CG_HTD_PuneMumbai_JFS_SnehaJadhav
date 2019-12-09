package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetomany.Pencil;
import com.capgemini.jpawithhibernate.onetomany.PencilBox;

public class TestMany {
	public static void main(String[] args) {

		PencilBox pencilBox = new PencilBox();
		pencilBox.setBoxid(3);
		pencilBox.setName("Camlin");

		Pencil pencil = new Pencil();
		pencil.setPid(23);
		pencil.setColor("blue");
		pencil.setPencilBox(pencilBox);

		Pencil pencil1 = new Pencil();
		pencil1.setPid(24);
		pencil1.setColor("yellow");
		pencil1.setPencilBox(pencilBox);

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			entityManager.persist(pencil);
			entityManager.persist(pencil1);
			transaction.commit();

		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
entityManager.close();

	}

}
