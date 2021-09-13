package com.A08_AccessModifiers;

public class A03_01_ProtectedFieldMethodInMain 
{
	protected int id=100;
	protected String name="Anant";
	
	protected void displayId()
	{
		System.out.println("Method display ID is "+id);
	}
	
	protected void displayName()
	{
		System.out.println("Method display name is "+name);
	}
	
	public static void main(String[] args) throws Exception
	{
		A03_01_ProtectedFieldMethodInMain obj=new A03_01_ProtectedFieldMethodInMain();
		
		System.out.println(obj.id);
		System.out.println(obj.name);
		obj.displayId();
		obj.displayName();
	}
}
