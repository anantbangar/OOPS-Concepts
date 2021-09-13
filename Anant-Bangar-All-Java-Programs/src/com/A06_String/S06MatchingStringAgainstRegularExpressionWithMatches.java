package com.A06_String;

import java.util.Scanner;

public class S06MatchingStringAgainstRegularExpressionWithMatches 
{
	public static void main(String[] args) 
	{
		String str1="anant bangar";
		
		System.out.println(str1.matches("(.*)ban(.*)"));
		System.out.println(str1.matches("bangar"));
		System.out.println(str1.matches("bangars"));
	}
}
