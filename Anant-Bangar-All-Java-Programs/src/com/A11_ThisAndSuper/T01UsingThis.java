package com.A11_ThisAndSuper;

public class T01UsingThis 
{
	int id;
	String name;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName() 
	{
		return this.name;
	}
	
	public void displayId()
	{
		System.out.println("id is "+this.id);
	}
	
	public void displayName()
	{
		System.out.println("name is "+this.name);
	}
	
	public static void main(String[] args) 
	{
		T01UsingThis obj=new T01UsingThis();
		
		obj.setId(100);
		obj.setName("Anant");
		
		obj.displayId();
		obj.displayName();
	}
}
