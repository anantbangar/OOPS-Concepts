package com.A08_AccessModifiers;

public class A03_02_ProtectedAccess 
{
	public static void main(String[] args) 
	{
		A03_01_ProtectedFieldMethodInMain obj=new A03_01_ProtectedFieldMethodInMain();
		
		obj.displayId();
		obj.displayName();
		
		System.out.println("id is "+obj.id);
		System.out.println("name is "+obj.name);
	}
}
