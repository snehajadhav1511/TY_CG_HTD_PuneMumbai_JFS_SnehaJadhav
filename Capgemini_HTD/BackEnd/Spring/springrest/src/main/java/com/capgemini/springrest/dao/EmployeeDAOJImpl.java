package com.capgemini.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.springrest.beans.EmployeeInfoBean;

@Repository
public class EmployeeDAOJImpl implements EmployeeDAO {

	@Autowired //@PersistenceUnit
	private EntityManagerFactory emf;

	@Override
	public EmployeeInfoBean getEmployee(int empId) {

		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean employeeInfoBean = manager.find(EmployeeInfoBean.class, empId);
		manager.close();
		return employeeInfoBean;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String pwd) {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBeans where empId = :empId and password= :pwd";
		Query query = manager.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", pwd);

		EmployeeInfoBean employeeInfoBean = null;
		try {
			employeeInfoBean = (EmployeeInfoBean) query.getSingleResult();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeInfoBean;
	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {

		EntityManager entityManager = emf.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		boolean isValid = false;
		try {
			transaction.begin();
			entityManager.persist(employeeInfoBean);
			transaction.commit();
			isValid = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isValid;
		// return true;
	}

	
	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		EntityManager manager = emf.createEntityManager();
		EmployeeInfoBean existingEmployeeInfo = manager.find(EmployeeInfoBean.class, employeeInfoBean.getEmpId());
		boolean isUpdated = false;
		
		if (existingEmployeeInfo != null) {
			String name = employeeInfoBean.getEmpName();
			if (name != null) {
				existingEmployeeInfo.setEmpName(name);
			}

			int age = employeeInfoBean.getAge();
			if (age > 18) {
				existingEmployeeInfo.setAge(age);
			}
			
			double salary = employeeInfoBean.getSalary();
			if (salary > 0) {
				existingEmployeeInfo.setSalary(salary);
			}
			
			long mobile = employeeInfoBean.getMobile();
			if (mobile > 0) {
				existingEmployeeInfo.setMobile(mobile);
			}
			
			String designation = employeeInfoBean.getDesignation();
			if (designation != null) {
				existingEmployeeInfo.setDesignation(designation);
			}
			char gender = employeeInfoBean.getGender();
			if (gender == 'M' || gender == 'f' || gender == 'm' || gender == 'f') {
				existingEmployeeInfo.setGender(gender);
			}
			
			String pwd = employeeInfoBean.getPassword();
			if (pwd != null) {
				existingEmployeeInfo.setPassword(pwd);
			}
			
			try {
				EntityTransaction tx = manager.getTransaction();
				tx.begin();
				manager.persist(existingEmployeeInfo);
				tx.commit();
				
				isUpdated = true;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			manager.close();
		}
		return isUpdated;
	}// End of updateEmployee()
	@Override
	public boolean deleteEmployee(int empId) {
		//EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("employeePersistenceUnit");
		EntityManager entityManager = emf.createEntityManager();
		boolean isDeleted = false;

		try {
			EntityTransaction tx = entityManager.getTransaction();
			tx.begin();
			EmployeeInfoBean employeeInfoBean= entityManager.find(EmployeeInfoBean.class, empId);
			entityManager.remove(employeeInfoBean);
			tx.commit();
			isDeleted = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		entityManager.close();
		return isDeleted;
	}// End of deleteEmployee()
	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager = emf.createEntityManager();
		String jpql = "from EmployeeInfoBean";
		Query query = manager.createQuery(jpql);
		
		List<EmployeeInfoBean> employeesList = null;
		try {
			employeesList = query.getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employeesList;
		
	}// End of getAllEmployees()
	
}
