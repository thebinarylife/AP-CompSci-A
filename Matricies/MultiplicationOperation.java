/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class MultiplicationOperation extends MatrixOperation
{
	private int coefficient;

	public MultiplicationOperation(Matrix matrix, int coefficient)
	{
		super(matrix);
		
		this.coefficient = coefficient;
	}
	
	public Matrix runOperation()
	{
		Matrix matrix = new Matrix(this.matrix.getRows(), this.matrix.getColumns());
		for(int x = 0; x < this.matrix.getRows(); x++)
			for(int y = 0; y < this.getMatrix().getColumns(); y++)
				matrix.set(x, y, this.matrix.getValue(x, y) * coefficient);
		
		return matrix;
	}
}
