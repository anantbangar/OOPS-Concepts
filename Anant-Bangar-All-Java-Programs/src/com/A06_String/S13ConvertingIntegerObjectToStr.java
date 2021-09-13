package com.A06_String;

public class S13ConvertingIntegerObjectToStr 
{
	public static void main(String[] args) 
	{
		int num=100;
		
		System.out.println("different way to convert int or Integer object to String ");
		
		String str1=String.valueOf(num);
		System.out.println("using String.valueOf method "+str1);
		
		String str2=Integer.toString(num);
		System.out.println("using Integer.toString method "+str2);
		
		Integer i=new Integer(num);
		String str3=i.toString();
		System.out.println("using obj.toString mehtod "+str3);
		
		String str4=new Integer(num).toString();
		System.out.println("using new Integer.toString method "+str4);
	}
}
