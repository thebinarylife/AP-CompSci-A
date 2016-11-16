import java.util.Scanner;

public class Lesson_17_Activity_One
{
	 public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		// Create varibla to track the score the user is inputing
		int score = 0;
		// Keep track of all test scores combined for calculating the average
		double cumulativeScores = 0;
		// Keep track of the number of tests submitted.
		int numberOfTests = 0;
		while (score != -1)
		{
			// Get the score that was input
			score = scan.nextInt();
			// Add the score to the combined score amount
			cumulativeScores += (double) score;
			// Add one to the number of tests
			numberOfTests++;

		}
		
		// Add one to the test score because it ran through the while loop when 1 was == 0, this way we get the correct cumulative
		cumulativeScores += 1;
		// Remove a test because it ran through the while loop and added 1
		numberOfTests--;

		System.out.println("The average is: " + (cumlativeScores / numberOfTests));
		scan.close();
	}
}
