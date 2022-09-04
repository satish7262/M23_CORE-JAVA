package com.cg.jdbc_crud;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class crud_Select {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgimini";
		String dbUsername="satish";
		String dbPassword="Satish@123";
		try
		{
			Connection connection=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
			String query="SELECT * FROM emp";
			Statement s=connection.createStatement();
			ResultSet r=s.executeQuery(query);
			
			
				while(r.next())
					{
						int id=r.getInt(1);
						
						String name=r.getString(2);
						String email_id=r.getString(3);
						String password=r.getString(4);
						String output="user - %d %s %s %s";
						
						System.out.println(String.format(output,id, name ,email_id ,password));
						
						
					}
				connection.close();
				
				
					
				
		}
			catch(SQLException se)
			{
			se.printStackTrace();
			
			}

	}

}
