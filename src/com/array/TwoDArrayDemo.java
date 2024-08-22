package com.array;

import java.io.File;
import java.util.Scanner;

/*
 * 2D Array: Collection of Row and Column
 * a[row][column]
 */
public class TwoDArrayDemo 
{
	public static void main(String[] args)
	{
		int[][] a=new int[2][2];
		Scanner s=new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print("Enter value of a["+i+"]["+j+"]: ");
				a[i][j]=s.nextInt();
			}
			System.out.println("");
		}
		System.out.println("You have entered");
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println("");
		}
	}
}
