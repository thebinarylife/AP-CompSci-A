/*
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 */

import java.util.Scanner;

public class Lesson_11_Activity_Four {
	
	public static void main(String[] args)
	{
		// Create Scanner object so we can get input from the user
		Scanner scan = new Scanner(System.in);
		
		// Ask and get the number number that will be tested to see if it is even
		System.out.println("Please input a number:");
		int i = scan.nextInt();
		
		// Test to see if there is a remainder of 0
		// IF the remainder is zero, THEN the number is even and we will print "Even"
		if(i % 2 == 0)
			System.out.println("Even");
		
		// Test to see if there is a remainder of 1
		// IF the remainder is one, THEN the number is odd and we will print "Odd"
		if(i % 2 == 1)
			System.out.println("Odd");
		
		// Disregard, closes scanner to lower memory usage
		scan.close();
	}
}
