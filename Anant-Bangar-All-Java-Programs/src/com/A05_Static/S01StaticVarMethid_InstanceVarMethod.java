package com.A05_Static;

public class S01StaticVarMethid_InstanceVarMethod 
{
	static int id;
	static String firstName;
	
	int salary;
	String lastName;
	
	static void printId()
	{
		System.out.println("Id is "+ id);
	}
	
	static void printFirstName()
	{
		System.out.println("First name is "+firstName);
	}
	
	void printSalary()
	{
		System.out.println("Salary is "+salary);
	}
	
	void printLastName()
	{
		System.out.println("Last name is "+lastName);
	}
	
	public static void main(String[] args) 
	{
		S01StaticVarMethid_InstanceVarMethod obj1=new S01StaticVarMethid_InstanceVarMethod();
		
		//static variables
		id=100;        
		firstName="Anant";
		
		//instance variables
		obj1.salary=50000;
		obj1.lastName="Bangar";
		
		//static methods
		printId();
		printFirstName();
		
		//instance methods
		obj1.printSalary();
		obj1.printLastName();
				
	}
	
}
