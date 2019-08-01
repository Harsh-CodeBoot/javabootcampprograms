/****************************************************************************** 
 *  Purpose: Checks Leap Year
 *
 *  @author  Harsh Pandey
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class LeapYear {
	
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		Utility utility = new Utility();
		int year;
		System.out.println("ENTER THE YEAR: ");
		year = scan.nextInt();
		utility.Leapyearchecker(year);
		
		
	
			
		  scan.close();
	}
	
  
}
