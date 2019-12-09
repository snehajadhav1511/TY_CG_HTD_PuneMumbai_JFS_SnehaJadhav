package com.capgemini.jdbc.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import com.capgemini.jdbc.beans.UserBean;

public class UserDAOImpl implements UserDAO {
	FileReader reader=null;
	Properties prop=null;
	//PreparedStatement pstmt=null;
	UserBean user;
	//ResultSet rs=null;

	public UserDAOImpl() {

		try {
			reader =  new FileReader("db.properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public UserBean getInfo(int userid) {
		

		try (Connection conn = DriverManager.getConnection(prop.getProperty("dbUrl1"),prop.getProperty("user"),prop.getProperty("password"));
				PreparedStatement pstmt = conn.prepareStatement(prop.getProperty("query2"))){
			pstmt.setInt(1, userid);
			try(ResultSet rs =pstmt.executeQuery()) {
				if(rs.next()) {
					user = new UserBean();
					user.setUserid(rs.getInt(1));
					user.setUsername(rs.getString(2));
					user.setEmail(rs.getString(3));
				}
				return user;
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}

}
