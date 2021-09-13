package com.A04_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class A05RemoveElementFrmArray 
{
	public static void removeElement(int[] arr,int size,int element)
	{
		int i,index=0;
		for(i=0;i<size;i++)
		{
			if(element==arr[i])
			{
				index=i;
			}
		}
		System.out.println("Index of "+element+" is "+index);
		
		int[] brr=new int[size-1];
		int k=0;
		for(i=0;i<size;i++)
		{
			if(i!=index)
			{
				brr[k]=arr[i];
				k++;
			}
		}
		
		System.out.println("after removing "+element+" from array , array is");
		for(i=0;i<size-1;i++)
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
		System.out.println("enter the element to remove from array ");
		int element=sc.nextInt();
		
		removeElement(arr, size, element);
		
		
	}
}
