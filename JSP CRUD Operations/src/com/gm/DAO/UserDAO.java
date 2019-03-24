package com.gm.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDAO {
	public static Connection getConnection()
	{
		Connection connection=null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		} catch (Exception  e) {
           e.printStackTrace();		}
		return connection;
	}
	public static int save(User u) {
		int status=0;
		try {
			Connection connection=getConnection();
			String sql="insert into register values(?,?,?,?,?)";
			PreparedStatement pStatement=connection.prepareStatement(sql);
			pStatement.setString(1,u.getName());
			pStatement.setString(2, u.getPassword());
			pStatement.setString(3, u.getEmail());
			pStatement.setString(4, u.getSex());
			pStatement.setString(5, u.getCountry());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
		
	}
	public static int update(User u)
	{
	int status=0;
	try {
		
	} catch (Exception e) {
      e.printStackTrace();	}
	return status;
	}
	

}
