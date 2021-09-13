package com.A04_Arrays;

import java.util.Scanner;

public class A07InsertElementInArray 
{
	public static void insertElement(int[] arr,int size,int element,int pos)
	{
		int i;
		int brr[]=new int[size+1];
		
		for(i=0;i<pos;i++)
		{
			brr[i]=arr[i];
		}
		
		brr[pos]=element;
		
		for(i=pos+1;i<=arr.length;i++)
		{
			brr[i]=arr[i-1];
		}
		
		System.out.println("after inserting "+element+" at position "+pos+ " array is");
		
		for(i=0;i<size+1;i++)
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
		System.out.println("enter the element to insert in array ");
		int element=sc.nextInt();
		System.out.println("enter the position of element ");
		int pos=sc.nextInt();
				
		insertElement(arr, size, element,pos);
		
		
	}
}
