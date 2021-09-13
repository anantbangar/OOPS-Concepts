package com.A08_AccessModifiers;

public class A01PrivateAccessInMainSub extends A01PrivateAccessInMain 
{
	public static void main(String[] args) throws Exception 
	{
		A01PrivateAccessInMain obj=new A01PrivateAccessInMain();
		
		//obj.displayId(); //error
		//obj.displayName(); //error
		
		//System.out.println("Id is "+obj.id); //error
		//System.out.println("name is "+obj.name); //error
		
	}
}
