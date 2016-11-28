/*
 * Lesson 29 Coding Activity 1
 * A student wants an algorithm to find the hardest spelling
 * word in a list of vocabulary. They define hardest by the longest word.
 * Write the code to find the longest word stored in an array of Strings called list.
 * If several words have the same length it should print the first word 
 * in list with the longest length.
 * For example, if the following list were declared:
 * 
 *     String list [] = {"high", "every", "nearing", "checking", "food ", 
 *     "stand", "value",  "best", "energy", "add", "grand", "notation",
 *     "abducted", "food ", "stand"};
 * 
 * It would print:
 *     checking 
 */

class Lesson_29_Activity_One {
	public static String[] list = {};
	
	public static void main(String[] args)
	{
		// Create a String that will hold the largest string
		String s = null;
		// Starting at 0, since an array starts at 0, increment it up until it is the == the length of the array
		for(int i = 0; i < list.length; i++)
		{
			// if the string is still = null, or the length of the string is the length of the value in the array
			// If it is longer, save it in the String variable
			if(s == null || list[i].length() > s.length())
				s = list[i];
		}
		
		// Print the final String value
		System.out.println(s);
	}
}
