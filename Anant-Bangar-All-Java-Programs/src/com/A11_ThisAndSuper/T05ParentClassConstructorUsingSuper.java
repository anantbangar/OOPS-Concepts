package com.A11_ThisAndSuper;

class ParentClass
{
	ParentClass()
	{
		System.out.println("this is Parent class Constructor ");
	}
}

public class T05ParentClassConstructorUsingSuper extends ParentClass
{
	T05ParentClassConstructorUsingSuper() 
	{
		super(); //by default there is super 
		System.out.println("this is child class constructor ");
	}
	
	public static void main(String[] args) 
	{
		T05ParentClassConstructorUsingSuper obj=new T05ParentClassConstructorUsingSuper();
	}
}
