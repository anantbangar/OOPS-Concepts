package com.A15_JavaIO;

import java.io.FileWriter;
import java.io.Writer;

public class J06_01WriteUsingWriter 
{
	public static void main(String[] args) 
	{
		try
		{
			Writer wr=new FileWriter("src/pawan");
			String str="this is using Writer";
			wr.write(str);
			wr.flush();
			wr.close();
			
			System.out.println("write operation is successfuly completed using Writer ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
