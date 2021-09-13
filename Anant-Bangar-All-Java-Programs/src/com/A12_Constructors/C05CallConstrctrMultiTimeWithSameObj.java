package com.A12_Constructors;

public class C05CallConstrctrMultiTimeWithSameObj 
{
	C05CallConstrctrMultiTimeWithSameObj(int x) 
	{
		System.out.println(x);
		
	}
	
	public static void main(String[] args) 
	{
		C05CallConstrctrMultiTimeWithSameObj obj=new C05CallConstrctrMultiTimeWithSameObj(400);
		
		//obj.C05CallConstrctrMultiTimeWithSameObj(); //error
		//obj.C05CallConstrctrMultiTimeWithSameObj(); /error
	}
}
