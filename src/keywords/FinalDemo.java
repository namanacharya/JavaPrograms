package keywords;
/*
 * Final: Constant at value side
 * Mostly it can be used with Variables
 * 1. Value must be define at the time of declaration
 * 2. Value can not be changed at runtime as well as compile time
 * 
 * It can be Used with method
 * It is opposite of abstract method
 * It can be used with class
 * It is opposite of abstract class 
 */
class FDemo
{
	final int r_no=1; //we can't change the value via method 
	String name;
	
	public void setData()
	{
		name="Naman";
	}
	public void show() 
	{
		System.out.println("Roll no  : "+r_no);
		System.out.println("Name     : "+name);
	}
}
public class FinalDemo 
{
	public static void main(String[] args)
	{
		FDemo fD=new FDemo();
		fD.setData();
		fD.show();
	}
}
