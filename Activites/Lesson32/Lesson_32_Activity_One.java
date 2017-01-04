public class Lesson_32_Activity_One {

    // Create the desired method with an input of an integer that corresponds with a month
    public static String monthName(int monthNum)
    {
        // Create a string of all the months in numerical order
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        // Find the month using the number inputted minus 1 (because arrays start at 0)
        System.out.println(month[monthNum-1]);
    }
}
