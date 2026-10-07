import java.util.Arrays;

public class ArrayElements {
    public static String arrayElements(String... numbers) {
        
        int[] array = new int[numbers.length];

        int i = 0;

        for(String number : numbers) {
            array[i] = Integer.parseInt(number);
            i++;
        }

        Arrays.sort(array);

        int[] newArray = new int[2];

        newArray[0] = array[0];
        newArray[1] = array[numbers.length - 1];

        return Arrays.toString(newArray);
    }
}
