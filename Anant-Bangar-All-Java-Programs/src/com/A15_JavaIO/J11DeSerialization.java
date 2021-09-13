package com.A15_JavaIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class J11DeSerialization 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("src/anant");
			ObjectInputStream oin=new ObjectInputStream(fin);
			
			Student st1=(Student)oin.readObject();
			
			System.out.println(st1.id);
			System.out.println(st1.name);
			
			oin.close();
			fin.close();
			
			System.out.println("deserialization is done.....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
