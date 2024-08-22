package com.commonclass;

import java.awt.Stroke;

/*
 * Wrapper Class: Conversion of Data from Primitive to non primitive and vice a versa
 * In Type conversion two sides only primitive data type should be there
 * 
 *  DataType					Wrapper Class
 *  int							Integer
 *  float						Float
 *    
 *  Conversion types
 *  Autoboxing: Value Given to the object
 *  Boxing: Value Given to the variable to object
 *  Unboxing: Object to variable
 */
public class WrapperClass 
{
	public static void main(String[] args)
	{
		Integer i1=new Integer(10);
		System.out.println("Autoboxing is: "+i1);
		
		int i2=20;
		Integer i3=new Integer(i2);
		System.out.println("Boxing is: "+i3);
		
		int i4=i1;
		String s1="123";
		String s2="456";
		System.out.println("Two String: "+s1+s2);
		
		int i5=Integer.parseInt(s1);
		int i6=Integer.parseInt(s2);
		System.out.println("Summation is: "+(i5+i6));
		
		System.out.println("Hashcode of perticular String S1: "+s1.hashCode()); //hashcode is used to check location of perticular variable where the value is stored.
	}
}
