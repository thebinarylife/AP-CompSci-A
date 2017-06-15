import java.util.Scanner;

/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class Main
{
	public static Scanner scanner;
	
	private static MatrixManager mm;
	
	public static void main(String[] args)
	{
		mm = new MatrixManager();
		
		printHelp();
		
		scanner = new Scanner(System.in);
		boolean creating = false;
		String line;
		while(!(line = scanner.nextLine()).equalsIgnoreCase("exit"))
		{
			Command cmd = new Command(line);
			
			if(creating)
			{
				creating = false;
				continue;
			}
			
			if(!cmd.getCommand().equalsIgnoreCase("create") && !cmd.getCommand().equalsIgnoreCase("multiply") && !cmd.getCommand().equalsIgnoreCase("list"))
			{
				System.out.println("That command does not exist!");
				continue;
			}
			
			if(cmd.getCommand().equalsIgnoreCase("create"))
			{
				createMatrixSequence(cmd);
				creating = true;
				continue;
			}
			
			if(cmd.getCommand().equalsIgnoreCase("list"))
			{
				mm.printMatricies();
				continue;
			}
			
			if(cmd.getCommand().equalsIgnoreCase("multiply"))
			{
				multiplyMatriciesSequence(cmd);
				continue;
			}
		}
		
		scanner.close();
	}
	
	private static void printHelp()
	{
	    System.out.println("<------------------------------------Commands------------------------------------>\n\t\t \"<>\" = required\t\t\"[]\" = optional");
	    System.out.println("\"create <matrix name (no spaces)> <rows> <cols>\"  - Create a new configuration");
	    System.out.println("\"multiply <1st matrix name> <2nd matrix name>\" - Set specified key to specified value");
	    System.out.println("\"list\" - List all matricies");
	    System.out.println("\"exit\" - Exit the program");
	}
	
	private static void createMatrixSequence(Command cmd)
	{
		if(cmd.getArgs().length !=3)
		{
			System.out.println("USAGE: \"create <matrix name (no spaces)> <rows> <columns>");
			return;
		}
		
		if(mm.getMatrix(cmd.getArgs()[0]) != null)
		{
			System.out.println("That matrix already exists!");
			return;
		}
		
		if(!Util.isInt(cmd.getArgs()[1]) && !Util.isInt(cmd.getArgs()[2]))
		{
			System.out.println("USAGE: \"create <matrix name (no spaces)> <rows> <columns>");
			return;
		}
		
		Matrix matrix = new Matrix(cmd.getArgs()[0], Util.toInteger(cmd.getArgs()[1]), Util.toInteger(cmd.getArgs()[2]), true);
		mm.addMatrix(matrix);
		System.out.println("The matrix has been created and added!");
		matrix.printMatrix();
	}
	
	private static void multiplyMatriciesSequence(Command cmd)
	{
		String[] args = cmd.getArgs();
		if(mm.getMatrix(args[0]) == null|| mm.getMatrix(args[1]) == null)
		{
			System.out.println("Make sure both matricies are exist!");
			return;
		}

		if(!mm.areCompatible(args[0], args[1]))
		{
			System.out.println("The two matricies are not compatible with each other!");
			return;
		}
		
		Matrix matrix = mm.getMatrix(args[0]).multiply(mm.getMatrix(args[1]));
		System.out.println("The to matricies have been multiplied! The resulting matrix has been saved as " + matrix.getName() + "\n");
		matrix.printMatrix();
	}
	
}
