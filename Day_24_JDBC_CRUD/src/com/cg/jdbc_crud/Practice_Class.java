package com.cg.jdbc_crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Practice_Class {
	public static void main(String args[]) throws SQLException
	{
			String dbURL="jdbc:mysql://localhost:3306/sampledb";
			String username="root";
			String password="sambhaji@1998";
			try
			{
			 Connection con=DriverManager.getConnection(dbURL,username,password);
			 if(con!=null)
			 {
				 System.out.println("connected to the database:");
				
				
				String str="Insert into user(user_id,username,password,fullname,email) +"
						+ "VALUES (101,'Sam','sambh','lets do it','sam@gmail.com')";
				
				Statement stmt=con.createStatement();
				int rows=stmt.executeUpdate(str);
				
				if(rows>0)
				{
					System.out.println("A new user has been inserted successfully:");
				}
			 }
			 
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
	}

}
