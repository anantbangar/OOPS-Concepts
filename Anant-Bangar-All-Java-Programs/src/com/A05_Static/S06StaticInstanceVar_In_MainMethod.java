package com.A05_Static;

public class S06StaticInstanceVar_In_MainMethod 
{
	static int id=100;
	static String firstName="Anant";
	
	int salary=50000;
	String lastName="Bangar";
	
	public static void main(String[] args) 
	{
		S06StaticInstanceVar_In_MainMethod obj=new S06StaticInstanceVar_In_MainMethod();
		
		System.out.println("Id is "+ id);
		System.out.println("First name is "+firstName);
		
		System.out.println("Salary is "+obj.salary);
		System.out.println("Last name is "+obj.lastName);
		
		S06StaticInstanceVar_In_MainMethod obj1=new S06StaticInstanceVar_In_MainMethod();
		
		obj1.salary=80000;
		obj1.lastName="pawar";
		System.out.println("Salary is "+obj1.salary);
		System.out.println("Last name is "+obj1.lastName);
	}
}
