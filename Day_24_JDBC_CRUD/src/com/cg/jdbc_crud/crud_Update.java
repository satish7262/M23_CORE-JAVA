package com.cg.jdbc_crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class crud_Update {
	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgimini";
		String dbUsername="satish";
		String dbPassword="Satish@123";
		try
		{
			Connection connection=DriverManager.getConnection(dbURL,dbUsername,dbPassword);
			String query="UPDATE emp SET NAME='PRIYA'  WHERE ID = '101' ";
			
			PreparedStatement p=connection.prepareStatement(query);
			
			//p.setInt(1, 110);
			
			int r=p.executeUpdate(query);
		
				if(r>0)
					{
					System.out.println("new user is inserted :");
					
					}
				connection.close();
		}
			catch(SQLException se)
			{
			se.printStackTrace();
			
			}
		
		

	}

}
