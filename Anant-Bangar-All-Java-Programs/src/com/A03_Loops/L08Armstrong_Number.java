package com.A03_Loops;

import java.util.Scanner;

public class L08Armstrong_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the number ");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int n=num;
		int n1=num;
		
		System.out.println("entered number is "+num);
		
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("count is "+count);
		
		int sum=0;
		
		while(n!=0) 
		{
			int rem=0,mul=1;
			rem=n%10;
			for(int i=0;i<count;i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			n=n/10;
		}
		
		if(sum==n1)
			System.out.println(n1+" is armstrong number");
		else
			System.out.println(n1+" is not armstrong number");
	}
}
