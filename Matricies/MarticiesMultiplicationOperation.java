public class MatrciesMultiplicationOperation extends MatrixOpeation
{
    private Matrix matrix2;
    
    public MatriciesMultiplicationOperation(Matrix baseMatrix)
    {
        super(baseMatrix);
        
        this.matrix2 = matrix2;
    }
    
    public boolean isCompatible(Matrix matrix)
    {
        return (matrix.getColumns() == matrix.getRows());
     }
    
    public void checkSecondMatrix()
    {
        if(matrix.getColumns() != matrix2.getRows())
        {
            System.out.println("The second matrix does not have the same amount of rows as the first does columns. The second matrix has been set to null.");
            matrix2 = null;
        }
    }
}
