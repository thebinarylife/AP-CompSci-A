/*
 * Lesson 13 Coding Activity 3 
 * Input two integers and print the largest. If they are equal print "EQUAL". 
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */


import java.util.Scanner;

class Lesson_13_Activity_Three {
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
    	// Ask user for the two numbers that will be checked
    	System.out.println("Give two integers to check to see which is larger.");
    	int num1 = scan.nextInt();
    	int num2 = scan.nextInt();
    	
    	// Check to see if num1 is larger than num2
    	// IF num1 is larger than num2, THEN we are going to print out num1
    	if(num1 > num2)
    		System.out.println(num1);
    	// IF num2 is larger than num1, THEN we are going to print num2
    	else if(num2 > num1)
    		System.out.println(num2);
    	// OTHERWISE they are both equal to each other, so we will just print "EQUAL"
    	else
    		System.out.println("EQUAL");
    	
    	
    }
    
}
