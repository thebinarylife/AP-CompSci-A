/*
 * Lesson 13 Coding Activity 1 
 * Take input of an integer number from the keyboard 
 * and print "Positive" if it's positive or zero, and print "Negative" otherwise.
 */


import java.util.Scanner;

public class Lesson_13_Activity_One {
    public static void main(String[] args)
    {
    	//Create scanner object so we can take user input
    	Scanner scan = new Scanner(System.in);
    	
    	// Ask for an integer to check whether it is positive or negative
    	System.out.println("Please enter an integer");
    	int i = scan.nextInt();
    	
    	// Check to see if the number is equal to it's absolute value
    	// IF the number is equal to it's absolute value, THEN the number is positive and we are going to print "Positive" to the console
    	if(i == Math.abs(i))
    		System.out.println("Positive");
    	// If the number is not equal to it's absolute value, then we know that it is negative.
    	else
    		System.out.println("Negative");
    	
    	// Disregard, closing the scanner to lower memory usage
    	scan.close();
    }
}
