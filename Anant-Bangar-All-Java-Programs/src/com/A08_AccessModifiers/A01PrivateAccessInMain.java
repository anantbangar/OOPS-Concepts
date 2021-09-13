package com.A08_AccessModifiers;

public class A01PrivateAccessInMain 
{
	private int id=100;
	private String name="Anant";
	
	private void displayId()
	{
		System.out.println("Method display ID is "+id);
	}
	
	private void displayName()
	{
		System.out.println("Method display name is "+name);
	}
	
	public static void main(String[] args) throws Exception
	{
		A01PrivateAccessInMain obj=new A01PrivateAccessInMain();
		
		System.out.println(obj.id);
		System.out.println(obj.name);
		obj.displayId();
		obj.displayName();
	}
}
