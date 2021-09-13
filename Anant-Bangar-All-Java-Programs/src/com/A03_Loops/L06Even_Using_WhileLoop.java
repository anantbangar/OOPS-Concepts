package com.A03_Loops;

public class L06Even_Using_WhileLoop 
{
	public static void main(String[] args) 
	{
		int i=10;
		
		System.out.println("even number between 10 to 100");
		
		while(i<=100)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			i++;
		}
	}
}
