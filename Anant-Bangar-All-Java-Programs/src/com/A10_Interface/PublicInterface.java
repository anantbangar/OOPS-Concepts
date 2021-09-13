package com.A10_Interface;

public interface PublicInterface 
{
	int num=100; //by default it is public static final
	
	void abstractMethod();
	
	static void staticMethod() //only default public static private abstract strictfp are permitted
	{
		System.out.println("this is static method of PublicInterface");
	}
	
}
