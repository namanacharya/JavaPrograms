package com.Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap: Pair Value (one value should be unique, another value can be same)
 * - It is a dynamic array
 * - It automatically shrink and grow
 * - Default value is {}
 * - Default size is 0
 * - It has a pair<K,V> (Key,Value)
 * - All value has its own hash key
 * - All Hashkey are converted into hash code
 * - All values are displayed hashcode wise 
 * - add() and remove() methods are used
 * - Duplicate values are not allowed
 */
public class HashMapDemo 
{
	public static void main(String[] args)
	{
		HashMap h1=new HashMap();
		System.out.println("Default value is: "+h1);
		System.out.println("Default size is: "+h1.size());
		
		h1.put(1, "Naman");
		h1.put("Dhimahi", 4);
		h1.put("Dhimahi", "Acharya");
		System.out.println("Now value is: "+h1);
		System.out.println("Size is: "+h1.size());
		
		h1.put(1, "Meghna");
		System.out.println("Now value is: "+h1);
		System.out.println("Size is: "+h1.size());
		
		h1.put(234, 123);
		System.out.println("Now value is: "+h1);
		System.out.println("Size is: "+h1.size());
		
		h1.remove(234);
		System.out.println("Now value is: "+h1);
		System.out.println("Size is: "+h1.size());
		
		Set s1=h1.entrySet();
		Iterator i1=s1.iterator();
		System.out.println("---------------- Iterator ------------------");
		while (i1.hasNext()) 
		{
//			System.out.println(i1.next()); it will display all the data 
			Map.Entry me = (Map.Entry)i1.next();
			//it will seprate the value and key
			System.out.println("Key is: "+me.getKey());
			System.out.println("Value is: "+me.getValue());
		}
	}
}
