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
			iter++;
			
			if(iter % 10 == 0)
			{
				System.out.println(i + " ");
			} else
			{
				System.out.print(i + " ");
			}
			
		}
	}
}
