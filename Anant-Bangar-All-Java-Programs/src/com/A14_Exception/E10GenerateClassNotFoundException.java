package com.A14_Exception;

public class E10GenerateClassNotFoundException 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("bangar.java");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("such class is not found");
		}
		
		System.out.println("rest of code ");
		
	}
}
