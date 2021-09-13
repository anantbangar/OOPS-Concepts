package com.A12_Constructors;

class Parent
{
	Parent()
	{
		System.out.println("this is default constructor of Parent Class ");
	}
	
	Parent(int x)
	{
		System.out.println("this is argument constructor of Parent Class ");
		System.out.println(x);
	}
}

public class C02SuperClassConstructor extends Parent 
{
	C02SuperClassConstructor()
	{
		super();
	}
	
	C02SuperClassConstructor(int x)
	{
		super(x);
	}
	
	public static void main(String[] args) 
	{
		C02SuperClassConstructor obj1=new C02SuperClassConstructor();
		C02SuperClassConstructor obj2=new C02SuperClassConstructor(555);
	
	}

}
