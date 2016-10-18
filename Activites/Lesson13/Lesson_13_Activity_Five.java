/*
 * Lesson 13 Coding Activity 5 
 * Create a program to let the user practice their multiplication tables.
 * Print two random integers between 1 and 12 each on a new line. 
 * Then, ask the user to input the multiplication of the two numbers. 
 * If they enter the correct product print "Correct!" otherwise print "Wrong".
 */


import java.util.Scanner;

class Lesson_13_Activity_Five {
	
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
    	// Create two random number values that are in between 12 and 1
    	int num1 = (int) (Math.random() * 12 + 1);
    	int num2 = (int) (Math.random() * 12 + 1);
    	
    	// Print the two numbers and get the number that the user believes is the product
    	System.out.println("" + num1 + " " + num2);
    	int inputProduct = scan.nextInt();
    	
    	// Check to see if the number given by the user is equal to the two numbers multiplied, if so, print "Correct!" , if not print "Wrong"
    	if(inputProduct == (num1 * num2))
    		System.out.println("Correct!");
    	else
    		System.out.println("Wrong");
    	
    	scan.close();
    	
    	
    }
}
