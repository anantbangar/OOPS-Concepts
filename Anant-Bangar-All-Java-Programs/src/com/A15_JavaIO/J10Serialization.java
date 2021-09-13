package com.A15_JavaIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}


public class J10Serialization 
{
	public static void main(String[] args) 
	{
		try
		{
			Student st=new Student(100,"anant");
			System.out.println(st.id+" "+st.name);
			
			FileOutputStream fout=new FileOutputStream("src/anant");
			ObjectOutputStream oout=new ObjectOutputStream(fout);
			oout.writeObject(st);
			oout.flush();
			fout.flush();
			oout.close();
			fout.close();
			
			System.out.println("serialization is done....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
