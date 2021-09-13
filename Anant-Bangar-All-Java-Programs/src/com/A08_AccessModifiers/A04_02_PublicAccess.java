package com.A08_AccessModifiers;
//import com.A08_AccessModifiers.A04_01_PublicAccesInMain.*;

public class A04_02_PublicAccess 
{
	public static void main(String[] args) 
	{
		A04_01_PublicAccesInMain obj=new A04_01_PublicAccesInMain();
		
		System.out.println(obj.id);
		System.out.println(obj.name);
		obj.displayId();
		obj.displayName();
	}
}
