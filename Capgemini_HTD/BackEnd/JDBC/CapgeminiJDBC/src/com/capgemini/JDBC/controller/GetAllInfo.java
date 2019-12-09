package com.capgemini.JDBC.controller;

import java.util.List;
import com.capgemini.JDBC.beans.UserBean;
import com.capgemini.JDBC.dao.UserDAO;
import com.capgemini.JDBC.factory.UserFactory;

public class GetAllInfo {
	public static void main(String[] args) {

		
		UserDAO dao =UserFactory.getInstance();
		
		List<UserBean> userList = dao.getAllInfo();
		
			for (UserBean userBean : userList) {
				
				System.out.println(userBean);
			}
		
	}

}
