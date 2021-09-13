package com.A15_JavaIO;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

class J01ReadUsingInputStream 
{
	public static void main(String[] args) 
	{
		try
		{
			InputStream ins=new FileInputStream("src/anant");
			Reader rd=new InputStreamReader(ins);
			int data=rd.read();
			while(data!=-1)
			{
				System.out.print((char)data+"");
				data=rd.read();
			}
			
			ins.close();
			
			System.out.println();
			System.out.println("read operation successfully completed using InputStream");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
