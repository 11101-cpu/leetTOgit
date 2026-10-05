class Solution {
    public String reverseWords(String s) {
        int left = 0;
        String str = "";

        for (int right = 0; right <= s.length(); right++) {
            if (right == s.length() || s.charAt(right) == ' ') {
                String sub = s.substring(left, right);
                String reversed = new StringBuilder(sub).reverse().toString();

                str += reversed;

                if (right < s.length()) {
                    str += " ";
                }

                left = right + 1;
            }
        }

        return str;
    }
}
