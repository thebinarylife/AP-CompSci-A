import java.util.Scanner;

public class Lesson_17_Activity_Two
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		// Store both numbers
		System.out.println("Enter two numbers:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		// While x is not greater than y
		while(!(x > y))
		{
			// Check to see if the number is even by checking to see if it's divisible by two
			if(x % 2 == 0)
			{
				System.out.print(x + " ");
			}
			// Up the number by one
			x++;
		}
		
		scan.close();
	}

}
