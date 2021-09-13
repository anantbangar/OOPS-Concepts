package com.A04_Arrays;

import java.util.Scanner;

public class A03IndexOfArrayElement 
{
	public static void indexOfElement(int[] arr,int size,int element)
	{
		int i;
		for(i=0;i<size;i++)
		{
			if(element==arr[i])
			{
				System.out.println(element+" is found at index "+(i+1));
			}
		}
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
		System.out.println("enter the element to fine index of it ");
		int element=sc.nextInt();
		
		indexOfElement(arr, size, element);
		
		
	}
}
