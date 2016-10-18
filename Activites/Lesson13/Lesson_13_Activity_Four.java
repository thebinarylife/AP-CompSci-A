/*
 * Lesson 13 Coding Activity 4
 * Input an integer grade from the keyboard and translate it to a letter grade. 
 * For example, if a user enters 4, print "A", and if they enter 0 print "F." 
 * You can assume that an integer between 0 and 4 will be input.
 */


import java.util.Scanner;

class Lesson_13_Activity_Four {
    public static void main(String[] args)
    {
    	Scanner scan = new Scanner(System.in);
    	
    	int grade = scan.nextInt();
    	
    	// If the grade equals 4, then the student got an A and we print 'A' to the console
    	if(grade == 4)
    		System.out.println('A');
    	// If the grade equals 3, then the student got an B and we print 'B' to the console
    	else if(grade == 3)
    		System.out.println('B');
    	// If the grade equals 2, then the student got an C and we print 'C' to the console
    	else if(grade == 2)
    		System.out.println('C');
    	// If the grade equals 1, then the student got an D and we print 'D' to the console
    	else if(grade == 1)
    		System.out.println('D');
    	// If the grade equals none of the above, it equals 0, then the student got an F and we print 'F' to the console
    	else
    		System.out.println('F');
    	
    	scan.close();
    }
}
