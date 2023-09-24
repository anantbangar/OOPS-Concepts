package com.A05_Static;

public class S03StaticVar_In_InstanceMethod 
{
	static int id;
	static String name;
	
	void printId()
	{
		System.out.println("Id is "+id);
	}
	
	void printName()
	{
		System.out.println("Name is "+name);
	}
	
	public static void main(String[] args) 
	{
		S03StaticVar_In_InstanceMethod obj1=new S03StaticVar_In_InstanceMethod();
		id=100;
		name="Anant Bangar";
		
		obj1.printId();
		obj1.printName();
		
		
	}
}
