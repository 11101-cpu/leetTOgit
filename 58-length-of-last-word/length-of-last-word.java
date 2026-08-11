class Solution {
    public int lengthOfLastWord(String s) {

        int i = s.length() - 1;

        // Skip trailing spaces
        while (s.charAt(i) == ' ') {
            i--;
        }

        int end = i;

        // Find beginning of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }

        return end - i;
    }
}