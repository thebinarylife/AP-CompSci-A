import java.util.Scanner;

public class Lesson_22_Activity_One
{
    public static void main(String[] args)
    {
        System.out.println("Please input a string!");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        int i = s.length();
        int iter = 0;
        while(iter < i)
        {
            System.out.println(s.charAt(iter));
            iter++;
        }
    }
}
