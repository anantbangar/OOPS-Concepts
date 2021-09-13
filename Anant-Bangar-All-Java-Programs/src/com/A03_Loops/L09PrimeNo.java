package com.A03_Loops;

import java.util.Scanner;

public class L09PrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		int flag=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				flag++;
			}
		}
		
		if(flag==2)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not prime number");
	}
}

