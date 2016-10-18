/*
 * Lesson 12 Coding Activity 4 
 * You are running an experiment that involves hatching chicken eggs. 
 * Bird eggs are very sensitive to temperature and chickensÕ eggs will hatch 
 * between 99 and 102 degrees Fahrenheit.
 * 
 * Write the code for the sensor that will be tracking the temperature. 
 * If the temperature falls below 99 or above 102 your code should print ÒWARNINGÓ.
 * The input should be in doubles.
 *     
 *     Sample Run 1
 *         What is the temperature?
 *         45.3
 *         WARNING
 *
 *         
 *      Sample Run 2
 *         What is the temperature?
 *         100        
 * 
 */


import java.util.Scanner;

class Lesson_12_Activity_Four {
    public static void main(String[] args)
    {
    	//Create scanner object so we can take user input
    	Scanner scan = new Scanner(System.in);
    	
    	// Ask for the temperature from the user so we can see if the temperature is in the range
    	System.out.println("What is the temperature?");
    	double temp = scan.nextDouble();
    	
    	// Check to see if the temperature is more than 102 degrees
    	// IF the temperature is more than 102, THEN we are going to send a warning to the user
    	if(temp > 102)
    		System.out.println("WARNING");
    	
    	// Check to see if the temperature is less than 99 degrees
    	// IF the temperature is lower than 99, THEN we are going to send a warning to the user
    	if(temp < 99)
    		System.out.println("WARNING");
    	
    	// Disregard, closing the scanner to lower memory usage
    	scan.close();
    }
}
