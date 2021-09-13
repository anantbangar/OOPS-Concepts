package com.A10_Interface;

interface Drawable3
{
	void draw();
}

interface Printable
{
	void print();
}

public class I04TwoInterface implements Drawable3,Printable
{
	public void draw()
	{
		System.out.println("drawable method from child class ");
	}
	
	public void print()
	{
		System.out.println("printable method from child class ");
	}
	
	public static void main(String[] args) 
	{
		I04TwoInterface obj1=new I04TwoInterface();
		obj1.draw();
		obj1.print();
	}
}
