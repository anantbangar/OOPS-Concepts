package com.A09_AbstractClass;

import com.A04_Arrays.A01AddIntOfArray;

public class A02SubClass01 extends A01AbstractClass 
{
	public void show()
	{
		System.out.println("this is show method of subclass of abstract class");
		
	}
	
	public static void main(String[] args) 
	{
		//A01AbstractClass obj=new A01AbstractClass(); //error
		
		//obj.display(); //no use
	}
}
