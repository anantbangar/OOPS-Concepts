package com.A14_Exception;

public class E16GenerateNumberFormatException 
{
	public static void main(String[] args) 
	{
		try
		{
			int x=Integer.parseInt("30k");
			System.out.println(x);
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format exception ");
			
		}
	}
}
