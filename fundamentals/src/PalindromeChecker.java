public class PalindromeChecker {
    public static boolean palindromeChecker(String string) {
        boolean checker = false;

        string = string.toLowerCase();

        String reversedString = ReverseString.reverseString(string);

        if (string.equals(reversedString)) {
            checker = true;
        }

        return checker;
    }
}
