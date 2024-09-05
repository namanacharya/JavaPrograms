package assignment;

//check given number is armstrong or not
public class ArmstrongNumber 
{
	public static void main(String[] args)
	{
		int n=153,sum=0,temp=n;
		System.out.println("The Givn number is: "+n);
		while (temp!=0)
		{
			int d=temp%10;
			sum+=Math.pow(d, 3);
			temp/=10;
		}
		System.out.println("The Number "+n+" is Armstrong Number");
	}
}
