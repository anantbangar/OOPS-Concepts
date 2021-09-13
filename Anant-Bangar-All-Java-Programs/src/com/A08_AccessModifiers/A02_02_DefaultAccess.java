package com.A08_AccessModifiers;

public class A02_02_DefaultAccess 
{
	public static void main(String[] args) 
	{
		A02_01_DefaultFieldMethods obj=new A02_01_DefaultFieldMethods();
		
		obj.displayId();
		obj.displayName();
		
		System.out.println("id is "+obj.id);
		System.out.println("name is "+obj.name);
	}
}
