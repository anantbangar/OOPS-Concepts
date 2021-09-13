package com.A04_Arrays;

import java.util.Scanner;

public class A01AddIntOfArray 
{
	public static int addIntArray(int[] arr,int size)
	{
		int sum=0,i;
		for(i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size=sc.nextInt(),i;
		System.out.println("enter the elements of array ");
		
		int[] arr=new int[size];
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("entered array is ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("Addition of integer of array is "+addIntArray(arr,size));
		
	}
}
