import java.util.Scanner;

public class Lesson_17_Activity_One
{
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
		    
		    int score = 0;
		    double cumlativeScores = 0;
		    int numberOfTests = 0;
		    while(score != -1)
		    {
		    	
		    	
		        score = scan.nextInt();
		        cumlativeScores += (double) score;
		        numberOfTests++;
		        	        
		    }
		    
	        cumlativeScores += 1;
		    numberOfTests -= 1;
		    
		    System.out.println("The average is: " + (cumlativeScores / numberOfTests));
		    scan.close();
	    }
}
