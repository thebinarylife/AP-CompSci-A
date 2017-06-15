import java.util.ArrayList;
import java.util.List;

/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class MatrixManager
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
