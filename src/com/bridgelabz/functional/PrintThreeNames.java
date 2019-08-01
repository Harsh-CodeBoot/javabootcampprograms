/****************************************************************************** 
 *  Purpose: Reverse Three Name String
 *
 *  @author  Harsh Pandey
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/


package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrintThreeNames
{


     
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        
        Utility utility = new Utility();
        System.out.println("Enter The three names :");
         
        String input = sc.nextLine();
        
         
         utility.reverse(input);
        
         sc.close();
    }
}



		
		
		
		
		
	   