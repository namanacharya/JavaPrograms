package com.array;
import java.util.Scanner;

import com.basic.interchangenumber;

/*
 * Jagged Array/ multidimensional array : same like 2D array
 * where row is Fixed, but number of column may Differ. / changed
 * used in QA mostly
 * 
 * 123
 * 12
 * 12345
 */
public class JaggedArray 
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			int row;
			System.out.println("Enter number of Rows: ");
			row=sc.nextInt();
			
			int[][] a=new int[row][];
			
			//no of column in each row
			for (int i = 0; i < a.length; i++) 
			{
				System.out.println("Enter number of column in row number: "+i);
				int col=sc.nextInt();
				a[i]=new int[col];
			}
			
			for (int i = 0; i < a.length; i++)
			{
				for (int j = 0; j < a[i].length; j++)
				{
					System.out.println("Enter value of a["+i+"]["+j+"]:");
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("--------Entered Values are --------");
			for (int i = 0; i < a.length; i++)
			{
				for (int j = 0; j < a[i].length; j++)
				{
					System.out.print(" "+a[i][j]);
				}
				System.out.println();
			}
		}
	
}
