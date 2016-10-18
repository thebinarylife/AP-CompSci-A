/*
 * Lesson 12 Coding Activity 2 
 * Input two decimal numbers and print the largest.
 * If the numbers are equal, print one of them.
 *     
 *     Sample Run 1
 *        Please enter two numbers:
 *        45.7
 *        45.1
 *
 *        Largest is: 45.7 
 *         
 *      Sample Run 2
 *        Please enter two numbers:
 *        14
 *        14
 * 
 *        Largest is: 14.0          
 * 
 */


import java.util.Scanner;

class Lesson_12_Activity_Two {
    public static void main(String[] args)
    {
    	//Create scanner object so we can take user input
    	Scanner scan = new Scanner(System.in);
    	
    	// Ask for two numbers from the user so we can test to see which is larger
    	System.out.println("Please enter two numbers");
    	double dec1 = scan.nextDouble();
    	double dec2 = scan.nextDouble();
    	
    	// Test to see if dec1 is larger or equal to
    	// IF dec1 is larger or equal to dec2, then print "Largest is : <dec1>" to the console 
    	if(dec1 >= dec2)
    		System.out.println("Largest is: " + dec1);
    	
    	// Test to see if dec2 is larger
    	// IF dec2 is larger, then print "Largest is : <dec2>" to the console 
    	if(dec1 < dec2)
    		System.out.println("Largest is: " + dec2);
    	
    	// Disregard, closing the scanner to lower memory usage
    	scan.close();
    }
}
