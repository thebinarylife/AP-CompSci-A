import java.util.Scanner;

public class Lesson_11_Activity_Two {

	public static void main(String[] args) {
		// Create scanner to make input possible
		Scanner sc = new Scanner(System.in);
		
		// Ask for an doube from the user
		System.out.println("Please input a double");
		double i = sc.nextDouble();
		
		// Check to see if the input double is equal to 48.729
		if(i == 48.729)
			System.out.println("YES");
		
		// Disregard
		// Closes scanner so that memory is not overused
		sc.close();
	}
}
