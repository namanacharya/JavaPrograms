package com.FileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * What is file:
 * - It is a class
 * - It is used to store the data permanently 
 * - We use stream to store data, stream is a medium to store data
 * 
 * We can implement it in 2 ways
 * 1. Byte Stream (1 byte)
 * - It is used generally it contain 1 byte per character
 * - FileOutputStream class has been used to WRITE in File
 * - FileInputStream class has been used to READ in File
 * 
 * 2. Character Stream (2 byte)
 * - FileWriter class has been used to WRITE in File
 * - FileReader class has been used to READ in File
 * 
 * Steps to implement
 * 1. To OPEN/CREATE a file into JAVA class
 * 2. To WRITE/READ INTO/FROM the file
 * 3. Close file
 * 
 * Must Error will be appear during FILE I/O
 * - File not found
 * - IO Exception
 */
public class ByteStreamDemo 
{
	public static void main(String[] args) throws IOException
	{
		//to open or create a file into java class
		FileOutputStream fo= new FileOutputStream("file1.text",true); //by adding true at last, we are able to append new string in to previous string
		String s="\nI am from surat";
		byte[] b=s.getBytes(); //it will convert string into byte, because data will be stored in byte
		fo.write(b);
		fo.flush(); //it will remove the data from file
		fo.close();
		System.out.println("Data Written"); //by writing this we can get idea that data has been written in file
		
		//It is used for reading the data from the file
		 FileInputStream fi=new FileInputStream("file1.text"); 
		 int n;
		 while ((n=fi.read())!=-1)
		 {
			System.out.print((char)n);
		}
		fi.close();
	}
}
