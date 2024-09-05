package com.Collection;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;

/*
 * Collection: To collect Primitive and Non Primitive Data into a Single Object 
 * It contain several class and interface
 * 
 * Class:
 * ArrayList:
 * 	- It is a dynamic array
 *  - It automatically shrink and grow
 *  - Default value is []
 *  - Default size is 0
 *  - The sequence at which the value is stored in same sequence it will display the same value
 *  - add() method has been used for add, remove() method has been used for remove
 *  - Duplicate values are allowed
 * HashSet:
 * HashMap:
 * Vector:
 * Generic:
 * 
 * Interface:
 * List:
 * Set:
 * Map:
 * Iterator:
 * Enumeration:
 * 
 */
public class ArrayListDemo 
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
	}
}
