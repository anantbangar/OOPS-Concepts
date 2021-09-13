package com.A01_JavaBasics;

public class JB05Local_Global_Variables 
{
	int num=20; //global variable..scope is class scope
	
	public static void main(String[] args) 
	{
		int num=10; //local variable for main method...scope is method scope
		
		System.out.println("Printing local num "+num);
		
		JB05Local_Global_Variables obj1=new JB05Local_Global_Variables();
		
		System.out.println("Printing global num "+obj1.num);
		
		
	}
}
