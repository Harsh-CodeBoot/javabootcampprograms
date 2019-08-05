package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrintInitials {
	
	
	public static void main(String args[])
	{
		    char pattern ;
		    Scanner scanner = new Scanner(System.in);
		    Utility utility = new Utility();
		    System.out.println("enter the character you want to print");
		    pattern = scanner.next().charAt(0);
		    utility.patternprint(pattern);
		    
	
	
	
	scanner.close();
	
	
	
	
	}
	    }
	
		
		
		
		
	


