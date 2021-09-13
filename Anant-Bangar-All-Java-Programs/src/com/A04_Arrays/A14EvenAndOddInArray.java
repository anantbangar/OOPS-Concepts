package com.A04_Arrays;

import java.util.Scanner;

public class A14EvenAndOddInArray 
{
	static void evenAndOdd(int arr[],int size)
	{
		int i;
		int evenCount=0,oddCount=0;
		for(i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is even number");
				evenCount++;
			}
			else
			{
				System.out.println(arr[i]+" is odd number");
				oddCount++;
			}
		}
		System.out.println("total even numbers in array "+evenCount);
		System.out.println("total odd numbers in array "+oddCount);
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");		
		int size=sc.nextInt();
		System.out.println("enter the elements of array");	
		int[] arr=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("entered array is ");
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		evenAndOdd(arr,size);
	}
}
