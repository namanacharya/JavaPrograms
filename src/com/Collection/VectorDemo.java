package com.Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector: 
 * - It is a dynamic array
 * - It automatically shrink and grow
 * - Default value is []
 * - Default size is 0
 * - Default capacity is 10
 * - The sequence at which the value is stored the same sequence will it will display the value
 * - add() and remove() method is used
 * - duplicate values are allowed
 * 
 *  Enumeration: 
 *  Only used with Vector, When there is a need to display value in list, instead of[] then we use Enumeration.
 *  Steps:
 *  1. To give all values to the Enumeration
 *  2. To use loop to traverse through list
 *  3. To get value from the enumeration
 */
public class VectorDemo 
{
	public static void main(String[] args)
	{
		Vector v1=new Vector();
		System.out.println("Default Value is: "+v1);
		System.out.println("Default Size is: "+v1.size());
		System.out.println("Default Capacity is: "+v1.capacity());
		
		v1.add(120);
		v1.add(23.05f);
		v1.add("Naman");
		v1.add("Naman");
		v1.add(23.05f);
		v1.add("Naman");
		v1.add(23.05f);

		System.out.println("Now Value is: "+v1);
		System.out.println("Now Size is: "+v1.size());
		System.out.println("Now Capacity is: "+v1.capacity());
		
		v1.remove(5);
		System.out.println("Now Value is: "+v1);
		System.out.println("Now Size is: "+v1.size());
		System.out.println("Now Capacity is: "+v1.capacity());
		
		Iterator i1=v1.iterator();
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		Enumeration e1=v1.elements();
		while (e1.hasMoreElements()) 
		{
			System.out.println(e1.nextElement());
		}
	}
}