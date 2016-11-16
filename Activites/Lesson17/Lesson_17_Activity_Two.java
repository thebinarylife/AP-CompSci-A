import java.util.Scanner;

public class Lesson_17_Activity_Two
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		while(!(x > y))
		{
			if(x % 2 == 0)
			{
				System.out.print(x + " ");
			}
			x++;
		}
		
		scan.close();
	}

}
