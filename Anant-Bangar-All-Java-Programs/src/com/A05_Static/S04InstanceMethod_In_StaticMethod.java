package com.A05_Static;

public class S04InstanceMethod_In_StaticMethod 
{
	void instanceMethod()
	{
		System.out.println("this is instance method");
	}
	
	static void staticMethod(S04InstanceMethod_In_StaticMethod obj)
	{
		System.out.println("this is static method and printing instance method in static method");
		obj.instanceMethod();
		
	}
	
	public static void main(String[] args) 
	{
		S04InstanceMethod_In_StaticMethod obj=new S04InstanceMethod_In_StaticMethod();
		staticMethod(obj);
	}
	
	
}
