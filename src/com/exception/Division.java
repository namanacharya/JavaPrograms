package com.exception;
/*
 * Exception: 
 * - Abnormal condition is known as Exception.
 * - Exception is a class and it is root class for all exception.
 * 
 * it it type of Error
 * Types of Error
 * - Compile time error: 
 *   syntax error (any {},; missing) that time error appear 
 * - Run time error: 
 *   error getting after run time is known as Runtime error (arithmetic exception,arrayindexoutofbound)
 * - Error:
 *   Developer mistake
 *   
 * Keywords used in exception handling:
 *  try: 
 *  - if you have a doubt that error might come in some code, keep that code inside TRY block.
 *  - it will skip the code which has error and execute the remaining code.
 *  - it will throw error to catch block and error will be handled by CATCH block.
 *  - TRY followed by CATCH block or FINALLY or both.
 *  catch: 
 *  - whenever any error thrown by TRY block it will handle the error.
 *  - There can be multiple Catch.
 *  finally:
 *  - whether error is there or not FINALLY block will be executed.
 *  throw:
 *  - 
 *  throws:
 */
public class Division 
{
	public static void main(String[] args)
	{
		int a=10,b=0; //if we divide it by 0 then we will get error, for fixing it, we will handle it using exception 
		int c;
		
		try {
			c=a/b;
			System.out.println("---------------------");
			System.out.println("   Division      ");
			System.out.println("---------------------");
			System.out.println("Value of A: ");
			System.out.println("Value of B: ");
			System.out.println("---------------------");
			System.out.println("Division of A/B : "+c); //error will be appear / by 0, it will be handled within TRY block
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
			System.out.println("Catch block executed");
			System.out.println("Developed by: Naman Acharya");
			System.out.println("-----------------------------");
			System.out.println("TRY block Error is printing using print strack trace method");
			e.printStackTrace(); //it will be used for print the errors which are in TRY block
			System.out.println("------------------------------");
		}
		finally {
			System.out.println("If try and catch block will not executed FINALLY block will be executed for SURE");
		}
	}
}