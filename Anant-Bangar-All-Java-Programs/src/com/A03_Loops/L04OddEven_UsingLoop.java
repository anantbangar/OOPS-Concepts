package com.A03_Loops;

public class L04OddEven_UsingLoop 
{
	public static void main(String[] args) 
	{
		int i=1,j=20,k,m;
		
		System.out.println("even and odd numbers between 1 to 20");
		
		for(k=i;k<=j;k++)
		{
				if(k%2==0)
				{
					System.out.println(k+" is even number ");
				}
				else
					System.out.println(k+" is odd number");
		}
	}
}
