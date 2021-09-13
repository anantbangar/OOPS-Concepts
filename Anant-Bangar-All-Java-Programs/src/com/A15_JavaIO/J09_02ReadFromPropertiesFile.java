package com.A15_JavaIO;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class J09_02ReadFromPropertiesFile 
{
	public static void main(String[] args) 
	{
		try
		{
			InputStream ins=new FileInputStream("resources/config.properties");
			Properties prop=new Properties();
			prop.load(ins);
			
			System.out.println("oracle url = "+prop.getProperty("oracle.url"));
			System.out.println("oracle user name = "+prop.getProperty("oracle.user_name"));
			System.out.println("oracle password = "+prop.getProperty("oracle.password"));
			System.out.println("mysql url = "+prop.getProperty("mysql.url"));
			System.out.println("mysql user name = "+prop.getProperty("mysql.user_name"));
			System.out.println("mysql password = "+prop.getProperty("mysql.password"));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
