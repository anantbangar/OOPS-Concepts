package com.A13_MethodOverloading;

public class M02SmNmDiffNofParaOfDiffTyp 
{
	void method(int x,String name)
	{
		System.out.println("number and string are "+x+" "+name);
	}
	
	void method(float f,double d,char ch)
	{
		System.out.println("float , double and char are "+f+" "+d+" "+ch);
	}
	
	public static void main(String[] args) 
	{
		M02SmNmDiffNofParaOfDiffTyp obj=new M02SmNmDiffNofParaOfDiffTyp();
		
		obj.method(20,"anant");
		obj.method(10.222f,50.121211,'B');
	}
}
