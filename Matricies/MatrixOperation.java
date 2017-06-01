public abstract class MatrixOperation
{
	protected Matrix matrix;
	
	public MatrixOperation(Matrix matrix)
	{
		this.matrix = matrix;
	}
	
	public Matrix getMatrix()
	{
		return matrix; 
	}
	
	public void setMatrix(Matrix matrix)
	{
		this.matrix = matrix;
	}
	
	abstract Matrix runOperation();
	
}
