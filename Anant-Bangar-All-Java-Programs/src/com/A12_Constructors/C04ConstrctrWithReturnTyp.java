package com.A12_Constructors;

public class C04ConstrctrWithReturnTyp 
{
	int C04ConstrctrWithReturnTyp(int x) //its become method not a constructor
	{
		return x;
	}
	
	String C04ConstrctrWithReturnTyp(String name) //its become method not a constructor
	{
		return name;
	}
	public static void main(String[] args) 
	{
		C04ConstrctrWithReturnTyp obj=new C04ConstrctrWithReturnTyp();
	}
}
