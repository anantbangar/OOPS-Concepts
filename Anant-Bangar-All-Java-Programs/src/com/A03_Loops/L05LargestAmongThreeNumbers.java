package com.A03_Loops;

public class L05LargestAmongThreeNumbers 
{
	public static void main(String[] args) 
	{
		int n1=5,n2=10,n3=4;
		
		System.out.println("numbers are "+n1+" "+n2+" "+n3);
		
		if(n1>n2 && n1>n3)
		{
			System.out.println(n1+" is largest number");
		}
		
		else if(n2>n1 && n2>n3)
		{
			System.out.println(n2+" is largest number");
		}
		
		else if(n3>n1 && n3>n1)
		{
			System.out.println(n3+" is largest number");
		}
		
		System.out.println("with the help of ternary operator ");
		
		int temp=n1>n2?n1:n2;
		
		int largest=n3>temp?n3:temp;
		
		System.out.println(largest+" is largest number");
		
	}
}
