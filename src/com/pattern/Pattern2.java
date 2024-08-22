package com.pattern;
/*
 * 1
 * 12
 * 123
 * 1234
 * 12345
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

public class Pattern2 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <=5; i++)
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
