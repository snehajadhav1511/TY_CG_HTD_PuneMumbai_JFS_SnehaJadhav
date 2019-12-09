package com.capgemini.JDBC.factory;

import com.capgemini.JDBC.dao.UserDAO;
import com.capgemini.JDBC.dao.UserDAOJDBCImpl;

public class UserFactory {
	private UserFactory() {
		
	}
	public static UserDAO getInstance() {
		UserDAO dao = new UserDAOJDBCImpl();
		return dao;
			
			
	}

}
