/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class Successors
{
	
	public static Position findPosition(int num, int[][] intArr)
	{
		for(int y = 0; y < intArr.length; y++)
		{
			for(int x = 0; x < intArr[y].length; x++)
			{
				if(intArr[y][x] == num)
					return new Position(y, x);
			}
		}
		
		return null;
	}
	
	public static Position[][] getSuccessorArray(int[][] intArr)
	{
		Position[][] positions = new Position[intArr.length][intArr[0].length];
		for(int y = 0; y < intArr.length; y++)
		{
			for(int x = 0; x < intArr[y].length; x++)
			{
				positions[y][x] = findPosition(intArr[y][x] + 1, intArr);
			}
		}
		
		return positions;
	}

}
