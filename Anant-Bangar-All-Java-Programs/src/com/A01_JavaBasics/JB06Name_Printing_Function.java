package com.A01_JavaBasics;

import java.util.Scanner;

public class JB06Name_Printing_Function 
{
	public void printName()
	{
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your namr ");
		
		name=sc.nextLine();
		
		System.out.println("your name is "+name);
	}
	
	public static void main(String[] args) 
	{
		JB06Name_Printing_Function obj1=new JB06Name_Printing_Function();
		obj1.printName();
	}
}
