package com.A04_Arrays;

import java.util.Scanner;

public class A17MissingNoOfSortedArrFrm1to100 
{
	static void missingElements(int[] arr,int size)
	{
		int i,j=0;
		for(i=1;i<=100;i++)
		{
			if(j<arr.length && i==arr[j])
			{
				j++;
			}
			else
			{
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		System.out.println("enter any elements between 1 to 100 in ascending manner");
		
		int i;
		int arr[]=new int[size];
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
		
		System.out.println("missing elements in array between 1 to 100 ");
		missingElements(arr,size);
		
		
	}
}
