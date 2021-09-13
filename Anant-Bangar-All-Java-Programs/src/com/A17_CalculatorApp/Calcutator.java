package com.A17_CalculatorApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calcutator 
{
	public void Calc() throws IOException
	{
		boolean next=false;
		do
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Integer iFNum=new Integer(0);
			Integer iSNum=new Integer(0);
			
			System.out.println("enter first number ");
			System.out.flush();
			try
			{
				iFNum=Integer.parseInt(br.readLine());
			}
			catch(Exception e)
			{
				System.out.println("please enter numeric values ");
				System.exit(0);
			}
			
			System.out.println("enter the Operation(Add:+,Minus:-,Product:*,Division:/)");
			String option=br.readLine();
			
			System.out.println("enter second number ");
			System.out.flush();
			try
			{
				iSNum=Integer.parseInt(br.readLine());
			}
			catch(Exception e)
			{
				System.out.println("please enter numeric values ");
				System.exit(0);
			}
			
			if(option.length()==1)
			{
				Calculate cal=new Calculate(iFNum,option.charAt(0),iSNum);
				cal.doCalculation();
				cal.getResult();
			}
			else
			{
				System.out.println("please enter available options ");
			}
			
			System.out.println("do you want to continue basic calculation again (y/n) ");
			char response=(char)br.read();
			
			if(response=='y' || response=='Y')
			{
				next=true;
			}
			else 
			{
				next=false;
				System.out.println("thank you ");
			}
			
		}
		while(next);
	}
}
