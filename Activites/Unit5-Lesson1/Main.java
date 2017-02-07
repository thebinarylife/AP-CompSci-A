
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please input words, enter STOP to stop the loop.");

		ArrayList <String> list = new ArrayList<>();
		String s = null;
		while (s == null || !s.equals("STOP"))
		{
		    s = scan.nextLine();
		    list.add(s);
		} 

		list.remove(list.size() - 1);

		System.out.println(list.size());
		System.out.println(list);
		if (list.size() > 2)
		{
		    list.remove(0);
		    list.remove(list.size()-1);
		    System.out.println(list);
		}

		scan.close();
	}
}
