class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
     Solution sol = new Solution();
        int[] expectedNums = new int[]{}; // The expected answer with correct length

        int k = sol.removeDuplicates(nums); // Calls your implementation

        System.out.println(k);

    }
}
