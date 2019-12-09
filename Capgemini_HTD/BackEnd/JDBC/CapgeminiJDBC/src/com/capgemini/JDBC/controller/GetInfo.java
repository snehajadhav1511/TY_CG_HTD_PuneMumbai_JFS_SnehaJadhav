package com.capgemini.JDBC.controller;

import java.util.Scanner;

import com.capgemini.JDBC.beans.UserBean;
import com.capgemini.JDBC.dao.UserDAO;
import com.capgemini.JDBC.factory.UserFactory;

public class GetInfo {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	
	UserDAO dao =UserFactory.getInstance();
	System.out.println("Enter the userid...");
	UserBean user = dao.getInfo(sc.nextInt());
	if(user!=null) {
		System.out.println(user);
	}
	else {
		System.out.println("Something went wrong...");
	}
	sc.close();
	
}
}
