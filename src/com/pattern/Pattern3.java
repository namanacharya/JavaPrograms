package com.pattern;
/*
 * 5
 * 54
 * 543
 * 5432
 * 54321
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

public class Pattern3 {
public static void main(String[] args)
{
	for(int i=5;i>=1;i--)
	{
		for (int j = 5; j >=i; j--)
		{
			System.out.print(j);
		}
		System.out.println("");
	}
}
}
