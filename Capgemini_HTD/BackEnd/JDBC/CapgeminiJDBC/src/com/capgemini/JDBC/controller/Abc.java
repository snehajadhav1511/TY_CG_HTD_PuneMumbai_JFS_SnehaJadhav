package com.capgemini.JDBC.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.JDBC.beans.UserBean;
import com.capgemini.JDBC.dao.UserDAO;
import com.capgemini.JDBC.dao.UserDAOJDBCImpl;

public class Abc {
	public void abc() {
		UserDAO dao = new UserDAOJDBCImpl();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		List<UserBean> li = new ArrayList<UserBean>();
		List<UserBean> al = dao.getAInfo();
		
		UserBean user = dao.getInfo(i);
		

	while(i>=0) {
		
	}
		

	}
}
