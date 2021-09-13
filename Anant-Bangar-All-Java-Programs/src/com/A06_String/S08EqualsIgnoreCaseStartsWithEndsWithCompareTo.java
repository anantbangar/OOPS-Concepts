package com.A06_String;

public class S08EqualsIgnoreCaseStartsWithEndsWithCompareTo 
{
	public static void main(String[] args) 
	{
		System.out.println("using equals ignore case");
		String str1="anant";
		String str2="Anant";
		String str3=new String("ANANT");
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		System.out.println("using == operator ");
		String s1="Sachin";  
		String s2="Sachin";  
		String s3=new String("Sachin");  
		System.out.println(s1==s2);  
		System.out.println(s1==s3);
		
		System.out.println("using compareTo method");
		String ss1="Sachin";  
		String ss2="Sachin";  
		String ss3="Ratan";  
		System.out.println(ss1.compareTo(ss2));
		System.out.println(ss1.compareTo(ss3));  
		System.out.println(ss3.compareTo(ss1));	
		
		System.out.println("ss1start with 'Sa' "+ss1.startsWith("Sa"));
		System.out.println("ss1 end with 'p' "+ss1.endsWith("p"));
		
		
	}
}
