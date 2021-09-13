package com.A06_String;

import java.util.Scanner;

public class S05SearchingStringUsingIndexOf 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str1=sc.nextLine();
		
		System.out.println("enter string to find it's index ");
		String str2=sc.nextLine();
		
		System.out.println("index of str2 is "+str1.indexOf(str2));
	}
}
