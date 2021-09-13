package com.A15_JavaIO;

import java.io.FileReader;

public class J05_02ReadUsingFileReader 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader frd=new FileReader("src/anant");
			int data=0;
			while((data=frd.read())!=-1)
			{
				System.out.print((char)data+"");
			}
			frd.close();
			
			System.out.println();
			System.out.println("read operation is successfuly completed using FileReader ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
