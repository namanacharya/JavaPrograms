package assignment;

public class Fibonacci
{
	public static void main(String[] args)
	{
		int a=0,b=1,c,count=10;
		System.out.println("Value of A: "+a+" B: "+b);
		
		for (int i = 2; i <=count; i++) 
		{
			c=a+b;
			System.out.print(" "+c+" ");
			a=b;
			b=c;
		}
		
	}
}
