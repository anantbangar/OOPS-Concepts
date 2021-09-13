package com.A04_Arrays;

import java.util.Scanner;

public class A09ReverseArray 
{
	static void reverseOfArray(int[] arr,int size)
	{
		int brr[]=new int[size];
		int k=0,i;
		for(i=size-1;i>=0;i--)
		{	
			brr[k]=arr[i];
			k++;
		}
		System.out.println();
		System.out.println("reverse of array is ");
		
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
		System.out.println();
		reverseOfArray(arr,size);
	}
}
