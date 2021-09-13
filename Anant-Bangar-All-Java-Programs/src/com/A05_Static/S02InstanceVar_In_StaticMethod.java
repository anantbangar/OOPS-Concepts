package com.A05_Static;

public class S02InstanceVar_In_StaticMethod 
{
	int id;
	String name;
	
	static void printId(int id)
	{
		System.out.println("Id is "+id);
	}
	
	static void printName(String name)
	{
		System.out.println("Name is "+name);
	}
	
	public static void main(String[] args) 
	{
		S02InstanceVar_In_StaticMethod obj1=new S02InstanceVar_In_StaticMethod();
		obj1.id=100;
		obj1.name="Anant Bangar";
		
		printId(obj1.id);
		printName(obj1.name);
	}
}
