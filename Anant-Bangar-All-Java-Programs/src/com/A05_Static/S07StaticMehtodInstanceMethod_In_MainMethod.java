package com.A05_Static;

public class S07StaticMehtodInstanceMethod_In_MainMethod 
{
	static void staticMethod()
	{
		System.out.println("this is static method ");
	}
	
	void instanceMethod()
	{
		System.out.println("this is instance method ");
	}
	
	public static void main(String[] args) 
	{
		S07StaticMehtodInstanceMethod_In_MainMethod obj=new S07StaticMehtodInstanceMethod_In_MainMethod();
		
		System.out.println("this is main method");
		System.out.println("printing static and instance method in main method ");
		staticMethod();
		obj.instanceMethod();
	}
}
