package com.oops;

/* Encapsulation: Wrapping of Data
 * Access Specifier
 * 1. Private: Only accessible within class
 * 2. Protected: only accessible to child 
 * 3. Default: accessible within package, it is by default for all class
 * 4. Public: accessible anywhere
*/
class Detail
{ //class created
	//error appear in roll_number because we didn't user roll_number anywhere.
    private	int roll_number; //we can access roll_number onlywithin StudentDetails Class, if we want to access it in other class we can't
	protected String name;
	
	public void setData() //function created 
	{
		roll_number=1;
		name="Naman";
	}
	/*public void showData()//function created 
	{
		System.out.println("Student Details");
		System.out.println("---------------------");
		System.out.println("Roll number  : "+roll_number);
		System.out.println("Student Name : "+name);
	}*/
}
class child extends Detail
{
	public void show()
	{
		System.out.println("number:");
		System.out.println("Name is: "+name);
	}
}

public class Encapsulation 
{
	public static void main(String[] args) {
	//	StudentDetails sd=new StudentDetails(); //created object for class
		//sd.setData(); //calling the class method
		//sd.showData();
		//if we try to call the rollnumber data using sd.roll_number we can't because it is defined as private

		child c=new child();
		c.setData();
		c.show();
	}
}
