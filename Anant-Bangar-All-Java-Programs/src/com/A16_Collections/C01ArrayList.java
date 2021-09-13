package com.A16_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class C01ArrayList 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> list=new ArrayList<String>();
		
		/*System.out.println("enter 10 name to add in array list ");
		for(int i=0;i<10;i++)
		{
			list.add(sc.next());
		}*/
		
		list.add("anant"); list.add("pawan"); list.add("ram"); list.add("shailoo");
		list.add("gulab"); list.add("kishor"); list.add("rahul"); list.add("laxmi");
		list.add("ketaki"); list.add("sadhana"); list.add("anant");
		
		System.out.println("array list which contain duplicate elements with list object ");
		System.out.println(list);
		
		System.out.println("array list with iterator object is ");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		System.out.println("array list with for-each-loop is ");
		for(String str : list)
		{
			System.out.print(str+" ");
		}
		
		System.out.println();
		System.out.println("adding element at 6th index ");
		list.add(6,"raja");
		System.out.println(list);
		
		System.out.println("removing particular element 'raja' ");
		list.remove("raja");
		System.out.println(list);
		
		System.out.println("removing element at 8th index ");
		list.remove(8);
		System.out.println(list);
		
		System.out.println("updating element at 5th index ");
		list.set(5,"vipin");
		System.out.println(list);
		
		System.out.println("checking \"gulab\" element is present or not ");
		System.out.println(list.contains("gulab"));
		
		System.out.println("geting element at 3rd index ");
		System.out.println(list.get(03));
		
		
		System.out.println("size of array lis is "+list.size());
		
		System.out.println("removing all elements of array list ");
		list.removeAll(list);
		System.out.println(list);
	}
			
}
