package com.A03_Loops;

import java.util.Scanner;

public class L10PalindromeNo 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int num=sc.nextInt();
		
		int n=num;
		int rem,rev=0;
		
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		if(rev==n)
			System.out.println(n+" is palindrome number");
		else
			System.out.println(n+" is not palindrome number");
	}
}
