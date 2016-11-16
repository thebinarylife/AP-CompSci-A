import java.util.Scanner;

public class Lesson_20_Activity
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int flag = 0;
		double option = 1;
		int incorrect = 0;
		
		double north = 0;
		double south = 0;
		double east = 0;
		double west = 0;
		while(option != 0)
		{
			double latLongInput = 0;
				
			if(flag == 0)
			{
				System.out.println("Please enter the lattitude:");
				latLongInput = scan.nextDouble();
				
				if(latLongInput < -90 || latLongInput > 90)
					incorrect = 1;
				else
				{
					if(south == 0)
						south = latLongInput;
					if(north == 0)
						north = latLongInput;
					
					if(latLongInput < south)
						south = latLongInput;
					if(latLongInput > north)
						north = latLongInput;
					
				}
				
				flag++;
				
			}
			else if(flag == 1)
			{
				System.out.println("Please enter the longitude:");
				latLongInput = scan.nextDouble();
				
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
