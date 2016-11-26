import java.util.Scanner;

public class Lesson_22_Activity_Two
{
    public static void main(String[] args)
    {
        System.out.println("Please input a string!");
        Scanner scan = new Scanner(System.in);
        // Ask for the String that will be outputted
        String s = scan.nextLine();
        
        // Get the length of the string so that we can use it in the while loop
        int i = s.length();
        // This will keep track of how many times we have iterated through the while loop
        int iter = 0;'
        // While the number of times we have iteratted through the while loop is less than the length of the string...
        while(iter < i)
        {
            // Create a String that will hold all of the indents
            String indent = "";'
           // Create a new variable to keep track of how many times we have iteratted through our while loop that tracks indents
            int iter2 = 0;
            // While the number of times we have iterated through the while loop is less than the number of times we have iteratted through the while loop we are in...
            while(iter2 < iter)
            {
                // Add an indent
                indent += "\t";
                // Increate the variable that keeps track of the indents by one
                iter2++;
            }
            
            // Print the idents and the character at the number correct location of the string
            // IMPORTANT we increase the iter variable AFTER we get the character at the specified location because charAt(int i) starts at 0 so if we incremented it before, the number would end up being one too high
            // For example, if we put in Hello, it would print e,   l,      l,          o, and then throw an error because we are trying to get a character that doesn't exist.
            System.out.println(indent + s.charAt(iter));
            // Increment our iteration variable by 1
            iter++;
        }
    }
}
