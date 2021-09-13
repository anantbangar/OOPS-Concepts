package com.A11_ThisAndSuper;

class Parent_class
{	
	public void parentMethod()
	{
		System.out.println("this is parent method");
	}
}

public class T06ThisSuperInMethod extends Parent_class
{	
	public void childMethod()
	{
		super.parentMethod();
		System.out.println("this is child method ");
		this.display();
		super.parentMethod();
	}
	
	public void display()
	{
		System.out.println("this is child display method ");
	}
	
	
	public static void main(String[] args) 
	{
		T06ThisSuperInMethod obj=new T06ThisSuperInMethod();
		
		obj.childMethod();
	}

}
