package com.oops;


/*
 * Inheritance: Deriving a attribute of some other class. Making a class from existing class
 * Types of Inheritance
 * 1. Single Inheritance : One parent one child
 * 2. Multilevel Inheritance : One grand parent, one parent, one child
 * 3. Hierarchichal Inheritance : One parent multiple child
 * 4. Multiple Inheritance : Multiple parent one child
 * 5. Hyrid Inheritance : Combination of any 2 tyoes
 * 
 *  Object will be created for last child class only
 *  Less object creation
 *  use "extends" keyword to inherit property of parent class
 */
//Single inheritance
class Student
{
	int roll_no;
	String name;
	public void setData() 
	{
		roll_no=1; //set roll_no using = and give the number, data can be fetched from here
		name="Naman"; //set name using = and give the name, data can be fetched from here
	}
}
class StudentMarks extends Student //SINGLE INHERITANCE by adding extends Student (Class name we can access the data of Student class) 
{
	int marks=60; //set marks using = and give the number, data can be fetched from here
//	public void showData()
//	{
//		System.out.println("Marks of Students");
//		System.out.println("------------------");
//		System.out.println("Roll Number : "+roll_no); //access rollno data from Student class
//		System.out.println("Name        : "+name); //access name data from Student class
//		System.out.println("Marks       : "+marks); //access marks from existing class
//	}
}
class Grade extends StudentMarks//MULTILEVEL INHERITANCE
{
	String gradeString="B+";
	public void showData()
	{
		System.out.println("Marks of Students");
		System.out.println("------------------");
		System.out.println("Roll Number : "+roll_no); //access rollno data from Student class
		System.out.println("Name        : "+name); //access name data from Student class
		System.out.println("Marks       : "+marks); //access marks from StudentMarks class
		System.out.println("Grades      : "+gradeString); //access marks from existing class
	}
}

public class Inheritance {
public static void main(String[] args) 
{
//	StudentMarks sm=new StudentMarks(); //single inheritance object creation will be from the last class
//	sm.setData();
//	sm.showData();
	
	Grade sg=new Grade();//in multilevel inheritance we have to create object of last class so in this last class in grade
	sg.setData();
	sg.showData();
}
}
