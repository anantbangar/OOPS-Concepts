package com.A02_Operators;

public class Op02Increment_Decrement 
{
	int count=0;
	
	public void incrementMethod()
	{
		count++;
	}
	
	public void decrementMethod()
	{
		count--;
	}
	
	public static void main(String[] args)
	{
		Op02Increment_Decrement obj1=new Op02Increment_Decrement();
		System.out.println("count is "+obj1.count);
		
		obj1.incrementMethod();
		obj1.incrementMethod();
		
		System.out.println("count is "+obj1.count);
		
		obj1.decrementMethod();
		
		System.out.println("count is "+obj1.count);
	}
}
