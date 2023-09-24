package com.A10_Interface;

interface Drawable6
{
	void draw();
	
	default void methodDraw()
	{
		System.out.println("this is default method of Drawable6 interface ");
	}
}

interface Printable2 extends Drawable6
{
	void print();
	
	default void methodPrint()
	{
		System.out.println("this is default method of Printable2 interface ");
	}
}

public class I07InterfaceInheritOtherInterface implements Printable2
{
	public void draw()
	{
		System.out.println("implementation of draw from Drawable6 ");
	}
	
	public void print()
	{
		System.out.println("implementation of print from Printable2 ");
	}
	
	public static void main(String[] args) 
	{
		I07InterfaceInheritOtherInterface obj=new I07InterfaceInheritOtherInterface();
		
		obj.draw();
		obj.print();
		obj.methodDraw();
		obj.methodPrint();
	}

}
