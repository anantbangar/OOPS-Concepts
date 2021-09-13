package com.A11_ThisAndSuper;

public class T03ConstructorUsingThis 
{
	T03ConstructorUsingThis()
	{
		System.out.println("this is no argument constructor ");
	}
	
	T03ConstructorUsingThis(int x)
	{	
		this();
		System.out.println("this is argument constructor");
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		T03ConstructorUsingThis obj=new T03ConstructorUsingThis(55);
		
	}
}
