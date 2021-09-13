package com.A04_Arrays;

import java.util.Scanner;

public class A15DiffncOfLargstSmllstInArray 
{
	static void diffncOfLargstSmllst(int[] arr,int size)
	{
		//Arrays.sort(arr1);
		int temp,j,i;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				
		System.out.println();
		System.out.println("sorted array is");
		for(i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		System.out.println("smallest element in array is "+arr[0]);

		System.out.println("largest element in array is "+arr[size-1]);
		
		int diff=arr[size-1]-arr[0];
		
		System.out.println("difference between largest and smallest element in array is "+diff);
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

		diffncOfLargstSmllst(arr,size);
				
	}
}
