package com.A14_Exception;

public class E05ThrowExceptionWithOwnMessage 
{
	static void checkAge(int age)
	{
		if(age<18)
		{
			throw new NumberFormatException("not eligible for voting ");
		}
		
		else
			System.out.println("eligible for voting ");
	}
	
	public static void main(String[] args) 
	{
		checkAge(8);
		
		System.out.println("rest of code ");
	}
}
