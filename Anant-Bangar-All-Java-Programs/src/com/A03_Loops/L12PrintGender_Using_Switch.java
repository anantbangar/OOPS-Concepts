package com.A03_Loops;

import java.util.Scanner;

public class L12PrintGender_Using_Switch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter M for male and F for female ");
		char ch=sc.next().charAt(0);
		System.out.println("you enter "+ch);
		
		switch(ch)
		{
			case 'm':
			case 'M':
				System.out.println("You are male");
				break;
			
			case 'f':
			case 'F':
				System.out.println("You are female");
				break;
			
			default:
				System.out.println("enter m or f only");
		
		}
	}
}
