package com.A15_JavaIO;

import java.io.BufferedReader;
import java.io.FileReader;

public class J07ReadUsingBufferedReader 
{
	public static void main(String[] args) 
	{
		try
		{
			FileReader frd=new FileReader("src/anant");
			BufferedReader br=new BufferedReader(frd);
			int data=0;
			while((data=br.read())!=-1)
			{
				System.out.print((char)data+"");
			}
			br.close();
			
			System.out.println();
			System.out.println("read operation is successfuly completed using BufferedReader ");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
