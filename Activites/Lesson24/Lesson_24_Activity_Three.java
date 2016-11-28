/*
 * Lesson 24 Coding Activity 3
 * Input an int between 0 and 100 and print the numbers between it and 100. 
 * If the number is not between 0 and 100 print "error". 
 * Print 20 numbers per line.
 * 
 *     Sample Run 1:
 *         
 *         Enter a number between 0 and 100:
 *         30
 *         30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49
 *         50 51 52 53 54 55 56 57 58 59 60 61 62 63 64 65 66 67 68 69
 *         70 71 72 73 74 75 76 77 78 79 80 81 82 83 84 85 86 87 88 89
 *         90 91 92 93 94 95 96 97 98 99 100
 *         
 * 
 *    Sample Run 2:
 *         
 *         Enter a number between 0 and 100:
 *         105
 *         error     
 * 
 * 
 */ 

import java.util.Scanner; 

class Lesson_24_Activity_Three {
    
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		// If the number is less than 0 or greater than 100
		if(num < 0 || num > 100)
		{
			// Print error
			System.out.println("error");
		}
		// Otherwise
		else
		{
			// Keep track of the number of times the loop has been iterated through
			int iter = 0;
			// Start the number at the number given by user. Stop when the number hits 100, and increment by 1
			for(int i = num; i < 101; i++)
			{
				// Increment the iteration by 1
				iter++;
				// If it is divisible by 20 print it on another line
				if(iter % 20 == 0)
					System.out.println(i+ " ");
				// Otherwise print it on the same line
				else
					System.out.print(i + " ");
			}
		}
		
		
		
		scan.close();
	}
	
}
