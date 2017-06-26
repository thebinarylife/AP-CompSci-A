import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class ClassVersion
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

class Command
{
	private String line;

	private String command;
	private String[] args;

	public Command(String line)
	{
		this.line = line;

		this.line.trim();
		String[] splittedLine = line.split(" ");
		this.command = splittedLine[0];
		this.args = new String[splittedLine.length - 1];

		if (!(splittedLine.length > 1))
			return;

		for (int i = 1; i < splittedLine.length; i++)
			args[i - 1] = splittedLine[i];
	}

	public String[] getArgs()
	{
		return args;
	}

	public String getCommand()
	{
		return command;
	}

	public String getRawLine()
	{
		return line;
	}

}

class Matrix
{
	private String name;
	
	private double[][] matrix;
	private final int ROWS, COLS;
	
	public Matrix(String name, int rows, int cols, boolean fill)
	{
		this.name = name;
		
		this.ROWS = rows;
		this.COLS = cols;
		matrix = new double[ROWS][COLS];
		
		if(fill)
			fillMatrix();
	}
	
	private void fillMatrix()
	{
		System.out.println("Please input all values, ((0,0) (0,1) (1,0) etc...)");
		Scanner scanner = ClassVersion.scanner;
		for(int i = 0; i < ROWS; i++)
			for(int j = 0; j < COLS; j++)
			{
				System.out.println("Row: " + i + " Column: " + j);
				matrix[i][j] = scanner.nextDouble();
			}
		
	}
	
	public boolean isCompatible(Matrix matrix)
	{
		return COLS == matrix.getRows();
	}
	
	public int getColumns()
	{
		return COLS;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRows()
	{
		return ROWS;
	}
	
	public double getValue(int row, int col)
	{
		return matrix[row][col];
	}
	
	public Matrix multiply(int coefficient)
	{
		Matrix matrix = new Matrix(name + "x" + coefficient, ROWS, COLS, false);
		for(int y = 0; y < ROWS; y++)
			for(int x = 0; x < COLS; x++)
				matrix.set(y, x, getValue(y, x) * coefficient);
		return matrix;
	}
	
	public Matrix multiply(Matrix mtrx)
	{
		if(!isCompatible(mtrx))
			return null;
		
		Matrix mat = new Matrix(name + "x" + mtrx.getName(), mtrx.getRows(), mtrx.getColumns(), false);
		for(int i = 0; i <  ROWS; i++)
		{
			
			for(int col = 0; col < mtrx.getColumns(); col++)
			{
				int sum = 0;
				for(int row = 0; row < mtrx.getRows(); row++)
				{
					sum += mtrx.getValue(row, col) * getValue(i, row);
				}
				mat.set(i, col, sum);
			}
		}
		
		return mat;
	}
	
	public void printMatrix()
	{
		for(int i = 0; i < ROWS; i++)
			for(int j = 0; j < COLS; j++)
			{
				System.out.print(getValue(i, j) + " ");
				if((j + 1) % COLS == 0)
					System.out.print("\n");
			}
	}
	
	public void set(int row, int col, double value)
	{
		if(row > ROWS - 1 || col > COLS - 1)
			return;
		
		matrix[row][col] = value;
	}

}

class MatrixManager
{
	private List<Matrix> matricies;
	
	public MatrixManager()
	{
		matricies = new ArrayList<>();
	}
	
	public void addMatrix(Matrix matrix)
	{
		matricies.add(matrix);
	}
	
	public boolean areCompatible(String m1, String m2)
	{
		if(getMatrix(m1) == null || getMatrix(m2) == null)
			return false;
		
		return areCompatible(getMatrix(m1), getMatrix(m2));
	}
	
	public boolean areCompatible(Matrix m1, Matrix m2)
	{
		return m1.isCompatible(m2);
	}
	
	public Matrix getMatrix(String name)
	{
		for(Matrix m : matricies)
		{
			if(m.getName().equalsIgnoreCase(name))
				return m;
		}
		
		return null;
	}
	
	public void printMatricies()
	{
		System.out.println("Saved matricies:");
		for(Matrix m : matricies)
		{
			System.out.println(m.getName());
		}
	}
	
	public void removeMatrix(String name)
	{
		for(Matrix m : matricies)
		{
			if(m.getName().equalsIgnoreCase(name))
			{
				matricies.remove(m);
				break;
			}
		}
	}
	
}

class Util
{
	public static boolean isBoolean(Object o)
	{
		try
		{
			Boolean.parseBoolean(o.toString());
			return true;
		} catch (Exception e)
		{
		}
		return false;
	}

	public static boolean isByte(Object o)
	{
		try
		{
			Byte.parseByte(o.toString());
			return true;
		} catch (Exception e)
		{
		}
		return false;
	}

	public static boolean isChar(Object o)
	{
		return o.toString().length() == 1;
	}

	public static boolean isDouble(Object o)
	{
		try
		{
			Double.parseDouble(o.toString());
			return true;
		} catch (Exception e)
		{
		}
		return false;
	}

	public static boolean isFloat(Object o)
	{
		try
		{
			Float.parseFloat(o.toString());
			return true;
		} catch (Exception e)
		{
		}
		return false;
	}

	public static boolean isInt(Object o)
	{
		try
		{
			Integer.parseInt(o.toString());
			return true;
		} catch (Exception e)
		{
		}
		return false;
	}

	public static boolean isLong(Object o)
	{
		try
		{
			Long.parseLong(o.toString());
			return true;
		} catch (Exception e)
		{
		}
		return false;
	}

	public static boolean isShort(Object o)
	{
		try
		{
			Short.parseShort(o.toString());
			return true;
		} catch (Exception e)
		{
		}
		return false;
	}

	public static boolean toBoolean(Object o)
	{
		return Boolean.parseBoolean(o.toString());
	}

	public static byte toByte(Object o)
	{
		return Byte.parseByte(o.toString());
	}

	public static char toChar(Object o)
	{
		return o.toString().charAt(0);
	}

	public static double toDouble(Object o)
	{
		return Double.parseDouble(o.toString());
	}

	public static float toFloat(Object o)
	{
		return Float.parseFloat(o.toString());
	}

	public static int toInteger(Object o)
	{
		return Integer.parseInt(o.toString());
	}

	public static long toLong(Object o)
	{
		return Long.parseLong(o.toString());
	}

	public static short toShort(Object o)
	{
		return Short.parseShort(o.toString());
	}
}


