package com.oops;

import java.util.Scanner;

/*
 * Scanner: 
 * it is a class derived from java.util package
 * main purpose is to take input from the user
 * it has argument as system.in
 * 
 * data type		in-built function
 * Primitive Datatype
 * int 				nextInt()
 * float			nextFloat()
 * double			nextDouble()
 * char				next().charAt(0)
 * 
 * Non Primitive Datatype
 * String			
 * word				next() read untill space is pressed
 * line				nextLine() read untill enter is pressed
 */
public class ScannerDemo 
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner s=new Scanner(System.in); //for scanning integer values
		Scanner s1=new Scanner(System.in); //for scanning string values
		System.out.println("Calculate Values of A+B");
		System.out.println("Enter a:");
		a=s.nextInt();
		System.out.println("Enter b:");
		b=s.nextInt();
		
		System.out.println("Sum is: "+(a+b));
		String n;
		//s.nextLine(); // buffer clean prevent to print garbage values, if use this we don't need to create another object
		System.out.println("Print name");
		System.out.println("Enter your name: ");
		n=s1.nextLine();
		System.out.println("Name is : "+n);
	}
}
