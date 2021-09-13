package com.A14_Exception;

class MyException extends Exception
{
	public MyException(String str) 
	{
		super(str);
	}
}

public class E06OwnException 
{
	public static void main(String[] args)
	{
		try
		{
			throw new MyException("this is my own exception ");
		}
		catch(MyException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
