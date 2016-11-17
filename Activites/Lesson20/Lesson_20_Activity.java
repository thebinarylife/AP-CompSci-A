import java.util.Scanner;

public class Lesson_20_Activity
{	
	// DOES NOT WORK ON EDHESIVE, can't debug completely? Works for me personally.
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		// Create a flag variable 0 = Ask for latitude, 1 = Ask for longitude, 2 = Ask if they want to input a new location
		int flag = 0;
		// Only keeps track to see if they exit out
		double option = 1;
		// Keep track to see if the input was incorrect
		int incorrect = 0;
		
		// Furthest North point
		double north = 0;
		// Furthest South point
		double south = 0;
		// Furthest East point
		double east = 0;
		// Furthest West point
		double west = 0;
		while(option != 0)
		{
			// Keeps track of the longitude and lattitude inputted, only need it in each instance of the loop which is why it is in the loop rather than outside
			double latLongInput = 0;
			// If our flag variable is 0...	
			if(flag == 0)
			{
				System.out.println("Please enter the lattitude:");
				// Get inputeded lattitude
				latLongInput = scan.nextDouble();
				
				// If the lattiude is less than 90 or greater than 90, then we flag the incorrect variable as such
				if(latLongInput < -90 || latLongInput > 90)
					incorrect = 1;
				// Otherwise...
				else
				{
					// Check to see if our North and South variables are 0, if they are we are just going to set the value to the number inputted, just to give it a value
					if(south == 0)
						south = latLongInput;
					if(north == 0)
						north = latLongInput;
					// Now that we know that those are not default values, we check to see if it is further than the previous "fartest south/north" and set it if it is
					// This is checked by seeing if the input value is less then or greater than the set farthest south/north
					if(latLongInput < south)
						south = latLongInput;
					if(latLongInput > north)
						north = latLongInput;
					
				}
				
				// Increase the flag for the next run through
				flag++;
				
			}
			else if(flag == 1)
			{
				System.out.println("Please enter the longitude:");
				// Ask for the input
				latLongInput = scan.nextDouble();
				
				// check to see if it is incorrect like we did in the previous if statement
				if(latLongInput < -300 || latLongInput > 300)
					incorrect = 1;
				else
				{
					// If the inputs were correct..
					if(incorrect != 1){
						// Check to see if our east and west variables are 0, if they are we are just going to set the value to the number inputted, just to give it a value
						if(east == 0)
							east = latLongInput;
						if(west == 0)
							west = latLongInput;
						
						// Now that we know that those are not default values, we check to see if it is further than the previous "fartest east/west" and set it if
						// it is
						// This is checked by seeing if the input value is less then or greater than the set farthest south/north
						if(latLongInput < west)
							west = latLongInput;
						if(latLongInput > east)
							east = latLongInput;
					}
					// Otherwise just keep incorrect at 1
					else
						incorrect = 1;
					
				}
				// If something was incorrect, tell them and then start from step 1 again
				if(incorrect == 1)
				{
					System.out.println("Incorrect Latitude or Longitude");
					// Set the flag varibale back to 0 to start the first part again, and set incorrect to 0 this way that we make sure it is not automatically deemed incorrect on the next run
					flag = 0;
					incorrect = 0;
				}
				else
				{
					// Increment the flag to get to the next step
					flag++;
				}
				
			}
			// If our flag variable is 2
			else if(flag == 2)
			{
				// Ask if they want to input another location, answer will be 0 or 1
				// If it's zero we know that they will automatically leave the loop so...
				System.out.println("Would you like to enter another location?");
				option = scan.nextDouble();
				
				// We check to see if the answer is 1, and if it is we start back at the first step by setting the flag variable to 0
				if(option == 1)
					flag = 0;
			}
		}
		// Print values
		System.out.println("Farthest North: " + north);
		System.out.println("Farthest South: " + south);
		System.out.println("Farthest East: " + east);
		System.out.println("Farthest West: " + west);
		
		
		// Ignore
		scan.close();
		
	}

}
