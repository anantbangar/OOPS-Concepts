package com.A02_Operators;

import java.util.Scanner;

public class Op07SmallerLarger 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers ");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("entered numbers are "+num1+" and "+num2);
		
		if(num1<num2)
			System.out.println(+num1+" is smaller number");
		else
			System.out.println(num2+" is smaller number");
		
		if(num1>num2)
			System.out.println(num1+" is larger number");
		else
			System.out.println(num2+" is larger number");
		
		sc.close();
					
	}
}
