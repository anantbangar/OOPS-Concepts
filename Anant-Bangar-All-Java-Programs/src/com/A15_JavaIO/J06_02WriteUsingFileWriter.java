package com.A15_JavaIO;

import java.io.FileWriter;
import java.io.Writer;

public class J06_02WriteUsingFileWriter 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fwr=new FileWriter("src/pawan");
			String str="this is using FileWriter";
			fwr.write(str);
			fwr.flush();
			fwr.close();
			
			System.out.println("write operation is successfuly completed using FileWriter ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
