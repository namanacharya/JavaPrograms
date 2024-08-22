package com.pattern;

/*
 * A
 * BB
 * CCC
 * DDDD
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
public class Pattern9 {
public static void main(String[] args)
{
	int l=65;
	for (int i = 0; i <=4; i++)
	{
		for (int j = 0; j <=i; j++)
		{
			System.out.print((char)l+"");
		}
		l++;
		System.out.println("");
	}
}
}
