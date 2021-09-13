package com.A09_AbstractClass;

public class A04SubClass03 extends A01AbstractClass 
{
	public void show()
	{
		System.out.println("this is show method of subclass of abstract class");
		
	}
	
	public static void main(String[] args) 
	{
		A04SubClass03 obj=new A04SubClass03();
		
		obj.display();
	}
}
