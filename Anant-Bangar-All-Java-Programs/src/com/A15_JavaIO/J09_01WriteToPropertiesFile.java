package com.A15_JavaIO;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class J09_01WriteToPropertiesFile 
{
	public static void main(String[] args) 
	{
		try
		{
			OutputStream out=new FileOutputStream("resources/config.properties");
			Properties prop=new Properties();
			
			prop.setProperty("oracle.url","jdbc:oracle:thin:@localhost:1521:orcl");
			prop.setProperty("oracle.user_name","system");
			prop.setProperty("oracle.password","system123");
			prop.setProperty("mysql.url","jdbc:mysql://localhost:3306/hibernate");
			prop.setProperty("mysql.user_name","root");
			prop.setProperty("mysql.password","system123");
			
			prop.store(out,null);
			
			System.out.println(prop);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
