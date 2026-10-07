public class ReverseString {
    public static String reverseString(String string) {

        String reversed = new StringBuilder(string).reverse().toString();
        
        return reversed;
    }
}
