package com.bigNumberComputation;

import java.util.*;
import java.io.*;
import java.math.BigDecimal;


public class bigNumberComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String input1 = "";
		String input2 = "";
		
		  BigDecimal sum;
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter first BigNumber:");
		  
		  input1 = scan.nextLine();
		  
		  System.out.println("Enter second BigNumber:");
		  
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
		  	
	}

}
