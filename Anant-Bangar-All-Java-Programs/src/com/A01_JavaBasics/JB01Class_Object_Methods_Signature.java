package com.A01_JavaBasics;

public class JB01Class_Object_Methods_Signature 
{
	int id;
	String name;
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
		
	}
	
	public String getName()
	{
		return name;
	}
	public static void main(String[] args) 
	{
		JB01Class_Object_Methods_Signature obj1=new JB01Class_Object_Methods_Signature();
		
		obj1.setId(100);
		obj1.setName("anant");
		
		System.out.println("id is "+obj1.getId());
		System.out.println("name is "+obj1.getName());
	}
}
