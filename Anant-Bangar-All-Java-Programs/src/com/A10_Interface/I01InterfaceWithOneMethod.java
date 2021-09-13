package com.A10_Interface;

interface drawable
{
	void draw();
}

public class I01InterfaceWithOneMethod implements drawable 
{
	public void draw()
	{
		System.out.println("drawing circle ");
	}
	
	public static void main(String[] args) 
	{
		I01InterfaceWithOneMethod obj=new I01InterfaceWithOneMethod();
		
		obj.draw();
	}

}
