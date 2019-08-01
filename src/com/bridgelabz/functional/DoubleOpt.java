/****************************************************************************** 
 *  Purpose: Double operations
 *
 *  @author  Harsh Pandey
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;


import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class DoubleOpt {

	/**
	 * @param args
	 */
	public static void main(String args[])
	
	{
		Scanner obj = new Scanner(System.in);
	   Utility utility = new Utility();
	   double a ;
	   double b ;
	   double c ;

		System.out.println("enter the first number");
		 a = obj.nextDouble();
		System.out.println("enter the second number");
		 b = obj.nextDouble();
		System.out.println("enter the third number");
		  c = obj.nextDouble();
		  
		  
		  utility.doubleoperations( a, b, c);
	  
	  
	obj.close(); 
	   
	   
	
	}
	
	
	
}



