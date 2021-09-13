package com.A17_CalculatorApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ScientificCalculator extends Calculate
{
	char operator;
	Double dbNum=new Double(0);
	
	ScientificCalculator()
	{
		
	}
	
	ScientificCalculator(double dbNum,char operator) 
	{
		super(dbNum,operator);
		this.operator=operator;
		this.dbNum=dbNum;
	}
	
	
	public void Calc() throws IOException
	{
		String option;
		boolean next=false;
		
		do
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter the Operation(Sine:S,Cosin:C,Tangent:T,Log:L");
		String operator=br.readLine();
		
		System.out.println("enter the value");
		System.out.flush();
		Double dbNum=new Double(0);
		try
		{
			dbNum=Double.parseDouble(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("please enter numeric values ");
			System.exit(0);
		}
		
		if(operator.length()==1)
		{
			ScientificCalculator scal=new ScientificCalculator(dbNum,operator.charAt(0));
			scal.doCalculation();
			scal.getResult();
		}
		else
		{
			System.out.println("operation not available...select available options ");
		}
		
		System.out.println("do you want to continue (y/n)");
		System.out.flush();
		option=br.readLine();
		
		if(option.equals("y") || option.equals("Y"))
		{
			next=true;
		}
		else
		{
			next=false;
			System.out.println("thank you ");
		}
		
		}while(next);
	}
}
