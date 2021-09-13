package com.A13_MethodOverloading;

public class M04SmNmSmNofParaOfDiffTyp 
{
	void method(int a,String name)
	{
		System.out.println("number and string are "+a+" "+name);
	}
	
	void method(String name,int a)
	{
		System.out.println("String and number are "+name+" "+a);
	}
	
	public static void main(String[] args) 
	{
		M04SmNmSmNofParaOfDiffTyp obj=new M04SmNmSmNofParaOfDiffTyp();
		
		obj.method(55,"Anant");
		obj.method("Bangar",88);
	}
}
