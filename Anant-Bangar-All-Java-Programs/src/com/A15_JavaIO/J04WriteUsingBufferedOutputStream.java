package com.A15_JavaIO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class J04WriteUsingBufferedOutputStream 
{
	public static void main(String[] args) 
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("src/pawan");
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String str="this is write using BufferedOutputStream";
			byte[] b=str.getBytes();
			bout.write(b);
			bout.flush();
			fout.flush();
			bout.close();
			fout.close();
			
			System.out.println();
			System.out.println("write operation successfull using BufferedOutputStream ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
