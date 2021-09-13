package com.A12_Constructors;

public class C01DrfaultOneTwoArgmntConstrctr 
{
	C01DrfaultOneTwoArgmntConstrctr()
	{
		System.out.println("this is default means no argument constructor ");
	}
	
	C01DrfaultOneTwoArgmntConstrctr(int x)
	{
		System.out.println("this is one argument constructor ");
		System.out.println(x);
	}
	
	C01DrfaultOneTwoArgmntConstrctr(String firstName,String lastName)
	{
		System.out.println("this is two argument constructor ");
		System.out.println("first name is "+firstName);
		System.out.println("Last name is "+lastName);
	}
	
	public static void main(String[] args) 
	{
		C01DrfaultOneTwoArgmntConstrctr obj1=new C01DrfaultOneTwoArgmntConstrctr();
		C01DrfaultOneTwoArgmntConstrctr obj2=new C01DrfaultOneTwoArgmntConstrctr(100);
		C01DrfaultOneTwoArgmntConstrctr obj3=
				new C01DrfaultOneTwoArgmntConstrctr("anant","bangar");
	}
}
