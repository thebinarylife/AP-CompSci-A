public class Matrix 
{
	private int[][] matrix;
	
	private final int ROWS;
	private final int COLS;

	public Matrix(int rows, int cols, int[][] matrix)
	{
		this.matrix = matrix;
		this.ROWS = rows;
		this.COLS = cols;
	}

	public Matrix(int rows, int cols)
	{
		int[][] matrix = new int[rows][cols];
		for (int x = 0; x < rows; x++)
		{
			for (int y = 0; y < cols; y++)
			{
				matrix[x][y] = 0;
			}
		}

		this.matrix = matrix;
		this.ROWS = rows;
		this.COLS = cols;
	}
	
	public boolean contains(int value)
	{
		for(int[] col : matrix)
			for(int val : col)
				if(val == value)
					return true;
		
		return false;
	}
	
	public int getColumns()
	{
		return COLS;
	}
	 
	public int[][] getRawMatrix()
	{
		return matrix;
	}
	
	public int getRows()
	{
		return ROWS;
	}
	
	public int getValue(int x, int y)
	{
		return matrix[x][y];
	}

	public void set(int x, int y, int value)
	{
		if (x > ROWS - 1 || y > COLS- 1)
			return;

		matrix[x][y] = value;
	}

}
