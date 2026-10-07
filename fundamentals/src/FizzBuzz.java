import java.util.Arrays;

public class FizzBuzz {
    public static String fizzbuzz(int until) {
        String[] array = new String[until];
        for (int i = 1; i < until; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                array[i] = String.valueOf(i);
            }
            else if (i % 3 == 0 && i % 5 != 0) {
                array[i] = "Fizz";
            }
            else if (i % 3 != 0 && i % 5 == 0) {
                array[i] = "Buzz";
            }
            else if (i % 3 == 0 && i % 5 == 0) {
                array[i] = "FizzBuzz";
            }
        }
        array[0] = "0";
        
        return Arrays.toString(array);
    }
}
