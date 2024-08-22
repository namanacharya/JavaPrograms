package com.pattern;
/*     A
 *    A B
 *   A B C
 *  A B C D  
 * A B C D E 
 */
public class Pattern15 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <=5; i++)
		{
			int c=65; //ascii value or c
			for (int k = i; k <=5; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i; j++)
			{
				System.out.print(" "+(char)c);
				c++; // if this line will be commented all A characters will be appeared as output
			}
			System.out.println("");
		}
	}
}
