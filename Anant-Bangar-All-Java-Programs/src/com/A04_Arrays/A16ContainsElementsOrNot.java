package com.A04_Arrays;

import java.util.Scanner;

public class A16ContainsElementsOrNot 
{
	public static void containValue(int[] arr,int size,int element1,int element2)
	{
		int i,flag=0;
		for(i=0;i<size;i++)
		{
			if(element1==arr[i])
			{
				System.out.println("Array contains "+element1);
				flag++;
			}
			
			else if(element2==arr[i])
			{
				System.out.println("Array contains "+element2);
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Array not contains "+element1+" and "+element2);
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
		int element1=12;
		int element2=23;
		
		containValue(arr, size, element1,element2);
		
		
	}
}
