package com.A12_Constructors;

public class C03PrivateProtectedDefaultPublic_Constrctr 
{
	private C03PrivateProtectedDefaultPublic_Constrctr()
	{
		System.out.println("this is private constructor ");
	}
	
	protected C03PrivateProtectedDefaultPublic_Constrctr(int x)
	{
		System.out.println("this is protected constructor ");
		System.out.println(x);
	}
	
	C03PrivateProtectedDefaultPublic_Constrctr(String name)
	{
		System.out.println("this is default constructor ");
		System.out.println(name);
	}
	
	public C03PrivateProtectedDefaultPublic_Constrctr(float n)
	{
		System.out.println("this is public constructor ");
		System.out.println(n);
	}
	
	public static void main(String[] args) 
	{
		C03PrivateProtectedDefaultPublic_Constrctr obj1=new C03PrivateProtectedDefaultPublic_Constrctr();
		C03PrivateProtectedDefaultPublic_Constrctr obj2=new C03PrivateProtectedDefaultPublic_Constrctr(100);
		C03PrivateProtectedDefaultPublic_Constrctr obj3=new C03PrivateProtectedDefaultPublic_Constrctr("anant");
		C03PrivateProtectedDefaultPublic_Constrctr obj4=new C03PrivateProtectedDefaultPublic_Constrctr(155.55f);
	}
}
