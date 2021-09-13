package com.A16_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class C02HashSet 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("anant"); list.add("ram"); list.add("ram"); 
		
		HashSet<String> hset=new HashSet<String>(list);
		
		hset.add("one"); hset.add("two"); hset.add("three"); hset.add("one");
		
		System.out.println("hash set using another collection ");
		System.out.println("hash set which contain not duplicate elements with hset object ");
		System.out.println(hset);
		
		System.out.println("hash set with iterator object is ");
		Iterator<String> itr=hset.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		System.out.println("hash set with for-each-loop is ");
		for(String str : hset)
		{
			System.out.print(str+" ");
		}
		
		System.out.println();
		System.out.println("adding element in existing hash set ");
		hset.add("gulab");
		System.out.println(hset);
		
		System.out.println("removing 'gulab' element from hash set ");
		hset.remove("gulab");
		System.out.println(hset);
		
		System.out.println("checking \"gulab\" element is present or not");
		System.out.println(hset.contains("gulab"));
		
		System.out.println("size of hash set is "+hset.size());
		
		System.out.println("removing all elements from hash set ");
		hset.removeAll(hset);
		System.out.println(hset);
		
		
		
		
		
		
	}
}
