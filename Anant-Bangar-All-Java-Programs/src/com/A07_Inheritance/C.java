package com.A07_Inheritance;

public class C extends B 
{
	String name="Class C";
	
	void firstMehtodOfC()
	{
		System.out.println("this is class C and first method");
	}
	
	void secondMethodOfC()
	{
		System.out.println("this is class C and second method");
	}
	
	@Override
	void show()
	{
		System.out.println("showing class C");
	}
}
