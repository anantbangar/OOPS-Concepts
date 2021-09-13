package com.A15_JavaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class J08WriteUsingBufferedWriter 
{
	public static void main(String[] args) 
	{
		try
		{
			FileWriter fwr=new FileWriter("src/pawan");
			BufferedWriter bw=new BufferedWriter(fwr);
			String str="this is write using BufferedWriter";
			bw.write(str);
			bw.flush();
			bw.close();
					
			System.out.println("write operation is successfuly completed using BufferedWriter ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
