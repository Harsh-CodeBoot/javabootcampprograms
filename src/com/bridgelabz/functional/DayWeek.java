package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class DayWeek {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     Utility utility = new Utility();
	     System.out.println("enter the month");
	     int month;
	     month = scan.nextInt();
	     System.out.println("enter the year");
	     int year;
	     year = scan.nextInt();
	     
	     int day;
	     System.out.println("enter the day");
	     day = scan.nextInt();
	     utility.dayweekchecker(month,year,day);

	}

}
