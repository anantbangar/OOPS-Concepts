package com.A15_JavaIO;

import java.io.FileInputStream;

class J01_02ReadUsingFileInputStream 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("src/anant");
			int data=fin.read();
			while(data!=-1)
			{
				System.out.print((char)data);
				data=fin.read();
			}
			fin.close();
			
			System.out.println();
			System.out.println("read operation successfully completed using FileInputStream");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
