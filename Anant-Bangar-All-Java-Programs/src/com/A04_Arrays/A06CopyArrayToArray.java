package com.A04_Arrays;

import java.util.Scanner;

public class A06CopyArrayToArray 
{
	public static void copyArray(int[] arr,int size,int[] brr)
	{
		int i;
		for(i=0;i<size;i++)
		{
			brr[i]=arr[i];
		}
		System.out.println();
		System.out.println("after copy all elements second array is");
		for(i=0;i<size;i++)
		{
			System.out.print(brr[i]+" ");
				
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
		
		int brr[]=new int[size];
		copyArray(arr, size,brr);
		
		
	}
}
