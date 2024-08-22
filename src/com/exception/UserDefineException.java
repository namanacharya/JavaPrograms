package com.exception;

import java.util.Scanner;

/*
 * Throw: 
 * - Must use for user defined exception
 * - Must inherit exception class to make a class
 * UserDefined Exception Class:
 * - throw must followed by "new" keyword and Constructor
 * - Written inside method
 * 
 * Throws:
 * - Written at method declaration
 * - it can be use user defined as well as system exception seprated by ,
 * 
 * ex: ATM usecase
 * Withdraw:
 * - if your account have 2000 and withdraw 5000 then insufficient balance message recevied. 
 * - i want to customise the message then the condition will be like this 
 *   if you deposit 3000rs more you can withdraw 5000rs
 * 
 * Deposit:
 */
class NamanExecption extends Exception
{
	double amount;
	public NamanExecption(double amount)
	{
		this.amount=amount; //this.amount will access the first amount variable declared in class
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance+=amount; //balance will be added in amount
		//balance = balance + amount;
		System.out.println("Balance after Deposited amount is: "+balance+" rs");
	}
	public void withdraw(double amount)throws NamanExecption
	{
		if (balance>=amount)
		{
			balance-=amount; //balance- is known as short hand operator 
			//balance=balance-amount; we can write this too
			System.out.println("You have withdrawn: "+amount+" rs"+"\nRemaining balance is: "+balance+" rs");
		}
		else {
			double needs=amount-balance;
			throw new NamanExecption(needs);
			}
	}
}
public class UserDefineException 
{
	public static void main(String[] args)
	{
		double amount;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-------------------------------");
		System.out.println("Enter amount to be deposited: ");
		amount=sc.nextDouble();
		ATM atm=new ATM();
		atm.deposit(amount);
		System.out.println("-------------------------------");
		System.out.println("Enter amount to be withdraw: ");
		amount=sc.nextDouble();
		try {
			atm.withdraw(amount);
		} 
		catch (NamanExecption e) 
		{
			// TODO: handle exception
			System.out.println("--------------------------------------------------------------------");
			System.out.println("If you deposit "+e.amount+" rs more \nyou can withdraw "+amount+" rs");
		}
	} 
}