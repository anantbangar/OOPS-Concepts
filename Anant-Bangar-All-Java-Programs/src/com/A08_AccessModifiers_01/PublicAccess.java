package com.A08_AccessModifiers_01;
import com.A08_AccessModifiers.*;

public class PublicAccess 
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
