public class Student
{
	private String first;
	private String last;
	
	private int level;
	private double grade;
	private int id;
	
	private static int count;
	
	public Student()
	{
		first = "None";
		last = "None";
		level = 0;
		grade = 0.0;
		count++;
		id = count;
	}
	
	public Student(String firstName, String lastName, int gradeLevel, double gpa)
	{
		first = firstName;
		last = lastName;
		count++;
		id = count;
		
		if (gradeLevel >= 0 && gradeLevel <= 12)
			level = gradeLevel;
		else
			level = 0;
		
		if (gpa >= 0.0 && gpa <= 4.5)
			grade = gpa;
		else
			grade = 0.0;
	}
	
	public String toString()
	{
		String output = last + ", " + first + "\n" 
				+ "GPA: " + grade + "\n" 
				+ "Grade Level: " + level 
				+ " id # " + id;
		
		return output;
	}	
}
