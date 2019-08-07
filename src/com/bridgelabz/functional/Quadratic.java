package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

//import com.bridgelabz.utility.Utility;
import static java.lang.Math.*;
public class Quadratic {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	    Utility utility = new Utility();
		double num1;
		num1 = scan.nextDouble();
        double num2;
        num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
             
       utility.quadraticchecker(num1,num2,num3);
        
        
        scan.close();
        
		
        
        
	

	}

}
