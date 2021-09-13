package com.A14_Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E11GenerateFileNotFoundException 
{
	public static void main(String[] args) 
	{
		try
		{
			File file=new File("anant.txt");
			FileInputStream fis=new FileInputStream(file);
			//fis.close();
			System.out.println("rest of code in try block ");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("such file is not found ");
			System.out.println("rest of code in catch block ");
		}
		
		System.out.println("rest of code out of try block ");
	}
}
