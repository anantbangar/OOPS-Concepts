package com.A10_Interface;

interface Drawable4
{
	void draw();
}

interface Printable1
{
	void draw();
}

public class I05TwoInterfaceWithSameMethods implements Drawable4,Printable1 
{
	public void draw()
	{
		System.out.println("child class draw method ");
	}
	
	public static void main(String[] args) 
	{
		I05TwoInterfaceWithSameMethods obj=new I05TwoInterfaceWithSameMethods();
		obj.draw();
	}

}
