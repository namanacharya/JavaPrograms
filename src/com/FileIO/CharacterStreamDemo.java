package com.FileIO;

import java.io.FileReader;
import java.io.FileWriter;

/*
 * Character Stream (2 byte)
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
public class CharacterStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		FileWriter fr=new FileWriter("File2.txt",true);
		String msg="\n This is Naman Acharya, learning Java";
		fr.write(msg);
		fr.flush();
		fr.close();
		System.out.println("Data Written");
		
		//read the file 
		FileReader fread=new FileReader("File2.txt");
		int a;
		while ((a=fread.read())!=-1)
		{
			System.out.print((char)a);
		}
		fread.close();
	}
}
