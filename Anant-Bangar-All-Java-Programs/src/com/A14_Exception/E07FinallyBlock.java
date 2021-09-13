package com.A14_Exception;

public class E07FinallyBlock 
{
	public static void main(String[] args) 
	{
		int num1=50;
		int num2=0;
		int div;
		
		try
		{
			div=num1/num2;
		
			System.out.println("num1= "+num1);
			System.out.println("num2= "+num2);
			System.out.println("division of two number is div "+div);
		}
		catch (Exception e) 
		{
			System.out.println("divide by zero is wrong "+e);
		}
		finally
		{
			System.out.println("exception occur or not finally block executed always");
		}
		
		System.out.println("rest of code ");
	}
}
