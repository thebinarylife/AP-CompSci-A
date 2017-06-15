/**
 * Copyright BinaryLife Design & Dev. To Present All rights reserved
 */

public class Command
{
	private String line;

	private String command;
	private String[] args;

	public Command(String line)
	{
		this.line = line;

		this.line.trim();
		String[] splittedLine = line.split(" ");
		this.command = splittedLine[0];
		this.args = new String[splittedLine.length - 1];

		if (!(splittedLine.length > 1))
			return;

		for (int i = 1; i < splittedLine.length; i++)
			args[i - 1] = splittedLine[i];
	}

	public String[] getArgs()
	{
		return args;
	}

	public String getCommand()
	{
		return command;
	}

	public String getRawLine()
	{
		return line;
	}

}
