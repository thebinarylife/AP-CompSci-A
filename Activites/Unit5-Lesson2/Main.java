import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
        System.out.println("Please enter words, enter STOP to stop the loop.");
        
        ArrayList<String> list = new ArrayList<>();
        String input = null;
        while (input == null || !input.equals("STOP"))
        {
            input = scan.nextLine();
            list.add(input);
        }
        
        list.remove(list.size() - 1);
        
        for (String s : list)
        {
        	if(s.contains("a"))
        		System.out.println(s);
        }
        
        scan.close();
    }
}
