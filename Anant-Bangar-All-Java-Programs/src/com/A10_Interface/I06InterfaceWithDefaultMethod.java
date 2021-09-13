package com.A10_Interface;

interface Drawable5
{
	default void draw()
	{
		System.out.println("this is default method of interface ");
	}
}

public class I06InterfaceWithDefaultMethod implements Drawable5
{
	public static void main(String[] args) 
	{
		I06InterfaceWithDefaultMethod obj=new I06InterfaceWithDefaultMethod();
		obj.draw();
	}

}
