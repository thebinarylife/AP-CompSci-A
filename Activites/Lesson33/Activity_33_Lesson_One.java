public class Lesson_33_Activity_One {

    // Create the method with a String array parameter
    public static void upper(String[] array)
    {
        // Iterate through each element of the array
        for(int i = 0; i < array.length; i++)
        {
            // Set the element to uperace
            array[i] = array[i].toUpperCase();
        }
    }
}
