package com.A13_MethodOverloading;

public class M01SmNmDiffNofParaOfSmtyp 
{
	void add(int a,int b)
	{
		System.out.println("Addition of two number is "+(a+b));
	}
	
	void add(int a,int b,int c)
	{
		System.out.println("Addition of three number is "+(a+b+c));
	}
	
	public static void main(String[] args) 
	{
		M01SmNmDiffNofParaOfSmtyp obj=new M01SmNmDiffNofParaOfSmtyp();
		
		obj.add(10, 20);
		obj.add(10, 20,30);
		
	}
}
