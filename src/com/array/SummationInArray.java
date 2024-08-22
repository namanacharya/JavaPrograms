package com.array;

import java.io.File;
import java.util.Scanner;

public class SummationInArray 
{
	public static void main(String[] args)
	{
		int[][] a=new int[2][2];
		int[][] b=new int[2][2];
		int[][] c=new int[2][2];
		Scanner s=new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print("Enter Value of a["+i+"]["+j+"]:");
				a[i][j]=s.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < b.length; i++) 
		{
			for (int j = 0; j < b[i].length; j++)
			{
				System.out.print("Enter Value of b["+i+"]["+j+"]:");
				b[i][j]=s.nextInt();
			}
		}
		System.out.println();
		System.out.println("Summation of two array");
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[i].length; j++)
			{
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(" "+c[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
