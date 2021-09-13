package com.A04_Arrays;

import java.util.Scanner;

public class A04ArrayContainValue 
{
	public static void containValue(int[] arr,int size,int element)
	{
		int i,flag=0;
		for(i=0;i<size;i++)
		{
			if(element==arr[i])
			{
				flag++;
			}
		}
		if(flag!=0)
			System.out.println("Array contains "+element+" for "+flag+" times");
		else
			System.out.println("Array not contains "+element);
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
		System.out.println("enter the element to find index of it ");
		int element=sc.nextInt();
		
		containValue(arr, size, element);
		
		
	}
}
