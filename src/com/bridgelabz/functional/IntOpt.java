
/****************************************************************************** 
 *  Purpose: Integers operations
 *
 *  @author  Harsh Pandey
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class IntOpt {
	
	
	public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		Utility utility = new Utility();
		
		int firstnum ;
		int secondnum ;
		int thirdnum ;
		
		System.out.println("enter the first number");
		firstnum = obj.nextInt();
		System.out.println("enter the second number");
		secondnum = obj.nextInt();
		System.out.println("enter the third number");
		thirdnum = obj.nextInt();
		 
		utility.operations(firstnum, secondnum, thirdnum);
		

     obj.close();       
	
	}
}
