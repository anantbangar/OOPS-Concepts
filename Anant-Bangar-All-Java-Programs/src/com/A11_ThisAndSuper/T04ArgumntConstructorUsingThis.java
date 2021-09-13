package com.A11_ThisAndSuper;

public class T04ArgumntConstructorUsingThis 
{
	T04ArgumntConstructorUsingThis()
	{
		this(77);
		System.out.println("this is no argument constructor ");
	}
	
	T04ArgumntConstructorUsingThis(int x)
	{
		System.out.println("this is argument constructor");
		System.out.println(x);
	}
	
	public static void main(String[] args) 
	{
		T04ArgumntConstructorUsingThis obj=new T04ArgumntConstructorUsingThis();
		
	}
}
