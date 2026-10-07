public class VowelCounter {
    public static int vowelCounter(String string) {

        string = string.toLowerCase();

        int counter = 0;

        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' ||
                string.charAt(i) == 'e' ||
                string.charAt(i) == 'i' ||
                string.charAt(i) == 'o' ||
                string.charAt(i) == 'u') {
                    counter++;
            }
        }

        return counter;
    }
}
