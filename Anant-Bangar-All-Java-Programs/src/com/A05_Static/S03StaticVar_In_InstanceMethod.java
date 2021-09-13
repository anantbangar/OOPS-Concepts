package com.A05_Static;

public class S03StaticVar_In_InstanceMethod 
{
	static int id;
	static String name;
	
	void printId(int id)
	{
		System.out.println("Id is "+id);
	}
	
	void printName(String name)
	{
		System.out.println("Name is "+name);
	}
	
	public static void main(String[] args) 
	{
		S02InstanceVar_In_StaticMethod obj1=new S02InstanceVar_In_StaticMethod();
		id=100;
		name="Anant Bangar";
		
		obj1.printId(id);
		obj1.printName(name);
	}
}
