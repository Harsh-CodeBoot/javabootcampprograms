package com.bridgelabz.functional.stringprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringRecursion {

	public static void main(String[] args) {
		
		 String str1 ;
		 System.out.println("enter the string: ");
		 Scanner scan = new Scanner(System.in);
		 str1 = scan.nextLine();
		
		
		
		Utility.printpermutation(str1," ");
		
		scan.close();

	}

}
