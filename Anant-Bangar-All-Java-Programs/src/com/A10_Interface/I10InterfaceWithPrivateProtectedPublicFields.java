package com.A10_Interface;

interface DoSomething
{
	//private int num=100; //error
	//protected int num2=500;//error because varibles are public static final by default
	public int num3=800; //it is public static final by default
	
	private static void privateMethod()
	{
		System.out.println("this is private method of interface ");
	}
	
	/*protected void protectedMethod()//error
	{
		//only public private abstract default static and strictfp are permitted
		//abstract methods do not specify a body
	}*/
	
	/*public void publicMethod()
	{
		//abstract methods do not specify a body
	}*/
	
	default void defaultMethod()
	{
		System.out.println("this is default method of interface ");
	}
	
	/*abstract void abstractMethod()
	{
		//abstract methods do not specify a body
	}*/
	
	static void staticMethod()
	{
		System.out.println("this is static method of interface ");
	}
}

public class I10InterfaceWithPrivateProtectedPublicFields implements DoSomething
{
	public static void main(String[] args) 
	{
		I10InterfaceWithPrivateProtectedPublicFields obj=new I10InterfaceWithPrivateProtectedPublicFields();
		
		obj.defaultMethod();
		
		DoSomething.staticMethod();
		
		System.out.println(DoSomething.num3);
	}
}
