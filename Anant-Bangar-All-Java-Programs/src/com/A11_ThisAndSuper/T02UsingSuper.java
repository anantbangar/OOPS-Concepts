package com.A11_ThisAndSuper;

class Parent
{
	String name="Parent";
	
	public void display()
	{
		System.out.println("Parent name is "+name);
	}
}


public class T02UsingSuper extends Parent
{
	String name="Child";
	
	public void display()
	{
		super.display();
		System.out.println("Child name is "+name);
	}
	public static void main(String[] args) 
	{
		T02UsingSuper obj=new T02UsingSuper();
		obj.display();
	}

}
