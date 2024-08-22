package com.commonclass;
/*types of common classes
 * String: immutable type, i.e it can not change the value.
 * StringBuffer: mutable, i.e value change 
 * Wrapper
 * Object
 */

public class StringDemo 
{
	public static void main(String[] args)
	{
		String s="Hello Naman Acharya here";
		
		System.out.println("Original String is  : "+s);
		System.out.println("Length of String is : "+s.length());
		System.out.println("----------------------------------");
		System.out.println("To upper case : "+s.toUpperCase());
		System.out.println("To lower case : "+s.toLowerCase());
		System.out.println("----------------------------------");
		System.out.println("Substring is : "+s.substring(0));
		System.out.println("Substring is between : "+s.substring(0, 8)); //last value will end -1, start from 0
		System.out.println("----------------------------------");
		System.out.println("Char at: "+s.charAt(0));
		
		System.out.println("Current string is ");
		System.out.println(s);
		if (s.equalsIgnoreCase("hello Naman Acharya here")) 
			//s.equal will compare string with case sensitive
			//s.equalsIgnoreCase will ignore case within string
		{
			System.out.println("String is matching");
		}
		else 
		{
			System.out.println("String is not matching");
		}
		System.out.println("-----------------------------");
		System.out.println("Actual String: "+s);
		System.out.println("Length of String: "+s.length());
	}
}
