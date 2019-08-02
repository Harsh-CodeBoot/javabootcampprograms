package com.bridgelabz.functional;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
        int head=0;
        int tail=0;		
        int counter=1;
        double randomnum = 0.0;
		int flips;
		System.out.println(" Numbers of time coin to be flipped :- ");
		Scanner scanner = new Scanner(System.in);
		flips = scanner.nextInt();
		
		  while (counter <= flips)
		  {
			  randomnum = Math.random();
			  System.out.println( counter +"\t"+ randomnum);
		  
		   if(randomnum < 0.5 )
		   {
		     head++;
		     System.out.println("\t head");
		     }
		   else
		   {
			  tail++;
			  System.out.println("\t tail");
			   }
		   counter++;
	
		   
		   System.out.println("Numbers of head: "+head);
		   System.out.println("Numbers of tail: "+tail);
	}
	
	scanner.close();
}
}
