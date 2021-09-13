package com.A06_String;

public class S01DiffWaysToCreateString 
{
	public static void main(String[] args) 
	{
		String str1="Using Java String Literal"; 
		
		String str2=new String("Using new keyword");
		
		char[] ch= {'s','t','r','i','n','g'};
		
		String str3=new String(ch);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
