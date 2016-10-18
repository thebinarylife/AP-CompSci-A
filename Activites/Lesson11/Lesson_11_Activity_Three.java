/*
 * Lesson 11 Coding Activity 3
 * Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
*/

import java.util.Scanner;

public class Lesson_11_Activity_Three {
	
	public static void main(String[] args)
	{
		// Create scanner object so we can input data from the console
		Scanner scan = new Scanner(System.in);
		
		// Ask user for two integers
		System.out.println("Please input two integers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		// Test to see if the two integers are the same
		// IF the two numbers are equal, then print yes
		if(num1 == num2)
			System.out.println("YES");
		
		// Disregard, closes scanner to lower memory usage
		scan.close();
	}
}
