package com.A14_Exception;

public class E17GenerateStringIndexOutOfBoundsException 
{
	public static void main(String[] args) 
	{
		String str="Hello My name is Anant";
		
		for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		
		try
		{
			System.out.println(str.charAt(25));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("accessing string out of bound ");
		}
	}
}
