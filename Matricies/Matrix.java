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
    for(int x = 0; x < rows - 1; x ++)
    {
      for(int y = 0; y < cols - 1; y++)
      {
        matrix[x][y] = 0;
      }
    }
    
    this(rows, cols, matrix);
  }
  
  /**
  * Sets specified location to specified value.
  * x and y start at 0!!
  */
  public void set(int x, int y, int value)
  {
    if(x > ROWS.length - 1 || y > COLS.length - 1)
      return;
    
    matrix[x][y] = value;
  }

}
