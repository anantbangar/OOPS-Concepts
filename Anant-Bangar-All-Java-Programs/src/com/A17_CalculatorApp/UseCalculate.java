package com.A17_CalculatorApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UseCalculate 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String option;
		do
		{
			System.out.println("select the calculator Basic:B or scientific:S ");
			System.out.flush();
	
			option=br.readLine();
			
			if(!option.equals("B") && !option.equals("b") && !option.equals("s") && !option.equals("S"))
			{
				System.out.println("please enter B or S ");
			}
		
		}while(!option.equals("B") && !option.equals("b") && !option.equals("s") && !option.equals("S") );
				
			if(option.length()==1)
			{
					if(option.equals("B") || option.equals("b"))
					{
						Calcutator cal=new Calcutator();
						cal.Calc();
						
					}
					else if(option.equals("S") || option.equals("s"))
					{
						ScientificCalculator scal=new ScientificCalculator();
						scal.Calc();
					}
					
			}
						
	}
}
