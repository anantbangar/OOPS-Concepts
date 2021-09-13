package com.A15_JavaIO;

import java.io.FileOutputStream;

class J02_02WriteUsingFileOutputStream 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("src/pawan");
			String str="Welcom Pawan Bangar";
			byte[] b=str.getBytes();
			fout.write(b);
			fout.close();
			
			System.out.println("Write operation successfully completed using FileOutputStream ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
