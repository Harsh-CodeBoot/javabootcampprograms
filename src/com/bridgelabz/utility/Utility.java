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
	 * @return  result:The Desired output the year is a Leap Year or not.
	 */
	public void Leapyearchecker(int year) {
		
		if(year>=1582) //checks year is more than year 1582//

			 if(((year%400 == 0)&& (year%100!=0))||(year%4==0)) //checks year by modulus 400==0 //by 100!=0//by 4==0
			
				System.out.println(+year+" year is a Leap Year");
				
			else
				
			
				System.out.println(+year+" Year is not a Leap Year");
			
			else 

			{
				System.out.println(+year+" year is Invaild");
				}
			
		
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

//}
