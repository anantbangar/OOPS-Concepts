package com.A04_Arrays;

import java.util.Scanner;

public class A08MinMaxOfArray 
{
	static void minOfArray(int[] arr,int size)
	{
		int min=arr[0],i;
		for(i=0;i<size;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("minimum value of array is "+min);
	}
	
	static void maxOfArray(int[] arr,int size)
	{

		int max=arr[0],i;
		for(i=0;i<size;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("minimum value of array is "+max);
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
		System.out.println();
		
		minOfArray(arr,size);
		maxOfArray(arr,size);
		
	}
	
}
