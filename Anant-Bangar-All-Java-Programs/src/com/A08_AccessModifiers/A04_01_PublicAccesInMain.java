package com.A08_AccessModifiers;

public class A04_01_PublicAccesInMain 
{
	public int id=100;
	public String name="Anant";
	
	public void displayId()
	{
		System.out.println("Method display ID is "+id);
	}
	
	public void displayName()
	{
		System.out.println("Method display name is "+name);
	}
	
	public static void main(String[] args) throws Exception
	{
		A04_01_PublicAccesInMain obj=new A04_01_PublicAccesInMain();
		
		System.out.println(obj.id);
		System.out.println(obj.name);
		obj.displayId();
		obj.displayName();
	}
}
