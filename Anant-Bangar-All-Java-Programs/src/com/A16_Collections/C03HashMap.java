package com.A16_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class C03HashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		hmap.put(01,"anant"); hmap.put(02,"pawan"); hmap.put(03,"ram");
		hmap.put(04,"shailoo"); hmap.put(05,"kishor"); hmap.put(06,"rahul");
		hmap.put(07,"ketaki"); 
		
		System.out.println("Initial hash map "+hmap);
		
		HashMap<Integer,String> hmap1=new HashMap<Integer, String>();
		hmap1.put(100,"rahul");
		hmap1.putAll(hmap);
		
		System.out.println("copy of initial hash map "+hmap1);
		
		System.out.println("clone of initial hash map "+hmap.clone());
		
		System.out.println("iterating using for loop and map.entry ");
		for(Map.Entry<Integer,String> entry : hmap1.entrySet())
		{
			System.out.println(entry.getKey()+ " "+entry.getValue());
		}
		
		System.out.println("checking key 100 is present or not ");
		System.out.println(hmap1.containsKey(100));
		
		System.out.println("checking value rama is present or not ");
		System.out.println(hmap1.containsValue("rama"));
		
		System.out.println("checking map is empty or not");
		System.out.println(hmap1.isEmpty());
		
		System.out.println("size of hmap1 is "+hmap1.size());
		
		System.out.println("printing all keys of hmap1 using Iterator ");
		Iterator<Integer> itr1=hmap1.keySet().iterator();
		while(itr1.hasNext())
		{
			System.out.print(itr1.next()+" ");
		}
		
		System.out.println();
		System.out.println("printing all keys of hmap1 using for-each loop ");
		for(Integer i : hmap1.keySet())
		{
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("printing all values of hmap1 using Iterator ");
		Iterator<String> itr2=hmap1.values().iterator();
		while(itr2.hasNext())
		{
			System.out.print(itr2.next()+" ");
		}
		
		System.out.println();
		System.out.println("printing all values of hmap1 using for-each loop ");
		for(String str : hmap1.values())
		{
			System.out.print(str+" ");
		}
		
		System.out.println();
		System.out.println("removing specific key-value pair from hmap1 ");
		hmap1.remove(4,"shailoo");
		System.out.println(hmap1);
		
		System.out.println("coping all elements from hmap1 to another hash map ");
		HashMap<Integer,String> hmap2=new HashMap<Integer, String>(hmap1);
		hmap2.put(8,"shailoo");
		System.out.println(hmap2);
	}
}
