package com.A06_String;

import java.util.Scanner;

public class S12ConvertingNumbersToStrWithValueOf 
{
	public static void main(String[] args) 
	{
		int num;
		float f;
		double db;
		char ch;
		boolean b;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer value ");
		num=sc.nextInt();
		System.out.println("enter the float value ");
		f=sc.nextFloat();
		System.out.println("enter the double value ");
		db=sc.nextDouble();
		System.out.println("enter the character value ");
		ch=sc.next().charAt(0);
		System.out.println("enter the boolean value ");
		b=sc.hasNextBoolean();
		
		String numStr=String.valueOf(num);
		System.out.println("integer converted in String is "+numStr);
		
		String floatStr=String.valueOf(f);
		System.out.println("float converted in String is "+floatStr);
		
		String doubleStr=String.valueOf(db);
		System.out.println("double converted in String is "+doubleStr);
		
		String charStr=String.valueOf(ch);
		System.out.println("character converted in String is "+charStr);
		
		String booleanStr=String.valueOf(b);
		System.out.println("boolean converted in String is "+booleanStr);
	}
}
