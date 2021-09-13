package com.A10_Interface;

public class I08PublicInterface implements PublicInterface
{
	public void abstractMethod()
	{
		System.out.println("this is inherited abstractMethod from PublicInterface");
	}
	
	public static void main(String[] args) 
	{
		I08PublicInterface obj=new I08PublicInterface();
		
		obj.abstractMethod();
		System.out.println(PublicInterface.num);
		PublicInterface.staticMethod();
	}
}
