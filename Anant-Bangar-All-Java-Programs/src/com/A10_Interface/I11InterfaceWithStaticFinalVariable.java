package com.A10_Interface;

interface WithStaticFinalVariable
{
	public static final int num=400;
	String str="anant"; // it is by default public static final
}

public class I11InterfaceWithStaticFinalVariable implements WithStaticFinalVariable
{
	public static void main(String[] args) 
	{
		System.out.println(WithStaticFinalVariable.num);
		System.out.println(WithStaticFinalVariable.str);
	}

}
