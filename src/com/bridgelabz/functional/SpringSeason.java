package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class SpringSeason {
	
	public static void main(String args[])
	{
	  Scanner scan = new Scanner(System.in);
	  Utility utility = new Utility();
	  System.out.println("Enter the month:");
      int month = scan.nextInt();
      System.out.println("Enter the day");
      int day = scan.nextInt();
      utility.spring(month,day);
      
    scan.close();
}
	
}
