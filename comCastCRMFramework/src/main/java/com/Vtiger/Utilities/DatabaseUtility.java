package com.Vtiger.Utilities;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class DatabaseUtility {

		
		Connection conn=null;
		 Statement st=null;
		public void getConnectionToDatabase() throws SQLException, IOException 
		{
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			FileUtility fu=new FileUtility();
			String DBurl = fu.getDataFromProperties("dburl");
			 String DBun = fu.getDataFromProperties("dbusername");
			 String DBpwd = fu.getDataFromProperties("dbpassword");
			 conn = DriverManager.getConnection(DBurl,DBun,DBpwd);
			  st = conn.createStatement();
		}
		
		public String getExecuteQuery(String query, int colm) throws SQLException
		{
			ResultSet result = st.executeQuery(query);
			String data = result.getString(colm);
					return data;
		}
		
		public int getExecuteUpdate(String query) throws SQLException
		{
			int data = st.executeUpdate(query);
			return data;
		}
		
		public void getConnectionClose() throws SQLException
		{
			conn.close();
		}
}
