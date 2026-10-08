class Solution {
    public int[] shortestToChar(String s, char c) {

        int[] arr = new int[s.length()];

        int i = 0;

        while (i < s.length()) {

            int j = 0;
            int min = s.length();

            while (j < s.length()) {

                if (s.charAt(j) == c) {

                    int distance = i > j ? i - j : j - i;

                    if (distance < min) {
                        min = distance;
                    }
                }

                j++;
            }

            arr[i] = min;
            i++;
        }

        return arr;
    }
}