package com.A03_Loops;

import java.util.Scanner;

public class L11EvenOdd_Using_Switch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		
		switch(num%2)
		{
			case 0 :
				System.out.println(num+" is even number");
				break;
		
			case 1 :
				System.out.println(num+" is odd number");
				break;
		}
			
	}
}
