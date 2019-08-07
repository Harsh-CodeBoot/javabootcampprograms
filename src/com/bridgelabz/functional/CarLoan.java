/****************************************************************************** 
 *  Purpose: Car Loan Calculater
 *
 *  @author  Harsh Pandey
 *  @version 1.0
 *  @since   05-08-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class CarLoan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Utility utility = new Utility();
		
		System.out.println("Enter year");
		double year;
		 year = scan.nextInt();
		 System.out.println("Enter principal");
		double principal;
		principal = scan.nextInt();
		System.out.println("Enter rate");
		
		double rate;
		rate = scan.nextInt();
		
		utility.loanchecker(year,principal,rate);
		scan.close();
	}
}
