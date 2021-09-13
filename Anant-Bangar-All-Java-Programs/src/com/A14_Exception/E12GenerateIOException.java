package com.A14_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E12GenerateIOException 
{
	public static void main(String[] args) 
	{
		try
		{
			File file=new File("src//anant");
			FileInputStream fis=new FileInputStream(file);
			fis.close();
			System.out.println(fis.available());
			System.out.println("rest of code in try block ");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("such file is not found ");
			System.out.println("rest of code in catch block ");
		}
		catch(IOException e)
		{
			System.out.println("this is IOExecption ");
		}
		
		System.out.println("rest of code out of try block ");
	}
}
