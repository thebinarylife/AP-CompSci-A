/*
 * Lesson 24 Coding Activity 1
 * Use a for loop to print all of the numbers from 23 to 89, with 10 numbers on each line. 
 * Print one space between each number.
 */

class Lesson_24_Activity_One {
    
	public static void main(String[] args)
	{
		// Create a variable to count how many times we have iterated through the loop
		int iter = 0;
		// Start i at 23, and incrememnt it by one until it hits 90
		for(int i = 23; i < 90; i++)
		{
			// Increment the iteration by 1
			iter++;
			// Now we have to see if the number will be printed on the same line
			// If the iteration number is divisible by 10
			if(iter % 10 == 0)
			{
				// Print on a new line
				System.out.println(i + " ");
			} else
			{
				// If not print on the same line
				System.out.print(i + " ");
			}
			
		}
	}
}
