class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseS = new StringBuilder(s).reverse().toString();

        if (s.equals(reverseS)) {
            return true;
        }

        return false;
    }
}
