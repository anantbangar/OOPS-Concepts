package com.A17_CalculatorApp;

public class Calculate implements iCalc 
{
	private int iFNum,iSNum;
	private int iResult=0;
	private char operator;
	private Double dbNum=new Double(0);
	private Double dbResult=new Double(0);
	private boolean typeInt=false;
	private boolean typeDouble=false;
	
	Calculate()
	{
		
	}
	
	Calculate(int iFNum,char operator,int iSNum)
	{
		this.iFNum=iFNum;
		this.operator=operator;
		this.iSNum=iSNum;
		typeInt=true;
	}
	
	Calculate(double dbNum,char operator)
	{
		this.dbNum=dbNum;
		this.operator=operator;
		typeDouble=true;
	}
	
	public void doCalculation()
	{
		iResult=0;
		dbResult=0.0;
		
		switch(operator)
		{
			case '+':
					checkInt();
					iResult=iFNum+iSNum;
					break;
			case '-':
					checkInt();
					iResult=iFNum-iSNum;
					break;
			case '*':
					checkInt();
					iResult=iFNum*iSNum;
					break;
			case '/':
					checkInt();
					if(!checkSecondNum())
					{
						iResult=iFNum/iSNum;
						break;
					}
			case 's':
			case 'S':
					checkDouble();
					dbResult=Math.sin(dbNum);
					break;
			case 't':
			case 'T':
					checkDouble();
					dbResult=Math.tan(dbNum);
					break;
			case 'c':
			case 'C':
					checkDouble();
					dbResult=Math.cos(dbNum);
					break;
			case 'l':
			case 'L':
					checkDouble();
					dbResult=Math.log(dbNum);
					break;
						
			default:
					iResult=0;		
					dbResult=0.0;
					System.out.println("Operation is not available...select available options ");
		}
	}
	
	public void getResult()
	{
		if(typeInt)
		{
			System.out.println("The result is = "+iResult);
		}
		else if(typeDouble)
		{
			System.out.println("The result is = "+dbResult);
		}
		
	}
	
	public boolean checkSecondNum()
	{
		if(iSNum==0)
		{
			System.out.println("zero is not allowed ");
			System.exit(0);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void checkInt()
	{
		if(!typeInt)
		{
			iResult=0;
			System.out.println("Operation is not available...please select available options");
			System.exit(0);
		}
	}
	
	public void checkDouble()
	{
		if(!typeDouble)
		{
			dbResult=0.0;
			System.out.println("Operation is not available...please select available options ");
			System.exit(0);
		}
	}
}
