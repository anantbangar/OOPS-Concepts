package com.A10_Interface;

interface Drawable2
{
	void draw();
}

class Circle implements Drawable2
{
	public void draw()
	{
		System.out.println("drawing cicle ");
	}
}

class Rectangle implements Drawable2
{
	public void draw()
	{
		System.out.println("drawing rectangle ");
	}
}

public class I03MethodCallUsingInterfaceInstance 
{
	public static void main(String[] args) 
	{
		Drawable2 circle=new Circle();
		circle.draw();
		
		Drawable2 rectangle=new Rectangle();
		rectangle.draw();
	}
}
