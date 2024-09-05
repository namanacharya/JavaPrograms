package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator:
 * When there is a need to display value is list instead of [] then we use Iterator.
 * Steps:
 * 1. To give all values to iterator 
 * 2. To use loop to traverse through list
 * 3. To get value from the iterator
 */
public class IteratorDemo 
{
	public static void main(String[] args)
	{
		ArrayList a1=new ArrayList();
		System.out.println("Default value is : "+a1);
		System.out.println("Default size is : "+a1.size());
		a1.add(120);
		a1.add(50.24f);
		a1.add("Naman");
		a1.add('N');
		a1.add(new Integer(4));
		
		System.out.println("The Value is: "+a1);            
		System.out.println("The size is: "+a1.size());
		
		a1.add("NamaN"); //duplicate values can be added
		System.out.println("The Value is: "+a1);
		System.out.println("The size is: "+a1.size());
		
		a1.remove(5); //value can be removed via index number
		System.out.println("The value is: "+a1);
		System.out.println("The size is: "+a1.size());
		
		a1.remove(50.24f);//value can be removed via data added witin array
		System.out.println("The value is: "+a1);
		System.out.println("The size is: "+a1.size());
		
		System.out.println("Iterator");
		Iterator i1=a1.iterator();
		System.out.println("Iterator values are:");
		while (i1.hasNext()) 
		{
			
			System.out.println(i1.next());
			
		}
	}
}
