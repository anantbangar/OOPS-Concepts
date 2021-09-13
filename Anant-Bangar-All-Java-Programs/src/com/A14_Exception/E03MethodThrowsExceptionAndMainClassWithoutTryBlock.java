package com.A14_Exception;

public class E03MethodThrowsExceptionAndMainClassWithoutTryBlock 
{
	static void testMethod() throws Exception
	{
		String str=null;
		System.out.println(str.toString());
	}
	
	public static void main(String[] args) 
	{
		// testMethod(); //error unhandle expection type exception..must be in try-catch block
	}
}
