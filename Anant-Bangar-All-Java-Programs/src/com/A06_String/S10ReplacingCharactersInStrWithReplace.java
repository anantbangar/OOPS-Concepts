package com.A06_String;

public class S10ReplacingCharactersInStrWithReplace 
{
	public static void main(String[] args) 
	{
		String str1="My name is Anant Bangar. My name is Anant";
		System.out.println("initial string is ");
		System.out.println(str1);
		
		System.out.println("after replace 'anant' with 'pawan' string is ");
		System.out.println(str1.replace("Anant","Pawan"));
		
		System.out.println("using replaceAll mehtod ");
		System.out.println(str1.replaceAll("is","was"));
		System.out.println(str1.replaceAll("is","was"));
		
		System.out.println("removing all white space ");
		System.out.println(str1.replaceAll("\\s",""));
	}
}
