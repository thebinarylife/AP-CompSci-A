/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class MultPractice
{
	private final int FIRST_NUM;
	private int secondNum;
	
	public MultPractice(int firstNum, int secondNum)
	{
		this.FIRST_NUM = firstNum;
		this.secondNum = secondNum;
	}
	
	public String getProblem()
	{
		return FIRST_NUM + " TIMES " + secondNum;
	}
	
	public void nextProblem()
	{
		secondNum++;
	}
	

}
