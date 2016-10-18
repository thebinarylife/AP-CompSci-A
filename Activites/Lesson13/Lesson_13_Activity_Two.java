/*
 * Lesson 13 Coding Activity 2 
 * Take input of an integer number from the keyboard and print "passing" 
 * if it's greater than or equal to 60, and print "failing" otherwise.
 */


import java.util.Scanner;

class Lesson_13_Activity_Two {
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
    	// What is your grade?
    	System.out.println("What is your grade?");
    	int grade = scan.nextInt();
    	
    	// Check to see if the grade is larger or equal to 60
    	// IF the grade is greater than or equal to 60, THEN print "passing"
    	if(grade >= 60)
    		System.out.println("passing");
    	
    	// OTHERWISE you are failing
    	else
    		System.out.println("failing");
    	
    	// Disregard, close the scanner to lower memory usage.
    	scan.close();
    }
}
