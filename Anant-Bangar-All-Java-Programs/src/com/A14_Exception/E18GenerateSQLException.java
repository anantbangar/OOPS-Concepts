package com.A14_Exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E18GenerateSQLException 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","system123");
			
			System.out.println("connection done with MySql Database ");
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp11");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
