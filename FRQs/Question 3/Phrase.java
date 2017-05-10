/** Copyright BinaryLife Design & Dev. To Present
All rights reserved
*/

public class Phrase
{
	
	private String currentPhrase;
	
	public Phrase(String p)
	{
		currentPhrase = p;
	}
	
	// Returns 0 for compilation purposes 
	public int findNthOccurence(String str, int n)
	{
		/* Implementation not shown */
		return 0;
	}
	
	public void replaceNthOccurent(String str, int  n, String repl)
	{
		int occurrence = findNthOccurence(str, n);
		if(occurrence < 0)
			return;
		
		String prefix = currentPhrase.substring(0, occurrence);
		String strOccurrence = currentPhrase.substring(occurrence);
		currentPhrase = prefix + strOccurrence;
	}
	
	public int findLastOccurence(String str)
	{
		int occurrence = 1;
		while(findNthOccurence(str, occurrence) != -1)
			occurrence++;
		
		return (occurence - 1 == 0) ? -1 : findNthOccurence(str, occurrence - 1);
	}

}
