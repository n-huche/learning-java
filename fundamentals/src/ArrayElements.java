import java.util.Arrays;

public class ArrayElements {
    public static String arrayElements(String... numbers) {

        int[] array = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        Arrays.sort(array);

        int[] newArray = {array[0], array[array.length - 1]};

        return Arrays.toString(newArray);
    }
}
