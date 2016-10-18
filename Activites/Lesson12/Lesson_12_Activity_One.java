/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

public class Lesson_12_Activity_One {
    public static void main(String[] args)
    {
    	// Create scanner object so we can take user input
    	Scanner scan = new Scanner(System.in);
    	
    	// Ask for the three numbers we will be averaging
    	System.out.println("Please input three integers for they're average");
    	int num1 = scan.nextInt();
    	int num2 = scan.nextInt();
    	int num3 = scan.nextInt();
    	
    	// Average the numbers (You can do this in an if statement, but this just looks cleaner)
    	// IMPORTANT: Make sure that you cast the numbers to a double, otherwise it will  not calculate as a double, and the answer will be wrong!
    	double avrg = (double)(num1 + num2 + num3) / 3;
    	
    	// Check to see if the average is above 89.5
    	// IF the average is above 89.5, THEN print ABOVE AVERAGE
    	if(avrg >= 89.5)
    		System.out.println("ABOVE AVERAGE");
    	
    	// Disregard, closing the scanner to lower memory usage
    	scan.close();
    }
}
