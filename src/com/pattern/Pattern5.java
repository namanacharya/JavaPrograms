package com.pattern;
/*
 *  1
 *  21
 *  321
 *  4321
 *  54321
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
 */
public class Pattern5 {
	public static void main(String[] args)
	{
		for (int i = 1; i<=5 ; i++)
		{
			for (int j = i; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
