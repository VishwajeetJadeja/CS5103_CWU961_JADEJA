package com.bigNumberComputation;

import java.util.*;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;


public class bigNumberComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String input1 = "";
		String input2 = "";
		String input3 = "";
		String input4 = "";
		
		  BigDecimal sum;
		  
		  //BigInteger for multiplication
		  BigInteger mult;
	 
		  
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter first BigNumber for addition:");
		  
		  input1 = scan.nextLine();
		  
		  System.out.println("Enter second BigNumber for addition:");
		  
		  input2 = scan.nextLine();
		  
	     /*
	      input1 = "5.45456468445645468464645";
	      input2 = "4.256456484464684864864";
	  	*/
	       
		  
		  if(input1!="" && input2!="") {
			  
			 // Converting the string input to BigDecimal  
			  BigDecimal a
	            = new BigDecimal(input1);
	        BigDecimal b
	            = new BigDecimal(input2);
	  
	        sum = a.add(b);
	  
	        // Display the result in BigDecimal
	        System.out.println("The sum of\n"
	                           + a + " \nand\n" + b + " "
	                           + "\nis\n" + sum + "\n");  
		  } else {
			  
			  System.out.println("Invalid input");
			  
		  }
		  
		  System.out.println("Enter first BigNumber for multiplication:");
		  
		  input3 = scan.nextLine();
		  
		  System.out.println("Enter second BigNumber for multiplication");
		  
		  input4 = scan.nextLine();
		  
		  
		 /*
		  input3 = 123456789;
		  input4 = 987654321;
		  
		  */
		  
		  
		  if(input3!="" && input4!="") {
			  
			  BigInteger c = new BigInteger(input3);	  
			  BigInteger d = new BigInteger(input4);
			  
			mult = c.multiply(d);
			
		  System.out.println("The product of\n"
                  + c + "x" + d + " "
                  + "is " + mult + "\n");
		  
		  } else {
			  
			  System.out.println("Invalid input");
			  }
		  	
	}

}
