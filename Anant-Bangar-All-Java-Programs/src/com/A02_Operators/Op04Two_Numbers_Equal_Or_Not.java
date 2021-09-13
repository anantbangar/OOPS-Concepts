package com.A02_Operators;

import java.util.Scanner;

public class Op04Two_Numbers_Equal_Or_Not 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("entered numbers are "+num1+" and "+num2);
		
		if(num1==num2)
			System.out.println("both numbers are equal");
		else
			System.out.println("both numbers are not equal");
	}
}
