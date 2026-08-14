class Solution {
    public int[] plusOne(int[] digits) {
        int k = digits.length - 1;

        while (k >= 0 && digits[k] == 9) {
            digits[k] = 0;
            k--;
        }

        if (k < 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }

        digits[k]++;
        return digits;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] digits = {9,9,9};

        Solution obj = new Solution();
        int[] result = obj.plusOne(digits);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}