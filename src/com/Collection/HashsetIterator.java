package com.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetIterator
{
	public static void main(String[] args)
	{
		HashSet h1=new HashSet();
		
		System.out.println("Default Value: "+h1);
		System.out.println("Default Size: "+h1.size());
		
		h1.add(200);
		h1.add(50.25f);
		h1.add("Naman");
		h1.add('N');
		h1.add(new Integer(220));
		
		System.out.println("Now value is: "+h1);
		System.out.println("Now size is: "+h1.size());
		
		h1.add("Naman"); //it will not add duplicate value
		System.out.println("Now value is: "+h1);
		System.out.println("Now size is: "+h1.size());
		
		h1.remove(200);
		System.out.println("Now value is: "+h1);
		System.out.println("Now size is: "+h1.size());
		
		System.out.println("Hash Code of H1 is: "+h1.hashCode()); //to see the hashcode value of object
		
		Iterator i2=h1.iterator();
		System.out.println("Iterator Value");
		while (i2.hasNext()) 
		{
			System.out.println(i2.next());
			
		}
	}
}
