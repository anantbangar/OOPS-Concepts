package com.A10_Interface;

interface drawable1
{
	//void draw();
	void print();
}

public class I02InterfaceWithTwoMethods implements drawable1
{
	public void print() 
	{
		System.out.println("printing method ");
	}
	public static void main(String[] args) 
	{
		I02InterfaceWithTwoMethods obj=new I02InterfaceWithTwoMethods();
		
		obj.print();
	}
}
