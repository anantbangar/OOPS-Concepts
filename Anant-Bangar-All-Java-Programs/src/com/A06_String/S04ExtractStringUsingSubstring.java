package com.A06_String;

import java.util.Scanner;

public class S04ExtractStringUsingSubstring 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string ");
		String str1=sc.nextLine();
		
		System.out.println("Substring for(0,5) is "+str1.substring(0,5));
		System.out.println("Substring for(7) is "+str1.substring(7));
	}
}
