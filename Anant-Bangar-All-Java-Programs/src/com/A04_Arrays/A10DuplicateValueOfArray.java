package com.A04_Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A10DuplicateValueOfArray 
{
	static void duplicateOfArray(int arr[],int size)
	{
		Set<Integer> duplicates=new HashSet<Integer>();
		
		int i,j;
		int flag=0;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					duplicates.add(arr[i]);
					flag++;
				}
			}
		}
		if(flag==0)
			System.out.println("there are no duplicate elements in array ");
		else
			System.out.println("duplicate elements in array are "+duplicates);
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
		duplicateOfArray(arr,size);
	}
}
