package com.A09_AbstractClass;

public class A03SubClass02 extends A01AbstractClass
{
	public void show()
	{
		System.out.println("this is show method of subclass of abstract class");
		
	}
	
	public static void main(String[] args) 
	{
		A03SubClass02 obj=new A03SubClass02();
		
		obj.show();
	}
}
