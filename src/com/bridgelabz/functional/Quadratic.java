package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		//Utility utility = new Utility();
		double input1;
		input1 = scan.nextDouble();
        double input2;
        input2 = scan.nextDouble();
        double input3 = scan.nextDouble();
             
        double delta = input2*input2-4*input1*input3;
        double root1=0;
        double root2=0;
        double squareroot = Math.sqrt(delta);
        
        root1 = (-input2+squareroot)/(2*input1);
        root2 = (-input2-squareroot)/(2*input1);
        
        System.out.println(root1);
        System.out.println(root2);
        
        
        
        
        
        
        
        
		
        //utility.quadraticoperations(input1,input2,input3)
        
		scan.close();

	}

}
