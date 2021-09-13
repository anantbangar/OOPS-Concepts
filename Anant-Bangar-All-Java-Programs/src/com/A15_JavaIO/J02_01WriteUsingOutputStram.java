package com.A15_JavaIO;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

class J02_01WriteUsingOutputStram 
{
	public static void main(String[] args) 
	{
		try
		{
			OutputStream outs=new FileOutputStream("src/pawan");
			Writer writer=new OutputStreamWriter(outs);
			writer.write("I am pawan bangar");
			writer.close();
			
			System.out.println("write operation successfully completed using OutputStream ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
