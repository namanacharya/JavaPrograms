package com.commonclass;
/*
 * String Buffer: Mutable i.e can change the value
 */
public class StringBufferDemo 
{
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("This is Naman Acharya");
		//StringBuilder sb1=new StringBuilder("Hello");  It work same as StringBuffer
		
		System.out.println("Original String is: "+sb);
		System.out.println("Length of String is: "+sb.length());
		
		System.out.println("--------------------------------");
		sb.insert(0, "Hello ");
		System.out.println("Original String is: "+sb);
		System.out.println("Length of String is: "+sb.length());
		
		System.out.println("---------------------------------");
		sb.append(" Here");
		System.out.println("Original String is: "+sb);
		System.out.println("Length of String is: "+sb.length());
		
		System.out.println("-----------------------------------");
		sb.delete(0, 4);
		System.out.println("Original String is: "+sb);
		System.out.println("Length of String is: "+sb.length());
		
		System.out.println("-----------------------------------");
		sb.replace(0, 9, "Hey");
		System.out.println("Original String is: "+sb);
		System.out.println("Length of String is: "+sb.length());
	}
}
