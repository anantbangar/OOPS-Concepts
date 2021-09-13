package com.A15_JavaIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class J03ReadUsingBufferedInputStream 
{
	public static void main(String[] args) 
	{
		try
		{
			FileInputStream fin=new FileInputStream("src/anant");
			BufferedInputStream bin=new BufferedInputStream(fin);
			int data=0;
			while((data=bin.read())!=-1)
			{
				System.out.print((char)data+"");
			}
			bin.close();
			fin.close();
			System.out.println();
			System.out.println("read operation is successfully completed using BufferedInputStream ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
