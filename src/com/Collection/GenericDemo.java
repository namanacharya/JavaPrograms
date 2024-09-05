package com.Collection;

import java.util.ArrayList;

/*
 * Generic: To generalised the collection into a specific type. Inbuilt / userdefined class
 * ex: Arraylist<Integer> : we can generalised arraylist with int, it will take only integer values
 * 
 */
public class GenericDemo 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(new Integer(60));
		a1.add((int)'N'); //it will take ascii value of N character
		System.out.println("Now the Value is: "+a1);
		System.out.println("Now the Size is: "+a1.size());
	}
}
