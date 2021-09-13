package com.A04_Arrays;

import java.util.Scanner;

public class A11CommonValueBetwnTwoArrays 
{
	static void commonElements(int[] arr1,int arr2[],int size)
	{
		int flag=0;
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]+" ");
					flag++;
				}
			}
		}
		if(flag==0)
			System.out.println("there is no common element between two arrays ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size for two array ");
		int size=sc.nextInt(),i;
		System.out.println("enter the elements of first array ");
		
		int[] arr1=new int[size];
		for(i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("entered first array is ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("enter the elements of second array ");
		
		int[] arr2=new int[size];
		for(i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("entered second array is ");
		for(i=0;i<size;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		System.out.println("common elements between two arrays are ");
		commonElements(arr1,arr2,size);
	}
}
