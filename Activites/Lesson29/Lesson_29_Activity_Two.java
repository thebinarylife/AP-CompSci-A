/*
 * Lesson 29 Coding Activity 2
 * Write a loop that processes an array of strings. 
 * Each String should be printed backwards on its own line.
 * 
 * For example, if the list contains:
 *     
 *     {"every", "nearing", "checking", "food", "stand", "value"}
 * 
 * It should output:
 *     yreve
 *     gniraen
 *     gnikcehc
 *     doof
 *     dnats
 *     eulav
 */

class Lesson_29_Activity_Two {
	public static String[] list = {};
	
	public static void main(String[] args)
	{
		// Start at 0 since the array starts and zero and end when the variable is one less than the length
		for(int i = 0; i < list.length; i++)
		{
			// Create a new variable with no text to store the new word
			String s = "";
			// Start at the length of the array - 1 because we know that this will be the last element of the array
			// Wait until the array hits zero, include zero because we know that the array starts at zero
			// Through every loop decrease it by one
			for(int ii = list[i].length() - 1; ii > -1; ii--)
			{
				// add the character to the string variable
				s += list[i].charAt(ii);
			}
			
			// Print the new string
			System.out.println(s);
		}
	}
	
}
