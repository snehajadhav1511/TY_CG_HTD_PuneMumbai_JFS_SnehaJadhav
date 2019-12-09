package com.capgemini.empwebapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.empwebapp.beans.EmployeeInfoBeans;

public class EmployeeDAOJImpl implements EmployeeDAO {

	private EntityManagerFactory entityManagerFactory = Persistence
			.createEntityManagerFactory("EmployeePersistenceUnit");

	@Override
	public EmployeeInfoBeans getEmployee(int empId) {

		EntityManager manager = entityManagerFactory.createEntityManager();
		EmployeeInfoBeans employeeInfoBeans = manager.find(EmployeeInfoBeans.class, empId);
		manager.close();
		return employeeInfoBeans;
	}

	@Override
	public EmployeeInfoBeans authenticate(int empId, String pwd) {
		EntityManager manager = entityManagerFactory.createEntityManager();
		String jpql = "from EmployeeInfoBeans where empId = :empId and password= :pwd";
		Query query = manager.createQuery(jpql);

		query.setParameter("empId", empId);
		query.setParameter("pwd", pwd);

		EmployeeInfoBeans employeeInfoBeans = null;
		try {
			employeeInfoBeans = (EmployeeInfoBeans) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBeans;
	}

	@Override
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans) {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isValid = false;
		try {
			transaction.begin();
			entityManager.persist(employeeInfoBeans);
			transaction.commit();
			isValid = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isValid;
		// return true;
	}

	@Override
	public boolean updateEmployee(EmployeeInfoBeans employeeInfoBeans) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EmployeeInfoBeans existingEmployeeInfo = entityManager.find(EmployeeInfoBeans.class, employeeInfoBeans.getEmpId());

		boolean isUpdated = false;

		if (existingEmployeeInfo != null) {
			String empName = employeeInfoBeans.getEmpName();
			if (empName != null) {
				existingEmployeeInfo.setEmpName(empName);
			}
			try {
				EntityTransaction transaction = entityManager.getTransaction();
				transaction.begin();
				entityManager.persist(existingEmployeeInfo);
				transaction.commit();
				isUpdated = true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			entityManager.close();
		}
		return isUpdated;
	}

}
