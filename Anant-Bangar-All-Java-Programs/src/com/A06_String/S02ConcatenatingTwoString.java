package com.A06_String;

public class S02ConcatenatingTwoString 
{
	public static void main(String[] args) 
	{
		System.out.println("concatenating by + operator ");
		
		String str1="anant"+"bangar";
		System.out.println(str1);
		
		String str2="pawan";
		String str3=str1+str2;
		System.out.println(str3);
		
		String str4=50+40+"anant"+60+80;
		System.out.println(str4);
		
		String str5="shailoo";
		String str6="bangar";
		String str7=str5.concat(str6);
		System.out.println(str7);
	}
}
