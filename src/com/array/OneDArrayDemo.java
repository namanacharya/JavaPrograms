package com.array;

import java.util.Scanner;

/*
 * array: Collection of Data of Similar type
 * Types of Array:
 * - 1D Array: Always start with index 0, size -1
 * 		if size is grater than assigned size it gives an error ArrayIndexOutOfBoundsException
 * 
 * - 2D Array:
 * 
 * - Jagged Array [Multidimentional Array]:
 */
public class OneDArrayDemo 
{
	public static void main(String[] args)
	{
		//array declaration
		int[] a; //1D Array 
		
		//array initialization
		int[] b=new int[5]; //size of array can be defined
		
		//direct value provide to the array
		int[] c= {1,2,3,4,5}; //we can directly define values in array in this pattern
		
		Scanner sc=new Scanner(System.in);
		//b[] array values will be print in this manner.
		for (int i = 0; i < b.length; i++)
		{
			System.out.println("Enter Value of: ");
			b[i]=sc.nextInt();
		}
		System.out.println("Entered Value Within B Array is");
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(+b[i]+" ");
		}
		System.out.println("");
		
		//c[] array value will be print in this manner.
		System.out.println("Value of C Array is");
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(+c[i]+" ");
		}
	}
}
