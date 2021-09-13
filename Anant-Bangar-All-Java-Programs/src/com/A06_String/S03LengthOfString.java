package com.A06_String;

import java.util.Scanner;

public class S03LengthOfString 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("finding length of string without using length function of string");
		System.out.println("enter string ");
		String str1=sc.nextLine();
		
		int length=0;
		
		for(char ch : str1.toCharArray())
		{
			length++;
		}
		
		System.out.println("length of string is "+length);
		
		System.out.println("finding length of string with using length function of string ");
		System.out.println("enter another string ");
		String str2=sc.nextLine();
		System.out.println("length of string is "+str2.length());
	}
}
