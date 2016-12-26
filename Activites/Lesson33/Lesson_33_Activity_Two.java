public class Lesson_33_Activity_Two {
    
    // Create the method with an Integer array parameter
    public static void randomize(int[] array)
    {
        // Create a for loop so that we can iterate through each element of the array
        for(int i = 0; i < array.length; i++)
        {
            // We know that the minimum value is 10
            int min = 10;
            // We know that the max will be 100, we add one to it so that it includes 100
            int max = 100;
            
            // Set element i in the Array to the random decimal times the range of the two numbers will give us a number in between
            // Add the minimum value so that it is between 100 and 99
            // Cast the number to an integer so that the element is an int
            array[i] = (int) (Math.random() * (max - min) + min);
        }
    }
}
