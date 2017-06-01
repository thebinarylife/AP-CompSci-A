public class Matrix 
{
  private int[][] matrix;
  private int rows;
  private int cols;
  
  public Matrix(int rows, int cols, int[][] matrix)
  {
    this.matrix = matrix;
    this.rows = rows;
    this.cols = cols;
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
  }

}
