package com.capgemini.JDBC.dao;

import java.util.List;

import com.capgemini.JDBC.beans.UserBean;

public interface UserDAO {
	public List<UserBean> getAllInfo();

	public UserBean getInfo(int userid);

	public UserBean userLogin(int userid, String password);

	public boolean insertInfo(int userid, String username, String email, String password);
	
	public List<UserBean> getAInfo();


}
