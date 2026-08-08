import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }

            }
        return j;
        }
    }

public class Main {
    public static void main(String[] args) {

        int[] n = new int[]{3, 2, 2, 3,9,8};
        int val = 3;
        Solution sol = new Solution();
        int k = sol.removeElement(n, val);
        System.out.println(k);
    }
}