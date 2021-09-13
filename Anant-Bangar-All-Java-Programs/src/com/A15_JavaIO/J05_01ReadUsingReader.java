package com.A15_JavaIO;

import java.io.FileReader;
import java.io.Reader;

public class J05_01ReadUsingReader 
{
	public static void main(String[] args) 
	{
		try
		{
			Reader rd=new FileReader("src/anant");
			int data=0;
			while((data=rd.read())!=-1)
			{
				System.out.print((char)data+"");
			}
			rd.close();
			
			System.out.println();
			System.out.println("read operation is successfuly completed using Reader ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
