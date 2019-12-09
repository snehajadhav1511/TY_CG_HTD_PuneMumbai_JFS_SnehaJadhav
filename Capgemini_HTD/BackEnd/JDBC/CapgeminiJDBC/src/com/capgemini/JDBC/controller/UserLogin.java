package com.capgemini.JDBC.controller;

import java.util.Scanner;

import com.capgemini.JDBC.beans.UserBean;
import com.capgemini.JDBC.dao.UserDAO;
import com.capgemini.JDBC.factory.UserFactory;

public class UserLogin {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		UserDAO dao =UserFactory.getInstance();
		System.out.println("Enter the userid...");
		int userid=sc.nextInt();
		System.out.println("Enter the password...");
		String password =sc.next();
		
		UserBean user = dao.userLogin(userid, password);
		if(user!=null) {
			System.out.println(user);
		}
		else {
			System.out.println("Something went wrong...");
		}
		sc.close();
		
	}

}
