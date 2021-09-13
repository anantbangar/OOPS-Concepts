package com.A06_String;

public class S11SplittingStrWithSplit 
{
	public static void main(String[] args) 
	{
		String str1="Java is nice programming language";
		System.out.println("before spliting string is ");
		System.out.println(str1);
		String[] str2=str1.split("\\s");
		
		System.out.println("after spliting str1 with space ");
		for(String str : str2)
		{
			System.out.println(str);
		}
	}
}
