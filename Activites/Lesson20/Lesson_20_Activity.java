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
					if(incorrect != 1){
						if(east == 0)
							east = latLongInput;
						if(west == 0)
							west = latLongInput;
						
						if(latLongInput < west)
							west = latLongInput;
						if(latLongInput > east)
							east = latLongInput;
					}
					else
						incorrect = 1;
					
				}
				if(incorrect == 1)
				{
					System.out.println("Incorrect Latitude or Longitude");
					flag = 0;
					incorrect = 0;
				}
				else
				{
					flag++;
				}
				
			}
			else if(flag == 2)
			{
				System.out.println("Would you like to enter another location?");
				option = scan.nextDouble();
				
				if(option == 1)
					flag = 0;
			}
		}
		
		System.out.println("Farthest North: " + north);
		System.out.println("Farthest South: " + south);
		System.out.println("Farthest East: " + east);
		System.out.println("Farthest West: " + west);
		
		scan.close();
		
	}

}
