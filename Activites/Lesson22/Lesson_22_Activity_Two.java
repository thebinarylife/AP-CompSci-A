import java.util.Scanner;

public class Lesson_22_Activity_Two
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
            String indent = "";
            int iter2 = 0;
            while(iter2 < iter)
            {
                indent += "\t";
                iter2++;
            }
            
            System.out.println(indent + s.charAt(iter));
            iter++;
        }
    }
}
