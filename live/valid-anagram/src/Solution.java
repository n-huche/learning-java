import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }
}

class Solution20261015 {
    public boolean isAnagram(String s, String t) {
        int i = 0;
        boolean containsChar = true;
        while (containsChar) {
            containsChar = t.contains(String.valueOf(s.charAt(i)));
            i++;
            if(i == t.length()) {
                break;
            }
        }
        return containsChar;
    }
}
