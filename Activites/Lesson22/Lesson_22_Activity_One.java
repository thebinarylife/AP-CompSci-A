import java.util.Scanner;

public class Lesson_22_Activity_One
{
    public static void main(String[] args)
    {
        System.out.println("Please input a string!");
        // String that will be used
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // Get the length of the string so that we can use it in the while loop
        int i = s.length();
        // This will keep track of how many times we have iterated through the while loop
        int iter = 0;
        // While the number of times we have iteratted through the while loop is less than the length of the string
        while(iter < i)
        {
            // Print the character at the number correct location of the string
            // IMPORTANT we increase the iter variable AFTER we get the character at the specified location because charAt(int i) starts at 0 so if we incremented it before, the number would end up being one too high
            // For example, if we put in Hello, it would print e, l, l, o, and then throw an error because we are trying to get a character that does not exist.
            System.out.println(s.charAt(iter));
            // Increment our iteration variable by 1
            iter++;
        }
    }
}
