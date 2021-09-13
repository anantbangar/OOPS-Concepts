package com.A14_Exception;

import java.util.Arrays;
import java.util.Scanner;

public class E09GenerateArrayIndexOutOfBoundException 
{
	public static void main(String[] args) 
	{
		int arr[]= {100,88,12,1,30,50};
		
		System.out.println("elements in array are "+Arrays.toString(arr));
		
		System.out.println("enter the index of required element ");
		
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int index=sc.nextInt();
			
			System.out.println("element at index "+index+" is "+arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("the index you have entered is invalid ");
			System.out.println("please enter index number between 0 to 5");
		}
		
		System.out.println("rest of code ");
	}
}
