package com.A07_Inheritance;

public class B extends A 
{	
	String name="Class B";
		
	void firstMehtodOfB()
	{
		System.out.println("this is class B and first method");
	}
	
	void secondMethodOfB()
	{
		System.out.println("this is class B and second method");
	}
	
	@Override
	void show()
	{
		System.out.println("showing class B");
	}

}
