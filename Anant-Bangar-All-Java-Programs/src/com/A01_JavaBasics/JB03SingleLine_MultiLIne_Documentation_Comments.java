package com.A01_JavaBasics;

import java.util.Scanner;

/** 
 *This is Documentation Comment
 *This program is printing user's name
 *Input is taking from user on console 
 * @author Anant
 *ok..Byee
 *
 */

public class JB03SingleLine_MultiLIne_Documentation_Comments 
{
	public static void main(String[] args) 
	{
		String name; // String variable...this is single line comment
		
		/*
		 	This is multiline comment
		 	Scanner is use for takling input from user
		 	This is from java.util pakage
		 */
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your name ");
		
		name=sc.nextLine();
		
		System.out.println("You entered your name is "+name);
	}
}
