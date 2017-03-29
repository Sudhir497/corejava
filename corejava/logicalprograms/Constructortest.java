package logicalprograms;

import java.util.Scanner;

public class Constructortest {  
	
	   private double balance; 
	   
	   public Constructortest ( double initialBalance )
	   {
	      
	      if ( initialBalance > 0.0 ) 
	         balance = initialBalance; 
	   } 
	   public void credit( double amount )
	   {      
	      balance = balance + amount; 
	   } 
	   public double getBalance()
	   {
	      return balance; 
	   } 

	public static void main(String[] args) {
		
		Constructortest  account1 = new Constructortest(25.00 ); 
		Constructortest account2 = new Constructortest( -10.53 ); 

	      System.out.printf( "account1 balance: $%.2f\n", 
	         account1.getBalance() );
	      System.out.printf( "account2 balance: $%.2f\n\n", 
	         account2.getBalance() );
	     
	      Scanner input = new Scanner( System.in );
	      double depositAmount; 

	      System.out.print( "Enter deposit amount for account1: " ); 
	      depositAmount = input.nextDouble(); 
	      System.out.printf( "\n adding %.2f to account1 balance\n\n", 
	         depositAmount );
	      account1.credit( depositAmount ); 
	      System.out.printf( "account1 balance: $%.2f\n", 
	         account1.getBalance() );
	      System.out.printf( "account2 balance: $%.2f\n\n", 
	         account2.getBalance() );

	      System.out.print( "Enter deposit amount for account2: " ); 
	      depositAmount = input.nextDouble(); 
	      System.out.printf( "\n adding %.2f to account2 balance\n\n", 
	         depositAmount );
	      account2.credit( depositAmount ); 

	      System.out.printf( "account1 balance: $%.2f\n", 
	         account1.getBalance() );
	      System.out.printf( "account2 balance: $%.2f\n", 
	         account2.getBalance() );
	   } 
		

	}


