package com.A06_String;

public class S07ComparingStrUsingEquals 
{
	public static void main(String[] args) 
	{
		String str1="anant";
		String str2="anant";
		String str3=new String("anant");
		String str4="ram";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
				
	}
}
