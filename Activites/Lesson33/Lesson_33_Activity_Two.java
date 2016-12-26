public class Lesson_33_Activity_Two {

    public static void randomize(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            int min = 10;
            int max = 100;
            array[i] = (int) (Math.random() * (max - min) + min);
        }
    }
}
