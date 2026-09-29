package com.bt.config;

import java.sql.SQLException;
import java.sql.*;

public class Config {
	
	private String url="jdbc:mysql://localhost:3306/gitbank";
	private String username="root";
	private String password="root";
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con=DriverManager.getConnection(url,username,password);
			
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
