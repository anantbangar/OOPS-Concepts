package com.A08_AccessModifiers_01;

import com.A08_AccessModifiers.A03_01_ProtectedFieldMethodInMain;
import com.A08_AccessModifiers.*;

public class ProtectedAccess_ChildClass extends A03_01_ProtectedFieldMethodInMain 
{
	public static void main(String[] args) 
	{
		ProtectedAccess_ChildClass obj=new ProtectedAccess_ChildClass();
		
		obj.displayId();
		obj.displayName();
		
		System.out.println("id is "+obj.id); 
		System.out.println("name is "+obj.name); 
	}
}
