package com.A07_Inheritance;

public class Test 
{
	public static void main(String[] args) 
	{
		A a=new A();
		B b=new B();
		C c=new C();
		
		System.out.println("for methods......");
		
		a.firstMehtodOfA();
		a.secondMethodOfA();
		a.show();
		
		System.out.println();
		
		b.firstMehtodOfB();
		b.secondMethodOfB();
		b.show();
		
		System.out.println();
		
		c.firstMehtodOfC();
		c.secondMethodOfC();
		c.show();
				
		System.out.println();
		
		A ab=new B();
		A ac=new C();
		
		ab.show();
		
		System.out.println();
		
		ac.show();
		
		System.out.println("for data members......");
		System.out.println(ab.name);
		System.out.println(ac.name);
		
		
		
		
	}
}
