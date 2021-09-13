package com.A14_Exception;

import java.util.Scanner;

public class E04MultipleCatchBlocks 
{
	public static void main(String[] args) 
	{
		int num1,num2,div;
		String str;
			
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two numbers ");
			num1=sc.nextInt();
			num2=sc.nextInt();
			div=num1/num2;
			System.out.println("division is "+div);
			
			int x=Integer.parseInt("30a");
			System.out.println(x);
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero error");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("number formate exception ");
			
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
