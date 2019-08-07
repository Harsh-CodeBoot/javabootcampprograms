package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Trig {

	public static void main(String[] args) {
	
		Utility utility = new Utility();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the angle");
		double degrees = scan.nextDouble();
		
        double radians = Math.toRadians(degrees);

        utility.trig(radians,degrees);
	}

}
