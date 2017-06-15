import java.util.Scanner;

/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class Matrix
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
		Scanner scanner = Main.scanner;
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
