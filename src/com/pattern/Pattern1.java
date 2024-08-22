package com.pattern;
/* for pattern first check how many rows and how many columns and rows are there then write code
 * 12345
 * 12345
 * 12345
 * 12345
 */
public class Pattern1 
{
	public static void main(String[] args)
	{
		for (int i = 1; i<=4; i++) //this loop is used for row
		{
			for (int j = 1; j<=5; j++)//this loop is used for column
			{
//we want to print numbers in same line so we have to write only print not println
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
