package com.pattern;
/*
 * 12345
 * 12345
 * 12345
 * 12345
 * reverse
 */
public class Pattern13 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <=4; i++)
		{
			for (int k = 1; k <=4 ; k++)
			{
				//System.out.print("+"); //it will print + before numbers
				System.out.print("");// it will print space before numbers
			}
			for (int j = 1; j <=5; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
