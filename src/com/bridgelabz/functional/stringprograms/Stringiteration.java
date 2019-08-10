package com.bridgelabz.functional.stringprograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Stringiteration {

	public static void main(String[] args) {
	
		String str ;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		str = scan.nextLine();
		Utility utility = new Utility();
		utility.iterationpermutation(str);
		
		
		

	}

}
