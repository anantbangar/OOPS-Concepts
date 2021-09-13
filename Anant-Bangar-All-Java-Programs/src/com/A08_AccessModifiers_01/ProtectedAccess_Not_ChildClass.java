package com.A08_AccessModifiers_01;
import com.A08_AccessModifiers.*;

public class ProtectedAccess_Not_ChildClass 
{
	public static void main(String[] args) 
	{
		ProtectedAccess_Not_ChildClass obj=new ProtectedAccess_Not_ChildClass();
		
		//obj.displayId(); //error
		//obj.displayName(); //error
		
		//System.out.println("id is "+obj.id); //error 
		//System.out.println("name is "+obj.name); //error 
	}
}
