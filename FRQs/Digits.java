import java.util.ArrayList;

/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class Digits
{
	private ArrayList<Integer> digitList;
	
	public Digits(int num)
	{
		digitList = new ArrayList<>();
		while(num != 0)
		{
			digitList.add(0, num % 10);
			num = num / 10;
		}
	}
	
	public boolean isStrictlyIncreatsing()
	{
		if(digitList.size() == 1)
			return true;
		
		for(int i = 1; i < digitList.size(); i++)
		{
			if(!(digitList.get(i) > digitList.get(i - 1)))
				return false;
		}
		
		return true;
	}

}
