package assignment;
//find the greatest number among given number

public class greatestNumber {
public static void main(String[] args)
{
	int a=10,b=20,c=30;
	System.out.println("Find the Gratest numbers among A:"+a+ " B: "+b+" C: "+c);
	System.out.println("--------------------------------------------------");
	if (a>b && a>c)
	{
		System.out.println("A "+a+" is greatest");
	}
	else if (b>a && b>c)
	{
		System.out.println("B "+b+" is greatest");
	}
	else {
		System.out.println("C "+c+" is greatest");
	}
}
}
