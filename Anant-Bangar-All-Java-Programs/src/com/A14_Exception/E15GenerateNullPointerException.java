package com.A14_Exception;

public class E15GenerateNullPointerException 
{
	public static void main(String[] args) 
	{
		Object ref=null;
		
		try
		{
			System.out.println(ref.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("printing null object reference");
		}
	}

}
