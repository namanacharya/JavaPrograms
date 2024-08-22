package com.pattern;
/*
 *     1 
 *    1 2
 *   1 2 3
 *  1 2 3 4
 * 1 2 3 4 5
 * 
 * first loop
 * for i:                           | condition                    |increment/decrement
 * initialisation:                  | last no of pattern           |smaller to bigger number: ++,<=
 * first no of pattern                                             |bigger to smaller number: --,>=
 *  
 * second loop
 * for j:							|condition							|increment/decrement
 * initialisation:					|last column of each row			|check in each row
 * first column of each row			|same number: that number only		|smaller to bigger number: ++,<=
 * same no: that number only		|different number: upper loop name	|bigger to smaller number: --.>=
 * different no: upper loop name
 * 
 * third loop: 
 * for k:
 * k completely depends on i, i.e same condition of i will be appeared in k
 */
public class Pattern14
{
	public static void main(String[] args)
	{
		for (int i = 1; i <=5; i++)
		{
			for (int k = i; k <=5; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <=i ; j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
