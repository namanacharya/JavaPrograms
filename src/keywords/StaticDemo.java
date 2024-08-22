package keywords;

/*
 * Static: Constant at memory side.
 * It can be used with Variable and Method
 * Variable: 
 * 1. Opposite of Final keyword
 *  Value must not be define at the time of declaration
 *  Value can be changed at runtime as well as compile time
 *  
 *  Method:
 *  1. Static method is called when class is called
 *  2. Static method can have only static variable
 *  3. Before static was called by class name only but right now we can call with object
 *  4. All variable inside static method are static by default
 * 
 */
class SDemo
{
	int no;
	static int s_no;
	
	public static void show() 
	{
		s_no=15;
		System.out.println("Static S_No value is: "+s_no);
		int r_no=85;
		System.out.println("Roll No is: "+r_no);
	}
}
public class StaticDemo 
{
	public static void main(String[] args)
	{
		SDemo s1=new SDemo();
		SDemo s2=new SDemo();
		SDemo s3=new SDemo();
		
		s1.no=10;
		s2.no=20;
		s3.no=30;
		System.out.println("-------------");
		System.out.println("No1 : "+s1.no);
		System.out.println("No2 : "+s2.no);
		System.out.println("No3 : "+s3.no);
		
		System.out.println("-----------------");
		SDemo.show();
		System.out.println("-----------------");

		SDemo.s_no=1;
		SDemo.s_no=2;
		SDemo.s_no=3;
		System.out.println("S_no is : "+SDemo.s_no);
		System.out.println("S_no is : "+SDemo.s_no);
		System.out.println("S_no is : "+SDemo.s_no);
		
	}
}
