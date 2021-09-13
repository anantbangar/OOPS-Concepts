package com.A05_Static;

public class S05StaticMethod_In_InstanceMethod
{		
	static void staticMethod()
	{
		System.out.println("this is static method ");
	}
	
	void instanceMethod()
	{
		System.out.println("this is instance method and printing static method in instance method");
		staticMethod();
	}
	
	public static void main(String[] args) 
	{
		S05StaticMethod_In_InstanceMethod obj=new S05StaticMethod_In_InstanceMethod();
		obj.instanceMethod();
	}
}
