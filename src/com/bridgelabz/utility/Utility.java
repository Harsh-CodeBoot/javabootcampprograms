/****************************************************************************** 
 *  Purpose: It is a utility class where the logics of all other programs
 *           are written. This is done so that most of the code can be reused.
 *
 *  @author  Harsh Pandey
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

import java.util.Random;
import java.util.Scanner;

public class Utility {
	
	
	  
		  
	  

	/**
	 * 
	 * Purpose: This method is used to do following Integer operations a+b*c,a*b+c,c+a/b,a%b+c
	 * @param firstnum
	 * @param secondnum
	 * @param thirdnum
	 *  @return result:The output of the following operations.
	 */
	public void operations(int firstnum, int secondnum, int thirdnum) 
	{
	int result1 = firstnum+(secondnum*thirdnum);
	int result2 = (firstnum*secondnum)+thirdnum;
	int result3 = thirdnum+(firstnum/secondnum);
	int result4 = (firstnum%secondnum)+thirdnum;
	
	System.out.println("the operation - a+b*c= "+result1);
	System.out.println("the operation - a*b+c= "+result2);
	System.out.println("the operation - c+a/b= "+result3);
	System.out.println("the operation - a%b+c= "+result4);
	
	
	}

	/**
	 * Purpose: This method is used to do following Double operations a+b*c,a*b+c,c+a/b,a%b+c
	 * @param a
	 * @param b
	 * @param c
	 * @return result:The output of the following operations.
	 */
	public void doubleoperations(double a, double b, double c) 
	{
		double result1 = a+(b*c);
		double result2 = (a*b)+c;
		double result3 = c+(a/b);
		double result4 = (a%b)+c;
		

		System.out.println("the operation - a+b*c= "+result1);
		System.out.println("the operation - a*b+c= "+result2);
		System.out.println("the operation - c+a/b= "+result3);
		System.out.println("the operation - a%b+c= "+result4);
		
	}

	/**Purpose: This method take three names as Input and Prints out a proper sentence with the names in the reverse of the order.
	 * @param input
	 *  @return result:The output  is the input in reverse order  with include "Hii".
	 */
	public void reverse(String input) {
		
		 String[] words = input.split("\\s");
         
	        String output = "";
	         
	        for (int i = words.length-1; i >= 0; i--)
	        {
	            output = output + words[i] + " ";
	        }
	        
	        System.out.println("Input String : "+input);
	         
	        System.out.println("Output String : "+"Hii"+" "+output);
	         
	}

	/**
	 * Purpose:This method checks the INPUT Year is Leap Year >=1582 or Not
	 * @param year
	 * @return 
	 * @return  result:The Desired output the year is a Leap Year or not.
	 */
	public  void Leapyearchecker(int year) {
		
		if(year>=1582) //checks year is more than year 1582//

			 if(((year%400 == 0)&& (year%100!=0))||(year%4==0)) //checks year by modulus 400==0 //by 100!=0//by 4==0
			 
				System.out.println(+year+" year is a Leap Year");
			 
			else
			{
			
				System.out.println(+year+" Year is not a Leap Year");
			
			}			
		    else 

		    {
				System.out.println("year is Invaild");
				
		    }
		
		
	}

	/**
	 * Purpose:To check Spring Season
	 * @param month
	 * @param day
	 * @return The season is spring or not.
	 */
	public void spring(int month, int day) {
		
		if((month == 3)||(month == 4)||(month == 5)||(month == 6)&&(day<=31)||(day>=1))
		{
			
		  System.out.println(" the Season is Spring Season");
			
	
		}
		else
			
		{ 
			System.out.println("INVAILD SEASON");
		}
		
		
	}

	public int sumofdice() {
		int sum = 0;
		Random r = new Random();
		for(int i =1; i<=2;i++)
		{
			sum = sum + r.nextInt(6);
		}
		
		
		System.out.println("Sum of two random number on dice  "+sum);
		return sum;
		
	}

	
	/**
	 * Purpose: To check prime number between one index to last index
	 * @param start index
	 * @param end index
	 * @return The prime numbers between the range.
	 */
	public void primechecker() {
		
	     int startindex,endindex;
	     Scanner scanner = new Scanner(System.in);
			System.out.println("enter the start value:");
			startindex = scanner.nextInt();
			System.out.println("enter the last value");
			endindex = scanner.nextInt();
	     
         int i,count,number;
		
		for(number=startindex;number<=endindex;number++)
		{
			count = 0;
			
			for(i=2;i<=number/2;i++){
	             if(number%i==0){
	                 count++;
	                 break;
	             }
	             
			}
			if(count==0 && number!= 1)
	             
	            	 System.out.println(number);
	             
			scanner.close();
		
		
	}

	

	//public void error(int hello, int world)
	//{
		
      // void hello() 
		
	//}

	/**
	 * 
	 * Purpose: To Find the Roots of the Equation a*x*x + b*x + c.
	 * @param input1
	 * @param input2
	 * @param input3
	 */
	//public void quadraticoperations(double input1, double input2, double input3) {
		
		//double delta = input2*input2-4*input1*input3;
		
		
		
		
	}

	/**
	 * purpose: To check Harmonic number.
	 * @param input from the user
	 *
	 * @return  sum of the series.
	 */
	public void harmonic() 
		{

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the nth number: ");
		int input = scanner.nextInt();
		
		double sum = 0.0;
		for (int i = 1; i <= input; i++) {
            sum += 1.0 / i;
        }

        
        System.out.println(sum);
		
		
		}

	/**
	 * purpose: To check  random numbers generated by dice
	 * @param side 
	 * @return  the random number generated by dice.
	 */
	
	public void Rolldice() {
	 
		int side;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Roll the dice : ");
		side = scanner.nextInt();
		int roll = (int)(Math.random()*side)+1;
		System.out.println("The Desired output is :"+roll);
		
      		
		scanner.close();
		
		
		
		
	}

	/**
	 * 
	 */
	public void RepeatingNumbers() {
	
		int i,j;
		int k = 0;
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the elements: ");
		num = scanner.nextInt();
		int arr[]= new int[10];
		arr[k]=scanner.nextInt();
	
		for(i =0;i<arr.length;i++)
		{
			
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					System.out.println(arr[j]+"  ");
				
				
			}
		
		}
		scanner.close();
		
	}

	public void Windchillfunc()
	{    
		Scanner scan = new Scanner(System.in);
		double temp; 
		System.out.println("ENTER THE TEMPERATURE");
		temp = scan.nextDouble();
        double speed ;
        System.out.println("ENTER THE SPEED");
        speed = scan.nextDouble();
        double windchill = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(speed, 0.16);
        
        System.out.println(" THE WIND CHILL IS  " + windchill);		
		
	}

	public void Tempconvert() {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input the temperature");
		float temperature;
		temperature = scan.nextFloat();
		
		
		
		      float fahrenhit;
               fahrenhit = (temperature*9/5)+32 ;
		  
	  System.out.println("the temperature in fahrenhit  "+fahrenhit);
	      
	  
		   
		  float celsius;
		
		celsius = (fahrenhit-32)*5/9;
		System.out.println(" temperature in celsius "+celsius);
		
		}

	public void elementchecker() {
		
				 
        int num,temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter numbers of elements:");
        num = s.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < num; i++) 
        {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < num; i++) 
        {
            for (int j = i + 1; j < num; j++) 
            {
                if (arr[i] > arr[j]) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest number in array:"+arr[num-2]);
        System.out.println("Second Smallest number in array:"+arr[1]);
	
}

	public void loanchecker(int year, int principle, int rate) {
		int payment ;
        int R;
	
        R = rate/(12*100);
		
		
		if(principle>0)
		{
			int n = 12*year;
			R = rate/(12*100);
			payment = principle*R/1-(1+R)^(-n);
			System.out.println(" payment = "+payment);
			
		}
		else if((principle==0)&&(year==0)&&(rate==0))
		{
			
			System.out.println("Please enter vaild value");
		}
		
		
		 
		

	}

	/**
	 * @param pattern
	 */
	public void patternprint(char pattern) {
		switch(pattern)
	    {
	    
	    case'k':
	    
            System.out.println("**    ***");
            System.out.println("**   ***");
            System.out.println("**  ***");
            System.out.println("** ***");
            System.out.println("*****");
            System.out.println("** ***");
            System.out.println("**   ***");
            System.out.println("**    ***");
            System.out.println("**     ***");
            break;
            
	    case'd' :
	    	
	    	System.out.println("**********");
            System.out.println("**       **");
            System.out.println("**        **");
            System.out.println("**         **");
            System.out.println("**         **");
            System.out.println("**         **");
            System.out.println("**        **");
            System.out.println("**       **");
            System.out.println("**********");
	    	break;
	    	
	    case'w' :
	    	System.out.println("**             *             **");
            System.out.println(" **           ***           **");
            System.out.println("  **         ** **         **");
            System.out.println("   **       **   **       **");
            System.out.println("    **     **     **     ** ");
            System.out.println("     **   **       **   **  ");
            System.out.println("      ** **         ** **   ");
            System.out.println("       ***           ***   ");
            System.out.println("        *             *    ");
            
	    	break;
	    	default:
	    		System.out.println("enter valid value");
	    	
	    	
	    	
	    	


	    }
		
	}


	}
