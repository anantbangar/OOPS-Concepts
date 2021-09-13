package com.A01_JavaBasics;

import java.util.Scanner;

public class JB02Print_Your_Name 
{
	public static void main(String[] args) 
	{
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name ");
		
		name=sc.nextLine();
		
		System.out.println("You entered your name is "+name);
	}
}
