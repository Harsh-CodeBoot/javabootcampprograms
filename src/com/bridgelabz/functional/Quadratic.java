package com.bridgelabz.functional;

import java.util.Scanner;

//import com.bridgelabz.utility.Utility;
import static java.lang.Math.*;
public class Quadratic {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
	
		double a;
		a = scan.nextDouble();
        double b;
        b = scan.nextDouble();
        double c = scan.nextDouble();
             
        double delta = b*b-4*a*c;
        double root1=0;
        double root2=0;
        
        double squareroot = Math.sqrt(delta);
       
        
        if(delta<0.0) 
        
        {
        	
        System.out.println(" No Real Roots ");
          
        }
        
        else
        {
        	
        	
        	root1 = ((-b+squareroot)/(2*a));
            root2 = ((-b-squareroot)/(2*a));
            
            System.out.println(root1);
            System.out.println(root2);
        	
        }
        
        
        
        
        
        
		
        
        
	

	}

}
